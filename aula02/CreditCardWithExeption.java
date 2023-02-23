package aula02;

public class CreditCardWithExeption {

	private String cliente;
	private String banco;
	private String conta;
	private int limite;
	private float saldo;
	
	public CreditCardWithExeption(String cliente, String banco, String conta, 
			int limite, float saldo) {
		this.cliente = cliente;
		this.banco = banco;
		this.conta = conta;
		this.limite = limite;
		this.saldo = saldo;
	}
	
	public CreditCardWithExeption(String cliente, String banco, String conta, 
			int limite) {
		this(cliente, banco, conta, limite, 0);
//		this.cliente = cliente;
//		this.banco = banco;
//		this.conta = conta;
//		this.limite = limite;
//		this.saldo = 0;
	}
	
	public String getCliente() { return cliente; }
	public String getBanco()   { return banco; }
	public String getConta()   { return conta; }
	public int getLimite()     { return limite; }
	public float getSaldo()    { return saldo; }

	
	public void imprimirCartao() {
//		System.out.println("Cliente: " + cliente);
//		System.out.println("Banco: " + banco);
//		System.out.println("Conta: " + conta);
//		System.out.println("Limite: " + limite);
//		System.out.println("Saldo: " + saldo);
		System.out.printf("Cliente: %s, banco: %s, conta: %s, limite: %d, saldo: %.2f\n",
				cliente, banco, conta, limite, saldo);
//		System.out.println("Cliente: " + cliente + "Banco: " + banco
//				+ "Conta: " + conta + "Limite: " + limite + "Saldo: " + saldo);
	}
	
	public boolean comprar (float valor) {
		if ((valor + saldo) > limite) {
			System.out.println("Operacao nao autorizada!");
			return false;
		}
		saldo = saldo + valor;
		System.out.println("Operacao autorizada!");
		return true;
	}
	
	public void pagar (float valor) {
		saldo = saldo - valor;
		
//		if (saldo > 0) {
//			saldo = (float) (saldo*1.10);
//		}
	}
	
	public static void main(String[] args) {
		CreditCardWithExeption[] carteira = new CreditCardWithExeption[3];
		carteira[0] = new CreditCardWithExeption("Joao", "Itau", "54765", 1000, 0);
		carteira[1] = new CreditCardWithExeption("Maria", "BB", "55656", 2000, 0);
		carteira[2] = new CreditCardWithExeption("Jose", "Santander", "5768", 3000, 0);
		
//		for (CreditCard cartao : carteira) {
//			cartao.imprimirCartao();
//		}
		
		try {
			for (int i=0; i <= carteira.length; i++) {
				if (i >= carteira.length) {
					//throw new Exception("Excessao disparada na varredura do array");
					throw new ExcessaoExemplo(10);
				}
				carteira[i].imprimirCartao();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de limites de array encontrado!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ExcessaoExemplo e) {
			System.out.println("Valor retornado: " + e.getVal());
			System.out.println(e.getMessage());
			e.printStackTrace();	
		} catch (Exception e) {
			System.out.println("Erro encontrado!!");
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		
//		CreditCard cartao1 = new CreditCard("Joao", "Itau", "54765", 1000, 0);
//		cartao1.imprimirCartao();
//		System.out.println();
//		
//		cartao1.comprar(100);
//		cartao1.imprimirCartao();
//		System.out.println();
//		
//		cartao1.comprar(500);
//		cartao1.imprimirCartao();		
//		System.out.println();
//		
//		cartao1.comprar(500);
//		cartao1.imprimirCartao();
		
	}
	

}