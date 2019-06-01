import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class parenthesisBalance {
		
		static Stack parenthesis= new Stack();
		
		
		public static void main(String[] args) throws IOException {
			try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			String line= in.readLine();
			while(line!=null) {
				System.out.println(isCorrect(line)?"Correct":"Incorrect");
				
				line=in.readLine();
			}
			}
		}
		
		
		public static boolean isCorrect(String line) {
			if(line.charAt(0)==')') return false;
			
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i)=='(') {
					parenthesis.push('(');
				}
				if(line.charAt(i)==')') {
						
					if(parenthesis.isEmpty()) {
						parenthesis.push(')');
					}else {
					parenthesis.pop();
				}
					}
				
			}
			if (parenthesis.isEmpty()) 
				return true;
			else 
				return false;
			
			
			
		}
		
		

	}
