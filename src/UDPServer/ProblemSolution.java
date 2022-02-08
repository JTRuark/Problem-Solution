package UDPServer;

import java.util.Arrays;

public class ProblemSolution {
    public boolean solution(int[] A){
        // Sort array first //
        Arrays.sort(A);         // O(nlogn)

        // Iterate through array to find any pairs that differ by 1 //
        for(int i = 1; i < A.length; i++){
            if(A[i] - A[i - 1] == 1){
                return true;
            }
        }
        return false;
    }
}