/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package learningjava.leapmonth;

import java.util.Scanner;
public class LeapMonth {
    
    int year;
    boolean isleapMonth;

    public LeapMonth(int year){
    
        this.year = year;
    
    }
    
    public void checkLeapMonth(){
    
        isleapMonth = (year % 4 == 0 && year % 100 != 0) 
                      || (year % 400 == 0);
        
        if (isleapMonth) {
            System.out.println(year + " is a leap month.");
        } else {
            System.out.println(year + " is not a leap month.");
        }
        
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        LeapMonth month = new LeapMonth(year);
        month.checkLeapMonth();
        
        input.close();
    }
}

