package utils;

import java.util.Random;

public interface RandomUtils {
	
	public static String ALPHA_NUMERIC_STRING= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
	public static final String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	
	public static final Random random = new Random();
	
	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		  
        for (int i = 0; i < length; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
        	int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
  
            // add Character one by one in end of sb
            sb.append(ALPHA_NUMERIC_STRING
                          .charAt(index));
        }
  
        return sb.toString();
	}

}
