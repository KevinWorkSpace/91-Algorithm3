package Basic.StackQueue;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<StringBuffer> sc = new Stack<>();
        Stack<Integer> sn = new Stack<>();
        int num = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (Character.isLetter(c)) {
                buffer.append(c);
            }
            else if (c == '[') {
                sn.add(num);
                num = 0;
                sc.add(buffer);
                buffer = new StringBuffer();
            }
            else if (c == ']') {
                int n = sn.pop();
                StringBuffer sb = new StringBuffer();
                for (int j=0; j<n; j++) {
                    sb.append(buffer);
                }
                buffer = sc.pop();
                buffer.append(sb);
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("2[2[y]p4[2[j]e1[f]]]"));
    }
}
