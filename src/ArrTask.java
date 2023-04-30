import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4,0,0,0,0,0};
        System.out.println("given array: " + Arrays.toString(nums));

        int[] result = removeDuplicates(nums);
        System.out.println("obtained array: " + Arrays.toString(result));

        System.out.println("----------");

        System.out.println("are the expected and the obtained arrays equal? " + Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] nums) {
        int replaceIndex = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[replaceIndex] = nums[i + 1];
                replaceIndex++;
            }
        }

        for (int i = replaceIndex; i < nums.length; i++) {
            nums[replaceIndex] = 0;
            replaceIndex++;
        }

        return nums;
    }
}