
public class hash {
public class HashNode implements Node{
public int key;	
public List data;
public HashNode next;
}
	
	private int subsets=100;
	private List keys= new List();
	public hash() {

	}
	public int hash_fuction(int id) {
		return id %subsets;
	}
	public void insert (int id) {
		
	}
}

