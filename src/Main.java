import Task1.*;
import Task2.*;
import Task2.Integer;
import Task3.Number;

import java.util.*;
public class Main {
    public static void Task1Test() {

        Vehicle[] vehicles1 = new Vehicle[4];
        vehicles1[0] = new Vehicle("Mazzerati", 325, 1955);
        vehicles1[1] = new Car("Ford_F_150", 193, 1814, 450, 5, "gray-brown-crimson");
        vehicles1[2] = new Train("Royal Scotsman", 160, 84900, "Blue", 19, 300);
        vehicles1[3] = new ExpressTrain("JR-Маглев", 603, 40000, "White", 30, 600, 40, "carbon", "electricity");

        for (Vehicle vehicle : vehicles1) {
            vehicle.show();
            System.out.println();
        }
    }

    public static void Task2Test() {
        Task2.Integer num1 = new Task2.Integer(10);
        Task2.Integer num2 = new Task2.Integer(5);
        Real num3 = new Real(3.14);
        Real num4 = new Real(2.0);

        // Виконання арифметичних операцій
        Task2.Integer sum = (Task2.Integer)num1.add(num2);
        Task2.Integer diff = (Task2.Integer)num1.subtract(num2);
        Task2.Integer product = (Task2.Integer)num1.multiply(num2);
        Integer quotient = (Task2.Integer)num1.divide(num2);

        Real sumReal = (Real)num3.add(num4);
        Real diffReal = (Real)num3.subtract(num4);
        Real productReal = (Real)num3.multiply(num4);
        Real quotientReal = (Real)num3.divide(num4);

        // Вивід результатів
        System.out.println("Integer operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        System.out.println("Real operations:");
        System.out.println(num3 + " + " + num4 + " = " + sumReal);
        System.out.println(num3 + " - " + num4 + " = " + diffReal);
        System.out.println(num3 + " * " + num4 + " = " + productReal);
        System.out.println(num3 + " / " + num4 + " = " + quotientReal);
    }

    public static void Task3Test() {
        Task3.Integer int1 = new Task3.Integer(10);
        Task3.Integer int2 = new Task3.Integer(5);

        Task3.Real real1 = new Task3.Real(3.5);
        Task3.Real real2 = new Task3.Real(2.0);

        // Виконуємо арифметичні операції
        Number sum1 = int1.add(int2);
        Number diff1 = int1.subtract(int2);
        Number prod1 = int1.multiply(int2);
        Number quot1 = int1.divide(int2);

        Number sum2 = real1.add(real2);
        Number diff2 = real1.subtract(real2);
        Number prod2 = real1.multiply(real2);
        Number quot2 = real1.divide(real2);

        // Виводимо результати
        System.out.println("Integer:");
        System.out.println(int1.getValue() + " + " + int2.getValue() + " = " + sum1);
        System.out.println(int1.getValue() + " - " + int2.getValue() + " = " + diff1);
        System.out.println(int1.getValue() + " * " + int2.getValue() + " = " + prod1);
        System.out.println(int1.getValue() + " / " + int2.getValue() + " = " + quot1);

        System.out.println("Real:");
        System.out.println(real1.getValue() + " + " + real2.getValue() + " = " + sum2);
        System.out.println(real1.getValue() + " - " + real2.getValue() + " = " + diff2);
        System.out.println(real1.getValue() + " * " + real2.getValue() + " = " + prod2);
        System.out.println(real1.getValue() + " / " + real2.getValue() + " = " + quot2);
    }

    public static void main(String[] args) {
        System.out.println("Lab 3");
        System.out.println("Виберіть завдання (1, 2, 3): ");

        Scanner cin = new Scanner(System.in);
        String choice = " ";

        while (!choice.equals("4")) {
            choice = cin.next();

            if(choice.equals("1")) {
                Task1Test();
            }

            if(choice.equals("2")) {
                Task2Test();
            }

            if(choice.equals("3")) {
                Task3Test();
            }
        }

    }
}