package com.luban.dao;

public class LubanDaoImpl implements LubanDao{

    @Override
    public void query() {
        System.out.println("query");
    }

    @Override
    public String proxy()throws Exception {
        System.out.println("aaaaaaaaaaa");
        return "proxy";
    }


}
