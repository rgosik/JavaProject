package pl.parser.nbp.xmlmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "pozycja")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Position implements Serializable {

    private String nazwa_waluty;
    private int przelicznik;
    private String kod_waluty;
    private String kurs_kupna;
    private String kurs_sprzedazy;
}
