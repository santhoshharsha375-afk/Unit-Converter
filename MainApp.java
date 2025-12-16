package app;

import java.util.Scanner;
import converter.UnitConverter;
import dimension.DimensionChecker;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("UNIT CONVERTER & DIMENSION CHECKER");

		System.out.print("Enter value: ");
		double value = sc.nextDouble();

		System.out.print("Enter from unit: ");
		String fromUnit = sc.next();

		System.out.print("Enter to unit: ");
		String toUnit = sc.next();

		if (DimensionChecker.isSameDimension(fromUnit, toUnit)) {

			double result = value;

			if (fromUnit.equals("meter") && toUnit.equals("kilometer"))
				result = UnitConverter.meterToKilometer(value);

			else if (fromUnit.equals("kilometer") && toUnit.equals("meter"))
				result = UnitConverter.kilometerToMeter(value);

			else if (fromUnit.equals("gram") && toUnit.equals("kilogram"))
				result = UnitConverter.gramToKilogram(value);

			else if (fromUnit.equals("kilogram") && toUnit.equals("gram"))
				result = UnitConverter.kilogramToGram(value);

			else if (fromUnit.equals("second") && toUnit.equals("minute"))
				result = UnitConverter.secondsToMinutes(value);

			else if (fromUnit.equals("minute") && toUnit.equals("second"))
				result = UnitConverter.minutesToSeconds(value);
			else if (fromUnit.equals("litre") && toUnit.equals("millilitre"))
				result = UnitConverter.litreToMillilitre(value);
			else if (fromUnit.equals("litre") && toUnit.equals("millilitre"))
				result = UnitConverter.millilitreToLitre(value);

			System.out.println("Converted Value: " + result);

		} else {
			System.out.println("ERROR: Units are NOT dimensionally consistent");
		}

		sc.close();
	}
}
