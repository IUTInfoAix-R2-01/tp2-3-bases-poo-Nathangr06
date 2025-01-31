public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
	  /*
      Circle c1 = new Circle();
      
      System.out.println(c1.getArea());
      Circle c2 = new Circle(2.0);

      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      */
	  
      Circle c3 = new Circle(4.0,"blue");
      c3.setRadius(1.5);
      c3.setColor("red");
      /*
      System.out.println("3e cercle après modification : "
    		  + c3.getColor() +" et "+ c3.getRadius());
      */
      //System.out.println(c3.toString());
      System.out.println(c3); 
   }
}