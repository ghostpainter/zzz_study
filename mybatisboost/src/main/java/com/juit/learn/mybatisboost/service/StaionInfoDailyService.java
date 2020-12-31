package com.juit.learn.mybatisboost.service;

import com.juit.learn.mybatisboost.domain.StationInfoDaily;
import com.juit.learn.mybatisboost.mapper.StationInfoDailyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Juit
 * @create 2020--12--31 14:28
 */
@Slf4j
@Service
public class StaionInfoDailyService {

	@Autowired
//	@Resource  //change  @Autowired to @Resource, just for  IDEA not show red line below the mapper instance.
	private StationInfoDailyMapper stationInfoDailyMapper;

	public StationInfoDaily getStationInfoDaily(){

		return  stationInfoDailyMapper.selectByPrimaryKey(565L);
	}

}
