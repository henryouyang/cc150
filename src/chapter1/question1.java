package chapter1;

public class question1 {

	public static boolean check(String str) {
		int[] checker=new int[32];
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
			int j=str.charAt(i);
			char a=(char)j;
			
			if((checker[i/32]&(1<<(j%32)))>0)return false;
			checker[i/32]|=(1<<(j%32));
			
		}
		return true;

	}

	public static void main(String[] args) {
		String sss = "{asdf ";
		char a = sss.charAt(5);
		System.out.println(a);
		boolean rrr=check(sss);
		System.out.println(rrr);
	}
	static void print(){
	  System.out.print("aaaa");
	}
}
