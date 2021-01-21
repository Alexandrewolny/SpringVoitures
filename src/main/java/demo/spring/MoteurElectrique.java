package demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MoteurElectrique implements IMoteur {

	private String puissance;
	
	
	public MoteurElectrique() {	
	}
	
	@Autowired
	public MoteurElectrique(String puissance) {
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
		return "MoteurElectrique [puissance=" + getPuissance()+ "]";
	}
	
	

}
