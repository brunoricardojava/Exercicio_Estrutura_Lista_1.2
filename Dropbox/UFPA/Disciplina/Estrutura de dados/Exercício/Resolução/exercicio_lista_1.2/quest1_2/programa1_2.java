public class programa1_2{
  public static void main(String args[]) {
    
    Lampada obj1 = new Lampada();

    obj1.setEstadoLampada("Ligada");

    obj1.mostraEstadoLampada();
  }
}

class Lampada{
	//Atributos
	private String estado;

	//Métodos

	void setEstadoLampada(String EstadoLampada){
		this.estado = EstadoLampada;
	}

  void mostraEstadoLampada(){
    System.out.println(this.estado);
  }
}

