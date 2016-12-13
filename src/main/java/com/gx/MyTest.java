package com.gx;

import com.gx.Service.LoginService;

import com.gx.Service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gx on 2016/12/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class MyTest {
    @Autowired
    private LoginService loginService;
    @Autowired
    private ShoppingCartService shoppingCartService;
    @Test
    public  void test1() {
        try {
            loginService.addUser("你 好");
        } catch (Exception e) {
//            e.printStackTrace();
        }
        loginService.updateUser("admin");
        loginService.inquiryUser("GM");
        loginService.delUser("gx");
        shoppingCartService.delUser("语文书");
        try {
            shoppingCartService.addProduct("JAVA核心技术卷");
        } catch (Exception e) {
        }
        shoppingCartService.inquiryUser("编程之美");
        shoppingCartService.updateUser("23种设计模式");
    }



}
