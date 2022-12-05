class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> lst = new ArrayList<Integer>();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                lst.add(arr[j]);
            }
        }
        return lst;
    }
    public void swap(int[] nums, int i, int correct) {
		int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
	}
}
