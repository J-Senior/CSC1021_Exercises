import java.util.Scanner;

public class BillCalculator {

	int tariff = 0;
	int rate = 0;
	double tariffMinutes = 0;
	double tariffTexts = 0;
	double userMinutes = 0;
	double userTexts = 0;
	double minutesExtraCost = 0;
	double textsExtraCost = 0;
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		BillCalculator b = new BillCalculator();
		b.setTariff();
		b.setRate();
		b.setTariffMinutes();
		b.setTariffTexts();
		b.setMinuteUsage();
		b.setTextUsage();
		b.setMinutesExtraCost();
		b.setTextsExtraCost();
		b.bill();

	}

	public void setTariff() {

		System.out.print("Please enter your tariff plan: ");

		while (true) {
			this.tariff = s.nextInt();

			if ((tariff <= 0) || (tariff >= 3)) {
				System.out.print("Please enter a valid tariff: ");
			} else {
				break;
			}
		}
	}

	public int getTariff() {
		return tariff;
	}

	public void setRate() {
		if (getTariff() == 1) {
			this.rate = 20;
		} else {
			this.rate = 35;
		}
	}

	public int getRate() {
		return rate;
	}

	public void setTariffMinutes() {
		if (getTariff() == 1) {
			this.tariffMinutes = 200;
		} else {
			this.tariffMinutes = 400;
		}
	}

	public double getTariffMinutes() {
		return tariffMinutes;
	}

	public void setTariffTexts() {
		if (getTariff() == 1) {
			this.tariffTexts = 150;
		} else {
			this.tariffTexts = 350;
		}
	}

	public double getTariffTexts() {
		return tariffTexts;
	}

	public void setMinuteUsage() {
		System.out.print("Please enter your minutes used: ");
		this.userMinutes = s.nextDouble();
	}

	public double getMinuteUsage() {
		return userMinutes;
	}

	public void setTextUsage() {
		System.out.print("Please enter your texts used: ");
		this.userTexts = s.nextDouble();
	}

	public double getTextUsage() {
		return userTexts;
	}

	public void setMinutesExtraCost() {
		if (getMinuteUsage() > getTariffMinutes()) {
			this.minutesExtraCost = (getMinuteUsage() - getTariffMinutes()) * 0.10;
		} else {
			this.minutesExtraCost = 0;
		}
	}

	public double getMinutesExtraCost() {
		return minutesExtraCost;
	}

	public void setTextsExtraCost() {
		if (getTextUsage() > getTariffTexts()) {
			this.textsExtraCost = (getTextUsage() - getTariffTexts()) * 0.05;
		} else {
			this.textsExtraCost = 0;
		}
	}

	public double getTextsExtraCost() {
		return textsExtraCost;
	}

	public void bill() {
		System.out.print(String.format("\nBill:\n" 
									+  "Tariff:\t%d\n" 
									+  "Included minutes: %.0f\tIncluded texts: %.0f\n"
									+  "-------------------------------------------------\n"
									+  "Tariff rate:\t\t£%d/month\n"
									+  "Extra minutes charge:\t£%.2f\n"
									+  "Extra texts charge:\t£%.2f\n"
									+  "Total charge:\t\t£%.2f\n", getTariff(), getTariffMinutes(), getTariffTexts(), getRate(), getMinutesExtraCost(), getTextsExtraCost(), (getRate() + getMinutesExtraCost() + getTextsExtraCost())));
	}
}
