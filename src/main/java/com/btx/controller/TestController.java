package com.btx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.btx.service.MainService;

/**
 * 
 * @author littlesky
 *
 */
@Controller
@RequestMapping("/testController")
public class TestController {

	@Autowired
	private MainService mainService;
	

//	public void setMainService(MainService mainService) {
//		this.mainService = mainService;
//	}
	@RequestMapping("/dealReq/{excepFlag}")
	public @ResponseBody boolean dealReq(@PathVariable("excepFlag") boolean excepFlag) throws Exception
	{
		return mainService.dealService(excepFlag);
	}

}
