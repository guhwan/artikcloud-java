/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.api;

import cloud.artik.client.ApiCallback;
import cloud.artik.client.ApiClient;
import cloud.artik.client.ApiException;
import cloud.artik.client.ApiResponse;
import cloud.artik.client.Configuration;
import cloud.artik.client.Pair;
import cloud.artik.client.ProgressRequestBody;
import cloud.artik.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cloud.artik.model.DevicePricingTierEnvelope;
import cloud.artik.model.DevicePricingTierRequest;
import cloud.artik.model.DevicePricingTiersEnvelope;
import cloud.artik.model.DeviceTypePricingTier;
import cloud.artik.model.DeviceTypePricingTiersEnvelope;
import cloud.artik.model.UpgradePathEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonetizationApi {
    private ApiClient apiClient;

    public MonetizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonetizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createPricingTiers */
    private com.squareup.okhttp.Call createPricingTiersCall(String dtid, DeviceTypePricingTier pricingTierInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = pricingTierInfo;
        
        // create path and map variables
        String localVarPath = "/pricing/devicetypes/{dtid}/pricingtiers".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "dtid" + "\\}", apiClient.escapeString(dtid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createPricingTiersValidateBeforeCall(String dtid, DeviceTypePricingTier pricingTierInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dtid' is set
        if (dtid == null) {
            throw new ApiException("Missing the required parameter 'dtid' when calling createPricingTiers(Async)");
        }
        
        // verify the required parameter 'pricingTierInfo' is set
        if (pricingTierInfo == null) {
            throw new ApiException("Missing the required parameter 'pricingTierInfo' when calling createPricingTiers(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createPricingTiersCall(dtid, pricingTierInfo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Define devicetype&#39;s pricing tiers.
     * Define devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param pricingTierInfo Pricing tier info (required)
     * @return DeviceTypePricingTier
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceTypePricingTier createPricingTiers(String dtid, DeviceTypePricingTier pricingTierInfo) throws ApiException {
        ApiResponse<DeviceTypePricingTier> resp = createPricingTiersWithHttpInfo(dtid, pricingTierInfo);
        return resp.getData();
    }

    /**
     * Define devicetype&#39;s pricing tiers.
     * Define devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param pricingTierInfo Pricing tier info (required)
     * @return ApiResponse&lt;DeviceTypePricingTier&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceTypePricingTier> createPricingTiersWithHttpInfo(String dtid, DeviceTypePricingTier pricingTierInfo) throws ApiException {
        com.squareup.okhttp.Call call = createPricingTiersValidateBeforeCall(dtid, pricingTierInfo, null, null);
        Type localVarReturnType = new TypeToken<DeviceTypePricingTier>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Define devicetype&#39;s pricing tiers. (asynchronously)
     * Define devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param pricingTierInfo Pricing tier info (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPricingTiersAsync(String dtid, DeviceTypePricingTier pricingTierInfo, final ApiCallback<DeviceTypePricingTier> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createPricingTiersValidateBeforeCall(dtid, pricingTierInfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceTypePricingTier>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPricingTiers */
    private com.squareup.okhttp.Call getPricingTiersCall(String did, Boolean active, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pricing/devices/{did}/pricingtiers".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "did" + "\\}", apiClient.escapeString(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (active != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPricingTiersValidateBeforeCall(String did, Boolean active, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling getPricingTiers(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getPricingTiersCall(did, active, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a device&#39;s pricing tiers
     * Get a device&#39;s pricing tiers
     * @param did Device ID (required)
     * @param active Filter by active (optional)
     * @return DevicePricingTiersEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DevicePricingTiersEnvelope getPricingTiers(String did, Boolean active) throws ApiException {
        ApiResponse<DevicePricingTiersEnvelope> resp = getPricingTiersWithHttpInfo(did, active);
        return resp.getData();
    }

    /**
     * Get a device&#39;s pricing tiers
     * Get a device&#39;s pricing tiers
     * @param did Device ID (required)
     * @param active Filter by active (optional)
     * @return ApiResponse&lt;DevicePricingTiersEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DevicePricingTiersEnvelope> getPricingTiersWithHttpInfo(String did, Boolean active) throws ApiException {
        com.squareup.okhttp.Call call = getPricingTiersValidateBeforeCall(did, active, null, null);
        Type localVarReturnType = new TypeToken<DevicePricingTiersEnvelope>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a device&#39;s pricing tiers (asynchronously)
     * Get a device&#39;s pricing tiers
     * @param did Device ID (required)
     * @param active Filter by active (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPricingTiersAsync(String did, Boolean active, final ApiCallback<DevicePricingTiersEnvelope> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPricingTiersValidateBeforeCall(did, active, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DevicePricingTiersEnvelope>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getThePricingTiers */
    private com.squareup.okhttp.Call getThePricingTiersCall(String dtid, Integer version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pricing/devicetypes/{dtid}/pricingtiers".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "dtid" + "\\}", apiClient.escapeString(dtid.toString()))
        .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getThePricingTiersValidateBeforeCall(String dtid, Integer version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dtid' is set
        if (dtid == null) {
            throw new ApiException("Missing the required parameter 'dtid' when calling getThePricingTiers(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getThePricingTiers(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getThePricingTiersCall(dtid, version, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get devicetype&#39;s pricing tiers.
     * Get devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param version Version (required)
     * @return DeviceTypePricingTiersEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceTypePricingTiersEnvelope getThePricingTiers(String dtid, Integer version) throws ApiException {
        ApiResponse<DeviceTypePricingTiersEnvelope> resp = getThePricingTiersWithHttpInfo(dtid, version);
        return resp.getData();
    }

    /**
     * Get devicetype&#39;s pricing tiers.
     * Get devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param version Version (required)
     * @return ApiResponse&lt;DeviceTypePricingTiersEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceTypePricingTiersEnvelope> getThePricingTiersWithHttpInfo(String dtid, Integer version) throws ApiException {
        com.squareup.okhttp.Call call = getThePricingTiersValidateBeforeCall(dtid, version, null, null);
        Type localVarReturnType = new TypeToken<DeviceTypePricingTiersEnvelope>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get devicetype&#39;s pricing tiers. (asynchronously)
     * Get devicetype&#39;s pricing tiers.
     * @param dtid DeviceType ID (required)
     * @param version Version (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getThePricingTiersAsync(String dtid, Integer version, final ApiCallback<DeviceTypePricingTiersEnvelope> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getThePricingTiersValidateBeforeCall(dtid, version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceTypePricingTiersEnvelope>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUpgradePath */
    private com.squareup.okhttp.Call getUpgradePathCall(String did, String action, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pricing/devices/{did}/revenueshare/upgradepath".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "did" + "\\}", apiClient.escapeString(did.toString()))
        .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUpgradePathValidateBeforeCall(String did, String action, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling getUpgradePath(Async)");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new ApiException("Missing the required parameter 'action' when calling getUpgradePath(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getUpgradePathCall(did, action, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get upgrade path
     * Get upgrade path
     * @param did Device ID (required)
     * @param action Action to perform (required)
     * @return UpgradePathEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpgradePathEnvelope getUpgradePath(String did, String action) throws ApiException {
        ApiResponse<UpgradePathEnvelope> resp = getUpgradePathWithHttpInfo(did, action);
        return resp.getData();
    }

    /**
     * Get upgrade path
     * Get upgrade path
     * @param did Device ID (required)
     * @param action Action to perform (required)
     * @return ApiResponse&lt;UpgradePathEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpgradePathEnvelope> getUpgradePathWithHttpInfo(String did, String action) throws ApiException {
        com.squareup.okhttp.Call call = getUpgradePathValidateBeforeCall(did, action, null, null);
        Type localVarReturnType = new TypeToken<UpgradePathEnvelope>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get upgrade path (asynchronously)
     * Get upgrade path
     * @param did Device ID (required)
     * @param action Action to perform (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUpgradePathAsync(String did, String action, final ApiCallback<UpgradePathEnvelope> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUpgradePathValidateBeforeCall(did, action, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpgradePathEnvelope>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for setPricingTier */
    private com.squareup.okhttp.Call setPricingTierCall(String did, DevicePricingTierRequest pricingTier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = pricingTier;
        
        // create path and map variables
        String localVarPath = "/pricing/devices/{did}/pricingtiers".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "did" + "\\}", apiClient.escapeString(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call setPricingTierValidateBeforeCall(String did, DevicePricingTierRequest pricingTier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling setPricingTier(Async)");
        }
        
        // verify the required parameter 'pricingTier' is set
        if (pricingTier == null) {
            throw new ApiException("Missing the required parameter 'pricingTier' when calling setPricingTier(Async)");
        }
        
        
        com.squareup.okhttp.Call call = setPricingTierCall(did, pricingTier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set a device&#39;s pricing tier
     * Set a device&#39;s pricing tier
     * @param did Device ID (required)
     * @param pricingTier Pricing tier (required)
     * @return DevicePricingTierEnvelope
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DevicePricingTierEnvelope setPricingTier(String did, DevicePricingTierRequest pricingTier) throws ApiException {
        ApiResponse<DevicePricingTierEnvelope> resp = setPricingTierWithHttpInfo(did, pricingTier);
        return resp.getData();
    }

    /**
     * Set a device&#39;s pricing tier
     * Set a device&#39;s pricing tier
     * @param did Device ID (required)
     * @param pricingTier Pricing tier (required)
     * @return ApiResponse&lt;DevicePricingTierEnvelope&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DevicePricingTierEnvelope> setPricingTierWithHttpInfo(String did, DevicePricingTierRequest pricingTier) throws ApiException {
        com.squareup.okhttp.Call call = setPricingTierValidateBeforeCall(did, pricingTier, null, null);
        Type localVarReturnType = new TypeToken<DevicePricingTierEnvelope>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set a device&#39;s pricing tier (asynchronously)
     * Set a device&#39;s pricing tier
     * @param did Device ID (required)
     * @param pricingTier Pricing tier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setPricingTierAsync(String did, DevicePricingTierRequest pricingTier, final ApiCallback<DevicePricingTierEnvelope> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = setPricingTierValidateBeforeCall(did, pricingTier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DevicePricingTierEnvelope>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}