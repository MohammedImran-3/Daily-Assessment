package org.test;

public class StringProgram {

	public static void main(String[] args) {

		int s = 0, c = 0, d = 0, ch = 0;

		String small = "", capital = "", digits = "", spcl = "";

		String s1 = "MohammedImran@123 SoftWare";

		String[] arr = s1.split(" ");

		String str = " ";

		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i].toString();
		}

		for (int j = 0; j <= str.length() - 1; j++) {
			char a = str.charAt(j);

			if (a > 97 && a <= 122) {
				s++;
				small = small + a;

			} else if (a > 65 && a <= 190) {
				c++;
				capital = capital + a;

			} else if (a >= 48 && a <= 57) {
				d++;
				digits = digits + a;

			} else {
				ch++;
				spcl = spcl + a;
			}

		}

		System.out.println("UpperCase are: " + capital + "\n" + "Count: " + c);
		System.out.println("LowerCase are:" + small + "\n" + "Count: " + s);
		System.out.println("Numeric Values are:" + digits + "\n" + "Count: " + d);
		System.out.println("Special Character are:" + spcl + "\n" + "Count: " + ch);
	}

}
