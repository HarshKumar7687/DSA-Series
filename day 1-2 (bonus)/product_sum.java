class product_sum {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n!=0){
            int temp = n%10;
            sum = sum+temp;
            product = product*temp;
            n = n/10;
        }
        return product-sum;
    }
    public static void main(String[] args) {
        int result = subtractProductAndSum(234);
        System.out.println(result);
    }
}