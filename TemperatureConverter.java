import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("-------------------------------");

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String unit = scanner.nextLine().toLowerCase();

        switch (unit) {
            case "celsius":
                double fahrenheit = celsiusToFahrenheit(temperature);
                double kelvin = celsiusToKelvin(temperature);
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.%n", temperature, fahrenheit, kelvin);
                break;
            case "fahrenheit":
                double celsius = fahrenheitToCelsius(temperature);
                kelvin = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.%n", temperature, celsius, kelvin);
                break;
            case "kelvin":
                celsius = kelvinToCelsius(temperature);
                fahrenheit = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f degrees Fahrenheit.%n", temperature, celsius, fahrenheit);
                break;
            default:
                System.out.println("Invalid unit. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
    }
}
//Output tested in Terminal.