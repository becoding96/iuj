package com.iuj.backend.api.domain.entity;

import com.iuj.backend.api.domain.entity.building.Apt;
import com.iuj.backend.api.domain.entity.building.Officetel;
import com.iuj.backend.api.domain.entity.building.Villa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class Location {
    @Column(length=45)
    private String lat;

    @Column(length=45)
    private String lng;

    public Location(Apt entity) {
        this.lat = entity.getLat();
        this.lng = entity.getLng();
    }

    public Location(Officetel entity) {
        this.lat = entity.getLat();
        this.lng = entity.getLng();
    }
    public Location(Villa entity) {
        this.lat = entity.getLat();
        this.lng = entity.getLng();
    }
}