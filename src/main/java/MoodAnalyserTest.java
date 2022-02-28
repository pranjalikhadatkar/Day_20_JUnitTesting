import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void  givenFirstName_WhenValid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmFirstName("Pranjali");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenFirstName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmFirstName("Pranjali");
        Assert.assertEquals(false,valid);
    }
}
