package Lession4_CountingElements;



public class MaxCounters {

    public MaxCounters() {

        int N = 5;
        int A[]= new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(N, A);
        System.out.println("MaxCounters result=");
        for(int i : result) {
            System.out.println(i);
        }
    }

    public int[] solution(int N, int[] A) {
        int[] maxCounters = new int[N];
        int max = 0;
        int tempMax = 0;

        for(int i=0; i<A.length; i++) {
            if (A[i] > N) {
                max = tempMax;
            } else {
                int index = A[i]-1;
                maxCounters[index] = Math.max(maxCounters[index], max);
                maxCounters[index]++;
                tempMax = Math.max(tempMax, maxCounters[index]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (maxCounters[i]<max) {
                maxCounters[i]=max;
            }
        }
        return maxCounters;
    }
}
