package Basic.Array;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int plus = 0;
        for (int i=A.length-1; i>=0; i--) {
            if (K == 0 && plus == 0) break;
            A[i] = A[i] + K % 10 + plus;
            K /= 10;
            if (A[i] >= 10) {
                plus = 1;
                A[i] = A[i] - 10;
            }
            else {
                plus = 0;
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        while (K != 0) {
            int num = plus + K % 10;
            if (num >= 10) {
                plus = 1;
                num %= 10;
            }
            else {
                plus = 0;
            }
            K /= 10;
            list2.add(num);
        }
        if (plus == 1) res.add(1);
        for (int i=0; i<list2.size(); i++) {
            res.add(list2.get(list2.size() - 1 - i));
        }
        for (int i=0; i<A.length; i++) {
            res.add(A[i]);
        }
        return res;
    }
}
