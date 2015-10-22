
public abstract class RightTriangle extends Triangle
	{
		public RightTriangle(double b, double h)
		{
			base = b;
			height = h;
		}
		public double getHypotenuse()
		{
			return Math.sqrt(Math.pow(base, base) * Math.pow(height, base));
		}
	}