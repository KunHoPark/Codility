package Lession5_PrefixSums;

public class PassingCars {

    public PassingCars() {

        int A[]= new int[]{0, 1, 0, 1, 1};
        int result = solution(A);
        System.out.println("PassingCars result="+result);
    }

    public int solution(int[] A) {
        int count = 0;
        int passing = 0;

        for(int i : A ) {
            if(i == 0) {
                count++;
            } else {
                passing += count;
            }

            if(passing > 1000000000) {
                return -1;
            }
        }

        return passing;
    }
}
