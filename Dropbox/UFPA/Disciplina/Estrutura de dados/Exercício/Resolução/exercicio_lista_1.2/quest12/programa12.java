
public class programa12{
  public static void main(String args[]) {

    intervalo obj1 = new intervalo();

    obj1.mostraIntervalo(1,20);
  }
}

class intervalo{
  void mostraIntervalo(int x, int y){

    while(y>=x){

      if((x%2)==1) System.out.println(x);

      x++;

    }
  }

}

