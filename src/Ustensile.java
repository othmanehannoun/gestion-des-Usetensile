
public class Ustensile {
	private int ann�_fabrication;

	public Ustensile(int ann�F) {
		this.ann�_fabrication = ann�F;
	}
	
	public void setAnn�Fabrication(int anneF){
		this.ann�_fabrication = anneF;
	}
	
	public int getAnneFabrication() {
		return ann�_fabrication;
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
