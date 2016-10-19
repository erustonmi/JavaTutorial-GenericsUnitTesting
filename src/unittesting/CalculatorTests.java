package unittesting;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTests {
	private static Properties properties;
	@BeforeClass
	public static void setup() throws Throwable {
		properties = new Properties();
		properties.load(new FileInputStream("Config.properties"));
	}
	
	@Test
	public void testCalc() throws Throwable {
		Calculator c = new Calculator();
		Class cc = c.getClass();
		Field [] fields = cc.getDeclaredFields();
		for (Field f : fields) {
			Inject i = f.getAnnotation(Inject.class);
			if (i != null) {
				String classToLoadName = properties.getProperty(i.value());
				System.out.println("About to load class for " + classToLoadName);
				Class classToLoad = Class.forName(classToLoadName);
				Object toInject = classToLoad.newInstance();
				f.setAccessible(true);
				f.set(c, toInject);
			}
		}
		
		
		double result = c.calculate(3);
		
		Assert.assertEquals(3.14159 * 2, result, 0.01);
	}

}
