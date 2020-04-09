package com.luban.test;

import com.luban.dao.LubanDao;
import com.luban.dao.LubanDaoImpl;
import com.luban.util.LubanInvocationHandler;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;


public class Test1 {
    public static void main(String[] args) {

        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy18",new Class[]{LubanDao.class});

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/quyixiao/com/google/$Proxy18.class");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //        System.out.println(proxy.proxy());
        LubanDao jdkproxy = (LubanDao) Proxy.newProxyInstance(Test1.class.getClassLoader(),
                new Class[]{LubanDao.class},new LubanInvocationHandler(new LubanDaoImpl()));


        //jdkproxy.query();
        try {
            jdkproxy.proxy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
