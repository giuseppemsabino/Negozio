public class Dvd extends Prodotti {

    private double durata;
    private String titolo;
    private String categoria;

    public Dvd(double peso, double prezzo, String categoria, String titolo, double durata){
        super(peso, prezzo);
        this.categoria = categoria;
        this.titolo = titolo;
        this.durata = durata;
    }


    public String getTitolo(){
        return titolo;
    }
    public String getCategoria(){
        return categoria;
    }
    public  double getDurata(){
        return durata;
    }


    @Override
    public String getThing() {
        return null;
    }
}
