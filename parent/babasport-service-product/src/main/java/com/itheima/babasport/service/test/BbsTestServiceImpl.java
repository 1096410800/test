package com.itheima.babasport.service.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.babasport.mapper.test.BbsTestMapper;
import com.itheima.babasport.pojo.test.BbsTest;

/** 
* @author 作者 E-mail: 1096410800@qq.com
* @version 创建时间：2017年9月14日 下午6:08:46 
* 测试service实现类
*/
@Service("bbsTestService")
public class BbsTestServiceImpl implements BbsTestService {
	@Resource
	private BbsTestMapper mapper;
	@Override
	@Transactional
	public void insertBbsTest(BbsTest bbsTest) {
		mapper.insertBbsTest(bbsTest);
	//	System.out.println(1/0);

	}
	@Override
	public List<BbsTest> selectBbsTestList() {
		
		return mapper.selectBbsTestList();
	}

}
