/****
@author: regrecario
@description: sample test done in Java
****/
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;


public class TestUnitRunner{

   public static void main(String args[])
   {
   		Result result = JUnitCore.runClasses(TestUnit.class); //run every tests within TestUnit

   		for(Failure failure : result.getFailures()){ //collect all failed tests
   			System.out.println(failure.toString()); //and prompt the details
   		}

   		System.out.println("Number of runs: "+result.getRunCount());//shows number of runs
   		System.out.println("All tests successful? "+result.wasSuccessful()); //if all tests are successful 
	
   }

}
