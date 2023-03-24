package com.iuj.backend.api.controller;

import com.iuj.backend.api.domain.dto.request.LikeBuildingRequest;
import com.iuj.backend.api.domain.entity.LikeBuilding;
import com.iuj.backend.api.domain.enums.ErrorCode;
import com.iuj.backend.api.exception.CustomException;
import com.iuj.backend.api.service.LikeService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/like")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @PostMapping("")
    @ApiOperation(value = "관심매물 등록 api", notes = "관심매물 등록 api")
    public ResponseEntity<Object> addLike(@RequestBody LikeBuildingRequest request,
                                          @RequestHeader(value="X-Auth-Token") String authToken) {
        try{
            likeService.addLike(request, authToken);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            // 예외 처리
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }


    @DeleteMapping("")
    @ApiOperation(value = "관심매물 삭제 api", notes = "관심매물 삭제 api")
    public ResponseEntity<Object> delLike(@RequestBody LikeBuildingRequest request,
                                          @RequestHeader(value="X-Auth-Token") String authToken) {
        try{
            likeService.delLike(request, authToken);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            // 예외 처리
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }


    @GetMapping("")
    @ApiOperation(value = "관심매물 조회 api", notes = "관심매물 조회 api")
    public ResponseEntity<Object> getAllLikesByEmail(@RequestHeader(value="X-Auth-Token") String authToken) {
        try{
            return new ResponseEntity<>(likeService.getAllLikesByEmail(authToken), HttpStatus.OK);
        }catch (Exception e){
            throw new CustomException(ErrorCode.UNKNOWN_ERROR);
        }
    }

}