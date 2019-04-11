package com.kv.subservice.controller;

import com.kv.commonuse.bean.ResponseData;
import com.kv.remoteclientapi.HouseRemoteClient;
import com.kv.remoteclientapi.dto.HouseListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class SubController {
    @Autowired
    HouseRemoteClient houseRemoteClient;

    @GetMapping("/list/{eid}/{uid}")
    public ResponseData hosueList(@PathVariable("eid")Long eid, @PathVariable("uid")String uid){
        return houseRemoteClient.hosueList(eid,uid);
    }
}
