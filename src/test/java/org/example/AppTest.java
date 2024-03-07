package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     */


    public void testPush(){

        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        assertEquals(10,stack.pop().intValue());
    }

    public void testPopOnEmptyStack(){
        MyStack<Integer> stack = new MyStack<>();
        try{
            stack.pop();
            fail("Expected EmptyStackException");
        } catch(EmptyStackException e){
            e.getStackTrace();
        }
    }

    public void testInEmpty(){
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    public void testSize(){
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0,stack.getSize());
        stack.push(1);
        stack.push(2);
        assertEquals(2,stack.getSize());
    }


    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
