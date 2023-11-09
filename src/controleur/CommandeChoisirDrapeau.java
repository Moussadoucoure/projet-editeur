package controleur;

import modele.Continent.DRAPEAU;
import modele.Pays.PAYS;
import vue.VueContinator;

public class CommandeChoisirDrapeau extends Commande {
	
	protected PAYS ancienDrapeau;
	protected PAYS nouveauDrapeau;
	protected double x;
	protected double y;
	
	public CommandeChoisirDrapeau(PAYS ancienDrapeau, PAYS nouveauDrapeau, double x, double y) 
	{
		this.ancienDrapeau = ancienDrapeau;
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
		
	}

}
