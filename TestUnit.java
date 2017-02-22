/****
@author: regrecario
@description: sample test done in Java

1. download junit<ver>.jar... in my case, that is junit-4.10.jar
2. put the file in /usr/local/JUNIT
3. issue this command in the terminal:
	export JUNIT_HOME=/usr/local/JUNIT
4. issue this command in the terminal:
	export CLASSPATH=$CLASSPATH:$JUNIT_HOME/junit-4.10.jar:.


****/
import org.junit.Test;
import static org.junit.Assert.*;


public class TestUnit{

   	String message = "Hello";		
	
	@Test
	public void testComputeSum(){
		Geekenator geek1 = new Geekenator();
		//first arg message if assert fails, second arg expected val, third actual val	
		assertEquals("10+10 must be 20 ",20,geek1.computeSum(10,10));		
		assertEquals("10+100 must be 110 ",110,geek1.computeSum(10,100));	
		assertEquals("10+-10 must be 0 ",0,geek1.computeSum(10,-10));
	}

	@Test
	public void testComputeSum2(){
		Geekenator geek2 = new Geekenator();
		//you can just include this test on the previous 
		//method but we just created another one 
		assertEquals("10+-10 must be 0 ",0,geek2.computeSum(1,1));	//intentional fail			
	}

	@Test //annotations are important
	public void testSingSong(){
		Geekenator geek = new Geekenator();	
		assertEquals("With input 'a' must be","Waaa",geek.singSong("a"));		
		assertEquals("With input 'Wa' must be","Waaa",geek.singSong("Wa"));	
		assertEquals("With input 'Hahahaha' must be","Waaa",geek.singSong("Hahahaha"));	
		//the next one will fail intentionally
		assertEquals("With input 'Hahahaha' must be","Hoho",geek.singSong("Hahahaha"));
	}

	@Test
	public void testDividEdSheeran(){
		Geekenator geek = new Geekenator();			
		fail("This is an intentional failed test");
		assertEquals("With inputs 0 0",-10000,geek.dividEdSheeran(0,0));
		//-10000 here is a code to catch the 0/0 error not an actual answer
	}

	@Test
	public void testAgeValue(){
		Geekenator geek = new Geekenator();	
		assertNotNull("Age is null",geek.getAge());
		assertNotNull("Level is null case#1",geek.getLevel());
		geek.setLevel(null);
		assertNotNull("Level is null case#2",geek.getLevel());
	}

   	@Test
   	//a very simple test
   	public void testPrintMessage() {
   		assertEquals("This will not print!", "Hello", message); 
    	assertEquals("Test Print fails!","Hello1", message); //this one will fail
  	}
}
