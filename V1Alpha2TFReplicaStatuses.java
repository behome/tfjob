package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class V1Alpha2TFReplicaStatuses {

    @SerializedName("Master")
    private V1Alpha2TFReplicaStatusesItem master = null;
    @SerializedName("Worker")
    private V1Alpha2TFReplicaStatusesItem worker = null;
    @SerializedName("PS")
    private V1Alpha2TFReplicaStatusesItem ps = null;


    public V1Alpha2TFReplicaStatuses(){

    }

    public V1Alpha2TFReplicaStatuses master(V1Alpha2TFReplicaStatusesItem master){
        this.master = master;
        return this;
    }

    @ApiModelProperty("Master is defined for V1Alpha2TFReplicaStatuses")
    public V1Alpha2TFReplicaStatusesItem getMaster() {
        return master;
    }

    public void setMaster(V1Alpha2TFReplicaStatusesItem master) {
        this.master = master;
    }

    public V1Alpha2TFReplicaStatuses worker(V1Alpha2TFReplicaStatusesItem worker){
        this.worker = worker;
        return this;
    }

    @ApiModelProperty("Worker is defined for V1Alpha2TFReplicaStatuses")
    public V1Alpha2TFReplicaStatusesItem getWorker() {
        return worker;
    }

    public void setWorker(V1Alpha2TFReplicaStatusesItem worker) {
        this.worker = worker;
    }

    public V1Alpha2TFReplicaStatuses ps(V1Alpha2TFReplicaStatusesItem ps){
        this.ps = ps;
        return this;
    }

    @ApiModelProperty("PS is defined for V1Alpha2TFReplicaStatuses")
    public V1Alpha2TFReplicaStatusesItem getPs() {
        return ps;
    }

    public void setPs(V1Alpha2TFReplicaStatusesItem ps) {
        this.ps = ps;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFReplicaStatuses {\n");
        sb.append("    master: ").append(this.toIndentedString(this.master)).append("\n");
        sb.append("    worker: ").append(this.toIndentedString(this.worker)).append("\n");
        sb.append("    ps: ").append(this.toIndentedString(this.ps)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
