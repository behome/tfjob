package tfjob;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

public class V1Alpha2TFJob {

    @SerializedName("apiVersion")
    private String apiVersion = "kubeflow.org/v1alpha2";
    @SerializedName("kind")
    private String kind = "TFJob";
    @SerializedName("metadata")
    private V1ObjectMeta metadata = null;
    @SerializedName("spec")
    private V1Alpha2TFJobSpec spec = null;
    @SerializedName("status")
    private V1Alpha2TFJobStatus status = null;

    public V1Alpha2TFJob() {
    }

    public V1Alpha2TFJob apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    @ApiModelProperty("APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public V1Alpha2TFJob kind(String kind) {
        this.kind = kind;
        return this;
    }

    @ApiModelProperty("Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public V1Alpha2TFJob metadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @ApiModelProperty("Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
    public V1ObjectMeta getMetadata() {
        return this.metadata;
    }

    public void setMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public V1Alpha2TFJob spec(V1Alpha2TFJobSpec spec) {
        this.spec = spec;
        return this;
    }

    @ApiModelProperty("Specification of the desired behavior of the pod. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
    public V1Alpha2TFJobSpec getSpec() {
        return this.spec;
    }

    public void setSpec(V1Alpha2TFJobSpec spec) {
        this.spec = spec;
    }

    public V1Alpha2TFJob status(V1Alpha2TFJobStatus status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty("Most recently observed status of the pod. This data may not be up to date. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
    public V1Alpha2TFJobStatus getStatus() {
        return this.status;
    }

    public void setStatus(V1Alpha2TFJobStatus status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            V1Alpha2TFJob tfJob = (V1Alpha2TFJob) o;
            return Objects.equals(this.apiVersion, tfJob.apiVersion) && Objects.equals(this.kind, tfJob.kind) && Objects.equals(this.metadata, tfJob.metadata) && Objects.equals(this.spec, tfJob.spec) && Objects.equals(this.status, tfJob.status);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.apiVersion, this.kind, this.metadata, this.spec, this.status});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFJob {\n");
        sb.append("    apiVersion: ").append(this.toIndentedString(this.apiVersion)).append("\n");
        sb.append("    kind: ").append(this.toIndentedString(this.kind)).append("\n");
        sb.append("    metadata: ").append(this.toIndentedString(this.metadata)).append("\n");
        sb.append("    spec: ").append(this.toIndentedString(this.spec)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
