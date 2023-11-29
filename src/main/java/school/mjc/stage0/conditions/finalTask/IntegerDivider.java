package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        }
        else {
            int divisionResult = dividend / divider;
            System.out.println(divisionResult * divider == dividend ? "can be divided completely" : "cannot be divided completely");
        }
    }
}
