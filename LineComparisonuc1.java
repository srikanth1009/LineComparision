package LineComparison;

	import java.util.Scanner;
	 class  LineCode1 {
	    public int comparison () {
	        double x1, x2, y1, y2;

	        double dis;

	        Scanner sc = new Scanner ( System.in );

	        System.out.print ( "enter x1 point: " );

	        x1 = sc.nextInt ();

	        System.out.print ( "enter y1 point: " );

	        y1 = sc.nextInt ();

	        System.out.print ( "enter x2 point: " );

	        x2 = sc.nextInt ();

	        System.out.print ( "enter y2 point: " );

	        y2 = sc.nextInt ();

	        dis = Math.sqrt ( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );

	        System.out.println ( "distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis );

	        return (int) dis;
	    }

	}
	public class LineComparisonuc1 {
	    public static void main ( String[] args ) {
	        LineCode1 lineCode1 = new LineCode1 ();
	        System.out.println ( "***************\n    Welcome To Line Comparison Computation \n*****************" );
	        System.out.println ( "\nEnter line 1 coordinates" );
	        int line1 = lineCode1.comparison ();
	        System.out.println ( "\nEnter line 2 coordinates" );
	        int line2 = lineCode1.comparison ();
	    }
	}
