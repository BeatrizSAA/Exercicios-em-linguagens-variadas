package ProjetoCofre;

public class Euro extends Moeda {

    public Euro (double quantidade){
        this.valor = quantidade;
      }


    @Override
    public void info() {
      System.out.println("Euro - "+ valor);
    }

    @Override
    public double converter() {
       return  this.valor*5.4;
    }

    @Override //para solucionar o problema na exclusão de moedas
    public boolean equals (Object objeto){
        if (this.getClass() != objeto.getClass()){
            return false;
        }

        Euro objetoDeEuro = (Euro) objeto;

        if (this.valor != objetoDeEuro.valor){
            return false;
        }
            return true;
    }
    
}
