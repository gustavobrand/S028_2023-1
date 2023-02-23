package aula02;

public class ExcessaoExemplo extends Exception {
	private int val;

	public ExcessaoExemplo(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	
}
