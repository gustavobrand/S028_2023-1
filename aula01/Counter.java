package aula01;

public class Counter {
	private int count;
	public Counter() {}
	public Counter(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void increment() { 
		count++; 
	}
	public void increment(int delta) { 
		count += delta; 
	}
	public void reset() {
		count  = 0;
	}
	
	public static void main(String[] args) {
		Counter c1;
		c1 = new Counter();
		Counter c2 = new Counter(10);
		c1.increment();
		c1.increment(10);
		c2.increment(10);
		Counter c3 = c2;
		c3 = c1;
		System.out.println("Valor c1: " + c1.getCount());
		System.out.println("Valor c2: " + c2.getCount());
		System.out.println("Valor c3: " + c3.getCount());
		
		int a = Integer.parseInt("12");
		float b = Float.parseFloat("14.55");
		double c = Double.parseDouble("15.3322");
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		return true;
	}

}
