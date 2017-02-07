package evolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import evolution.service.AnyService;

@RestController
public class AnyController {
	@Autowired
	AnyService anyService;
	
	@RequestMapping(value = "/0", method = RequestMethod.GET)
	public void anyMethod() {
		anyService.anyMethod();
	}
}
