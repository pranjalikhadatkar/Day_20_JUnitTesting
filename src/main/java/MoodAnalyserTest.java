import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void  givenPasswordAsPerRule1_Having8Characters_WhenValid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmpassword("pran@123");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_Having8Characters_WhenInvalid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmpassword("pranj>00");
        Assert.assertEquals(false,valid);
    }
}
