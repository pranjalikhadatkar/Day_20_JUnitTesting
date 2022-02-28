import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = junittesting.confirmpassword("abc@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc-100@yahoo.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = junittesting.confirmpassword("abc.100@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc111@abc.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc-100@abc.net");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc.100@abc.com.au");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword(".abc@1.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc@gmail.com.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = junittesting.confirmpassword("abc+100@gmail.com");
        Assert.assertEquals(false, result);
    }
}