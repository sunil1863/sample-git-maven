package org.paumard.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloServiceTest {
	
	@Test
	public void should_return_hello_world_message() 
	{
		HelloServiceImpl msgSvc = new HelloServiceImpl();
		String expected = "Hello World!";
		String msg = msgSvc.getMessage();
		
		Assertions.assertThat(msg).isEqualTo(expected);
	}
}