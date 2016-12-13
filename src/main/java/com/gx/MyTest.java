package com.gx;

import com.gx.Service.LoginService;

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
    @Test
    public  void test1(){
        try {
            loginService.addUser("你 好");
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }



}
