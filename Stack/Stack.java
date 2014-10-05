
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Stack<T> {

	private List<T> s;
	
	Stack(){
		s=new ArrayList<T>();
	}
	
	public void push(T e){
		if(!e.equals(null))
		{
			s.add(0, e);
			System.out.print("push :");
		}
				
		else
			System.out.println("Null values not allowed");
	}
	
	public T pop(){
		
		if(!s.isEmpty()){
			T e=s.remove(0);
			return e;
		}
		else{
			System.out.println("Stack empty");
			return null;
		}
	}
	
	public boolean isEmpty(){
		return s.isEmpty();
	}
	
}
