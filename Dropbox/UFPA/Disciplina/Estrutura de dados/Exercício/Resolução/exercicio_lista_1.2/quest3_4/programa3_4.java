public class programa3_4{
  public static void main(String args[]) {
    
    ContaBancaria obj1 = new ContaBancaria();

    obj1.abreConta(-100.0);

    obj1.mostraDados();

    obj1.mostraSaldo();
  }
}

class ContaBancaria{
	//Atributos
	private Double saldo;

	//Métodos

	void abreConta(Double Saldo){
    if(Saldo < 0) Saldo = 0.0;
		this.saldo = Saldo;
	}

  void mostraDados(){
    if(this.saldo < 0) System.out.println("Saldo negativo!!!");
  }

  void mostraSaldo(){
    System.out.println(this.saldo);
  }
}

