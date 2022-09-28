
public class Trapecio implements FigurasGeometricas{

	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double baseMayor,
			double baseMenor, double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}//constructor
	
	public double calcularPerimetro() {
		return getLado1()+getLado2()+getLado3()+getLado4();
	}
	
	public double calcularArea() {
		return (getAltura()/2)*(getBaseMayor()+getBaseMenor());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura
				+ ", getName()=" + getName() + ", getLado1()=" + getLado1() + ", getLado2()=" + getLado2()
				+ ", getLado3()=" + getLado3() + ", getLado4()=" + getLado4() + ", getBaseMayor()=" + getBaseMayor()
				+ ", getBaseMenor()=" + getBaseMenor() + ", getAltura()=" + getAltura() + "]";
	}// toString
	
	
	
	
}// class Trapecio
