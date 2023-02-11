import java.util.ArrayList;

public class PadelRacket extends Prodotti {

    private String brandRacket;
    private String racketTipe;



    public PadelRacket(double peso, double prezzo, String brandRacket, String racketTipe){
        super(peso,prezzo);
        this.racketTipe = racketTipe;
        this.brandRacket = brandRacket;
    }
    public String getBrandRacket(){
        return brandRacket;
    }
    public String getTipoRacket(){
        return racketTipe;
    }

    @Override
    public String getThing() {
        return racketTipe;
    }
}
