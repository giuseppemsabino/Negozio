public  class Libri extends Prodotti{


    private  int numeroPag;
    private int ISBN;
    private String titolo;
    private String categoria;


    public Libri(double peso, double prezzo,int ISBN, String titolo, String categoria, int numeropag){
        super(peso,prezzo);

        this.categoria = categoria;
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.numeroPag = numeropag;
    }
    public int getNumeroPag(){
        return numeroPag;
    }
    public int getISBN(){
        return ISBN;
    }
    public String getTitolo(){
        return titolo;
    }
    public  String getCategoria(){
        return categoria;
    }


    @Override
    public String getThing() {
        return categoria;
    }
}
