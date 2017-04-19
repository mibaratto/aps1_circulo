
public class Main {

	public static void main(String[] args) {
	
		Circulo circulo1 = new Circulo(10, 3, 3);
		Circulo circulo2 = new Circulo(20, 30, 50);
		
		System.out.println("A área do círculo 1 é " + circulo1.calculaArea());
		System.out.println("A circuferência do círculo 1 é " + circulo1.calculaCircunferencia());
		
		circuloEncosta(circulo1, circulo2);
		
		
	}

	public static double calculaDistanciaPontos(Coordenada coordenada1, Coordenada coordenada2){
		
		double x = coordenada1.getX() - coordenada2.getX();
		double y = coordenada1.getY() - coordenada2.getY();
		
		double distancia = Math.hypot(x, y);
		
		return distancia;
		
	}
	
	public static void circuloEncosta(Circulo circulo1, Circulo circulo2){
		
		double distancia = calculaDistanciaPontos(circulo1.getCoordenada(),circulo2.getCoordenada());
		
		double somaraios = circulo1.getRaio() + circulo2.getRaio();
		
		if(distancia > somaraios){
			System.out.println("Não se tocam!");
		}
		else {
			System.out.println("Se tocam");
		}
		
	}
	
	
}
