package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

    public static final Long WORKING_HOURS_IN_A_DAY = 8L;
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    
    public static boolean isAfterOrEqualsNow(LocalDate date) {
		return LocalDate.now().isAfter(date) || LocalDate.now().isEqual(date);
	}
	
	public static boolean isBeforeOrEqualsNow(LocalDate date) {
		return LocalDate.now().isBefore(date) || LocalDate.now().isEqual(date);
	}
	
	public static String formatLocalDateToString(LocalDate date) {
		return date.format(DATE_FORMATTER);
	}
    
}
