public class Test {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(exR1(n));
    }
	
	public static String exR1(int n){
		if (n <= 0) {
			return "";
		}
		return exR1(n-3) + n + exR1(n-2) + n;
	}

}


Êä³ö£º311361142246