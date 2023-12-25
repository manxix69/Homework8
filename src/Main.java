import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        char[] chars = {'a', 'b', 'c', 'd', 'f'};


        System.out.println("Task 2");
        System.out.println("ints = " + Arrays.toString(ints).replace("[", "").replace("]", ""));
        System.out.println("doubles = " + Arrays.toString(doubles).replace("[", "").replace("]", ""));
        System.out.println("chars = " + Arrays.toString(chars).replace("[", "").replace("]", ""));

        System.out.println("Task 3");

        int[] intsReversed = new int[ints.length];
        for (int i = 0, j = intsReversed.length - 1; i < ints.length; i++, j--) {
            intsReversed[j] = ints[i];
        }
        double[] doublesReversed = new double[doubles.length];
        for (int i = 0, j = doublesReversed.length - 1; i < doubles.length; i++, j--) {
            doublesReversed[j] = doubles[i];
        }
        char[] charsReversed = new char[chars.length];
        for (int i = 0, j = charsReversed.length - 1; i < chars.length; i++, j--) {
            charsReversed[j] = chars[i];
        }

        System.out.println("intsReversed = " + Arrays.toString(intsReversed).replace("[", "").replace("]", ""));
        System.out.println("doublesReversed = " + Arrays.toString(doublesReversed).replace("[", "").replace("]", ""));
        System.out.println("charsReversed = " + Arrays.toString(charsReversed).replace("[", "").replace("]", ""));


        System.out.println("Task 4");

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                ints[i] += 1;
            }
        }
        System.out.println("ints = " + Arrays.toString(ints));


    }
}
