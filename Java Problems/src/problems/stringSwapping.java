package problems;

public class stringSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strEqual("banka", "kanba"));
		
	}
	
	public static boolean strEqual(String str1, String str2) {
		if (str1.length() == str2.length()) {
			if (str1.equals(str2)) {
				return true;
			}else {
				if (checkSwapping(str1, str2)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkSwapping(String str1, String str2) {
		int count = 0;
		int a=0, b=0;
		for (int i=0; i<str2.length(); i++) {
			if (!(str2.charAt(i) == str1.charAt(i))){
				count++;
				if(count == 1) {
					a = i;
				}
				if(count == 2) {
					b = i;
				}
			}
		}

		if (count == 2) {
			String str3 = str2.substring(0, a) + str2.charAt(b) + str2.substring(a+1, b) + str2.charAt(a) + str2.substring(b+1, str2.length());
			if (str1.equals(str3)) {
				return true;
			}
		}
		return false;
	}

}
