package lab_banco_digital;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100);
		Conta cp = new ContaCorrente(venilton);
		cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}