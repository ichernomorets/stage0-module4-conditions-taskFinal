package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year < 0 || month <= 0 || month > 12) {
            System.out.println("invalid date");
        }
        else {
            if (month == 2) {
                boolean isLeadYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
                if(isLeadYear) {
                    System.out.println("29");
                }
                else {
                    System.out.println("28");
                }
            }
            else {
                System.out.println(month % 2 == 0 ? "30" : "31");
            }
        }
    }
}
