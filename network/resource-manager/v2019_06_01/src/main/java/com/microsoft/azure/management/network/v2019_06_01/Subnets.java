/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_06_01.implementation.SubnetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Subnets.
 */
public interface Subnets extends SupportsCreating<Subnet.DefinitionStages.Blank>, HasInner<SubnetsInner> {
    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable prepareNetworkPoliciesAsync(String resourceGroupName, String virtualNetworkName, String subnetName, PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Subnet> getAsync(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Subnet> listAsync(final String resourceGroupName, final String virtualNetworkName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName);

}