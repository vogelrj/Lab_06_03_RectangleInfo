import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        String trash = "";
        double horizontals = 0;
        double verticals = 0;
        double rectPeri = 0;
        double areaRect = 0;
        double diagWork = 0;
        double diagRect = 0;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);
        System.out.println("Let's talk about a rectangle. What is the length of the horizontal sides? [in]? ");
        if (in.hasNextDouble()) {
            horizontals = in.nextDouble();
        }
        else{
            trash.equals(in.nextLine());
            System.out.println("Invalid Entry");
        }
        System.out.println("What is the length of the vertical sides? [in]? ");
        if (in.hasNextDouble()){
            verticals = in.nextDouble();
        }
        else{
            trash.equals(in.nextLine());
            System.out.println("Invalid Entry");
        }
            rectPeri = (horizontals + verticals) * 2;
            areaRect = horizontals * verticals;
            diagWork = (horizontals * horizontals) + (verticals * verticals);
            diagRect = Math.sqrt(diagWork);
            System.out.println("The perimeter of the rectangle is " + df.format(rectPeri) + " inches.");
            System.out.println("the area of the rectangle is " + df.format(areaRect) + " inches.");
            System.out.println("The diagonal inside the rectangle is " + df.format(diagRect) + " inches.");
        }
    }

