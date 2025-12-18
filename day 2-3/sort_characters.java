class sort_characters {
    public static String frequencySort(String s) {
        int[] count = new int[256];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        StringBuilder ans = new StringBuilder();
        while (true) {
            int max = 0;
            int ch = 0;
            for (int i = 0; i < 256; i++) {
                if (count[i] > max) {
                    max = count[i];
                    ch = i;
                }
            }
            if (max == 0) break;
            for (int i = 0; i < max; i++) {
                ans.append((char) ch);
            }
            count[ch] = 0; 
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "cccaaa";
        System.out.println(frequencySort(s));
    }
}
