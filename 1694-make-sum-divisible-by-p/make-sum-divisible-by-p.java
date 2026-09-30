import java.util.HashMap;

class Solution {

    public int minSubarray(int[] nums, int p) {

        long total = 0;

        for (int n : nums) {
            total += n;
        }

        if (total % p == 0) {
            return 0;
        }

        long sum = 0;
        int ans = nums.length;
        long rem = total % p;

        HashMap<Long, Integer> a = new HashMap<>();

        a.put(0L, -1);

        for (int i = 0; i < nums.length; i++) {

            sum = (sum + nums[i]) % p;

            long need = (sum - rem + p) % p;

            if (a.containsKey(need)) {

                int l = i - a.get(need);

                ans = Math.min(ans, l);
            }

            a.put(sum, i);
        }

        if (ans == nums.length) {
            return -1;
        }

        return ans;
    }
}