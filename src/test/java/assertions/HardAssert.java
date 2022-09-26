package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert {
	
	
	@Test
	public void test() {
		
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, false); 
		System.out.println("validate home page");

		
		
	}

}
