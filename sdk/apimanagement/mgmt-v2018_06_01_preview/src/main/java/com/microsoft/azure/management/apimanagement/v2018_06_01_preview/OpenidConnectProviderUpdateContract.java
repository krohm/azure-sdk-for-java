/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Update OpenID Connect Provider operation.
 */
@JsonFlatten
public class OpenidConnectProviderUpdateContract {
    /**
     * User-friendly OpenID Connect Provider name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * User-friendly description of OpenID Connect Provider.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Metadata endpoint URI.
     */
    @JsonProperty(value = "properties.metadataEndpoint")
    private String metadataEndpoint;

    /**
     * Client ID of developer console which is the client application.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * Client Secret of developer console which is the client application.
     */
    @JsonProperty(value = "properties.clientSecret")
    private String clientSecret;

    /**
     * Get user-friendly OpenID Connect Provider name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set user-friendly OpenID Connect Provider name.
     *
     * @param displayName the displayName value to set
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get user-friendly description of OpenID Connect Provider.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user-friendly description of OpenID Connect Provider.
     *
     * @param description the description value to set
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get metadata endpoint URI.
     *
     * @return the metadataEndpoint value
     */
    public String metadataEndpoint() {
        return this.metadataEndpoint;
    }

    /**
     * Set metadata endpoint URI.
     *
     * @param metadataEndpoint the metadataEndpoint value to set
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withMetadataEndpoint(String metadataEndpoint) {
        this.metadataEndpoint = metadataEndpoint;
        return this;
    }

    /**
     * Get client ID of developer console which is the client application.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set client ID of developer console which is the client application.
     *
     * @param clientId the clientId value to set
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get client Secret of developer console which is the client application.
     *
     * @return the clientSecret value
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set client Secret of developer console which is the client application.
     *
     * @param clientSecret the clientSecret value to set
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

}