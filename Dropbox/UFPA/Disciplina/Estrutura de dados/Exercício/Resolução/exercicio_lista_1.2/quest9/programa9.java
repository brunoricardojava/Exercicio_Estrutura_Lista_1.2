
public class programa9{
  public static void main(String args[]) {
    Livro obj1 = new Livro();
    
    obj1.setTitulo("Python como programar");

    obj1.setAutor("Sei la...");

    obj1.setAssunto("Programacao");

    obj1.setQuantidadePaginas(374);

    obj1.setEdicaoVolume('3','1');

    obj1.mostradados();
  }
}

class Livro{
	//Atributos
	private String titulo;
  private String autor;
  private int quantidadePaginas;
  private char volume;
  private char edicao;
  private String assunto;

	//Métodos

  void setTitulo(String Titulo){
    this.titulo = Titulo;
  }

  void setAutor(String Autor){
    this.autor = Autor;
  }

  void setAssunto(String Assunto){
    this.assunto = Assunto;
  }

  void setQuantidadePaginas(int Quant){
    this.quantidadePaginas = Quant;
  }

  void setEdicaoVolume(char Edicao, char Volume){
    this.edicao = Edicao;
    this.volume = Volume;
  }

  void mostradados(){
    System.out.println("Nome: "+this.titulo);
    System.out.println("Autor: "+this.autor);
    System.out.println("Quantidade de paginas:"+ this.quantidadePaginas);
    System.out.println("Edição e Volume: "+ this.edicao+ ", " + this.volume);
    System.out.println("Assunto: "+ this.assunto);

  }

}

