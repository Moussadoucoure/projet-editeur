package controleur;


import modele.Pays.PAYS;
import vue.VueContinator;

public class CommandeChoisirDrapeau extends Commande {
	
	
	protected PAYS nouveauDrapeau;
	protected double x;
	protected double y;
	
	public CommandeChoisirDrapeau(PAYS nouveauDrapeau, double x, double y) 
	{
		
		this.nouveauDrapeau = nouveauDrapeau;
		this.x = x;
		this.y = y;
		
		
	}

	public void executer() 
	{
		VueContinator.getInstance().decouvrirPays(nouveauDrapeau, x, y);
	}
	
	public void annuler() 
	{
	
		VueContinator.getInstance().retirerPays(nouveauDrapeau, x, y);
	}

}
