package chapter1;

import static chapter1.print.print;

public class chartoint {
public static void main(String[] args){
	String str="12345";
	String strr="1";
	char[] cha=str.toCharArray();
	char a='9';
	String v[]=new String[10];
	int ii=Integer.valueOf(str);
	print(ii);
	v[0]="asdd";
	print(v[0]);
	int i=(int)a;
	int b=strr.charAt(0);
	print(b);
	int aaa=Math.max(1, 2);
	
	 
	/*
	
	int aa=Character.digit(a, 10);
	String str1=Character.toString(cha[2]);
	//String str2=a.toString();
	int i =Integer.parseInt(Character.toString(cha[0]));
	int j=a-'0';
	print(i);
	print("j="+j);
	char[] newchar=new char[10];
	
	str.getChars(0, 4, newchar, 0);
	
	print(newchar[4]);
	
	
	char[] chararray=new char[]{'a','b','c','d'};
	String stt=String.valueOf(chararray, 2, 2);
	print(stt);  */
	
}
}
