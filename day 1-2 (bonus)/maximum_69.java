class maximum_69 {
    public static int maximum69Number (int num) {
        String s = String.valueOf(num);
        int idx = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            s = s.substring(0, idx) + "9" + s.substring(idx + 1);
            return Integer.parseInt(s);
        }
        return num;
    }
    public static void main(String[] args) {
        int result = maximum69Number(9669);
        System.out.println(result);
    }
}