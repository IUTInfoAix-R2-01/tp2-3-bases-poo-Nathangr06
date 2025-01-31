public class Circle2{
	private double radius=1.0;
	
	public Circle2() {
		this.radius=radius;
	}
	
	public Circle2(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2.0*this.radius*Math.PI;
	}
	
	public String toString() {
		return "Circle : "+this.radius;
	}
	
}