import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Test {

	public static void main(String[] args) {
		int N = 30;
        int M = 10;
        
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(M);
        
        for (int i = 0; i < N; i++)
            StdOut.printf("%2d", a[i]);
        
        int[] h = histogram(a, M);
        
        StdOut.println("\n");//����
        for (int i = 0; i < M; i++)
            StdOut.printf("%4d", h[i]);
    }
	
	public static int[] histogram(int[] a,int m){
		int[] newArr = new int[m];//ÿ��Ԫ�س�ʼ��Ϊ0
		//System.out.println(Arrays.toString(newArr));
		int n = a.length;
		for(int i = 0;i < n;i++){
			if(a[i]<m){
				newArr[a[i]]++;//��һ���ǳ�����
			}
		}
		return newArr;
		
	}

}