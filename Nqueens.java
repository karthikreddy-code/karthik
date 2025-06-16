public class Main {
    static int n = 4;

    public static void main(String[] args) {
        int[][] ar = new int[n][n];
        solve(ar, 0);
    }

    static void solve(int[][] ar, int r) {
        if (r == n) {
            print(ar);
            System.out.println();
            return;
        }
        for (int c = 0; c < n; c++) {
            if (safe(ar, r, c)) {
                ar[r][c] = 1;
                solve(ar, r + 1);
                ar[r][c] = 0;
            }
        }
    }

    static void print(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean safe(int[][] ar, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (ar[i][c] == 1) return false;
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (ar[i][j] == 1) return false;
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < ar.length; i--, j++) {
            if (ar[i][j] == 1) return false;
        }
        return true;
    }
}
