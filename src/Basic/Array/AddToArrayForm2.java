package Basic.Array;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm2 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int plus = 0;
        int i = A.length - 1;
        int sum = 0;
        while (K != 0 || i >= 0){
            int x = i >= 0 ? A[i] : 0;
            int y = K >= 0 ? K % 10 : 0;
            sum = x + y + plus;
            K /= 10;
            i --;
            plus = sum / 10;
            res.add(sum % 10);
        }
        if (plus == 1) res.add(1);
        List<Integer> resR = new ArrayList<>();
        for (int j=res.size()-1; j>=0; j--) {
            resR.add(res.get(j));
        }
        return resR;
    }
}
