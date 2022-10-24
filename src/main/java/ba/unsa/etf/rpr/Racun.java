package ba.unsa.etf.rpr;

public class Racun {

    private  long racun;
    private long brojRacuna;
    private final Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;

    public Racun(long racun, Osoba korisnikRacuna) {
        this.racun = racun;
        this.korisnikRacuna = korisnikRacuna;
    }
    private boolean provjeriOdobrenjePrekoracenja(boolean prekoracenje)
    {
        return prekoracenje;
    }
    public boolean izvrsiUplatu(double iznos)
    {
        stanjeRacuna = stanjeRacuna + iznos;
        return true;
    }
    public boolean izvrsiIsplatu(double iznos)
    {
        if(racun-iznos < 0 ) return false;
        else {
            this.racun = this.racun - (long)iznos;
            return true;
        }
    }

}