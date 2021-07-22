package com;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExampleJenkinsApplicationTests {

	public static Logger log = LoggerFactory.getLogger(ExampleJenkinsApplication.class);
	@Test
	void contextLoads() {
		log.info("Test case executing....... ");
		assertEquals(true, true);
	}

}
