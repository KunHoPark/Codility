package sort;

public class Sort {
    public Sort() {


    }

    /**
     * Select Sort
     * @param a
     * @param n
     */
    void select_sort(int[]a, int n) {
        int min;                                // 최소값을 저장.
        int minindex;                           // 최소값의 인덱스를 저장

        for(int i=0; i < n-1; i++) {
            minindex = i;                       // 최소값의 초기 설정
            min = a[i];
            for (int j = 0; j < n; j++) {       // i 이후로 최소값을 찾음
                if(min > a[j]) {                // 더 작은 값이 나타나면 바꿈
                    min = a[j];
                    minindex = j;
                }
            }
            a[minindex] = a[i];                 // i 항과 min 항을 교환
            a[i] = min;
        }
    }

    /**
     * Shell Sort
     * @param a
     * @param n
     */
    void shell_sort(int[] a, int n) {
        int i, j, k, h, v;
        for (h = n/2; h > 0; h /=2) {               // h값을 2배로 감소.
            for (i = 0; i < h; i++) {               // h값 이하로 증가.
                for (j = i+h; j < n; j += h) {      // j는 삽입 정렬할 요소를 지정. h 요소끼를 삽입 정렬을 한다.
                    v = a[j];
                    k = j;
                    while (k > h-1 && a[k-h] > v) { // 삽입할 곳을 찾음.
                        a[k] = a[k-h];
                        k -= h;
                    }
                    a[k] = v;
                }
            }
        }
    }

    /**
     * Insert Sort
     * @param a
     * @param N
     */
    void insert_sort(int[] a, int N) {
        int i, j, t;
        for(i=1; i<N; i++) {
            t = a[i];
            j=i;
            while (a[j-1]>t && j>0) {       // 삽입될 곳을 찾음
                a[j] = a[j-1];              // 뒤로 옮김
                j--;
            }
            a[j] = t;                       // 삽입 함
        }
    }

    /**
     * Bubble Sort
     * @param a
     * @param n
     */
    void bubble_sort(int[] a, int n) {
        int t;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j-1] > a[j]) {        // 인접 요소의 비교
                    t = a[j-1];             // 교환
                    a[j-1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
