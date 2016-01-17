
public class programa15{
  public static void main(String args[]) {

    Calculadora obj1 = new Calculadora();

    obj1.calculaMostra(5,3);
  }
}

class Calculadora{
  
  float soma(int x, int y){

    return x+y;
    }

  float sub(int x, int y){

    return x-y;
  }

  float mult(float x, float y){
    return x*y;
  }

  float div(int x, int y){
    return x/y;
  }

  float exp(int x, int y){
    if(y==0) return 1;

    int result =x;

    for(int cont=1;cont<y;cont++){
      result = result*x;
    }

    return result;
  }

  float mod(int x, int y){
    return x%y;
  }

  void calculaMostra(int x, int y){
    System.out.println("Soma entre "+x+" e "+y+" eh: "+this.soma(x,y));
    System.out.println("Sbtracao entre "+x+" e "+y+" eh: "+this.sub(x,y));
    System.out.println("Multiplicacao entre "+x+" e "+y+" eh: "+this.mult(x,y));
    System.out.println("Divisao entre "+x+" e "+y+" eh: "+this.div(x,y));
    System.out.println("Exponenciacao entre "+x+" e "+y+" eh: "+this.exp(x,y));
    System.out.println("Mod entre "+x+" e "+y+" eh: "+this.mod(x,y));
  }
}

