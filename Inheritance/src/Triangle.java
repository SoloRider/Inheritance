
public abstract class Triangle extends Shape
	{
		protected double base;
		protected double height;
		
		public double findArea()
			{
				return (base * height) / 2;
			}
		public double findPerimeter()
			{
				return (height * 2) + base;
			}
	}
