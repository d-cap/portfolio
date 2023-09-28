package com.test;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.test.dto.Graph;
import com.test.dto.SpanningTree;

import jakarta.enterprise.context.ApplicationScoped;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@ApplicationScoped
public class TestLambda implements RequestHandler<Graph, SpanningTree>{
    private final DynamoDbClient dynamoDbClient;
    private final String tableName;

    public TestLambda(@ConfigProperty(name = "dynamo.db.table") String tableName, DynamoDbClient dynamoDbClient) {
        this.tableName = tableName;
        this.dynamoDbClient = dynamoDbClient;
    }

    @Override
    public SpanningTree handleRequest(Graph graph, Context context) {
        return null;
    }
}