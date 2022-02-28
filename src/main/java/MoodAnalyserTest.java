import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void  givenLastName_WhenValid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmLastName("Khadatkar");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenLastName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = junittesting.confirmLastName("Khadatkar");
        Assert.assertEquals(false,valid);
    }
}
