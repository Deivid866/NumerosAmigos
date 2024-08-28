package javaapplication1;

import java.util.Random;

public class JavaApplication1 {

    public static void main(String[] args) {

        Random random = new Random();
        int size = 26000;
        int[][] numbers = new int[size][size];
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                numbers[i][j] = random.nextInt(100);
            }

        }
        long final1 = System.currentTimeMillis();
        System.out.println(final1 - inicio);

    }

}
