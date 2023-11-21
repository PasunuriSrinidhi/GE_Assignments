import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();


        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4-digit number for the year.");
            return;
        }

        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

       
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
