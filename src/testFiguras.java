
public class testFiguras{

	public static void main(String[] args) {
Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
Triangulo t2 = new Triangulo("Bermudas", 87.0, 121.0, 101.0);
Cuadrado c1 = new Cuadrado("Cuadradito", 5);
Rectangulo r1 = new Rectangulo("Rectangulito", 2, 3);
Rombo ro1 = new Rombo("Rombito", 4, 6, 10);
Romboide rode1 = new Romboide("Romboidito", 3, 4);
Trapecio trap1 = new Trapecio("Trapecito", 2, 3, 5, 6, 5, 2, 6);

imprimirCalculo(t1); imprimirCalculo(t2); imprimirCalculo(r1);
imprimirCalculo(c1); imprimirCalculo(ro1); imprimirCalculo(rode1);
imprimirCalculo(trap1);
	}// main
	
	public static void imprimirCalculo(FigurasGeometricas f) {
		System.out.println(f);
		System.out.println("+============================");
		System.out.println("|El área de ["+f.getName()+"] es: "+f.calcularArea()+
				"\n" + "|El perímetro de ["+f.getName()+"] es: "+f.calcularPerimetro());
		System.out.println("+============================");
	}// método imprimirCalculo

}
