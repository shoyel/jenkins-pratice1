package com.syntexpro.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {


    @Test
    void testHello(){
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello World", helloWorld.hello());
    }


}
