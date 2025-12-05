import java.util.Map;

public class TwoSum {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    public void twoSum() {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public void twoSum2() {
        int[] result = new int[2];

        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
