package controleur;

import modele.Continent.DRAPEAU;

import vue.VueContinator;

public class CommandeChoisirPays extends Commande{
	
	protected DRAPEAU ancienDrapeau;
	protected DRAPEAU nouveauDrapeau;
	
	public CommandeChoisirPays(DRAPEAU ancienDrapeau, DRAPEAU nouveauDrapeau) 
	{
		this.nouveauDrapeau = ancienDrapeau;
		this.nouveauDrapeau = nouveauDrapeau;
		
		
	}

	public void executer() 
	{
		VueContinator.getInstance().afficherPays(this.nouveauDrapeau);
	}
	
	public void annuler() 
	{
		VueContinator.getInstance().afficherPays(this.ancienDrapeau);
	}

}
