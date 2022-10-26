
public class LeapYear {


    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        }
        if (year % 400 == 0){
            leapYear = true;
            }
        return leapYear;
    }

}
