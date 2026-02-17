import java.util.Scanner;

class Calculator
{
    double add(double a, double b)
    {
        return a + b;
    }

    double subtract(double a, double b)
    {
        return a - b;
    }

    double multiply(double a, double b)
    {
        return a * b;
    }

    double divide(double a, double b)
    {
        return a / b;
    }

    double modulus(double a, double b)
    {
        return a % b;
    }
}

class CalApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int ch;

        do
        {
            System.out.println("\nCHOICES:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. END");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            if (ch >= 1 && ch <= 5)
            {
                System.out.print("ENTER FIRST NUMBER: ");
                double x = sc.nextDouble();

                System.out.print("ENTER SECOND NUMBER: ");
                double y = sc.nextDouble();

                switch (ch)
                {
                    case 1:
                        double ans1 = calc.add(x, y);
                        System.out.println("ADDITION OF " + x + " + " + y + " is " + ans1);
                        break;

                    case 2:
                        double ans2 = calc.subtract(x, y);
                        System.out.println("SUBTRACTION OF " + x + " - " + y + " is " + ans2);
                        break;

                    case 3:
                        double ans3 = calc.multiply(x, y);
                        System.out.println("MULTIPLICATION OF " + x + " * " + y + " is " + ans3);
                        break;

                    case 4:
                        if (y == 0)
                        {
                            System.out.println("ZERO DIVISION NOT POSSIBLE");
                        }
                        else
                        {
                            double ans4 = calc.divide(x, y);
                            System.out.println("DIVISION OF " + x + " / " + y + " is " + ans4);
                        }
                        break;

                    case 5:
                        if (y == 0)
                        {
                            System.out.println("ZERO DIVISION NOT POSSIBLE");
                        }
                        else
                        {
                            double ans5 = calc.modulus(x, y);
                            System.out.println("MODULUS OF " + x + " % " + y + " is " + ans5);
                        }
                        break;
                }
            }
            else if (ch != 6)
            {
                System.out.println("INVALID CHOICE");
            }

        } while (ch != 6);

        System.out.println("END");
        sc.close();
    }
}
