package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int max = (first > second || first == second) ? first:second;
        if (max == first) {
            System.out.println("first");
        }else {System.out.println("second");
        }
    }
}
