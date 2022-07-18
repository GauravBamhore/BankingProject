package KiteTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void summation() {
	  Reporter.log("The sum is: "+5,true);
  }
  
  @Test
  public void substraction() {
	  Reporter.log("The sum is: "+10,true);
  }
}
