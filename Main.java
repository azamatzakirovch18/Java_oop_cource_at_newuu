import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void first() {
        System.out.print("Task 1\n");

        System.out.println("""
                Name: Student Name
                Adress: Tashkent City ,Chilanzar 9
                passcode: ********
                """);
    }

    public static void second() {
        System.out.print("Task 2\n");
        Scanner name = new Scanner(System.in);
        String new_name;
        System.out.print("Enter new name: ");
        new_name = name.nextLine();

        System.out.print("Hi " + new_name);
    }

    public static void third(){
        Double height,length,perimetre,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Task 3 \n");
        System.out.print("Enter height: ");
        height = input.nextDouble();

        System.out.print("Enter length: ");
        length = input.nextDouble();

        perimetre = 2 * (length + height);
        area = length * height;

        System.out.print("Area is " + area);
        System.out.print(" and Perimeter is " + perimetre);
    }

    public static void fourth(){
        Scanner input = new Scanner(System.in);
        Double radius,area,length,volume;
        System.out.print("Task 4\n");
        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        System.out.print("Enter length: ");
        length = input.nextDouble();

        area = 3.14 * radius * radius;
        volume = area * length;

        System.out.print("""
                if height is %f and radius is %f
                then area is %f and volume is %f
                """.formatted(length,radius,area,volume));
    }

    public static void fifth(){
        Scanner inout = new Scanner (System.in);
        System.out.print("Task 5\n");
        Double height,side,area,volume,constants;
        System.out.print("""
                Let's imagine there is 1 pyramid and every side is equal.
                Task is find the volume of this pyramid, Your task is 
                enter 1 side:  """ + " ");
        side = inout.nextDouble();

        System.out.print("And the height is: ");
        height = inout.nextDouble();

        constants = Math.sqrt(3) / 4;

        area = constants * side * side;
        volume = area * height;

        System.out.print("""
                Area is: %f \n
                Volume is: %f
                """.formatted(area,volume));
    }

    public static void sixth(){
        System.out.print("Task 6\n");
        Scanner input = new Scanner (System.in);
        Double meal,total,with_tax,with_tip;

        final double TAX = 0.08;
        final double TIP = 0.20;

        System.out.print("Please enter the cost of meal in USD: ");
        meal = input.nextDouble();

        with_tax = meal * TAX;
        with_tip = meal * TIP;

        total = with_tax + with_tip + meal;

        System.out.print("""
                Your meal is $%.2f.
                Tax rate: %.0f%%
                Tip rate: %.0f%%
                Tax: $%.2f
                Tip: $%.2f
                Total: $%.2f
                """.formatted(meal,TAX*100,TIP*100,with_tax,with_tip,total));
    }

    public static void seventh(){
        System.out.print("Task 7\n");
        Scanner input = new Scanner (System.in);
        Double distance,cost,mile_per_gallon,total;
        System.out.print("Please enter the distance: ");
        distance = input.nextDouble();

        System.out.print("Please enter miles per gallon: ");
        mile_per_gallon = input.nextDouble();

        System.out.print("Please nter price per gallon: ");
        cost = input.nextDouble();

        total = (distance / mile_per_gallon) * cost;

        System.out.printf("""
                
                
                
                If you want to drive for %.2f miles
                your engine uses 1 galon for %.2f miles
                and 1 gallon fuel is $%.2f
                
                and you must spent $%.2f for this trip
                """.formatted(distance,mile_per_gallon,cost,total));
    }

    public static void eighth(){
        System.out.print("Task 8\n");
        Scanner input = new Scanner (System.in);
        int number,s,t,l;
        System.out.print("Please enter the digit with length is 4: ");
        number = input.nextInt();
        l = number % 10;
        number = number / 10;
        t = number % 10;
        number = number / 10;
        s = number % 10;
        number = number / 10;
        System.out.print(l+t+s+number);
    }

    public static void ninth(){

        System.out.print("Task 9\n");
        Scanner input = new Scanner (System.in);
        int s,t,l,min,max,middle;
        System.out.print("1: ");
        s = input.nextInt();

        System.out.print("2: ");
        t = input.nextInt();

        System.out.print("3: ");
        l = input.nextInt();

        min = Math.min(s, Math.min(t, l));
        max = Math.max(s, Math.max(t, l));
        middle = (s + t + l) - min - max;

        System.out.print(min + " " + middle + " " + max);
    }

    public static void main(String[] args) {
        // from here you can run all tasks
        first();
    }
}