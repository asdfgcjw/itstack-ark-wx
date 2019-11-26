package org.itstack.ark.wx.test;

import com.alibaba.fastjson.JSON;
import org.itstack.ark.wx.domain.receive.model.MessageTextEntity;
import org.itstack.ark.wx.infrastructure.util.XmlUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 微信公众号：bugstack虫洞栈
 * 纯洁版博客：https://bugstack.cn
 * 沉淀、分享、成长，让自己和他人都能有所收获！
 * Create by 付政委 on @2019
 */
public class ApiTest {

    public static void main(String[] args) throws ParseException {
        System.out.println(3|9);
    }

    public static String parseTime(int time) {
        System.setProperty("user.timezone", "Asia/Shanghai");
        TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
        TimeZone.setDefault(tz);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String times = format.format(new Date(time * 1000L));
        System.out.print("日期格式---->" + times);
        return times;
    }

}
