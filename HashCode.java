package practice.hashcode;

import java.util.HashSet;
import java.util.Iterator;

public class HashCode {

	private String name;

	
	public HashCode(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
//if you not override hashcode() then same object stores multiple times in hashing tech

	//Override hashCode()
	/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCode other = (HashCode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main(String[] args) {
 
//		HashSet<String> hs = new HashSet<>();
//		hs.add("Barfa");
//		hs.add("Barfa1");
//		hs.add("Barfa");
//		hs.add("Barfa2");
//		hs.add("Barfa");
//		Iterator<String> itr = hs.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	
		HashSet<HashCode> hs = new HashSet<>();

		hs.add(new HashCode("Barfa"));
		hs.add(new HashCode("Barfa1"));
		hs.add(new HashCode("Barfa"));
		hs.add(new HashCode("Barfa2"));
		hs.add(new HashCode("Barfa"));
	 
		Iterator<HashCode> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}

	}
	
	

}
