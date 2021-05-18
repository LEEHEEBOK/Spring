package com.icia.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//컨트롤러 클래스로 지정하기 위한 어노테이션
@Controller
public class MainController {

	// 기본주소를 처리하기 위한 메소드 정의
	// @RequestMapping : 주소값을 받기 위한 어노테이션
//	@RequestMapping(value="/")
//	public void home() {
//		System.out.println("home 메소드 호출됨");
//	}
	
	// 기본주소 요청이 왔을때 home.jsp를 출력하기 위한 메소드
	@RequestMapping(value = "/")
	public String home1() {
		System.out.println("home1 메소드 호출");
		return "home"; // => home.jsp 를 출려하는 역활을 함.
	}
	
	// a 라는 주소 요청이 왔을 때 처리하기 위한 메소드 정의
	// 메소드 이름은 homea 라고 하고 메소드가 호출 됐을때 homea  메소드 호출이라고 sysout 출력
	
	@RequestMapping(value = "/a")
	public void homea() {
		System.out.println("homea 메소드 호출됨");
	}
	
	// /abc 라는 주소 요청이 있을 때 abc.jsp 를 출력하는 메소드 정의
	// abc. jsp 에서는 파란색으로 hello world 출력
	@RequestMapping(value = "/abc")
	public String home2() {
		System.out.println("abc 메소드 호풀");
		return "abc";
	}
	
	@RequestMapping(value = "/paramtest")
	public void home3(@RequestParam("param1") String a) {
		System.out.println("home3 메소드 호풀");
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
	
}
