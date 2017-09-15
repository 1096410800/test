package com.itheima.babasport.service.test;

import java.util.List;

import com.itheima.babasport.pojo.test.BbsTest;

/** 
* @author 作者 E-mail: 1096410800@qq.com
* @version 创建时间：2017年9月14日 下午6:06:13 
* 测试service接口
*/
public interface BbsTestService {
	public void insertBbsTest(BbsTest bbsTest);

	public List<BbsTest> selectBbsTestList();
}
