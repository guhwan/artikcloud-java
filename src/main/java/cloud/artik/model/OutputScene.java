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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Output of a scene
 */
@ApiModel(description = "Output of a scene")

public class OutputScene {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("aid")
  private String aid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("actions")
  private Map<String, Object> actions = new HashMap<String, Object>();

  @SerializedName("error")
  private Map<String, Object> error = new HashMap<String, Object>();

  public OutputScene id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OutputScene uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OutputScene aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }

  public OutputScene name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutputScene description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutputScene actions(Map<String, Object> actions) {
    this.actions = actions;
    return this;
  }

  public OutputScene putActionsItem(String key, Object actionsItem) {
    this.actions.put(key, actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getActions() {
    return actions;
  }

  public void setActions(Map<String, Object> actions) {
    this.actions = actions;
  }

  public OutputScene error(Map<String, Object> error) {
    this.error = error;
    return this;
  }

  public OutputScene putErrorItem(String key, Object errorItem) {
    this.error.put(key, errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getError() {
    return error;
  }

  public void setError(Map<String, Object> error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputScene outputScene = (OutputScene) o;
    return Objects.equals(this.id, outputScene.id) &&
        Objects.equals(this.uid, outputScene.uid) &&
        Objects.equals(this.aid, outputScene.aid) &&
        Objects.equals(this.name, outputScene.name) &&
        Objects.equals(this.description, outputScene.description) &&
        Objects.equals(this.actions, outputScene.actions) &&
        Objects.equals(this.error, outputScene.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, aid, name, description, actions, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputScene {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

