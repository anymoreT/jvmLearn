package chapter10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试语法糖
 * @author skywalker
 *
 */
public class Suger {

	public static void main(String[] args) {
		String condition = "A";
		switch (condition) {
		case "A":
			System.out.println("1A");
			break;
		}
		try(InputStream is = new FileInputStream("path")) {
			is.available();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
