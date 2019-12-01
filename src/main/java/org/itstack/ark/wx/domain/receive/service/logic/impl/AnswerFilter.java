package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("answer")
public class AnswerFilter implements LogicFilter {

    private final String defaultAnswer = "您好！\n" +
            "\n" +
            "我是bugstack虫洞栈的作者：付政委，如果您有什么需求，欢迎留言。\n" +
            "\n" +
            "获取专题案例源码，请按需回复以下数字编号1、2、3...：\n" +
            "0、资源下载，NetAssist网络调试助手等\n" +
            "1、netty案例\n" +
            "2、rpc案例\n" +
            "3、用Java实现jvm源码\n" +
            "4、基于JavaAgent的全链路监控案例\n" +
            "5、iot-gateway案例源码\n" +
            "6、DDD落地\n" +
            "7、SpringCloud专题\n" +
            "8、itstack-ark-wx，微信公众号开发\n";

    @Override
    public String filter(BehaviorMatter request) {

        String content = request.getContent();

        //NetAssist+184172133@qq.com
        if (content.contains("0")){
            return "网络调试助手下载地址：https://download.csdn.net/download/yao__shun__yu/11835105\n" +
                    "\n" +
                    "如果没有CSDN下载积分可以加我微信号：monkeycode\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //1、netty案例
        if (content.equals("1")){
            return "Netty实战专题案例，Netty4.x案例从简单入门到应用实战，全篇37节优秀案例+实战源码[基础篇(12)、拓展篇(13)、应用篇(3章+)、源码篇(6)]，以上章节全部完成并不断持续更新中。\n" +
                    "\n" +
                    "源码地址；（Netty4.1案例）\n" +
                    "https://github.com/fuzhengwei/itstack-demo-netty\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //2、rpc案例
        if (content.equals("2")){
            return "RPC是一种远程调用的通信协议，例如dubbo、thrift等，我们在互联网高并发应用开发时候都会使用到类似的服务。本专题主要通过三个章节简单的实现rpc基础功能，来深入学习rpc是如何交互通信的。\n" +
                    "\n" +
                    "源码地址：｛手写RPC框架｝\n" +
                    "https://github.com/fuzhengwei/itstack-demo-rpc\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //3、用Java实现jvm源码
        if (content.equals("3")){
            return "本专题主要介绍如何通过java代码来实现JVM的基础功能（搜索解析class文件、字节码命令、运行时数据区等），从而让java程序员通过最熟知的java程序，学习JVM是如何将java程序一步步跑起来的。\n" +
                    "\n" +
                    "源码地址\n" +
                    "https://github.com/fuzhengwei/itstack-demo-jvm\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //4、基于JavaAgent的全链路监控案例
        if (content.equals("4")){
            return "本专题主要介绍如何通过java代码来实现JVM的基础功能（搜索解析class文件、字节码命令、运行时数据区等），从而让java程序员通过最熟知的java程序，学习JVM是如何将java程序一步步跑起来的。\n" +
                    "\n" +
                    "源码地址\n" +
                    "https://github.com/fuzhengwei/itstack-demo-jvm\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //5、iot-gateway案例源码
        if (content.equals("5")){
            return "基于Netty实现的物联网网关服务，iot-gateway；netty网关，支持百万客户端连接，压力测试ing...，并优化了与服务端集群通信，以往轮询往多个服务器发消息，看似消息发送很平均，其实大大影响了效率，本次对平均算法做了优化,本次上传代码添加了很多功能，摒弃了以往只做心跳维护、数据转发的功能。\n" +
                    "\n" +
                    "源码地址：｛作者 - 青草非鱼｝\n" +
                    "https://github.com/fuzhengwei/itstack-demo-iot-gatewary\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //6、DDD落地
        if (content.equals("6")){
            return "本专题以DDD实战落地为根本，分章节设计不同的架构模型，学习并实战是奔入应用级开发最快的方法，Hi HelloWorld！我来了。\n" +
                    "\n" +
                    "案例源码：\n" +
                    "https://github.com/fuzhengwei/itstack-demo-ddd\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        //7、SpringCloud专题
        if (content.equals("7")){
            return "Spring Cloud是一系列框架的有序集合。它利用Spring Boot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Spring Boot的开发风格做到一键启动和部署。\n" +
                    "\n" +
                    "源码地址：\n" +
                    "https://github.com/fuzhengwei/itstack-demo-springcloud\n" +
                    "\n" +
                    "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！\n" +
                    "\n";
        }

        //8、微信公众号与博客打通
        if(content.equals("8")){
             return "itstack-ark-wx 是一套基于领域驱动设计方式搭建的Java公众号开发工程，主要服务于博客与公众号之间打通，引导用户关注公众号，做粉丝回流。其实产品往往是使用研发技术力搭建出可以用于承载接收用户在各种设备上所生产的行为数据的一种产品化服务。因此兴衰存亡，皆在核心数据沉淀于运作上！\n" +
                     "\n" +
                     "源码地址：\n" +
                     "https://github.com/fuzhengwei/itstack-ark-wx \n" +
                     "\n" +
                     "期待您将公众号：bugstack虫洞栈 | 推荐给你的小伙伴，非常感谢支持！";
        }

        return defaultAnswer;
    }

}
