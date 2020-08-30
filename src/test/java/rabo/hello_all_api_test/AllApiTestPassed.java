package rabo.hello_all_api_test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AllApiTestPassed {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
	return "“Hello, all API tests were successfull'";
	}
}


