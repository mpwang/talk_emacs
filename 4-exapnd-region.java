// 按照语义选择代码

public ListServicesResult listServices(ListServicesRequest listServicesRequest) {
    ExecutionContext executionContext = createExecutionContext(listServicesRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    awsRequestMetrics.startEvent(Field.ClientExecuteTime);
    Request<ListServicesRequest> request = null;
    Response<ListServicesResult> response = null;

    try {
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ListServicesRequestMarshaller().marshall(super.beforeMarshalling(listServicesRequest));
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ListServicesResult, JsonUnmarshallerContext> unmarshaller =
            new ListServicesResultJsonUnmarshaller();
        JsonResponseHandler<ListServicesResult> responseHandler =
            new JsonResponseHandler<ListServicesResult>(unmarshaller);

        response = invoke(request, responseHandler, executionContext);

        return response.getAwsResponse();
    } finally {

        endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
    }
}
