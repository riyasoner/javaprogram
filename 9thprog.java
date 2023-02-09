/* WAP to find word of maximum length in given String.
	Sample Input: “Dear Student ,You have need to work hard”
`	Output: “Student”*/
class TestMain{
   public static void maximumlength(String s1[] ){
     int maxlength=0;
     String maxdata="";
     for(int i=0;i<s1.length;i++){
       if(s1[i].length()>maxlength){
         maxlength=s1[i].length();
         maxdata=s1[i];
       }  
     }
    System.out.println(maxdata);
  }
  public static void main(String args[]){
    String s=("aaa a a aaa a aa a a a aaaaa a  ");
    String s1[]=s.split(" ");
    maximumlength(s1);
  }
}	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
