
public class programa6_7{
  public static void main(String args[]) {
    Empregado obj1 = new Empregado();

    obj1.setNome("Bruno");

    obj1.setDepartamento("Diretoria");

    obj1.setHorasTrabalhadas(160);

    obj1.setSalarioPorHora(200);

    obj1.mostradados();
  }
}

class Empregado{
	//Atributos
	private String nome;
  private String departamento;
  private int horasTrabalhadasNoMes;
  private int salarioPorHora;


	//Métodos

  void setNome(String Nome){
    this.nome = Nome;
  }

  void setDepartamento(String Departamento){
    this.departamento = Departamento;
  }

  void setHorasTrabalhadas(int Horas){
    this.horasTrabalhadasNoMes = Horas;
  }

  void setSalarioPorHora(int SalarioP){
    this.salarioPorHora = SalarioP;
  }

  void mostradados(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Departamento: "+this.departamento);
    System.out.println("Horas trabalhadas no Mes: "+this.horasTrabalhadasNoMes);
    System.out.println("Salario por hora: "+this.salarioPorHora);
    System.out.println("Salario mensal: "+this.calculaSalarioMensal());
  }

  Double calculaSalarioMensal(){
    if(this.departamento == "Diretoria") return ((this.horasTrabalhadasNoMes*this.salarioPorHora)+(this.horasTrabalhadasNoMes*this.salarioPorHora*0.1));
    else return (this.horasTrabalhadasNoMes*this.salarioPorHora*1.0);
  }

}

