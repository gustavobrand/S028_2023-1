package aula02;

public class Pair <TipoA, TipoB> {
	//Atributos
	TipoA item1;
	TipoB item2;
	
	public Pair(TipoA item1, TipoB item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	public TipoA getItem1() {
		return item1;
	}
	public void setItem1(TipoA item1) {
		this.item1 = item1;
	}
	public TipoB getItem2() {
		return item2;
	}
	public void setItem2(TipoB item2) {
		this.item2 = item2;
	}


	public static void main(String[] args) {
		Pair <Integer, Integer> par1;
		Pair <String, Integer> par2;
		par1 = new Pair<Integer, Integer>(1, 10);
		par2 = new Pair<String, Integer>("Teste", 20);
		
		System.out.println("Par 1: " + par1.getItem1() + ", " + par1.getItem2());
		System.out.println("Par 2: " + par2.getItem1() + ", " + par2.getItem2());
		par1.setItem1(50);
		par1.setItem2(100);
		par2.setItem1("Novo Teste");
		par2.setItem2(200);
		System.out.println("Par 1: " + par1.getItem1() + ", " + par1.getItem2());
		System.out.println("Par 2: " + par2.getItem1() + ", " + par2.getItem2());
		
	}

}
