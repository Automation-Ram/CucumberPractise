package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {

	@Before(order = 1)
	public void setUp() {
		System.out.println("Launch Amazon Application");
	}

	@Before(order = 2)
	public void setUp_urL() {
		System.out.println("Launch Amazon Application------->");
	}

	@After(order = 2)
	public void tearDown_closed() {
		System.out.println("Close the browser");
	}

	@After(order = 1)
	public void tearDown() {
		System.out.println("Close the browser------------->");
	}
}
