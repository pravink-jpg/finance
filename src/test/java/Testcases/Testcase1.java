package Testcases;

import org.testng.annotations.Test;

import Pageobject.Addtocart;
import Pageobject.Homepage;
import Pageobject.Loginpage;

public class Testcase1 {
	@Test
	public  void case1() throws InterruptedException {
		// TODO Auto-generated method stub

		Loginpage first=new Loginpage();
	    first.main(null);
		Homepage second=new Homepage();
		second.main(null);
		Addtocart third=new Addtocart();
		
	}

}
