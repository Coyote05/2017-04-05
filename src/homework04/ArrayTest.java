package homework04;

import java.util.Arrays;
import java.util.Random;

/**
  Created by Norman on 2017.04.08..
 */
public class ArrayTest {

    private int[] array = new int[20];
    private int[] index = new int[5];
    private int secondMaximum;
    private int k;

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

    private int[][] matrix = new int[5][5];

    public void initMatrix(){

        Random random = new Random();
        double matrixNumber;

        for(int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                matrixNumber = random.nextInt(0+1);
                matrix[i][j] = (int)matrixNumber;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchNotNullRows(){

        for(int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {

                    if (matrix[i][j] != 0) {
                        index[i] = matrix[i][j];
                        k = i;
                        break;
                    }
                }
            }
        if(index[k] != 0){
            System.out.print("Azoknak a soroknak az indexei, amiben van nullától különböző szám: " + Arrays.toString(index));
        }
        else{
            System.out.println("Nem találtam nullától különböző elemet!");
        }
    }
}

