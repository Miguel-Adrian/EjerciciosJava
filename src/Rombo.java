
public class Rombo implements FigurasGeometricas{

	private String name;
	private double lado;
	private double diagMayor;
	private double diagMenor;
	public Rombo(String name, double lado, double diagMayor, double diagMenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagMayor = diagMayor;
		this.diagMenor = diagMenor;
	}//constructor
	
	//getters y setters
	public double calcularPerimetro() {
		return getLado()*4;
	}
	
	public double calcularArea() {
		return ((getDiagMayor()*getDiagMenor())/2);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDiagMayor() {
		return diagMayor;
	}
	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}
	public double getDiagMenor() {
		return diagMenor;
	}
	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagMayor=" + diagMayor + ", diagMenor=" + diagMenor
				+ ", calcularPerimetro()=" + calcularPerimetro() + ", calcularArea()=" + calcularArea() + ", getName()="
				+ getName() + ", getLado()=" + getLado() + ", getDiagMayor()=" + getDiagMayor() + ", getDiagMenor()="
				+ getDiagMenor() + "]";
	}// toString
	
	
}
