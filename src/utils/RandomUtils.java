package utils;

public class RandomUtils {
	
	private static String ALPHA_NUMERIC_STRING= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
	
	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		  
        for (int i = 0; i < length; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(ALPHA_NUMERIC_STRING.length() * Math.random());
  
            // add Character one by one in end of sb
            sb.append(ALPHA_NUMERIC_STRING
                          .charAt(index));
        }
  
        return sb.toString();
	}

}
