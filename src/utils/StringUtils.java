package utils;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface StringUtils { 
	
	public static final String EMPTY_STRING = "";
	public static final String SPACE_STRING = " ";
	public static final String EMPTY_FIELD_STRING = "--------";
	public static final String EMPTY_PHONE_NUMBER_STRING = "00000000";
	public static final String EMPTY_NUMBER_STRING = "0";
	public static final String ZERO_MONEY_VALUE_STRING = "0,00";
	public static final Locale PT_BR_LOCALE = new Locale("pt", "BR");
	
	public static boolean hasDigit(String str) {
		return str.matches(".*\\d.*");
	}
	
	public static boolean hasSpecialChar(String str) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		return m.find();
	}
	
	public static boolean hasUpperCaseChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasLowerCaseChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String trimCpf(String cpf) {
		return cpf.replaceAll("\\D", "").trim();
	}
	
	public static String removeAllSpecialCharacters(String string) {
		return string.replaceAll("[^a-zA-Z0-9\\s+]", "");	
	}
	
	public static String removeAccents(String string) {
		String normalizer = Normalizer.normalize(string, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
	}

}
