package ex1.q1;

class Point {
	private int x = 0;
	private int y = 0;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplacer(int x, int y) {
		this.x += x;
		this.y += y;
	}

@Override
public String toString() {return "("+x+","+y+")";}
}
public class Question1 {
	public static void main(String [] args) {
		Point[] points=new Point[3];
		points[0] = new Point(0,0);
		points[1] = new Point(0,0);
		points[2] = new Point(0,0);
		points[0].deplacer (2, 2); 
		points [1].deplacer (3, 3);
		for(int i=0;i<points.length;i++)
			System.out.println (points [i]);
		}
}


