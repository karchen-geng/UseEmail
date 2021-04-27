package com.ck;

import javax.mail.MessagingException;
import java.util.Random;

public class myTest {
    public static void main(String[] args) throws MessagingException {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            //生成一个随机的int值，该值介于[0,9)
            int r = random.nextInt(10);
            code = code + r;  //把每次随机出的数字拼在一起
        }
        //WangYiMailUtil.send_mail("******@qq.com", String.valueOf("本次服务的激活码为：              " + code));
        QQMailUtil.send_mail("******@163.com", String.valueOf("本次服务的激活码为：              " + code));
        System.out.println("邮件发送成功!");

    }

}
