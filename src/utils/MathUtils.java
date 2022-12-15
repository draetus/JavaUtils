package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class MathUtils {
	
	public static Double roundEven(Double value) {
		if (ObjectUtils.isNull(value)) {
			throw new IllegalArgumentException();
		}
		BigDecimal bigDecimal = new BigDecimal(value);
		return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
