package com.kv.houseservice.service;

import com.kv.houseservice.pojo.HouseInfo;

import java.util.List;

public interface HouseService {
    /**
     * 查询企业下某个用户的所有有效的房产信息
     * @param eid	企业编号
     * @param uid	用户编号
     * @return
     */
    List<HouseInfo> queryAll(Long eid, String uid);

    /**
     * 根据房产编号查询房产信息
     * @param houseId 房产编号
     * @return
     */
    HouseInfo getHouseInfo(Long houseId);

    /**
     * 修改信息
     */
    boolean update(HouseInfo info);
}
