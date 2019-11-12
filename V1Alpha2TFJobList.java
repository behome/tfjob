package tfjob;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

public class V1Alpha2TFJobList {

    @SerializedName("apiVersion")
    private String apiVersion = null;
    @SerializedName("items")
    private List<V1Alpha2TFJob> items = new ArrayList<>();
    @SerializedName("kind")
    private String kind = null;
    @SerializedName("metadata")
    private V1ListMeta metadata = null;

    public V1Alpha2TFJobList(){

    }

    public V1Alpha2TFJobList apiVersion(String apiVersion){
        this.apiVersion = apiVersion;
        return this;
    }

    @ApiModelProperty("APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public V1Alpha2TFJobList items(List<V1Alpha2TFJob> items){
        this.items = items;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = "Items is the list of TFJobs."
    )
    public List<V1Alpha2TFJob> getItems() {
        return items;
    }

    public void setItems(List<V1Alpha2TFJob> items) {
        this.items = items;
    }

    public V1Alpha2TFJobList kind(String kind){
        this.kind = kind;
        return this;
    }

    @ApiModelProperty("Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public V1Alpha2TFJobList metadata(V1ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @ApiModelProperty("Standard list metadata.")
    public V1ListMeta getMetadata() {
        return this.metadata;
    }

    public void setMetadata(V1ListMeta metadata) {
        this.metadata = metadata;
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
