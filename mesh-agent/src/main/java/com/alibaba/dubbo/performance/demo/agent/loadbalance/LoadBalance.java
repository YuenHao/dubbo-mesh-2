package com.alibaba.dubbo.performance.demo.agent.loadbalance;

import com.alibaba.dubbo.performance.demo.agent.dubbo.model.RpcInvocation;
import com.alibaba.dubbo.performance.demo.agent.registry.Endpoint;
import org.aopalliance.intercept.Invocation;

import java.util.List;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-05-19
 */
public interface LoadBalance {


    Endpoint select(RpcInvocation invocation);

    List<Endpoint> getEndpoints();

}
