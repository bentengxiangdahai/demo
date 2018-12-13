package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@PostMapping("/queryDemo")
	public Map<String, Object> queryDemo() throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("stat", 0);
		resultMap.put("msg", "success");
		resultMap.put("val", "demo-test-1");
		return resultMap;
	}
}
