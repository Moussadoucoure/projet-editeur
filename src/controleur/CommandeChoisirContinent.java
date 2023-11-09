package controleur;

import modele.Continent.DRAPEAU;

import vue.VueContinator;

public class CommandeChoisirContinent extends Commande{
	
	protected DRAPEAU ancienContinent;
	protected DRAPEAU nouveauContinent;
	
	public CommandeChoisirContinent(DRAPEAU ancienContinent, DRAPEAU nouveauContinent) 
	{
		this.ancienContinent = ancienContinent;
		this.nouveauContinent = nouveauContinent;
		
		
	}

	public void executer() 
	{
		VueContinator.getInstance().afficherContinent(this.nouveauContinent);
	}
	
	public void annuler() 
	{
		//VueContinator.getInstance().afficherPays(this.ancienContinent);
	}

}
