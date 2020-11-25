package com.oceanlife.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class OceanlifeAPI implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(Object input, Context context) {
		System.out.println("I am from Java Project");
		return null;
	}
    
}
