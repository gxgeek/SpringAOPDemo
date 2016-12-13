package com.gx.Service;

import org.springframework.stereotype.Component;

/**
 * Created by gx on 2016/12/13.
 */
@Component
public class LoginService {
        public void addUser(String name) throws Exception {
            System.out.println("注册用户"+name);
            throw  new Exception("就抛错");
        }
        public void updateUser(String name){
            System.out.println("升级用户"+name);
        }
        public void delUser(String name){
            System.out.println("注销用户"+name);
        }
        public void inquiryUser(String name){
            System.out.println("查询用户"+name);
        }
}
