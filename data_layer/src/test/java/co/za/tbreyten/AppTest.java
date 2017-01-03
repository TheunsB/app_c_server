package co.za.tbreyten;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    public void testGetHello() throws Exception {
        assertEquals("Hello", App.getHello());
    }
}
