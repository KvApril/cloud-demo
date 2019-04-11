package com.kv.houseservice.controller;

import com.kv.commonuse.bean.ResponseData;
import com.kv.houseservice.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/list/{eid}/{uid}")
    public ResponseData hosueList(@PathVariable("eid")Long eid, @PathVariable("uid")String uid) {
        return ResponseData.ok(houseService.queryAll(eid, uid));
    }

    @GetMapping("/{houseId}")
    public ResponseData hosueInfo(@PathVariable("houseId")Long houseId, HttpServletRequest request) {
        String uid = request.getHeader("uid");
        System.out.println("==="+uid);
        return ResponseData.ok(houseService.getHouseInfo(houseId));
    }

}
