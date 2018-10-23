package io.satchell.example;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ExampleJavaService {
    public String handleRequest(String serviceInput, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Example Service: received String: " + serviceInput);
        return serviceInput;
    }
}