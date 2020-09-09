package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.HelloService;

/**
 * <p>文件名称：HelloServiceImpl.java</p>
 * <p>文件描述：TODO</p>
 * <p>版权所有： 版权所有(C)2016-2099</p>
 * <p>公   司： 优行科技 </p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>完成日期：2020/9/8 下午3:28 </p>
 *
 * @author wenchao.wang
 */
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello(String name) {
		return "hello";
	}
}
