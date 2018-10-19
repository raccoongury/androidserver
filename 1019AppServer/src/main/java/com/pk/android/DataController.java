package com.pk.android;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//html 대신에 csv 나 json 을 리턴하는 Controller를 만들어주는 어노테이
@RestController
public class DataController {

	@RequestMapping(value="data.csv", method=RequestMethod.GET)
	public @ResponseBody String csv (){
		return "girl'sgeneratio,수지, AOA,RedVelvet";
		
//		@RequestMapping(value="data.csv", method=RequestMethod.GET)
//		public String csv (HttpServletResponse response) {
//			response.setCharacterEncoding("utf-8");//한글 경우 깨지기때문에 사용
//			
//			return "피카츄, 라이츄, 파이리, 꼬부기";
	}
}



