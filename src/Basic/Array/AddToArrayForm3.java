package Basic.Array;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm3 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> resR = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int i = A.length - 1;
        int sum = 0;
        int carry = 0;
        while (i >= 0 || K != 0) {
            int x = i >= 0 ? A[i] : 0;
            int y = K != 0 ? K % 10 : 0;
            sum = x + y + carry;
            K /= 10;
            carry = sum / 10;
            i --;
            resR.add(sum % 10);
        }
        if (carry == 1) res.add(carry);
        for (int j=resR.size()-1; j>=0; j--) {
            res.add(resR.get(j));
        }
        return res;
    }
}
