package chapter6;

public class Rectangle {

	
		
		double length;
		double width;
		
		
		public Rectangle() {
			length = 0;
			width = 0;
			
		}
		
		public Rectangle (double length, double width) {
			setLength(length);
			setWidth(width);
			// you can also use this.length = length;
		}
		public double getLength() {
			return length;
			
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getWidt() {
			return width;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public double calculatePerimeter () {
			return (2 * length + 2 * width);
		}
		
		public double calculateArea() {
			return length * width;
		}
		
		
		

	
	

}
