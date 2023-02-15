package com.web.sms;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			String name =req.getParameter("name");
			System.out.println("name is "+name);
			Map<String,String> map=new  HashedMap();
			map.put("msg", "hello "+name);
			
		return new ModelAndView("success", map);
	}

}
