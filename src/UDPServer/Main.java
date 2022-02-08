package UDPServer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // Driver code for problem //
        ProblemSolution driver = new ProblemSolution();
        ArrayList<int[]> testCases = new ArrayList<>();

        // Provided test cases //
        int[] test_1 = new int[] {7};                   // Should return false //
        testCases.add(test_1);

        int[] test_2 = new int[] {4, 3};                // Should return true //
        testCases.add(test_2);

        int[] test_3 = new int[] {11, 1, 8, 12, 14};    // Should return true //
        testCases.add(test_3);

        int[] test_4 = new int[] {4, 10, 8, 5, 9};      // Should return true //
        testCases.add(test_4);

        int[] test_5 = new int[] {5, 5, 5, 5, 5};       // Should return false //
        testCases.add(test_5);

        // Additional test cases //
        int[] test_6 = new int[] {-2, -1};              // Should return true //
        testCases.add(test_6);

        int[] test_7 = new int[]
                {0, 0, 0, 0, 0, 2, 4, 6, 7};            // Should return true //
        testCases.add(test_7);

        // Run tests //
        for(int i = 0; i < testCases.size(); i++){
            System.out.println("Test " + (i + 1) + " Result: " + driver.solution(testCases.get(i)));
        }
        System.out.println("Tests Complete");
    }
}
