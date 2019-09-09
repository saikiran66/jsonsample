package jsonEncode;


import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class JsonListExample {
	
	public static void main(String[] args )
	{
		//this is writing json data using List
		List arr=new ArrayList();
		arr.add("kiran");
		arr.add(new Integer(21));
		arr.add(new Double(600000));
		String jsonText=JSONValue.toJSONString(arr);
		System.out.println(jsonText);
	}
}
