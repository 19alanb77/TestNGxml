package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Logic.PrimeNumberChecker;

public class ParamTestWithDataProvider1 {
   private PrimeNumberChecker primeNumberChecker;

   @BeforeMethod
   public void initialize() {
      primeNumberChecker = new PrimeNumberChecker();
   }

   @DataProvider(name = "test1")
   public static Object[][] primeNumbers() {
      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
   }

   @Test(dataProvider = "test1")
   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
      System.out.println(inputNumber + " " + expectedResult);
      Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}
