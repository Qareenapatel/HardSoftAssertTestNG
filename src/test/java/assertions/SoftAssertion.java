package assertions;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void test1() {
		SoftAssert softAssert2 = new SoftAssert();
		
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);

		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, true);

		System.out.println("validate home page");
		softAssert2.assertEquals(true, false, "home page title is missing");// soft assertion

		System.out.println("go to deals page");
		System.out.println("create a deal");
		softAssert2.assertEquals(true, false, "not able to create a deal");// soft assertion

		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softAssert2.assertEquals(true, false, "not able to create a contact");// soft assertion

		softAssert2.assertAll();

	
	
}
	@Test
	public void test2() {
		SoftAssert softAssert3 = new SoftAssert();
		System.out.println("logout");
		softAssert3.assertEquals(true, false);
		softAssert3.assertAll();

	}
	
	@AfterClass
	public void tearDown() {
		
	}

	
	}
