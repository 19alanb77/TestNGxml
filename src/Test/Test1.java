package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.MessageUtil;

public class Test1 {
   String message = "Alan";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      Assert.assertEquals(message, messageUtil.printMessage());
   }
}
