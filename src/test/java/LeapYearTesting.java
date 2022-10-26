import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class LeapYearTesting extends Assertions {
    @ParameterizedTest
    @ValueSource (ints = { 400, 800, 1200, 1600, 2004, 2008, 2012, 2016})
    public void must_return_true_when_divided_by_4_but_not_by_100(int argument){
        assertTrue(LeapYear.isLeapYear(argument));
    }
    @ParameterizedTest
    @ValueSource (ints = {400, 800, 1200, 1600, 2004, 2008, 2012, 2016})
    public void must_return_true_when_divided_by_400(int argument){
        assertTrue(LeapYear.isLeapYear(argument));
    }
    @ParameterizedTest
    @ValueSource(ints = {500, 700, 1100, 1800, 2001, 2006, 2010, 2013})
    public void must_return_false_when_not_divideble_by_4(int argument){
        assertFalse(LeapYear.isLeapYear(argument));
    }
    @ParameterizedTest
    @ValueSource(ints = {500, 700, 1100, 1800, 2001, 2006, 2010, 2013})
    public void must_return_false_when_divideble_by_100_but_not_by_400(int argument){
        assertFalse(LeapYear.isLeapYear(argument));
    }

}
