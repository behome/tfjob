package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class V1Alpha2Worker{

    @SerializedName("replicas")
    private Integer replicas = null;
    @SerializedName("restartPolicy")
    private String restartPolicy = null;
    @SerializedName("template")
    private V1Alpha2TFJobTemplate template = null;

    public V1Alpha2Worker(){

    }

    public V1Alpha2Worker replicas(Integer replicas){
        this.replicas = replicas;
        return this;
    }

    @ApiModelProperty("replicas is defined for V1Alpha2Worker")
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public V1Alpha2Worker restartPolicy(String restartPolicy){
        this.restartPolicy = restartPolicy;
        return this;
    }

    @ApiModelProperty("restartPolicy is defined for V1Alpha2Worker")
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public V1Alpha2Worker template(V1Alpha2TFJobTemplate template){
        this.template = template;
        return this;
    }

    @ApiModelProperty("template is defined for V1Alpha2Worker")
    public V1Alpha2TFJobTemplate getTemplate() {
        return template;
    }

    public void setTemplate(V1Alpha2TFJobTemplate template) {
        this.template = template;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2Worker {\n");
        sb.append("    replicas: ").append(this.toIndentedString(this.replicas)).append("\n");
        sb.append("    restartPolicy: ").append(this.toIndentedString(this.restartPolicy)).append("\n");
        sb.append("    template: ").append(this.toIndentedString(this.template)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
