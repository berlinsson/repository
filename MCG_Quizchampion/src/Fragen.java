
public class Fragen {

	
private int nummer;
private String kategorie;
private int schwierigkeitsgrad;
private String frage;

private String antwortA;
private String antwortB;
private String antwortC;
private String antwortD;

private Character korrekteAntwort;

public Fragen(int nummer)
{
	setNummer(nummer);
}

public int getNummer() {
	return nummer;
}

public void setNummer(int nummer) {
	this.nummer = nummer;
}

public String getKategorie() {
	return kategorie;
}

public void setKategorie(String kategorie) {
	this.kategorie = kategorie;
}

public int getSchwierigkeitsgrad() {
	return schwierigkeitsgrad;
}

public void setSchwierigkeitsgrad(int schwierigkeitsgrad) {
	this.schwierigkeitsgrad = schwierigkeitsgrad;
}

public String getFrage() {
	return frage;
}

public void setFrage(String frage) {
	this.frage = frage;
}

public String getAntwortA() {
	return antwortA;
}

public void setAntwortA(String antwortA) {
	this.antwortA = antwortA;
}

public String getAntwortB() {
	return antwortB;
}

public void setAntwortB(String antwortB) {
	this.antwortB = antwortB;
}

public String getAntwortC() {
	return antwortC;
}

public void setAntwortC(String antwortC) {
	this.antwortC = antwortC;
}

public String getAntwortD() {
	return antwortD;
}

public void setAntwortD(String antwortD) {
	this.antwortD = antwortD;
}

public Character getKorrekteAntwort() {
	return korrekteAntwort;
}

public void setKorrekteAntwort(Character korrekteAntwort) {
	this.korrekteAntwort = korrekteAntwort;
}
}
