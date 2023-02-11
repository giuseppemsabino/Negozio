import java.util.ArrayList;

public abstract class Prodotti {

        private double peso;
        private double prezzo;


        public Prodotti(double peso, double prezzo) {
            this.peso = peso;
            this.prezzo = prezzo;
        }

    public double getPeso() {
        return peso;
    }
    public  double getPrezzo(){
        return prezzo;
    }
    public abstract String getThing();

}
