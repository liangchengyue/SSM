package com.lcy.comtroller;

import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcy.pojo.Test;
import com.lcy.service.TestService;

@Controller
public class TestController {
	@Autowired
	@Qualifier("testService")
	private TestService testService;
	@RequestMapping("/TestToJson")
	@ResponseBody
	public String TestToJson() {
		List<Test> tests=testService.findTests();
		JSONArray jsonArray=JSONArray.fromObject(tests);
		return jsonArray.toString();
	}
	@RequestMapping("/Hello")
	@ResponseBody
	public String Helle() {
		return "Hello SSM";
	}
}
