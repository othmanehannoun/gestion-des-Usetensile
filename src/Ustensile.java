
public class Ustensile {
	private int anné_fabrication;

	public Ustensile(int annéF) {
		this.anné_fabrication = annéF;
	}
	
	public void setAnnéFabrication(int anneF){
		this.anné_fabrication = anneF;
	}
	
	public int getAnneFabrication() {
		return anné_fabrication;
	}
	
	public Ustensile(){}
	public double calculerValeur(int anneeActuelle) {
        int age = (anneeActuelle - getAnneFabrication());
        double valeur = 0;
        if (age > 50) {
            valeur = age - 50;
        }
        return valeur;
    }
}
