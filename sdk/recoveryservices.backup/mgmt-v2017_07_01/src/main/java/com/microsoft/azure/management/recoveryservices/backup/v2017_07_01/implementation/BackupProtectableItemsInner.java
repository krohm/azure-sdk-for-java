/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupProtectableItems.
 */
public class BackupProtectableItemsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupProtectableItemsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupProtectableItemsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupProtectableItemsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupProtectableItemsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupProtectableItems to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupProtectableItemsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupProtectableItems list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupProtectableItems")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupProtectableItems listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadProtectableItemResourceInner> list(final String vaultName, final String resourceGroupName) {
        ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName).toBlocking().single();
        return new PagedList<WorkloadProtectableItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadProtectableItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadProtectableItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final ListOperationCallback<WorkloadProtectableItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadProtectableItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Page<WorkloadProtectableItemResourceInner>>() {
                @Override
                public Page<WorkloadProtectableItemResourceInner> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName) {
        return listSinglePageAsync(vaultName, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        final String filter = null;
        final String skipToken = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadProtectableItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadProtectableItemResourceInner> list(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken).toBlocking().single();
        return new PagedList<WorkloadProtectableItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadProtectableItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadProtectableItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken, final ListOperationCallback<WorkloadProtectableItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadProtectableItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter, skipToken)
            .map(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Page<WorkloadProtectableItemResourceInner>>() {
                @Override
                public Page<WorkloadProtectableItemResourceInner> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
    ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> * @param filter OData filter options.
    ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadProtectableItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkloadProtectableItemResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkloadProtectableItemResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadProtectableItemResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<WorkloadProtectableItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadProtectableItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadProtectableItemResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<WorkloadProtectableItemResourceInner>> serviceFuture, final ListOperationCallback<WorkloadProtectableItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadProtectableItemResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Page<WorkloadProtectableItemResourceInner>>() {
                @Override
                public Page<WorkloadProtectableItemResourceInner> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(ServiceResponse<Page<WorkloadProtectableItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
    ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadProtectableItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadProtectableItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadProtectableItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkloadProtectableItemResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkloadProtectableItemResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkloadProtectableItemResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}