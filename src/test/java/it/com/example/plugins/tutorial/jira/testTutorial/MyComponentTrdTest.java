package it.com.example.plugins.tutorial.jira.testTutorial;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
  
public class MyComponentTrdTest
{
    @Test
    public void testSomeFailure()
    {
        System.out.println("I RAN But failed...");
        assertEquals("something failed","blah","boo");
    }
}
