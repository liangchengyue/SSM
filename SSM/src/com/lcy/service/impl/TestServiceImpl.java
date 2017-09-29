package com.lcy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.lcy.mapper.TestMapper;
import com.lcy.pojo.Test;
import com.lcy.service.TestService;

@Transactional
public class TestServiceImpl implements TestService {
	@Autowired
	@Qualifier("testMapper")
	private TestMapper testMapper;

	@Override
	public List<Test> findTests() {
		return testMapper.findTests();
	}

}
