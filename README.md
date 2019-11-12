## This is TFJob java api for kubeflow v1alpha2. 
It can be used with java api of kubernetes 1.9-1.12

[Kubernetes Java Api](https://github.com/kubernetes-client/java)

### Instructions for use
1. You need install java client for kubernetes first
2. Copy this code to your project
3. Now you can use TFJob Api in your kubernetes java client class;

#### Example
```java
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.util.Config;
import tfjob.V1Alpha2Api;
import tfjob.V1Alpha2TFJobList;
public class KubernetesClient{

	private final ApiClient client;

	private final V1Alpha2Api v1Alpha2Api;
	
	public KubernetesClient(){
		// Init the Kubernetes Client from the config of Kubernetes Cluster
		this.client = Config.fromCluster();
		// Init the v1Alpha2Api through client;
		this.v1Alpha2Api = new V1Alpha2Api(client);
	}
	
	// List TFJob Items in one namespace
	public V1Alpha2TFJobList listNamespacedTFJob(String namespace, String label)throws ApiException{
        return this.v1Alpha2Api.listNamespacedTFJobList(namespace, null, null, null, null, label, null, null, null, null);
    }
	
	/***
	Learn more about api usage in the V1Alpha2Api.java 
	***/
}
``` 
