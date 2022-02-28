import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue () {
        boolean valid = junittesting.confirmpassword( "PRan@123" );
        Assert.assertEquals( true, valid );
    }

    @Test
    public void givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue () {
        boolean valid = junittesting.confirmpassword( "pran>12" );
        Assert.assertEquals( false, valid );
    }
}

