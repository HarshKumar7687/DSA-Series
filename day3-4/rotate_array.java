class rotate_array {
    public static void rotate(int[] arr, int d) {
        d = d % arr.length;
        int count = arr.length-d;
        int c = 0;
        int[] arr1 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(count<arr.length){
                arr1[i]=arr[count++];
            }else{
                arr1[i] = arr[c++];
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr1[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}