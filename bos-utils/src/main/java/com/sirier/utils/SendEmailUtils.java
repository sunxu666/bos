package com.sirier.utils;

import org.springframework.stereotype.Component;

/**
 * 发送邮件的工具类,已配置到quartz管理执行
 * Created by Sirierx on 2017/8/17.
 */
@Component("sendEmail")
public class SendEmailUtils {

    private static void SendEmail() {
        System.out.println("---发邮件啦---");
    }

}
