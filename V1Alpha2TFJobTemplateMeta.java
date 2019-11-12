package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

public class V1Alpha2TFJobTemplateMeta {

    @SerializedName("creationTimestamp")
    private DateTime creationTimestamp = null;

    public V1Alpha2TFJobTemplateMeta(){

    }

    public V1Alpha2TFJobTemplateMeta creationTimestamp(DateTime creationTimestamp){
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    @ApiModelProperty("creationTimestamp is defined for V1Alpha2TFJobTemplateMeta")
    public DateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(DateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Alpha2TFJobTemplateMeta {\n");
        sb.append("    creationTimestamp: ").append(this.toIndentedString(this.creationTimestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
