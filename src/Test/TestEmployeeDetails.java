package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Logic.EmpBusinessLogic;
import Logic.EmployeeDetails;

public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();

   @Test
   public void testCalculateAppriasal() {
      employee.setName("Alan");
      employee.setAge(24);
      employee.setMonthlySalary(8000);
      
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      Assert.assertEquals(500, appraisal, 0.0, "500");
   }

   @Test
   public void testCalculateYearlySalary() {
      employee.setName("Alan");
      employee.setAge(24);
      employee.setMonthlySalary(8000);
      
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      Assert.assertEquals(96000, salary, 0.0, "8000");
   }
}