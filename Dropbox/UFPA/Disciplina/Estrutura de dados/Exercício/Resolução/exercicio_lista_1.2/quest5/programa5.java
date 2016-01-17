
public class programa5{
  public static void main(String args[]) {
    Time obj1 = new Time();

    obj1.setNome("Anderas");

    obj1.setQuantidade(16);

    obj1.setRank(23);

    obj1.setVitorias(14);

    obj1.setDerrotas(7);

    obj1.setNextPlay("07/08/2016");

    obj1.mostraInfo();
  }
}

class Time{
	//Atributos
	private String nome;
  private int quantidade;
  private int rank;
  private int virotias;
  private int derrotas;
  private String data_next_round;


	//Métodos

	void setNextPlay(String Data){
    this.data_next_round = Data;
	}

  void setNome(String Nome){
    this.nome = Nome;
  }

  void setQuantidade(int Quantidade){
    this.quantidade = Quantidade;
  }

  void setRank(int Rank){
    this.rank = Rank;
  }

  void setVitorias(int Vitorias){
    this.virotias = Vitorias;
  }

  void setDerrotas(int Derrotas){
    this.derrotas = Derrotas;
  }

  void mostraInfo(){
    System.out.println("Nome do time: "+this.nome);
    System.out.println("Quantidade de jogadores: "+this.quantidade);
    System.out.println("Rank do time: "+this.rank);
    System.out.println("Vitorias do time: "+this.virotias);
    System.out.println("Derrotas do time: "+this.derrotas);
    System.out.println("Data da proxima partida: "+this.data_next_round);
  }
}

