package lightsout;

public class Main {

    private static String[] ptnStr = {
            "110100000", "111010000", "011001000",
            "100110100", "010111010", "001011001",
            "000100110", "000010111", "000001011"
    };

    private static int[] ans = new int[9];

    public static void main(String[] args) {

        int questPtn = Integer.parseInt("010111010",2);
        solve(questPtn, 0, 0);
    }

    public static void solve(int questPtn, int num, int btn) {

        for (int i = btn; i < 9; i++) {
            ans[num] = i;
            int btnPtn = Integer.parseInt(ptnStr[i], 2);
            int newPtn = questPtn ^ btnPtn;
            if (newPtn == 0) {
                for (int a : ans) {
                    System.out.print(a);
                }
            } else {
                solve(newPtn, num + 1, i + 1);
            }
        }
    }
}
