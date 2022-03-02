public class HomeWorkApp {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (j == arr[i].length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
        }

    }

    public static void five(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
    }
}



