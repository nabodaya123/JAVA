
public class kadans_Algorithm {
    public static void kadans(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                cs += numbers[i];
                ms = Math.max(cs, ms);
            } else {
                cs += numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }

        }

        System.out.println("Max Subarray Sum is:" + ms);

    }

    public static void main(String args[]) {

        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadans(numbers);

    }
}