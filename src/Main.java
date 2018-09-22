import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double number1 = 0, number2 = 0;

        while (number1 <= 3.0) {

            if (number1 == 0d) {
                System.out.printf("0,");
                number1 += 0.1;
            } else if (number1 > 2.9 && number1 < 3.1) {
                System.out.println("3.0");
                number1 += 0.1;
            } else {
                System.out.printf(Locale.US, "%.1f,", number1);
                number1 += 0.1;
            }
        }


        do {
            if (number2 == 0d) {
                System.out.printf("0,");
                number2 += 0.1;
            } else if (number2 > 2.9 && number2 < 3.1) {
                System.out.println("3.0");
                number2 += 0.1;
            } else {
                System.out.printf(Locale.US, "%.1f,", number2);
                number2 += 0.1;
            }
        } while (number2 < 3);
        System.out.printf("3.0");


    }

}