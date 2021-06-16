package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.HelloService;

/**
 * <p>文件名称：HelloServiceImpl</p>
 * <p>文件描述：</p>
 * <p>版权所有： 版权所有(C)2016-2099</p>
 * <p>公   司： 优行科技 </p>
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 * <p>完成日期：2021/6/16 下午10:31 </p>
 *
 * @author wenchao.wang
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String say() {
        return "hello";
    }
}
