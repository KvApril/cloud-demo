package com.kv.houseservice.service;

import com.kv.houseservice.pojo.HouseInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Override
    public List<HouseInfo> queryAll(Long eid, String uid) {
        List<HouseInfo> infos = new ArrayList<HouseInfo>(){{
            add(new HouseInfo(1L,"上海","闵行","一宝","100弄1号",1.1,1.2));
            add(new HouseInfo(1L,"上海","张江","二宝","200弄2号",2.1,2.2));
            add(new HouseInfo(1L,"上海","徐汇","三宝","300弄3号",3.1,3.2));
            add(new HouseInfo(1L,"上海","闵行","七宝","400弄4号",4.1,4.2));
            add(new HouseInfo(1L,"上海","闵行","七宝","500弄5号",5.1,5.2));
            add(new HouseInfo(1L,"上海","闵行","七宝","600弄6号",6.1,6.2));
        }};
        return infos;
    }

    @Override
    public HouseInfo getHouseInfo(Long houseId) {
        return new HouseInfo(1L,"上海","闵行","一宝","100弄1号",1.1,1.2);
    }

    @Override
    public boolean update(HouseInfo info) {
        return true;
    }
}
