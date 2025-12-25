class move_zeroes {
    public static void moveZeroes(int[] nums) {
       int [] arr = new int[nums.length];
       int n = nums.length;
       int c=0;
       for(int i=0;i<nums.length;i++) {
        if(nums[i]!=0){
            arr[c++]=nums[i];
        }else{
            arr[n-1] = 0;
            n--;
        }
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
       }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}