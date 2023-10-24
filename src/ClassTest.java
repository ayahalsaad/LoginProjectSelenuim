import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ClassTest extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		performLogin(StandardUserName, passWord);
		Thread.sleep(3000);
	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		performLogin(ProblemUserName, passWord);
		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		performLogin(PerformanceUserName, passWord);
		Thread.sleep(3000);
	}

	@AfterTest()
	public void AfterTest() {

	}

}
