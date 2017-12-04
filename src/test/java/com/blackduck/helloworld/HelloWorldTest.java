package com.blackduck.helloworld;

import org.junit.Before;
import org.junit.Test;

import com.blackduck.helloworld.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		// comment
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
}
