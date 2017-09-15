package com.itheima.babasport.mapper.test;

import java.util.List;

import com.itheima.babasport.pojo.test.BbsTest;

/** 
* @author 作者 E-mail: 1096410800@qq.com
* @version 创建时间：2017年9月14日 下午4:09:06 
* 类说明 
*/
public interface BbsTestMapper {
	public void insertBbsTest(BbsTest bbsTest);
	public List<BbsTest> selectBbsTestList();
}
