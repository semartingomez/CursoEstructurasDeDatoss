import java.io.BufferedReader;
import java.io.FileReader;

public class Graph implements Node  {
		
		private int Data;
		
		int label;
		Node next;
		List nodes = new List();
		List edges = new List();
		boolean visited = false;
		
		Node MostImportant=null;

		public Graph(int Data, int label) {
			this.Data = Data;
			this.label = label;
		}
		public Graph() {
			
		}

		
		public void insert_node() {
			nodes.insertAtEnd(next);
		}

		public void delete_node() {
			Graph search = new Graph(0, label);
			for (int i = 0; i < nodes.length(); i++)
				if (nodes.get(i).isEqual(search)) {
					nodes.deleteAtIndex(i);
					break;
				}
				
		}

		public void insert_edge(int label1, int label2) {
			Graph search = new Graph(0, label1);
			for (int i = 0; i < nodes.length(); i++)
				if (nodes.get(i).isEqual(search)) {
					edges.insertAtEnd(search);
					break;
				}

			search = new Graph(0, label2);
			for (int i = 0; i < nodes.length(); i++)
				if (nodes.get(i).isEqual(search)) {
					edges.insertAtEnd(search);
					break;
				
		
		}
			
		}
		public static void main(String[] args)
		{
			
			
			try {
				FileReader fr=new FileReader("datos proyecto.txt");
				BufferedReader br =new BufferedReader (fr);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		}
			
		