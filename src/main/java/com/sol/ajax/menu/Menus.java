package com.sol.ajax.menu;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// 테이블을 표현해줄 객체
@XmlRootElement
public class Menus {
	
	private List<Menu> menu;
	
	@Override
	public String toString() {
		return "Menus [menu=" + menu + "]";
	}

	public Menus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menus(List<Menu> menu) {
		super();
		this.menu = menu;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	@XmlElement  // xml이 자동으로 만들어줌
	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}
	
	
}
