
public class GoingToTheMarket {
	public class product  implements Node{
		public String name = "";
		public double price = 0.0;
		public product next;
		public product (String name, double price){

		}
		@Override
		public void setNext(Node node) {
			// TODO Auto-generated method stub
			this.next=(product)node;
		}

		@Override
		public Node getNext() {
			// TODO Auto-generated method stub
			return this.next;
		}

		@Override
		public Node clone() {
			// TODO Auto-generated method stub
			return new product(name, price);
		}

		@Override
		public boolean isEqual(Node node) {
			// TODO Auto-generated method stub
			product temp=(product)node;

			return this.name.equals(temp.name)? true:false;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}

	}
public GoingToTheMarket() {
}
public void solution() {
	
}
public static void main(String[] args) {
	BufferedReader br= new BufferedReader(new inputStreamReader(System.in));
	
}
}

