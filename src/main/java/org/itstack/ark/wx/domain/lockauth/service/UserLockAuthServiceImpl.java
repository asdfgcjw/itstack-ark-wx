package org.itstack.ark.wx.domain.lockauth.service;

import org.itstack.ark.wx.application.UserLockAuthService;
import org.itstack.ark.wx.domain.lockauth.repository.IUserAuthPatrolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
@Service("userLockAuthService")
public class UserLockAuthServiceImpl implements UserLockAuthService {

    @Autowired
    private IUserAuthPatrolRepository userAuthPatrolRepository;

    @Override
    public boolean checkAuth(String token) {
        return userAuthPatrolRepository.isTokenExist(token);
    }

}
