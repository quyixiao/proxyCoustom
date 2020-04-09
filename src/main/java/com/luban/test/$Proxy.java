package com.luban.test;
import com.luban.dao.LubanDao;
import com.luban.dao.CoustomInvocationHandler;
import java.lang.Exception;import java.lang.reflect.Method;
public class $Proxy implements LubanDao{
	private CoustomInvocationHandler h;
	public $Proxy (CoustomInvocationHandler h){
		this.h =h;
	}

	public void query() throws Exception{
		Method method = Class.forName("com.luban.dao.LubanDao").getDeclaredMethod("query");
		 h.invoke(method);
	}
	public String proxy()throws Exception {
		Method method = Class.forName("com.luban.dao.LubanDao").getDeclaredMethod("proxy");
		return (String)h.invoke(method);
	}
}