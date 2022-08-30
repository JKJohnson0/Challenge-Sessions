package ChallengeList;

public class twoSum {

	public int[] checkSum(int[] nums, int target) {
		int[] newNums = new int[2];
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					newNums[0] = nums[i];
					newNums[1] = nums[j];
				}
			}
		}
		return newNums;    
	}

}
