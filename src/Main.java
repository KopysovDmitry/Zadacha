import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

            String[] array = new String[10];
            array[0] = "one";
            array[1] = "two";
            array[2] = "three";
            array[3] = "four";
            array[4] = "five";
            array[5] = "five";
            array[6] = "four";
            array[7] = "three";

            String[] arrayCopy = new String[array.length];

            for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < arrayCopy.length; j++) {
                            if (array[i].equals(arrayCopy[j])){
                                    array[i] = null;
                            }

                    }

            }

            System.out.println(Arrays.toString(array));

    }
}