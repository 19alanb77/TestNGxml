package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.MessageUtil;

public class Test2 {
   String message = "Alan";	
   MessageUtil messageUtil = new MessageUtil(message);
	 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Alan";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}