package demo;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonWr {
	
	
	public static void main(String[] args) {
		
		JSONObject student=new JSONObject();
	student.put("firstName", "Lokesh");
    	student.put("lastName", "Gupta");
    	student.put("website", "howtodoinjava.com");
    	
	
	try {
		FileWriter file=new FileWriter("student.json");
	
		file.write(student.toJSONString());
		
		System.out.println("successfully written in json file");
        file.flush();

	
	
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
	
	

}
