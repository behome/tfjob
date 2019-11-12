package tfjob;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.ExtensionsV1beta1DeploymentCondition;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.joda.time.DateTime;

public class V1Alpha2TFJobStatus {

    @SerializedName("completionTime")
    private DateTime completionTime = null;
    @SerializedName("startTime")
    private DateTime startTime = null;
    @SerializedName("conditions")
    private List<ExtensionsV1beta1DeploymentCondition> conditions = null;
    @SerializedName("tfReplicaStatuses")
    private V1Alpha2TFReplicaStatuses tfReplicaStatuses = null;

    public V1Alpha2TFJobStatus(){

    }

    public V1Alpha2TFJobStatus completionTime(DateTime completionTime){
        this.completionTime = completionTime;
        return this;
    }

    @ApiModelProperty("CompletionTime is defined for TFJob")
    public DateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(DateTime completionTime) {
        this.completionTime = completionTime;
    }

    public V1Alpha2TFJobStatus startTime(DateTime startTime){
        this.startTime = startTime;
        return this;
    }

    @ApiModelProperty("startTime is defined for TFJob")
    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public V1Alpha2TFJobStatus conditions(List<ExtensionsV1beta1DeploymentCondition> conditions){
        this.conditions = conditions;
        return this;
    }

    @ApiModelProperty("conditions is defined for TFJob")
    public List<ExtensionsV1beta1DeploymentCondition> getConditions() {
        return conditions;
    }

    public void setConditions(
            List<ExtensionsV1beta1DeploymentCondition> conditions) {
        this.conditions = conditions;
    }

    public V1Alpha2TFJobStatus tfReplicaStatuses(V1Alpha2TFReplicaStatuses tfReplicaStatuses){
        this.tfReplicaStatuses = tfReplicaStatuses;
        return this;
    }

    @ApiModelProperty("tfReplicaStatuses is defined for TFJob")
    public V1Alpha2TFReplicaStatuses getTfReplicaStatuses() {
        return tfReplicaStatuses;
    }

    public void setTfReplicaStatuses(V1Alpha2TFReplicaStatuses tfReplicaStatuses) {
        this.tfReplicaStatuses = tfReplicaStatuses;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFJobStatus {\n");
        sb.append("    completionTime: ").append(this.toIndentedString(this.completionTime)).append("\n");
        sb.append("    startTime: ").append(this.toIndentedString(this.startTime)).append("\n");
        sb.append("    conditions: ").append(this.toIndentedString(this.conditions)).append("\n");
        sb.append("    tfReplicaStatuses: ").append(this.toIndentedString(this.tfReplicaStatuses)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
