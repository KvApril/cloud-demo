package com.kv.remoteclientapi.dto;

import com.kv.commonuse.bean.ResponseData;

import java.util.List;

public class HouseListDto extends ResponseData {
    private List<HouseInfo> data;

    public List<HouseInfo> getData() {
        return data;
    }

    public void setData(List<HouseInfo> data) {
        this.data = data;
    }
}
