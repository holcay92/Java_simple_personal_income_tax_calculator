
import java.util.Scanner;
public class IncomeTaxCalculator {

    //This program calculates personal income tax

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        // User enters year
        System.out.print("Enter year :");
        int year = input.nextInt();

        // User enters his/her income
        System.out.println("Enter income: ");
        double income = input.nextDouble();
        double tax =0;

        if (year==2020) {
            if (income<=0) {
                System.out.print("Income must be > 0!");
                System.exit(2020);}

            else if(income<22000)
                tax = income*0.15;
            else if (income<49000)
                tax=3300 + (income-22000)*0.20 ;
            else if (income<180000)
                tax=8700+(income-49000)*0.27;
            else if (income<600000)
                tax=44070+(income-180000)*0.35;
            else if (income>=600000)
                tax=191070+(income-600000)*0.40;

        }

        else if (year==2019) {if (income<=0)
            System.out.println("Income must be > 0!");
        else if (income<18000)
            tax = income*0.15;
        else if (income<40000)
            tax=2700 + (income-18000)*0.20 ;
        else if (income<148000)
            tax=7100 + (income-40000)*0.27;
        else if (income<500000)
            tax=36260 + (income-148000)*0.35;
        else if (income>=500000)
            tax=163460 +(income-500000)*0.40;
        }
        else if (year==2018) {
            if (income<=0)
                System.out.println("Income must be > 0!");
            else if (income<14800)
                tax = income*0.15;
            else if (income<34000)
                tax=2220 + (income-14800)*0.20 ;
            else if (income<120000)
                tax=6060 + (income-34000)*0.27;
            else if (income>=120000)
                tax=29280+ (income-120000)*0.35;

        }
        else if(year==2017) {
            if (income<=0)
                System.out.println("Income must be > 0!");
            else if(income<13000)
                tax = income*0.15;
            else if (income<30000)
                tax=1950 + (income-14800)*0.20 ;
            else if (income<110000)
                tax=5350 +(income-30000)*0.27;
            else if (income>=110000)
                tax=26950+(income-110000)*0.35;
        }
        else { System.out.println("Undefined year value! ");
            System.exit(1);
        }
        System.out.println("Income: "+ income);
        System.out.println("Tax amount: "+ (int)(tax*100)/100.0);
        System.out.println("Income after tax: "+ (int)((income-tax)*100)/100.0);
        System.out.println("Real tax rate: " + (int)((tax/income )*10000)/100.0+ "%");
    }

}

