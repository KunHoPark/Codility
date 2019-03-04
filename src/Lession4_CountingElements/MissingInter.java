package Lession4_CountingElements;

import java.util.*;

public class MissingInter {

    public MissingInter() {
//        int A[]= new int[]{1, 3, 6, 4, 1, 2};
//        int A[]= new int[]{2};
        int A[]= new int[]{4, 5, 6, 2};
//        int A[]= new int[]{-1, -3};
        int result = solution(A);
        System.out.println("MissingInter result="+result);
    }

    public int solution(int[] A) {
        Arrays.sort(A);

        int m[] = new int[5];

        int beforeNum = 0;

        for (int i: A) {
            if (i>0) {

                int v = i - beforeNum;
                if(v>1) {
                    return beforeNum+1;
                }
                beforeNum = i;

            }

        }

        if (beforeNum>=1) {
            return beforeNum+1;
        }

        return 1;
    }
}
