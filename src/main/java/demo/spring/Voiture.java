package demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Voiture {
	public static int compteur =0;
	private String marque;
	private String couleur;
	private IMoteur moteur;
	
	public Voiture() {}

	@Autowired
	public Voiture(String marque, String couleur, IMoteur moteur) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.moteur = moteur;
		System.out.println(++compteur);
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	

	public IMoteur getMoteur() {
		return moteur;
	}

	public void setMoteur(IMoteur moteur) {
		this.moteur = moteur;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", couleur=" + couleur + ", moteur=" + moteur + "]";
	}

	
	
	
}
