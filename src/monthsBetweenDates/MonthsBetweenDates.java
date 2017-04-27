package monthsBetweenDates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MonthsBetweenDates {

	public static void main(String[] args) {
		monthsBetweenDates("2007-01-01"); 
	}

	static String monthsBetweenDates(String data) {
 
		long l = ChronoUnit.MONTHS.between(LocalDate.parse(data), LocalDate.now());

		return String.valueOf(l);

	}

}
