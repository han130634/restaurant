package com.netease;

//import log4j 
import org.apache.log4j.Logger;

public class Kitchen {
	//Get a logger instance with Logger's getLogger method.
	public static Logger logger = Logger.getLogger(Kitchen.class);
	public static String makeNoodles(String vegetable){
		if(vegetable == null){
			vegetable = "Tomato";
		}
		//write log
		logger.info("Noodles with "+vegetable);
		
		StringBuffer s = new StringBuffer();
		s.append("<html><body>\n")
		.append("<h1> Noodles with ")
		.append(vegetable)
		.append("</h1>\n")
		.append("</body></html>_____");
		return s.toString();
	}
}
