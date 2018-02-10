package com.niit.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() 
	{
		Calculator calobj=new Calculator();
		assertEquals("correct output",30, calobj.add(20, 10));
	}
	@Test
	public void testAddFailure() 
	{
		Calculator calobj=new Calculator();
		assertEquals("the expected value did not match the value returned",60, calobj.add(20, 10));
	}
	
	@Test
	public void testSub() 
	{
		Calculator calobj=new Calculator();
		assertEquals("correct output",10, calobj.sub(20, 10));
	}
	@Test
	public void testmul() 
	{
		Calculator calobj=new Calculator();
		assertEquals("correct output",200, calobj.mul(20, 10));
	}
	
	
	}
