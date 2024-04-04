package app;

import app.service.TimeService;
import app.utils.Time;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TimeService service = new TimeService();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            long seconds = scanner.nextLong();
            System.out.println(service.convertFromSecondToHours(seconds));
        } catch (Exception ex){
            System.out.println("invalid input");
        }


        scanner.close();


    }
}
