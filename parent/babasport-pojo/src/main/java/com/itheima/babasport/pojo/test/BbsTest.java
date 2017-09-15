package com.itheima.babasport.pojo.test;

import java.io.Serializable;
import java.util.Date;

/**
 *  
 * 
 * @author 作者 E-mail: 
 * @version 创建时间：2017年9月14日 下午3:47:05  测试sm
 */
public class BbsTest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Date birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public BbsTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbsTest(Integer id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

}
