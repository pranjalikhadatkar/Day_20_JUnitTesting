import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void  givenEMailAddress_WhenValid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmEmailAddress("Pranjali.khadatkar@bl.co.in");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenEMailAddress_WhenInvalid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmEmailAddress("Khadatkargmail.com");
        Assert.assertEquals(false,valid);
    }
}
