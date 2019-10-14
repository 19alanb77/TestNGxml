package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.MessageUtil;

public class IgnoreTest {
	
   String message = "Alan";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(enabled = false)
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Alan";
      Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Alan";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }
}
