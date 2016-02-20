package snake;

public class Cerchio {
	
	private int x;
	private int y;
	private int raggio;
	
	public Cerchio(int x1,int y2, int raggio) { 
		this.x=x1;
		this.y=y2;
        setRaggio(raggio);
	}

//////////////GETTER SETTER//////////////////////
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
//////////////////////////////////////////////

	public void spostaSu(int deltax, int deltay){
		
		this.x+=deltax;
		this.y+=deltay;
	
	}
	public void spostaGiu(int deltax, int deltay){
		
		this.x-=deltax;
		this.y-=deltay;
	
	}
	public void spostaDx(int deltax, int deltay){
	
		this.x+=deltax;
		this.y+=deltay;
	
	}
	public void spostaSx(int deltax, int deltay){
	
		this.x-=deltax;
		this.y-=deltay;
	}


	public String toString() {
		return "Cerchio [x=" + x + ", y=" + y + ", raggio=" + raggio + "]";
	}

	

}
