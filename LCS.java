/*  Copyright (C) <2013>  University of Massachusetts Amherst

	Released under the BSD 3-clause license (see license.txt)
*/ 
/**
 *
 * @author Ismet Zeki Yalniz
 */

import java.util.ArrayList;

public class LCS {

    // precondition: anchor words in t1 and t2 are sorted based on their term positions in respective texts.
    // returns indices of elements in both sequences (in a 2D matrix) that are in the longest common subsequence
    public static int[] findLCS(ArrayList<IndexEntry> t1, ArrayList<IndexEntry> t2){

        int M = t1.size();
        int N = t2.size();
        //ArrayList<IndexEntry> LCSterms = new ArrayList<IndexEntry>();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            String term1 = t1.get(i).getTerm();
            for (int j = N-1; j >= 0; j--) {
                if ( term1.equals(t2.get(j).getTerm()) ) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                }
                else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }

        int LCSindices [] = new int[2 * opt[0][0]] ;

        // recover LCS itself and print it 
        int i = 0, j = 0, count = 0;
        while(i < M && j < N) {

            if (t1.get(i).getTerm().equals(t2.get(j).getTerm())) {
                LCSindices[count] = i;
                LCSindices[opt[0][0]+ count] = j;
                i++;
                j++;
                count++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) {
                i++;
            }
            else {
                j++;
            }
        }

        return LCSindices;
    }

    // Space efficient version using binary recursion but it only reports the LCS length.
    // This function is not called by the recursive alignment tool. 
    // This is just to show how binary recursion is implemented. 
    public static int findLCS_3(ArrayList<IndexEntry> t1, ArrayList<IndexEntry> t2){

        int M = t1.size();
        int N = t2.size();
        //ArrayList<IndexEntry> LCSterms = new ArrayList<IndexEntry>();

        int X[] = new int[N+1];
        int Y[] = new int[N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if ( t1.get(i).getTerm().equals(t2.get(j).getTerm()) ) {
                    X[j] = 1 + Y[j+1];
                }
                else {
                    X[j] = Math.max(Y[j], X[j+1]);
                }
            }
            Y = X;
        }

        return X[0];

    }
}
