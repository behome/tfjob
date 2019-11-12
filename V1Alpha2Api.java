package tfjob;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.ApiResponse;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.Pair;
import io.kubernetes.client.ProgressRequestBody.ProgressRequestListener;
import io.kubernetes.client.ProgressResponseBody;
import io.kubernetes.client.ProgressResponseBody.ProgressListener;
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1PersistentVolume;
import io.kubernetes.client.models.V1PersistentVolumeClaim;
import io.kubernetes.client.models.V1Status;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class V1Alpha2Api {

    private ApiClient apiClient;

    public V1Alpha2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public V1Alpha2Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public V1Alpha2TFJobList listTFJobForAllNamespaces(String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1Alpha2TFJobList> resp = this.listTFJobForAllNamespacesWithHttpInfo(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        return (V1Alpha2TFJobList) resp.getData();
    }

    public V1Alpha2TFJobList listNamespacedTFJobList(String namespace, Boolean includeUninitialized, String pretty, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1Alpha2TFJobList> resp = this.listNamespacedTFJobWithHttpInfo(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
        return (V1Alpha2TFJobList)resp.getData();
    }

    public V1Status deleteNamespacedTFJob(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        ApiResponse<V1Status> resp = this.deleteNamespacedTFJobWithHttpInfo(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        return (V1Status) resp.getData();
    }

    public V1Alpha2TFJob createNamespacedTFJob(String namespace, V1Alpha2TFJob body, Boolean includeUninitialized, String pretty, String dryRun) throws ApiException {
        ApiResponse<V1Alpha2TFJob> resp = this.createNamespacedTFJobWithHttpInfo(namespace, body, includeUninitialized, pretty, dryRun);
        return (V1Alpha2TFJob) resp.getData();
    }

    public V1Alpha2TFJob readNamespacedTFJob(String name, String namespace, String pretty, Boolean exact, Boolean export) throws ApiException {
        ApiResponse<V1Alpha2TFJob> resp = this.readNamespacedTFJobWithHttpInfo(name, namespace, pretty, exact, export);
        return (V1Alpha2TFJob) resp.getData();
    }

    public V1Alpha2TFJob patchNamespacedTFJob(String name, String namespace, Object body, String pretty, String dryRun) throws ApiException {
        ApiResponse<V1Alpha2TFJob> resp = this.patchNamespacedTFJobWithHttpInfo(name, namespace, body, pretty, dryRun);
        return (V1Alpha2TFJob) resp.getData();
    }

    public V1Alpha2TFJob replaceNamespacedTFJob(String name, String namespace, V1Alpha2TFJob body, String pretty, String dryRun) throws ApiException {
        ApiResponse<V1Alpha2TFJob> resp = this.replaceNamespacedTFJobWithHttpInfo(name, namespace, body, pretty, dryRun);
        return (V1Alpha2TFJob) resp.getData();
    }

    public V1Namespace deleteNamespace(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        ApiResponse<V1Namespace> resp = this.deleteNamespaceWithHttpInfo(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        return (V1Namespace) resp.getData();
    }

    public ExtensionsV1beta1Deployment deleteNamespacedDeployment(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        ApiResponse<ExtensionsV1beta1Deployment> resp = this.deleteNamespacedDeploymentWithHttpInfo(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        return (ExtensionsV1beta1Deployment)resp.getData();
    }

    private Call replaceNamespacedTFJobValidateBeforeCall(String name, String namespace, V1Alpha2TFJob body, String pretty, String dryRun, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedDeployment(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedDeployment(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedDeployment(Async)");
        } else {
            Call call = this.replaceNamespacedTFJobCall(name, namespace, body, pretty, dryRun, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<V1Alpha2TFJob> replaceNamespacedTFJobWithHttpInfo(String name, String namespace, V1Alpha2TFJob body, String pretty, String dryRun) throws ApiException {
        Call call = this.replaceNamespacedTFJobValidateBeforeCall(name, namespace, body, pretty, dryRun, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJob>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }


    private Call patchNamespacedTFJobValidateBeforeCall(String name, String namespace, Object body, String pretty, String dryRun, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedDeployment(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedDeployment(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedDeployment(Async)");
        } else {
            Call call = this.patchNamespacedTFJobCall(name, namespace, body, pretty, dryRun, progressListener, progressRequestListener);
            return call;
        }
    }


    public ApiResponse<V1Alpha2TFJob> patchNamespacedTFJobWithHttpInfo(String name, String namespace, Object body, String pretty, String dryRun) throws ApiException {
        Call call = this.patchNamespacedTFJobValidateBeforeCall(name, namespace, body, pretty, dryRun, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJob>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    private Call readNamespacedTFJobValidateBeforeCall(String name, String namespace, String pretty, Boolean exact, Boolean export, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedDeployment(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedDeployment(Async)");
        } else {
            Call call = this.readNamespacedTFJobCall(name, namespace, pretty, exact, export, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<V1Alpha2TFJob> readNamespacedTFJobWithHttpInfo(String name, String namespace, String pretty, Boolean exact, Boolean export) throws ApiException {
        Call call = this.readNamespacedTFJobValidateBeforeCall(name, namespace, pretty, exact, export, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJob>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    private Call createNamespacedTFJobValidateBeforeCall(String namespace, V1Alpha2TFJob body, Boolean includeUninitialized, String pretty, String dryRun, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedDeployment(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedDeployment(Async)");
        } else {
            Call call = this.createNamespacedTFJobCall(namespace, body, includeUninitialized, pretty, dryRun, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<V1Alpha2TFJob> createNamespacedTFJobWithHttpInfo(String namespace, V1Alpha2TFJob body, Boolean includeUninitialized, String pretty, String dryRun) throws ApiException {
        Call call = this.createNamespacedTFJobValidateBeforeCall(namespace, body, includeUninitialized, pretty, dryRun, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJob>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }


    public Call createNamespacedTFJobCall(String namespace, V1Alpha2TFJob body, Boolean includeUninitialized, String pretty, String dryRun, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/apis/kubeflow.org/v1alpha2/namespaces/{namespace}/tfjobs".replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (includeUninitialized != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("includeUninitialized", includeUninitialized));
        }

        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call deleteNamespacedTFJobCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/apis/kubeflow.org/v1alpha2/namespaces/{namespace}/tfjobs/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private Call deleteNamespacedTFJobValidateBeforeCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedDeployment(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedDeployment(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteNamespacedDeployment(Async)");
        } else {
            Call call = this.deleteNamespacedTFJobCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<V1Status> deleteNamespacedTFJobWithHttpInfo(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        Call call = this.deleteNamespacedTFJobValidateBeforeCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Status>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    private Call listTFJobForAllNamespacesValidateBeforeCall(String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        Call call = this.listTFJobForAllNamespacesCall(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch, progressListener, progressRequestListener);
        return call;
    }


    public ApiResponse<V1Alpha2TFJobList> listTFJobForAllNamespacesWithHttpInfo(String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        Call call = this.listTFJobForAllNamespacesValidateBeforeCall(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJobList>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }



    public ApiResponse<V1Alpha2TFJobList> listNamespacedTFJobWithHttpInfo(String namespace, Boolean includeUninitialized, String pretty, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        Call call = this.listNamespacedTFJobValidateBeforeCall(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Alpha2TFJobList>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    private Call listNamespacedTFJobValidateBeforeCall(String namespace, Boolean includeUninitialized, String pretty, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedDeployment(Async)");
        } else {
            Call call = this.listNamespacedTFJobCall(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch, progressListener, progressRequestListener);
            return call;
        }
    }

    public Call listNamespacedTFJobCall(String namespace, Boolean includeUninitialized, String pretty, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/apis/kubeflow.org/v1alpha2/namespaces/{namespace}/tfjobs".replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (includeUninitialized != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("includeUninitialized", includeUninitialized));
        }

        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("continue", _continue));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("limit", limit));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("watch", watch));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call listTFJobForAllNamespacesCall(String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/apis/kubeflow.org/v1alpha2/tfjobs";
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (_continue != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("continue", _continue));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (includeUninitialized != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("includeUninitialized", includeUninitialized));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("limit", limit));
        }

        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("watch", watch));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call readNamespacedTFJobCall(String name, String namespace, String pretty, Boolean exact, Boolean export, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/apis/kubeflow.org/v1alpha2/namespaces/{namespace}/tfjobs/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (exact != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("exact", exact));
        }

        if (export != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("export", export));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call patchNamespacedTFJobCall(String name, String namespace, Object body, String pretty, String dryRun, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call replaceNamespacedTFJobCall(String name, String namespace, V1Alpha2TFJob body, String pretty, String dryRun, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/apis/extensions/v1beta1/namespaces/{namespace}/tfjobs/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    public Call deleteNamespaceCall(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/api/v1/namespaces/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private Call deleteNamespaceValidateBeforeCall(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespace(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteNamespace(Async)");
        } else {
            Call call = this.deleteNamespaceCall(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<V1Namespace> deleteNamespaceWithHttpInfo(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        Call call = this.deleteNamespaceValidateBeforeCall(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1Namespace>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    public Call deletePersistentVolumeCall(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/api/v1/persistentvolumes/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private Call deletePersistentVolumeValidateBeforeCall(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePersistentVolume(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deletePersistentVolume(Async)");
        } else {
            Call call = this.deletePersistentVolumeCall(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener);
            return call;
        }
    }

    public V1PersistentVolume deletePersistentVolume(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        ApiResponse<V1PersistentVolume> resp = this.deletePersistentVolumeWithHttpInfo(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        return (V1PersistentVolume) resp.getData();
    }

    public ApiResponse<V1PersistentVolume> deletePersistentVolumeWithHttpInfo(String name, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        Call call = this.deletePersistentVolumeValidateBeforeCall(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1PersistentVolume>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    public Call deleteNamespacedPersistentVolumeClaimCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private Call deleteNamespacedPersistentVolumeClaimValidateBeforeCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedPersistentVolumeClaim(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedPersistentVolumeClaim(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteNamespacedPersistentVolumeClaim(Async)");
        } else {
            Call call = this.deleteNamespacedPersistentVolumeClaimCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener);
            return call;
        }
    }

    public V1PersistentVolumeClaim deleteNamespacedPersistentVolumeClaim(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        ApiResponse<V1PersistentVolumeClaim> resp = this.deleteNamespacedPersistentVolumeClaimWithHttpInfo(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        return (V1PersistentVolumeClaim) resp.getData();
    }

    public ApiResponse<V1PersistentVolumeClaim> deleteNamespacedPersistentVolumeClaimWithHttpInfo(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        Call call = this.deleteNamespacedPersistentVolumeClaimValidateBeforeCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<V1PersistentVolumeClaim>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    public Call deleteNamespacedDeploymentCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, final ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        String localVarPath = "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("dryRun", dryRun));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private Call deleteNamespacedDeploymentValidateBeforeCall(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, ProgressListener progressListener, ProgressRequestListener progressRequestListener) throws ApiException {
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedDeployment(Async)");
        } else if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedDeployment(Async)");
        } else if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteNamespacedDeployment(Async)");
        } else {
            Call call = this.deleteNamespacedDeploymentCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, progressListener, progressRequestListener);
            return call;
        }
    }

    public ApiResponse<ExtensionsV1beta1Deployment> deleteNamespacedDeploymentWithHttpInfo(String name, String namespace, V1DeleteOptions body, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
        Call call = this.deleteNamespacedDeploymentValidateBeforeCall(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, (ProgressListener)null, (ProgressRequestListener)null);
        Type localVarReturnType = (new TypeToken<ExtensionsV1beta1Deployment>() {
        }).getType();
        return this.apiClient.execute(call, localVarReturnType);
    }

    public Call readNamespacedPodLogCall(String name, String namespace, String container, Boolean follow, Integer limitBytes, String pretty, Boolean previous, Integer sinceSeconds, Integer tailLines, Boolean timestamps, final ProgressListener progressListener, ProgressRequestListener progressRequestListener, Integer timeoutSeconds) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/api/v1/namespaces/{namespace}/pods/{name}/log".replaceAll("\\{name\\}", this.apiClient.escapeString(name.toString())).replaceAll("\\{namespace\\}", this.apiClient.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (container != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("container", container));
        }

        if (follow != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("follow", follow));
        }

        if (limitBytes != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("limitBytes", limitBytes));
        }

        if (pretty != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("pretty", pretty));
        }

        if (previous != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("previous", previous));
        }

        if (sinceSeconds != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("sinceSeconds", sinceSeconds));
        }

        if (tailLines != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("tailLines", tailLines));
        }

        if (timestamps != null) {
            localVarQueryParams.addAll(this.apiClient.parameterToPair("timestamps", timestamps));
        }

        if(timeoutSeconds != null){
            localVarQueryParams.addAll(this.apiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();
        String[] localVarAccepts = new String[]{"text/plain", "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"};
        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[]{"*/*"};
        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"BearerToken"};
        return this.apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

}
