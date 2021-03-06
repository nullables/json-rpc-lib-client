package com.code4people.jsonrpclib.client.serialization;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.code4people.jsonrpclib.client.exceptions.SerializationException;

public class MissingParamsSerializer implements ParamsSerializer {
    @Override
    public JsonNode serialize(Object[] args) throws SerializationException {
        return MissingNode.getInstance();
    }
}
