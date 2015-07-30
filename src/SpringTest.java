import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import junit.framework.TestCase;

public class SpringTest extends TestCase {
	public static void test() {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("resources/test.xml");
		User user = (User)ctx.getBean("user");
		System.out.println(user.getName());
	}
}
