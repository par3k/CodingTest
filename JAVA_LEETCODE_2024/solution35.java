public class solution35 {
    /**
     * 35. Search Insert Position
     *
     * Given a sorted array of distinct integers and a target value,
     * return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(solution(5, nums));
    }

    public static int solution(int target, int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
