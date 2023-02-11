import java.util.ArrayList;

public class Negozio {


    public static void main(String[] args) {

        ArrayList <Prodotti> prodotti = new ArrayList<>();


        Libri l1 = new Libri(2,200,7251100,"The Grate Gatsby","drama",200);
        Libri l2 = new Libri(3,50,29655134,"Biblia","Fantasy",500);
        Libri l3 = new Libri(29,800,7889055,"Codex Gigas","Fantasy",3000);
        Libri l4 = new Libri(5,20,5440684,"The Lord of Rings", "Fantasy", 600);

        Dvd d1 = new Dvd(0.1,10,"Rock","ACDC",45.00);
        Dvd d2 = new Dvd(0.1,15,"pop","Selena Gomez", 45.00);
        Dvd d3 = new Dvd(1.0,20,"bachata","Romeo Santos",45.00);
        Dvd d4 = new Dvd(1.0,25,"Dembow", "Danny Ocean",45.00);

        PadelRacket p1 = new PadelRacket(0.5,100,"Wilson","Goccia");
        PadelRacket p2 = new PadelRacket(0.4,50,"Pippo","Diamante");
        PadelRacket p3 = new PadelRacket(0.4, 100,"Adidas","Goccia");
        PadelRacket p4 = new PadelRacket(0.5, 20,"Wilfred","rotonda");

        newProduct(prodotti, l1);
        System.out.println("prodotto aggiunto " + l1.getTitolo());
        newProduct(prodotti, l2);
        System.out.println("prodotto agginto " + l2.getTitolo());
        newProduct(prodotti, l3);
        System.out.println("prodotto agginto " + l3.getTitolo());
        newProduct(prodotti, l4);
        System.out.println("prodotto agginto " + l4.getTitolo());
        int quantitaFantasy = numeroFantasyBooks(prodotti);
        System.out.println("nella nostra selezioni di libri " +  quantitaFantasy + " sono di fantasia");

        newProduct(prodotti, d1);
        newProduct(prodotti, d2);
        newProduct(prodotti, d3);
        newProduct(prodotti, d4);

        newProduct(prodotti, p1);
        newProduct(prodotti, p2);
        newProduct(prodotti, p3);
        newProduct(prodotti, p4);
        System.out.println("abbiamo a la nostra disposizione " + prodotti.size() + " prodotti ");

        System.out.println("abbiamo un inventario equivalente  a " + pesoTotale(prodotti) + "kg" );

        System.out.println("I nostri prodotti non superano il modico prezzo di " + prezzoMax(prodotti) + "€");




    }

    public static int inventario(ArrayList <Prodotti> prodotti ){
        return prodotti.size();
    }
    public static void newProduct(ArrayList<Prodotti> listaP, Prodotti n){
        listaP.add(n);
    }
    public static int numeroFantasyBooks (ArrayList<Prodotti> prodotto){
        int coutn = 0;
        for (Prodotti p : prodotto){
            if (p.getThing().equalsIgnoreCase("Fantasy")){
                coutn++;
            }
        }
        return coutn;
    }

    public static double pesoTotale(ArrayList<Prodotti> prodotto){
        double pT = 0;
        for (Prodotti p : prodotto){
            pT += p.getPeso();
        }
        return pT;
    }

    public static double prezzoMax(ArrayList<Prodotti> prodotti){
        double prezzo = 0;
        for (Prodotti d : prodotti){
            if (d.getPrezzo() > prezzo){
                prezzo += d.getPrezzo();
            }
        }
        return prezzo;
    }


}
