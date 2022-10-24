package ba.unsa.etf.rpr;
import java.util.List;

public class Banka {
    private List korisnici;
    private List uposlenici;
    private final long brojRacuna;

    public Banka(long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
    public Korisnik kreirajNovogKorisnika(String ime,String prezime)
    {
        Korisnik k =  new Korisnik(ime,prezime);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String ime,String prezime)
    {
        Uposlenik u =  new Uposlenik(ime,prezime);
        uposlenici.add(u);
        return u;
    }
    public Racun kreirajRacunaZaKorisnika(Korisnik k)
    {
        return new Racun(0,k);
    }

}