package com.juit.learn.mybatisboost.controller;

import com.juit.learn.mybatisboost.domain.StationInfoDaily;
import com.juit.learn.mybatisboost.service.StaionInfoDailyService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juit
 * @create 2020--12--30 17:19
 */
@Slf4j
@RestController
public class HelloController {

//	//定义一个全局的记录器，通过LoggerFactory获取
//	private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
	@Autowired
	StaionInfoDailyService staionInfoDailyService;

	@RequestMapping("/hello")
	public String getHello(){

		String strCode = staionInfoDailyService.getStationInfoDaily().getAreaCode();
		log.info("logback hello get");
		return "Hello! I am Juit:" + strCode;
	}
}
