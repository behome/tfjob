package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class V1Alpha2TFReplicaStatusesItem {

    @SerializedName("active")
    private Integer active = null;
    @SerializedName("succeeded")
    private Integer succeeded = null;
    @SerializedName("failed")
    private Integer failed = null;

    public V1Alpha2TFReplicaStatusesItem(){

    }

    public V1Alpha2TFReplicaStatusesItem active(Integer active){
        this.active = active;
        return this;
    }

    @ApiModelProperty("active is defined for Item")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public V1Alpha2TFReplicaStatusesItem succeeded(Integer succeeded){
        this.succeeded = succeeded;
        return this;
    }

    @ApiModelProperty("succeeded is defined for Item")
    public Integer getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    public V1Alpha2TFReplicaStatusesItem failed(Integer failed){
        this.failed = failed;
        return this;
    }

    @ApiModelProperty("failed is defined for item")
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFReplicaStatusesItem {\n");
        sb.append("    active: ").append(this.toIndentedString(this.active)).append("\n");
        sb.append("    succeeded: ").append(this.toIndentedString(this.succeeded)).append("\n");
        sb.append("    failed: ").append(this.toIndentedString(this.failed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
