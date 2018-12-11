import java.util.ArrayList;
import java.util.List;

public class Digits {
    List<Integer> digitList;

    public Digits(int num) {
        this.digitList = new ArrayList<>();

        if (num == 0) this.digitList.add(0);
        while (num > 0) {
            this.digitList.add(0, num % 10);
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < this.digitList.size(); i++) {
            if (this.digitList.get(i) < this.digitList.get(i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Digits[] tests = {
                new Digits(0), new Digits(1234),
                new Digits(4321), new Digits(1259)
        };

        for (Digits digit : tests) {
            System.out.println(digit.digitList.toString());
            System.out.println(digit.isStrictlyIncreasing());
        }
    }
}
