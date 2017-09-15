package com.itheima.babasport.controller.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.babasport.pojo.test.BbsTest;
import com.itheima.babasport.service.test.BbsTestService;

/** 
* @author 作者 E-mail: 1096410800@qq.com
* @version 创建时间：2017年9月14日 下午6:24:50 
* 类说明 
*/
@Controller
public class BbsTestController {
	@Resource
	private BbsTestService service;
	@RequestMapping("/test.do")
	public String test(){
		List<BbsTest> list=service.selectBbsTestList();
		System.out.println(list.size());
		return "test";
	}
}
