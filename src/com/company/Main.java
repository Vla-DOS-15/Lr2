package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Task 1.1
    static boolean IsIntercalaryYear(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    static void GetIsIntercalaryYear(int year){
        if(year <= 1900 || year >= 3000){
            return;
        }
        else if(IsIntercalaryYear(year) == true)
            System.out.println("Високосний");
        else{
            System.out.println("Звичайний");
        }
    }

    // Task 1.2
    static boolean Interval(int number){
        return ((number >= -15 && number <= 12) || (number >= 14 && number <= 17) || (number >= 19));
    }

//  Task #2
    static void CheckingTheNumberOfProgrammers(int numberOfProgrammers){
        if(numberOfProgrammers <= 0){
            return;
        }
        else if(numberOfProgrammers == 1){
            System.out.print(numberOfProgrammers + " програміст");
        }
        else if(numberOfProgrammers > 1 && numberOfProgrammers < 5){
            System.out.print(numberOfProgrammers + " програмісти");
        }
        else{
            System.out.print(numberOfProgrammers + " програмістів");
        }
    }

    //  Task #3
    static int NOD(int x, int y)
    {
        while (x != y)
        {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    //  Task #4
    static void Task4(float x, float y){
        int i = 1;
        while (x < y){
            x*=1.1;
            i+=1;
        }
        System.out.println(i);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("\tTask #1.1:\n");

        System.out.print("Input year: ");
        int year = Integer.parseInt(reader.readLine());
        GetIsIntercalaryYear(year);

        System.out.print("\tTask #1.2:\n");
        System.out.print(Interval(10));

        System.out.print("\n\tTask #2:\n");

        System.out.print("Input number of programmers: ");
        int numberOfProgrammers = Integer.parseInt(reader.readLine());
        CheckingTheNumberOfProgrammers(numberOfProgrammers);

        System.out.print("\n\tTask #3:\n");
        System.out.print("Input first number: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.print("Input last number: ");
        int y = Integer.parseInt(reader.readLine());
        System.out.print("Найбільший цілий дільник цих чисел: " + NOD(x, y));

        System.out.print("\n\tTask #4:\nНомер дня, на який пробіг спортсмена складе не менше y кілометрів: ");
        Task4(2,4);
    }
}
