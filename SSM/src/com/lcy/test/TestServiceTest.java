package com.lcy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lcy.service.TestService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/lcy/config/applicationContext.xml")
public class TestServiceTest {
	@Autowired
	@Qualifier("testService")
	private TestService testService;
	@Test
	public void testFindTests() {
		System.out.println(testService.findTests());
	}
}
