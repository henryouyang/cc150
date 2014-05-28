package chapter1;

import static chapter1.print.print;

import java.util.Arrays;

public class question4 {
	public static void main(String[] args) {
		String str1 = "acbd feg  ";
		String str2 = "aa  acc  ssassss";
		print(str1);
		question4 q4 = new question4();
		str1 = q4.replace(str1);
		print(str1);
		print(str2);
		char[] arr = str2.toCharArray();
		int spacenumber = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == " ".charAt(0)) { // Comparing with char type, should
											// use ‘ ’ not" "
				spacenumber++;
			}
		}
		int newlength = arr.length + spacenumber * 2;
		int oldlength = arr.length;
		arr = Arrays.copyOf(arr, newlength);
		q4.replace(arr, oldlength);
		str2 = Arrays.toString(arr);
		print(str2);
	}

	// write a method to replace all spaces in a string with "%20". Already
	// given cha array and length. Array has enough sapce

	public String replace(String str) {
		char[] cha = str.toCharArray();
		int length = str.length();
		int spacenumber = 0;
		for (int i = 0; i < length; i++) {
			if (cha[i] == " ".charAt(0)) { // Comparing with char type, should
											// use ‘ ’ not" "
				spacenumber++;
			}
		}
		int newlength = length + spacenumber * 2;
		cha = java.util.Arrays.copyOf(cha, newlength);

		replace(cha, length);
		str = new String(cha);
		return str;
	}

	public void replace(char[] cha, int length) {

		int spacenumber = 0;
		for (int i = 0; i < length; i++) {
			if (cha[i] == " ".charAt(0)) { // Comparing with char type, should
											// use ‘ ’ not" "
				spacenumber++;
			}
		}
		int newlength = length + spacenumber * 2;

		for (int i = length - 1; i > 0; i--) {
			if (cha[i] == " ".charAt(0)) {
				cha[newlength - 1] = '0';
				cha[newlength - 2] = '2';
				cha[newlength - 3] = '%';
				newlength -= 3;
			} else {
				cha[newlength - 1] = cha[i];
				newlength--;
			}
		}
	}
}
