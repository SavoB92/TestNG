package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("I am before method!");
    }

    @Test (groups = "regression")
    public void aFirstTestCase () {
        System.out.println("I am the first test case!");
    }

    @Test
    public void bSecondTestCase () {
        System.out.println("I am the second test case!");
    }

    @Test
    public void cThirdTestCase () {
        System.out.println("I am the third test case!");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("I am after method!");
    }
}
