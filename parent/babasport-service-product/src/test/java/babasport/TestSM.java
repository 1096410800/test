package babasport;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.babasport.mapper.test.BbsTestMapper;
import com.itheima.babasport.pojo.test.BbsTest;
import com.itheima.babasport.service.test.BbsTestService;

/** 
* @author 作者 E-mail: 1096410800@qq.com
* @version 创建时间：2017年9月14日 下午4:35:32 
* 类说明 
*/
@ContextConfiguration(locations={"classpath:spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSM {
//	private ApplicationContext context;
//
//	@Before
//	public void setUp() throws Exception {
//		this.context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//	}
//
//	
	
	@Resource
	private BbsTestMapper mapper;
	@Resource
	private BbsTestService service;
//	
	/**
	 * 测试mybatis
	 */
	@Test
	public void testMybatis(){
		
//		BbsTestMapper mapper = this.context.getBean(BbsTestMapper.class);


		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("test");
		bbsTest.setBirthday(new Date());
		mapper.insertBbsTest(bbsTest);
	}
	@Test
	public void testService(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("test1");
		bbsTest.setBirthday(new Date());
		service.insertBbsTest(bbsTest);
	}
	
}
