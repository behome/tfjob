package tfjob;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1PodSpec;
import io.swagger.annotations.ApiModelProperty;

public class V1Alpha2TFJobTemplate {

    @SerializedName("metadata")
    public V1Alpha2TFJobTemplateMeta metadata = null;
    @SerializedName("spec")
    public V1PodSpec spec = null;

    public V1Alpha2TFJobTemplate() {

    }

    public V1Alpha2TFJobTemplate metadata(V1Alpha2TFJobTemplateMeta metadata){
        this.metadata = metadata;
        return this;
    }

    @ApiModelProperty("metadata is defined for V1Alpha2TFJobTemplateMeta")
    public V1Alpha2TFJobTemplateMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(V1Alpha2TFJobTemplateMeta metadata) {
        this.metadata = metadata;
    }

    public V1Alpha2TFJobTemplate spec(V1PodSpec spec){
        this.spec = spec;
        return this;
    }

    @ApiModelProperty("spec is defined for V1Alpha2TFJobTemplateMeta")
    public V1PodSpec getSpec() {
        return spec;
    }

    public void setSpec(V1PodSpec spec) {
        this.spec = spec;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFJobTemplate {\n");
        sb.append("    metadata: ").append(this.toIndentedString(this.metadata)).append("\n");
        sb.append("    spec: ").append(this.toIndentedString(this.spec)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
