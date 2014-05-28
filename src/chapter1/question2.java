package chapter1;

public class question2 {

	public static void main(String[] args) {

		String str = "sss aaa dd   ";
		System.out.print(str.length());
		System.out.print(str.trim());
		System.out.print(str);

		String str2 = str.trim();
		System.out.println(str2.length());
		question1 qqq = new question1();
		qqq.print();
		int i = 111;
		String ii = String.valueOf(i);
		System.out.println(ii);
		char data[] = { 'a', 'b', 'c' };
		String strr = new String(data);
		System.out.println(strr);
		
		String str1=reverse("abcdefghijk");
		System.out.println(str1.length());
		System.out.println(str1);
		System.out.println(str1.length());
		
		String aaa="";
		int aaaa=aaa.length();
		System.out.println("length="+aaaa);
		
		
	}

	// public String reverse(String str){

	// }
	
	public static String reverse(String str){
		String strcopy=str.trim();
		int length=strcopy.length()/2;//不能随便改length值 因为后面循环还要用到length做参数 但通过循环可以把前（0-n/2）个调换后面不动
		char[] data=strcopy.toCharArray();

		for(int i=0;i<length/2;i++){
			System.out.println(i);
	       char tmp=data[i];
	       data[i]=data[length-1-i];
	       data[length-1-i]=tmp;

		}
	    return new String(data);



	}

}
