/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest;

import com.microsoft.rest.protocol.SerializerAdapter;
import com.microsoft.rest.serializer.JacksonAdapter;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * ServiceClient is the abstraction for accessing REST operations and their payload data types.
 */
public abstract class ServiceClient {
    /**
     * The RestClient instance storing configuration for service clients.
     */
    private RestClient restClient;

    /**
     * Initializes a new instance of the ServiceClient class.
     *
     * @param baseUrl the service base uri
     */
    protected ServiceClient(String baseUrl) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build());
    }

    /**
     * Initializes a new instance of the ServiceClient class.
     *
     * @param restClient the REST client
     */
    protected ServiceClient(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * @return the {@link RestClient} instance.
     */
    @Deprecated
    public RestClient restClient() {
        return restClient;
    }

    /**
     * @return the adapter to a Jackson {@link com.fasterxml.jackson.databind.ObjectMapper}.
     */
    public SerializerAdapter<?> serializerAdapter() {
        return this.restClient.serializerAdapter();
    }
}
