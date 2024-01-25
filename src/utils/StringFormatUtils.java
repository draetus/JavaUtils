package utils;

import static utils.ObjectUtils.isNull;
import static utils.StringUtils.EMPTY_STRING;
import static utils.StringUtils.SPACE_STRING;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.text.MaskFormatter;

public interface StringFormatUtils {
	
	public static String CPF_MASK = "###.###.###-##";
	public static String CNPJ_MASK = "##.###.###/####-##";
	public static String PHONE_MASK = "(##) #####-####";
	
	public static final NumberFormat MONEY_FORMAT = NumberFormat.getInstance(new Locale("pt", "BR"));
	
	public static String formatString(String value, String pattern) throws ParseException {
		MaskFormatter mf = new MaskFormatter(pattern);
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(value);
    }
	
	public static String formatCPF(String cpf) throws ParseException {
		return formatString(cpf, CPF_MASK);
	}
	
	public static String formatCNPJ(String cnpj) throws ParseException {
		return formatString(cnpj, CNPJ_MASK);
	}
	
	public static String formatPhoneNineDigits(String phone) throws ParseException {
		return formatString(phone, PHONE_MASK);
	}
	
	public static String formatFullName(String name, String lastName) {
		return (isNull(name) ? EMPTY_STRING : name) + SPACE_STRING + (isNull(lastName) ? EMPTY_STRING : lastName);
	}
	
	public static Double parseMoney(String money) throws ParseException {
		money = money.replaceAll("[^\\d,]", "").trim();
		return money.isBlank() ? MONEY_FORMAT.parse(money).doubleValue() : null;
	}
	
	

}
