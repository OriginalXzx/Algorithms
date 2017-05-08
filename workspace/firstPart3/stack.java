package xzx.yidiansan;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 下压堆栈（链表实现）
 * @author xzx
 *
 */
public class Stack<Item> {
    
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public int size(){
		return N;
	}
	public void push(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Item pop(){
		//从栈顶移除元素
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public static void main(String[] args) {
        //创建一个队列并操作字符串入列或出列
		Stack<String> s = new Stack<String>();
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!item.equals("-")){
				s.push(item);
			}else if(!s.isEmpty()){
				StdOut.print(s.pop()+" ");
			}
		}
		StdOut.println("("+s.size()+"left on stack");
	}

}
测试：to be or not to - be - - that - - - is
to be not that or be 