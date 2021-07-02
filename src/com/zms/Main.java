package com.zms;
import static org.junit.Assert.assertTrue;
import com.zms.Student;
//import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class Main
{
    /**
     * Rigorous Test :-)
     */
    //@Test
    public static void main(String []args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }
}
