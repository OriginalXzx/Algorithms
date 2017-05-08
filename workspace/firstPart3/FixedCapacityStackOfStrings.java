package xzx.yidiansan;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 一种表示定容字符串栈的抽象数据类型
 * @author xzx
 *
 */
public class FixedCapacityStackOfString {

	public static void main(String[] args) {
       FixedCapacityStackOfString s;
       s = new FixedCapacityStackOfString(100);
       while(!StdIn.isEmpty()){
    	   String item = StdIn.readString();
    	   if(!item.equals("-")){
    		   s.push(item);
    	   }else if(!s.isEmpty()){
    		   StdOut.print(s.pop()+" ");
    	   }
       }
       StdOut.println("(" + s.size() + " left on stack)");
	}
    
	private String[] a;
	private int N;
	public FixedCapacityStackOfString (int cap){
		a = new String[cap]; 
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void push(String item){
		a[N++] = item;
	}
	public String pop(){
		return a[--N];
	}
	
	public boolean isFull(){
		return a.length==N;
	}
}

测试：it was - the best of times - - - it was - the - -
was times of best was the it 