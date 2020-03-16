package pl.parser.nbp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement(name = "pozycja")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Position implements Serializable {

    private String nazwa_waluty;
    private int przelicznik;
    private String kod_waluty;
    private String kurs_kupna;
    private String kurs_sprzedazy;

    public Position() {
    }

    public Position(String nazwa_waluty, int przelicznik, String kod_waluty, String kurs_kupna, String kurs_sprzedazy) {
        this.nazwa_waluty = nazwa_waluty;
        this.przelicznik = przelicznik;
        this.kod_waluty = kod_waluty;
        this.kurs_kupna = kurs_kupna;
        this.kurs_sprzedazy = kurs_sprzedazy;
    }
    
    public String getNazwa_waluty() {
        return nazwa_waluty;
    }

    public void setNazwa_waluty(String nazwa_waluty) {
        this.nazwa_waluty = nazwa_waluty;
    }

    public int getPrzelicznik() {
        return przelicznik;
    }

    public void setPrzelicznik(int przelicznik) {
        this.przelicznik = przelicznik;
    }

    public String getKod_waluty() {
        return kod_waluty;
    }

    public void setKod_waluty(String kod_waluty) {
        this.kod_waluty = kod_waluty;
    }

    public String getKurs_kupna() {
        return kurs_kupna;
    }

    public void setKurs_kupna(String kurs_kupna) {
        this.kurs_kupna = kurs_kupna;
    }

    public String getKurs_sprzedazy() {
        return kurs_sprzedazy;
    }

    public void setKurs_sprzedazy(String kurs_sprzedazy) {
        this.kurs_sprzedazy = kurs_sprzedazy;
    }
}
