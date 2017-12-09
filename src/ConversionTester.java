import java.util.Scanner;
public class ConversionTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an imperial unit (fl. oz, gal, oz, lb, in, ft, mi): ");
        String convertIn = in.next();
        System.out.print("Please enter a matching metric unit(ml, l, g, kg, mm, cm, m, km)(match volume to volume, length to length, or mass to mass): ");
        String convertOut = in.next();
        System.out.print("Enter the value that you would like to convert from " + convertIn + " to " + convertOut + ": ");
        double convertValue = in.nextDouble();
        Conversion number = new Conversion(convertIn, convertOut, convertValue);
        if(number.convert() == 0){
            System.out.println("Sorry, one or both of your measurements was input incorrectly.");
        }else{
            System.out.println(convertValue + " " + convertIn + " is equivalent to " + number.convert() + " " + convertOut + ".");
        }
    }
}
