package Basic.StackQueue;

import java.util.Stack;

public class MaxChunksToSorted {

    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            if (stack.isEmpty() || stack.peek() <= arr[i]) {
                stack.add(arr[i]);
            }
            else if (stack.peek() > arr[i]) {
                int top = stack.pop();
                while (!stack.isEmpty() && stack.peek() > arr[i]) stack.pop();
                stack.add(top);
            }
        }
        return stack.size();
    }
}
