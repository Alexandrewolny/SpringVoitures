package demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MoteurEssence implements IMoteur {

	private String puissance;
	
	public MoteurEssence() {
		
	}
	
	@Autowired
	public MoteurEssence(String puissance) {
		this.puissance = puissance;
	}


	@Override
	public String getPuissance() {
		// TODO Auto-generated method stub
		return this.puissance;
	}

	@Override
	public void setPuissance(String puissance) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "MoteurEssence [puissance=" + getPuissance() + "]";
	}
	
	

}
