package org.itstack.ark.wx.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.itstack.ark.wx.infrastructure.po.UserAuth;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Mapper
public interface UserAuthDao {

    void insert(UserAuth userAuth);

    void delete(String openId);

    UserAuth queryUserAuth(String token);

}
