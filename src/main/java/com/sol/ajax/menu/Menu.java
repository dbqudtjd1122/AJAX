package com.sol.ajax.menu;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// DB에 있는 데이터 하나를 표현 가능
//@XmlRootElement
public class Menu {

	private String m_name;
	private BigDecimal m_price;

	@Override
	public String toString() {
		return "Menu [m_name=" + m_name + ", m_price=" + m_price + "]";
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String m_name, BigDecimal m_price) {
		super();
		this.m_name = m_name;
		this.m_price = m_price;
	}
	
	public String getM_name() {
		return m_name;
	}
	
	//@XmlElement
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public BigDecimal getM_price() {
		return m_price;
	}
	
	//@XmlElement
	public void setM_price(BigDecimal m_price) {
		this.m_price = m_price;
	}
	
	
}
