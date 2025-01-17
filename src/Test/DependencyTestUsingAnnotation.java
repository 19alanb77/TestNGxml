package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.MessageUtil;

public class DependencyTestUsingAnnotation {
	
	String message = "Alan";
	MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Alan";
      Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test(dependsOnMethods = { "initEnvironmentTest" })
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Alan";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }

   @Test
   public void initEnvironmentTest() {
      System.out.println("This is initEnvironmentTest");
   }
}
