import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Примітивні типи даних:");

        System.out.println("byte: " + Byte.SIZE + " біт, "
                + Byte.MIN_VALUE + " ... " + Byte.MAX_VALUE);

        System.out.println("short: " + Short.SIZE + " біт, "
                + Short.MIN_VALUE + " ... " + Short.MAX_VALUE);

        System.out.println("int: " + Integer.SIZE + " біт, "
                + Integer.MIN_VALUE + " ... " + Integer.MAX_VALUE);

        System.out.println("long: " + Long.SIZE + " біт, "
                + Long.MIN_VALUE + " ... " + Long.MAX_VALUE);

        System.out.println("float: " + Float.SIZE + " біт, "
                + Float.MIN_VALUE + " ... " + Float.MAX_VALUE);

        System.out.println("double: " + Double.SIZE + " біт, "
                + Double.MIN_VALUE + " ... " + Double.MAX_VALUE);

        System.out.println("char: " + Character.SIZE + " біт, "
                + (int) Character.MIN_VALUE + " ... "
                + (int) Character.MAX_VALUE);

        System.out.println("boolean: true або false");


        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведіть byte: ");
        byte b = Byte.parseByte(scanner.nextLine());

        System.out.print("Введіть short: ");
        short s = Short.parseShort(scanner.nextLine());

        System.out.print("Введіть int: ");
        int i = Integer.parseInt(scanner.nextLine());

        System.out.print("Введіть long: ");
        long l = Long.parseLong(scanner.nextLine());

        System.out.print("Введіть float: ");
        float f = Float.parseFloat(scanner.nextLine());

        System.out.print("Введіть double: ");
        double d = Double.parseDouble(scanner.nextLine());

        System.out.print("Введіть char: ");
        char c = scanner.nextLine().charAt(0);

        System.out.print("Введіть boolean (true/false): ");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());


        System.out.println("\nВведені значення:");
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bool);

        scanner.close();
    }
}
