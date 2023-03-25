package Class01;

import org.testng.annotations.Test;

public class enableDisable {

    @Test (enabled = false)
    public void aTest () {
        System.out.println("I am the first test case!");
    }
    @Test
    public void bTest () {
        System.out.println("I am the second test case!");
    }

}
