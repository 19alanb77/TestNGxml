package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.MessageUtil;

public class ExpectedExceptionTest {
	
   String message = "Alan";	
   MessageUtil messageUtil = new MessageUtil(message);
	   
   @Test(expectedExceptions = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }
   
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Alan";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}