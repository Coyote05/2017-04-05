package homework04;

import java.util.Arrays;
import java.util.Random;

/**
  Created by Norman on 2017.04.08..
 */
public class ArrayTest {

    private int[] array = new int[20];
    private int[] index = new int[5];
    private int maximum = 0;
    private int secondMaximum = 0;
    private int k;
    private int randomMin = -10;
    private int randomMax = 20;

    public void intArray(){

        int randomNumber;

        for(int i = 0; i < array.length; ++i){

            randomNumber = randomMin + (int)(Math.random() * ((randomMax - randomMin) + 1));
            array[i] = randomNumber;
        }
    }

    public int getSecondHighest() {

        System.out.println("A tömbben lévő elemek: " + Arrays.toString(array));

        for(int i = 0; i < array.length; ++i){

            if(array[i] > maximum){

                secondMaximum = maximum;
                maximum = array[i];
            }
            else if(array[i] > secondMaximum && array[i] != maximum){
                secondMaximum = array[i];
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
                matrixNumber = random.nextInt(2);
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
                        index[i] = i;
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

