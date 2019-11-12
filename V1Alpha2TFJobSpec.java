package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

@ApiModel(
        description = "TFJobSpec is a description of a TFJobSpec."
)
public class V1Alpha2TFJobSpec {

    @SerializedName("tfReplicaSpecs")
    private V1Alpha2TFReplicaSpecs tfReplicaSpecs = null;

    public V1Alpha2TFJobSpec(){

    }

    public V1Alpha2TFJobSpec tfReplicaSpecs(V1Alpha2TFReplicaSpecs tfReplicaSpecs){
        this.tfReplicaSpecs = tfReplicaSpecs;
        return this;
    }

    @ApiModelProperty(required = true,
            value = "Template describes the Master, Worker and PS that will be created.")
    public V1Alpha2TFReplicaSpecs getTfReplicaSpecs() {
        return tfReplicaSpecs;
    }

    public void setTfReplicaSpecs(V1Alpha2TFReplicaSpecs tfReplicaSpecs) {
        this.tfReplicaSpecs = tfReplicaSpecs;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(this.getClass() == o.getClass()){
            V1Alpha2TFJobSpec v1Alpha2TFJobSpec = (V1Alpha2TFJobSpec) o;
            return Objects.equals(this.getTfReplicaSpecs(), v1Alpha2TFJobSpec.getTfReplicaSpecs());
        }else{
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(new Object[]{this.tfReplicaSpecs});
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionsV1beta1DeploymentSpec {\n");
        sb.append("    tfReplicaSpecs: ").append(this.toIndentedString(this.tfReplicaSpecs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
