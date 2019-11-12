package com.sol.ajax.menu;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerMenu {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerMenu.class);
	
	@Autowired
	DaoMenu mDao;
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(HttpServletRequest req) {
		
		mDao.getMenu(req);
		
		return "menu";
	}
	
	// AJAX
	@RequestMapping(value = "/menu.get", method = RequestMethod.GET, produces = "application/xml; charset=utf-8")
	public @ResponseBody Menus menuGet() {
		
		return mDao.getMenuXML();
	}
	
}
