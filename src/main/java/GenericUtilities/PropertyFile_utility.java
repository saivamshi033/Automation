package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile_utility {
public String readDatafromPF(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(IconstantUtility.propertyfilepath);
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);
	return value;
	System.out.println("Hi this is change made by TL from github")
}
}

