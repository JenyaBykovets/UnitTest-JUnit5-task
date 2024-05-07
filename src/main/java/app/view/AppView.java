package app.view;

import app.exceptions.TemperatureException;
import app.utils.Constants;

import java.util.Scanner;

public class AppView {
    public void runAppView(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();

        try {
            Constants.validateTemperature(temperature);
            System.out.println("Temperature " + temperature + " permissible  .");
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}


