package tfjob;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.joda.time.DateTime;

@ApiModel(
        description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create."
)
public class V1Alpha2ObjectMeta {

    @SerializedName("clusterName")
    private String clusterName = null;
    @SerializedName("creationTimestamp")
    private DateTime creationTimestamp= null;
    @SerializedName("selfLink")
    private String selfLink = null;
    @SerializedName("generation")
    private Long generation = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("namespace")
    private String namespace = null;
    @SerializedName("uid")
    private String uid = null;
    @SerializedName("resourceVersion")
    private String resourceVersion = null;

    public V1Alpha2ObjectMeta(){

    }

    public V1Alpha2ObjectMeta clusterName(String clusterName){
        this.clusterName = clusterName;
        return this;
    }

    @ApiModelProperty("The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.")
    public String getClusterName() {
        return this.clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public V1Alpha2ObjectMeta creationTimestamp(DateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    @ApiModelProperty("CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
    public DateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(DateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public V1Alpha2ObjectMeta generation(Long generation) {
        this.generation = generation;
        return this;
    }

    @ApiModelProperty("A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.")
    public Long getGeneration() {
        return this.generation;
    }

    public void setGeneration(Long generation) {
        this.generation = generation;
    }

    public V1Alpha2ObjectMeta name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty("Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V1Alpha2ObjectMeta namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    @ApiModelProperty("Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces")
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public V1Alpha2ObjectMeta resourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    @ApiModelProperty("An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency")
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public V1Alpha2ObjectMeta selfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    @ApiModelProperty("SelfLink is a URL representing this object. Populated by the system. Read-only.")
    public String getSelfLink() {
        return this.selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public V1Alpha2ObjectMeta uid(String uid) {
        this.uid = uid;
        return this;
    }

    @ApiModelProperty("UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(o != null && this.getClass() == o.getClass()){
            V1Alpha2ObjectMeta v1Alpha2ObjectMeta = (V1Alpha2ObjectMeta)o;
            return Objects.equals(this.clusterName, v1Alpha2ObjectMeta.clusterName) && Objects.equals(this.creationTimestamp, v1Alpha2ObjectMeta.creationTimestamp) && Objects.equals(this.generation, v1Alpha2ObjectMeta.generation) && Objects.equals(this.name, v1Alpha2ObjectMeta.name) && Objects.equals(this.namespace, v1Alpha2ObjectMeta.namespace) && Objects.equals(this.resourceVersion, v1Alpha2ObjectMeta.resourceVersion) && Objects.equals(this.selfLink, v1Alpha2ObjectMeta.selfLink) && Objects.equals(this.uid, v1Alpha2ObjectMeta.uid);
        }else{
            return false;
        }

    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.clusterName, this.creationTimestamp, this.generation, this.name, this.namespace, this.resourceVersion, this.selfLink, this.uid});
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class V1ObjectMeta {\n");
        sb.append("    clusterName: ").append(this.toIndentedString(this.clusterName)).append("\n");
        sb.append("    creationTimestamp: ").append(this.toIndentedString(this.creationTimestamp)).append("\n");
        sb.append("    generation: ").append(this.toIndentedString(this.generation)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    namespace: ").append(this.toIndentedString(this.namespace)).append("\n");
        sb.append("    resourceVersion: ").append(this.toIndentedString(this.resourceVersion)).append("\n");
        sb.append("    selfLink: ").append(this.toIndentedString(this.selfLink)).append("\n");
        sb.append("    uid: ").append(this.toIndentedString(this.uid)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
