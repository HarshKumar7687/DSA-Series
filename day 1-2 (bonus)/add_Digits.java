class add_Digits {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        int n = num%9;
        return n;
    }
    public static void main(String[] args) {
        int result = addDigits(38);
        System.out.println(result);
    }
}