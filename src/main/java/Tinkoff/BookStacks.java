package Tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class BookStacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i <= n; i++) {
            heights[i] = scanner.nextInt();
        }

        solveBookStacks(n, heights);
    }

    private static void solveBookStacks(int n, int[] heights) {
        Arrays.sort(heights);

        int count = 0;
        int currentHeight = 0;

        for (int i = 0; i <= n; i++) {
            if (heights[i] > currentHeight) {
                count++;
                currentHeight = heights[i];
            }
        }

        System.out.println(count);

        int[] stackHeights = new int[count];
        int stackIndex = 0;

        for (int i = 0; i <= n; i++) {
            if (heights[i] > stackHeights[stackIndex]) {
                stackHeights[stackIndex] = heights[i];
                stackIndex++;
            }
        }

        Arrays.sort(stackHeights);

        for (int i = 0; i < count; i++) {
            System.out.print(stackHeights[i] + " ");
        }
    }
}
