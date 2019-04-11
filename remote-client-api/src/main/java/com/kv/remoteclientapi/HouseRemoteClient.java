package com.kv.remoteclientapi;

import com.kv.remoteclientapi.dto.HouseInfoDto;
import com.kv.remoteclientapi.dto.HouseListDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "house-service",path = "/house")
public interface HouseRemoteClient {
    @GetMapping("/list/{eid}/{uid}")
    HouseListDto hosueList(@PathVariable("eid")Long eid, @PathVariable("uid")String uid);

    /**
     * 获取房产详细信息
     * @param houseId 房产编号
     * @return
     */
    @GetMapping("/{houseId}")
    HouseInfoDto hosueInfo(@PathVariable("houseId")Long houseId);
}
