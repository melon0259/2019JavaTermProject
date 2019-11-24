package Main;

import java.io.*;
import net.sourceforge.tess4j.*;
public class main {
	static Tesseract instance = Tesseract.getInstance();
	public static String process(String fileName) {
		File inputFile=new File(fileName);
		String result="";
		try {
			result=instance.doOCR(inputFile);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void main (String[] args) {
		System.out.println(process("input2.png"));
	}
}
