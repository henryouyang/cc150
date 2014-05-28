package chapter1;
import static chapter1.print.print;



public class question3 {
public static void main(String[] args){
	String str1="apple";
	String str2="pplez";
	question3 question3=new question3();
	print(question3.compare(str1,str2));
	
	print(question3.comparecount(str1,str2));		
			
}

// Apple and people is different, ratate and tatera is the same.

	// first solution: sort

	public boolean compare(String str1,String str2){
		if(str1==null){  //  TO JUDGE IF STRING IS NULL SHOULD USE == NOT =
		   if (str2==null){
		      print("Both of two strings are null.");
		      return true;
		   }
		   else{ return false; }// MUST ADD THIS TO AVOID NULLPOINTEREXCEPTION IN NEXT CLAUSE"LENGTH()"
		 //  else return false; // if can we delete {}? YES WE CAN
		}
		if(str1.length()!=str2.length()) return false;
		return sort(str1).equals(sort(str2));
	}

	public String sort(String str){
		char[] cha=str.toCharArray();
		java.util.Arrays.sort(cha);
		String strr=new String(cha);
		return strr; //  FORGET ADD ;;
	}
	public boolean comparecount(String str1, String str2){
		 if(str1==null){
			   if (str2==null){
			      print("Both of two strings are null.");
			      return true;
			   }
			   else{ return false;
			   } // if can we delete {}?
			}
			if(str1.length()!=str2.length()) return false;
			
			int[] count=new int[256];
			for(int i=0;i<str1.length();i++){
			   int j=(int)str1.charAt(i);
			    count[str1.charAt(i)]++;
			    print("count["+(char)j+"]="+count[j]);
			}
			
			for(int a=0;a<str2.length();a++){
			    int b=str2.charAt(a);
			    print(b);
			    char i='p';
			    int ii=i;
			    print("ii="+ii);
			    if((--count[str2.charAt(a)])<0)   //不可以是--放在后面 这样的话就是先做比较再做--
			    	{
			    	print("count["+(char)b+"]="+count[b]);
			    	return false;  
			    	
			    	}
		    	print("count["+(char)b+"]="+count[b]);

			   // else return true;  //只摆在这里不可以 在最后必须要放 return 要不然报错
			}
			
			return true;

		}
}
