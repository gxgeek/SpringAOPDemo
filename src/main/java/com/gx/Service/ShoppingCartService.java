package com.gx.Service;

import org.springframework.stereotype.Component;

/**
 * Created by gx on 2016/12/13.
 */
@Component
public class ShoppingCartService {

    public void addProduct(String name) throws Exception {
        System.out.println("加入购物车"+name);
        throw  new Exception("就抛错");
    }
    public void updateUser(String name){
        System.out.println("增加商品数量"+name);
    }
    public void delUser(String name){
        System.out.println("删除商品"+name);
    }
    public void inquiryUser(String name){
        System.out.println("查询商品"+name);
    }

}
