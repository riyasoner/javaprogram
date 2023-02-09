class TestMain{
    /**
     * @param s
     * @return
     */
    public static String removeDuplicateLetters(String s){
        String output = "";
        for(int i=0; i<s.length(); i++){
            String ch  = ""+s.charAt(i);
            if(output.contains(ch) == false)
             output = output+ch;
        }
        return output;
    }
    public static void main(String args[]){
        String input = "aabbbccccddddd";
        // uniqueString = "abcd"
        String uniqueString = TestMain.removeDuplicateLetters(input);
        for(int i=0; i<uniqueString.length(); i++){
            char ch = uniqueString.charAt(i);
            int count = 0;
            for(int j=0; j<input.length();j++){
               if(ch == input.charAt(j))
                count++;
            }

            System.out.println(ch+" - "+count+" times");
        }
    }
}
