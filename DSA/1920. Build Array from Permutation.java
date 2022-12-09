import java.util.*;
class Solution {
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        buildArray(nums);
    }
}
