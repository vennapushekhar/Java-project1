package com.shekhar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	AdditionBean a1=(AdditionBean)ctx.getBean("id1");
        System.out.println( a1 );
        a1.printAddition();
    }
}
