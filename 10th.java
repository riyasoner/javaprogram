
//WAP to count the word whose first letter is  vowel

class TestMain{
    public static void vowel(String s1[] )
    {
     int count=0;
     for(int i=0;i<s1.length;i++){
       if(s1[i].charAt(0)=='a' || s1[i].charAt(0)== 'e' || s1[i].charAt(0)== 'i' ||s1[i].charAt(0)== 'o' || s1[i].charAt(0)=='u'||
           s1[i].charAt(0)=='A' || s1[i].charAt(0)== 'E' || s1[i].charAt(0)== 'I' ||s1[i].charAt(0)== 'O' || s1[i].charAt(0)=='U')
       {
         count++;
       }
     }
     System.out.println("The word whose first letter voewl is "+count  );
    }
    
    public static void main(String args[]){
      String s=("Dear Student Eaou wake up early in the Uorning  ");
      String s1[]=s.split(" ");
      vowel(s1);
    }
}	
