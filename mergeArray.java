public class mergeArray {

    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
        int pointerX = m - 1;  
        int pointerY = n - 1; 
        int pointerMerge = m + n - 1;

        while (pointerX >= 0 && pointerY >= 0) {
            if (X[pointerX] > Y[pointerY]) {
                X[pointerMerge] = X[pointerX];
                pointerX--;
            } else {
                X[pointerMerge] = Y[pointerY];
                pointerY--;
            }
            pointerMerge--;
        }

        while (pointerY >= 0) {
            X[pointerMerge] = Y[pointerY];
            pointerY--;
            pointerMerge--;
        }
    }

    public static void main(String[] args) {
        int[] X = {1, 3, 5, 7, 0, 0, 0}; 
        int[] Y = {2, 4, 6}; 
        int m = 4;  
        int n = 3; 

        mergeArrays(X, Y, m, n);

        // Print merged array X[]
        for (int element : X) {
            System.out.print(element + " ");
        }
    }
}