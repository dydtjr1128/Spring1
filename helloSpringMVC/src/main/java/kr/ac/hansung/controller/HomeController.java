package kr.ac.hansung.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * Handles requests for the application home page.
 */
@Controller  //@Component HomController 클래스를 빈으로 등록해서 컨테이너에서 생성하도록 만듬 
//이건 빈을 등록하면서 추가적으로 컨트롤러로 사용할 것이다라는 걸 나타냄 @Component + 컨트롤러 역할
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//private static final Logger logger = LoggerFactory.getLogger(/helloSpringMVC/src/main/java/kr/ac/hansung/controller/HomeController.java)
			//같은 의미
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(HttpServletRequest request, Locale locale, Model model) {
		
		logger.trace("trace leve: Welcome home! The client locale is ()",locale);
		logger.debug("debug leve: Welcome home! The client locale is ()",locale);
		logger.info("info leve: Welcome home! The client locale is ()",locale);
		logger.warn("warn leve: Welcome home! The client locale is ()",locale);
		logger.error("error leve: Welcome home! The client locale is ()",locale);
		
		String url = request.getRequestURL().toString();
		String clientIPAdress = request.getRemoteAddr();
		
		logger.info("Request URL : " + url);
		logger.info("Client IP : " + clientIPAdress);
		
		return "home";//view의 이름
	}
	
}
