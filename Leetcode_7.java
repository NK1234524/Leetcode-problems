
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Leetcode_7 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (j < nums.length) {
            // Maintain decreasing order in deque
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.pollLast();
            }
            deque.offerLast(nums[j]);

            // Window size < k
            if (j - i + 1 < k) {
                j++;
            }
            // Window size == k
            else if (j - i + 1 == k) {
                // Front of deque is max
                result.add(deque.peekFirst());

                // Remove element going out of window
                if (nums[i] == deque.peekFirst()) {
                    deque.pollFirst();
                }

                i++;
                j++;
            }
        }

        // Convert result list to array
        int[] resArr = new int[result.size()];
        for (int idx = 0; idx < result.size(); idx++) {
            resArr[idx] = result.get(idx);
        }

        return resArr;
    }
}