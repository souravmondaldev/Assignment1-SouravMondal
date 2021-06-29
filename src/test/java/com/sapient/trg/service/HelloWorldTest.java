package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	private HelloWorld helloWorld =null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Executing before all test methods");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Executing after all test methods");
	}

	@BeforeEach
	void setUp() throws Exception {
		helloWorld = new HelloWorld("Ravi","Kumar");
	}

	@AfterEach
	void tearDown() throws Exception {
		helloWorld=null;
	}
	
	@Test
	void testGetFirstName() {
		assertEquals("Ravi",helloWorld.getFirstName());
	}

	
	@Test
	void testSetFirstName() {
		helloWorld.setFirstName("Steve");
		assertEquals("Steve",helloWorld.getFirstName());
	}

	
	@Test
	void testGetLastName() {
		assertEquals("Kumar",helloWorld.getLastName());
	}

	
	@Test
	void testSetLastName() {		
		assertNotEquals("Steve",helloWorld.getLastName());
	}

	
	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
