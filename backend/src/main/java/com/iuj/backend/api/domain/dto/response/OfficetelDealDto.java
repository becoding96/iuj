package com.iuj.backend.api.domain.dto.response;

import com.iuj.backend.api.domain.entity.building.OfficetelDeal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OfficetelDealDto {
    private int id;
    private String area;
    private String contract_ym;
    private String contract_day;
    private String dealType;
    private int guarantee;
    private int price;
    private int floor;
    private int monthly;
    private Long officetelId;

    private AptDto author;

    public OfficetelDealDto(int id, String area, String contract_ym, String contract_day, String dealType, int guarantee, int price, int floor, int monthly, Long officetelId){
        this.id = id;
        this.area = area;
        this.contract_ym = contract_ym;
        this.contract_day = contract_day;
        this.dealType = dealType;
        this.guarantee = guarantee;
        this.floor = floor;
        this.price = price;
        this.monthly = monthly;
        this.officetelId = officetelId;

    }
}
