package homework04;

import java.util.Arrays;
import java.util.Random;

/**
  Created by Norman on 2017.04.08..
 */
public class ArrayTest {

    private int[] array = new int[20];
    private int secondMaximum;

    public void intArray(){

        Random random = new Random();

        int number;

        for(int i = 0; i < array.length; ++i){
            number = random.nextInt(-10+20);
            array[i] = number;
        }
    }

    public int getSecondHighest() {

        Arrays.sort(array);
        System.out.println("A tömbben lévő elemek: " + Arrays.toString(array));

        for (int i = 19; i < array.length; --i) {
            if (array[i] != array[i - 1]) {
                secondMaximum = array[i - 1];
                break;
            }
        }
        return secondMaximum;
    }
}
