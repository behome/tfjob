package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class V1Alpha2TFReplicaSpecs {

    @SerializedName("Master")
    public V1Alpha2Worker master = null;
    @SerializedName("Worker")
    public V1Alpha2Worker worker = null;
    @SerializedName("PS")
    public V1Alpha2Worker ps = null;

    public V1Alpha2TFReplicaSpecs(){

    }

    public V1Alpha2TFReplicaSpecs master(V1Alpha2Worker master){
        this.master = master;
        return this;
    }

    @ApiModelProperty("The master worker of the V1Alpha2TFJob")
    public V1Alpha2Worker getMaster() {
        return master;
    }

    public void setMaster(V1Alpha2Worker master) {
        this.master = master;
    }

    public V1Alpha2TFReplicaSpecs woker(V1Alpha2Worker worker){
        this.worker = worker;
        return this;
    }

    @ApiModelProperty("The worker of The V1Alpha2TFJob")
    public V1Alpha2Worker getWorker() {
        return worker;
    }

    public void setWorker(V1Alpha2Worker worker) {
        this.worker = worker;
    }

    public V1Alpha2TFReplicaSpecs ps(V1Alpha2Worker ps){
        this.ps = ps;
        return this;
    }

    @ApiModelProperty("The PS of the V1Alpha2TFJob")
    public V1Alpha2Worker getPs() {
        return ps;
    }

    public void setPs(V1Alpha2Worker ps) {
        this.ps = ps;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFReplicaSpecs {\n");
        sb.append("    master: ").append(this.toIndentedString(this.master)).append("\n");
        sb.append("    worker: ").append(this.toIndentedString(this.worker)).append("\n");
        sb.append("    PS: ").append(this.toIndentedString(this.ps)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
