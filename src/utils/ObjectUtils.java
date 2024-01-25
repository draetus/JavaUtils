package utils;


import java.util.List;

public interface ObjectUtils {
	
	public static Boolean isNotNull(Object... objects) {
		for (Object object : objects) {
			if (object == null) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean isNull(Object... objects) {
		for (Object object : objects) {
			if (object != null) {
				return false;
			}
		}
		
		return true;
	}
	
	@SafeVarargs
	public static Boolean isEmpty(Iterable<?>... iterables) {
		for (Iterable<?> iterable : iterables) {
			if (isNotNull(iterable) && iterable.iterator().hasNext()) { 
				return false;
			}
		}
		return true;
	}
	
	@SafeVarargs
	public static Boolean isNotEmpty(Iterable<?>... iterables) {
		for (Iterable<?> iterable : iterables) {
			if (isNotNull(iterable) && iterable.iterator().hasNext()) { 
				return true;
			}
		}
		return false;
	}
	
	public static Boolean not(Boolean expression) {
		return !expression;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> Class<List<T>> convertClassToListOfClass(Class<T> objectClass) {
		Class<List<T>> clazz = (Class) List.class;
		return clazz;
	}

}
