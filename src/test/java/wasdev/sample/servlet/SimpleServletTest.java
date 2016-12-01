package wasdev.sample.servlet;


import junit.framework.TestCase;

public class SimpleServletTest extends TestCase {

	public void testGetMessage() {
    	String str1 = "Hello World! Welcome to the Financial Advisor Site!";
    	String str2 = "A budget tells us what we can't afford, but it doesn't keep us from buying it!";
    	
    	String result = SimpleServlet.getMessage();
    	boolean correct = (result.equalsIgnoreCase(str1) || result.equalsIgnoreCase(str2));
    	System.out.println("Testing GetMessage();");
    	
    	assertEquals(correct, true);
    	//fail("not matched");
    	
	}

}
