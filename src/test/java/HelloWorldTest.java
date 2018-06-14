package org.gpf.maventest01.model;

import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testSayHelloWorld(){
        assertEquals("Hello World!",new HelloWorld().sayHelloWorld());
    }
}