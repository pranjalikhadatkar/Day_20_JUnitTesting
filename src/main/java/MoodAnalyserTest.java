import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenValid_ShouldReturnTrue () {
        boolean valid = junittesting.confirmpassword( "Pran@123" );
        Assert.assertEquals( true, valid );
    }

    @Test
    public void givenPasswordAsPerRule4_ShouldHaveExactlyOneSpecialCharacter_WhenInvalid_ShouldReturnTrue () {
        boolean valid = junittesting.confirmpassword( "pran>12" );
        Assert.assertEquals( false, valid );
    }
}