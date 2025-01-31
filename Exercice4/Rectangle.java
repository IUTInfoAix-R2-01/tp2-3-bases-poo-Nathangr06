public class Rectangle{
	private float lenght = 1;
	private float width = 1;
	
	public Rectangle() {
		this.lenght=lenght;
		this.width=width;
	}
	
	public Rectangle(float lenght, float width) {
		this.lenght=lenght;
		this.width=width;
	}
	
	public float getLength() {
		return this.lenght;
	}
	
	public void setLenght(float lenght) {
		this.lenght=lenght;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth() {
		this.width=width;
	}
	
	public double getArea() {
		return this.lenght*this.lenght;
	}
	
	public double getPerimeter() {
		return 2*this.width+2*this.lenght;
	}
	
	public String toString() {
		return "Rectangle : " + this.getArea();
	}
}