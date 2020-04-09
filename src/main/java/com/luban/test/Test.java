package com.luban.test;

import com.luban.dao.LubanDao;
import com.luban.dao.LubanDaoImpl;
import com.luban.proxy.ProxyUtil;
import com.luban.util.TestCustomHandler;

import java.lang.reflect.Method;


public class Test {
    public static void main(String[] args) {
        //自定义
        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(LubanDao.class, new TestCustomHandler(new LubanDaoImpl()));
        try {
            proxy.proxy();

            proxy.query();

            System.out.println("=======================================================");


            Method method = Class.forName("com.luban.dao.LubanDao").getDeclaredMethod("query");
            method.invoke(new LubanDaoImpl());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
