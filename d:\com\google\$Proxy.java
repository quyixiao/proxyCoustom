package com.google;
import com.luban.dao.LubanDao;
public class $Proxy implements LubanDao{
	private LubanDao target;
	public $Proxy (LubanDao target){
		this.target =target;
	}
	public void query() {
		System.out.println("log");
		target.query();
	}
}