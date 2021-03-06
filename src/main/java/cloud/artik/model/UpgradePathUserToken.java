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

public class UpgradePathUserToken {
  @SerializedName("uid")
  private String uid = null;

  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("did")
  private String did = null;

  public UpgradePathUserToken uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * User ID
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "User ID")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UpgradePathUserToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * User token from initial upgrade path request
   * @return accessToken
  **/
  @ApiModelProperty(example = "null", value = "User token from initial upgrade path request")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public UpgradePathUserToken did(String did) {
    this.did = did;
    return this;
  }

   /**
   * Device ID
   * @return did
  **/
  @ApiModelProperty(example = "null", value = "Device ID")
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
    UpgradePathUserToken upgradePathUserToken = (UpgradePathUserToken) o;
    return Objects.equals(this.uid, upgradePathUserToken.uid) &&
        Objects.equals(this.accessToken, upgradePathUserToken.accessToken) &&
        Objects.equals(this.did, upgradePathUserToken.did);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, accessToken, did);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradePathUserToken {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

