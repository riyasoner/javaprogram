/*) Write a java program to find all possible palindrom of given String.
	Sample Input: “aaabbbacccababacccaabb”*/
class TestMain{
   public static String isPalindrone(String part){
     boolean status=true;
     for(int i =0,j=s.length()-1;i<=j;i++,j--){
       char ch1=s.charAt(i);
       char ch2=s.charAt(j);
       if(!ch1==ch2)
         status=false;
         break;
     }
     return status;
  
   public static void main(String args[]){
     String s = "aaabbbacccababacccaabb";
     LinkedHashSet<String> lhs =new LinkedHashSet<String>();
     for(int i=0;i<s.length()-1;i++){
      for(int j=i+1;j<s.length;j++){
       String part = s.substring(i,j+1);
      }
      boolean status =TestMain.isPalindrone(part); 
      if(status)
       lhs.add(part);
     }
     for(String data : lhs)
     System.out.println(data);
   }
  }  
}  














