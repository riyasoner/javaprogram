class Duplicate{
   public static String removeduplicate(String s){
   String output = "";
   for(int i=0;i<s.length();i++){
    String output1=" "+s.charAt(i);
     if((output.contains(output1)==false))
      output=output+output1;
   }
   return output;  
   }
 }
class Main{
  public static void main(String args[]){
    String riya ="aaabbccd";
    String out= Duplicate.removeduplicate(riya);
    System.out.println(out);
  }
}






