package com.nagarro.devops.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	public static final org.slf4j.Logger Logger = LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	void contextLoads() {
		Logger.info("its a Test Class ");
		assertEquals(true, true);
	}

}
