package com.niit.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calobj=new Calculator();
        System.out.println(calobj.add(10, 5));
        System.out.println(calobj.sub(10, 5));
        System.out.println(calobj.mul(10, 5));
        
        
        
    }
}
