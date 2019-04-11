package com.kv.remoteclientapi.dto;

import com.kv.commonuse.bean.ResponseData;

public class HouseInfoDto extends ResponseData {
    private HouseInfo data;

    public HouseInfoDto(HouseInfo data) {
        data = this.data;
    }

    public HouseInfoDto() {

    }

    public HouseInfo getData() {
        return data;
    }

    public void setData(HouseInfo data) {
        this.data = data;
    }
}
