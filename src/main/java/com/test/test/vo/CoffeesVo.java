package com.test.test.vo;

import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@lombok.Data
@NoArgsConstructor
public class CoffeesVo {

    int language_id;
    String name;
    Timestamp last_update;

    public CoffeesVo(String name) {
        this.name = name;
        this.language_id = 0;
        this.last_update = null;
    }
}

