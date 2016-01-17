
public class programa8{
  public static void main(String args[]) {
    ReprodutorDeMusica obj1 = new ReprodutorDeMusica();

    obj1.setNome("Favoritas");

    obj1.setQuantidade(7);

    obj1.play();

    obj1.mostradados();
  }
}

class ReprodutorDeMusica{
	//Atributos
	private String nomeColecao;
  private int quantidade;
  private boolean playMusic;

	//Métodos

  void play(){
    //Metodo para executar a coleção de musicas
    this.playMusic = true;
  }

  void setNome(String Nome){
    this.nomeColecao = Nome;
  }

  void setQuantidade(int Quant){
    this.quantidade = Quant;
  }

  void mostradados(){
    System.out.println("Nome: "+this.nomeColecao);
    System.out.println("Quantidade de musicas da coleção: "+this.quantidade);
    if(this.playMusic==true) System.out.println("Esta em estado: Ligado");
    else System.out.println("Esta em estado: Desligado");

  }

}

