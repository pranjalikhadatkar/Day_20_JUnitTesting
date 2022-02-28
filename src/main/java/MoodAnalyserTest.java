import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    JUnitTesting junittesting = new JUnitTesting();

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue () {
        boolean valid = JUnitTesting.confirmMobileNumber( "08412087845" );
        Assert.assertEquals( true, valid );
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnTrue () {
        boolean valid = junittesting.confirmMobileNumber( "918412087845" );
        Assert.assertEquals( false, valid );
    }
}
