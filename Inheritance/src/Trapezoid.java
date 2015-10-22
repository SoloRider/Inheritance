
public class Trapezoid extends Quadrilateral
	{
		protected double base1;
		protected double base2;
		protected double height;
		
		public Trapezoid(double b1, double b2, double h)
			{
				base1 = b1;
				base2 = b2;
				height = h;
			}
		public double findPerimeter()
			{
				return (base1 + base2) / 2 * height;
			}
	}
