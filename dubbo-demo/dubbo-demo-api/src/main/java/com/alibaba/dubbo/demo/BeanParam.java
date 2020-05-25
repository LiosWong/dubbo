package com.alibaba.dubbo.demo;

import java.io.Serializable;

/**
 * <p>文件名称：BeanParam.java</p>
 * <p>文件描述：TODO</p>
 * <p>版权所有： 版权所有(C)2016-2099</p>
 * <p>公   司： 优行科技 </p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>完成日期：2020/5/25 下午2:37 </p>
 *
 * @author wenchao.wang
 */
public class BeanParam implements Serializable {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public BeanParam setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public BeanParam setAge(int age) {
		this.age = age;
		return this;
	}
}
