import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {

        long total = 0;

        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }

        long remainder = total % p;

        if (remainder == 0) {
            return 0;
        }

        HashMap<Long, Integer> map = new HashMap<>();

        map.put(0L, -1);

        long sum = 0;
        int answer = nums.length;

        for (int i = 0; i < nums.length; i++) {

            sum = (sum + nums[i]) % p;

            long needed = (sum - remainder + p) % p;

            if (map.containsKey(needed)) {
                int length = i - map.get(needed);

                if (length < answer) {
                    answer = length;
                }
            }

            map.put(sum, i);
        }

        if (answer == nums.length) {
            return -1;
        }

        return answer;
    }
}