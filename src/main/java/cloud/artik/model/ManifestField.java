/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ManifestField {
  @SerializedName("field")
  private String field = null;

  @SerializedName("did")
  private String did = null;

  public ManifestField field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ManifestField did(String did) {
    this.did = did;
    return this;
  }

   /**
   * Get did
   * @return did
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestField manifestField = (ManifestField) o;
    return Objects.equals(this.field, manifestField.field) &&
        Objects.equals(this.did, manifestField.did);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, did);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestField {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

