package snake;

public class Cerchio {
	
	private Punto centro;
	private int raggio;
	
	public Cerchio(Punto centro, int raggio) { 
		this.centro=new Punto(centro);
        setRaggio(raggio);
	}
	
	
	public Punto getCentro() {
		Punto centro=new Punto(this.centro);
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public int getRaggio() {
		return raggio;
	}
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	
	public void spostaSu(int deltax, int deltay){
		
		centro.setX(centro.getX()+deltax);
		
		centro.setY(centro.getY()+deltay);
	
	}
	public void spostaGiu(int deltax, int deltay){
		
		centro.setX(centro.getX()+deltax);
		
		centro.setY(centro.getY()+deltay);
	
	}
	public void spostaDx(int deltax, int deltay){
	
		centro.setX(centro.getX()+deltax);
	
		centro.setY(centro.getY()+deltay);
	
	}
	public void spostaSx(int deltax, int deltay){
	
		centro.setX(centro.getX()+deltax);
	
		centro.setY(centro.getY()+deltay);
	
	}

}
