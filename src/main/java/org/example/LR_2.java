package org.example;

import java.util.Scanner;
import java.util.Random;

public class LR_2 {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = -20;
    private static final int MAX_RANDOM = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків (не більше 20): ");
        int rows = getValidSize(scanner);
        System.out.print("Введіть кількість стовпців (не більше 20): ");
        int cols = getValidSize(scanner);

        int[][] matrix = createMatrix(scanner, rows, cols);
        displayMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);
        double geometricMean = calculateGeometricMean(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    private static int getValidSize(Scanner scanner) {
        int size;
        do {
            size = scanner.nextInt();
            if (size < 1 || size > MAX_SIZE) {
                System.out.print("Некоректний розмір. Введіть значення від 1 до 20: ");
            }
        } while (size < 1 || size > MAX_SIZE);
        return size;
    }

    private static int[][] createMatrix(Scanner scanner, int rows, int cols) {
        System.out.print("Створити матрицю вручну (1) або рандомно (2)? ");
        int choice = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        if (choice == 1) {
            System.out.println("Введіть елементи матриці через Enter:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = MIN_RANDOM + random.nextInt(MAX_RANDOM - MIN_RANDOM + 1);
                }
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0, count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                product *= Math.abs(value);
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
