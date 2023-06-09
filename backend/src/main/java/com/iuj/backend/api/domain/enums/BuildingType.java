package com.iuj.backend.api.domain.enums;

import lombok.Getter;

@Getter
public enum BuildingType {
    APT("apt"),
    OFFICETEL("officetel"),
    VILLA("villa");

    private final String name;

    BuildingType(String name) {
        this.name = name;
    }
    
}
