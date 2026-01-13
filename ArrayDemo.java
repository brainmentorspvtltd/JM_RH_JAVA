class Song {
    String title;
    String artistName;
    String albumName;
    String photo;
    String url;
    int duration;
}

public class ArrayDemo {
    public static void main(String[] args) {
        int g1[][] = new int[3][3];
        int[] g2[] = { { 10, 20, 30 }, { 90, 100, 77 } };
        int[][] g3 = new int[3][4];
        int[][] g4 = new int[3][];
        g4[0] = new int[10];
        g4[1] = new int[20];
        g4[2] = new int[30];
        g4[0][1] = 1;
        g4[2][8] = 1;
        g4[1][5] = 1;
        for (int i = 0; i < g4.length; i++) {
            for (int j = 0; j < g4[i].length; j++) {
                System.out.print(g4[i][j]);
            }
            System.out.println();
        }

        char t[] = new char[10];
        char t2[] = { 'A', 'B' };
        int[] s = new int[10];
        int s2[] = new int[] { 10, 20, 30 };
        int arr[] = { 10, 20, 30 };
        // arr[1]
        int a[] = new int[10]; // fill 0
        Song songs[] = new Song[10]; // Array of Objects

    }
}
