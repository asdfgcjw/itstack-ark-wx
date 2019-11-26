package org.itstack.ark.wx.domain.receive.service.logic.impl;

import org.itstack.ark.wx.domain.receive.model.BehaviorMatter;
import org.itstack.ark.wx.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 * 关注微信公众号
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {

    private final String content = "您好！\n" +
            "\n" +
            "非常感谢您关注，微信公众号：bugstack虫洞栈  | 也期待您分享给更多小伙伴！\n" +
            "\n" +
            "bugstack虫洞栈，专注于原创技术专题案例，以最易学习编程开发的方式分享技术知识，让萌新、小白、大牛都能有所收获。目前已经完成的专题有；《Netty4.x从入门到实战》、《手写RPC框架》、《用Java实现JVM》、《基于JavaAgent的全链路监控》、《DDD专题案例》，其他更多专题还在排兵布阵中。\n" +
            "\n" +
            "获取专题案例源码回复；netty案例、rpc案例、用Java实现jvm源码、基于JavaAgent的全链路监控案例、DDD落地。\n" +
            "\n" +
            "联系作者：付政委 | monkeycode";

    @Override
    public String filter(BehaviorMatter request) {
        return content;
    }

}
