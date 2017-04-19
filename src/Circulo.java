
public class Circulo {
	
	double raio;
	Coordenada coordenada = new Coordenada();
	
	
	public Circulo(double raio, int x, int y) {
		this.raio = raio;
		this.coordenada.setX(x);
		this.coordenada.setY(y);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	
	public double calculaArea(){
		double area = Math.PI * raio * raio;
		return area;
	}

	public double calculaCircunferencia(){
		double circunferencia = 2*Math.PI*raio;
		return circunferencia;
	}
	
				

	
}

