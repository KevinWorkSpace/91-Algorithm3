package Basic.Array;

public class ShortestToChar {

    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        int pre = Integer.MIN_VALUE / 2;
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == C) {
                pre = i;
            }
            res[i] = i - pre;
        }
        int after = Integer.MAX_VALUE / 2;
        for (int i=S.length()-1; i>=0; i--) {
            if (S.charAt(i) == C) {
                after = i;
            }
            res[i] = Math.min(res[i], after - i);
        }
        return res;
    }
}
