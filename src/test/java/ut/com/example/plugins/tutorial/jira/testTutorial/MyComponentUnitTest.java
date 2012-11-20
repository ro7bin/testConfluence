package ut.com.example.plugins.tutorial.jira.testTutorial;

import org.junit.Ignore;
import org.junit.Test;
import com.example.plugins.tutorial.jira.testTutorial.MyPluginComponent;
import com.example.plugins.tutorial.jira.testTutorial.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
    
    @Test
    public void testAdd()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("Result", 8, component.addNumbers(8, 8));
    }
}