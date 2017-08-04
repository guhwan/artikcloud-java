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
 * 
 */
@ApiModel(description = "")

public class DeviceStatusData {
  @SerializedName("lastTimeOnline")
  private Long lastTimeOnline = null;

  @SerializedName("lastActionTs")
  private Long lastActionTs = null;

  @SerializedName("lastMessageTs")
  private Long lastMessageTs = null;

  @SerializedName("availability")
  private String availability = null;

  @SerializedName("snapshot")
  private Map<String, Object> snapshot = new HashMap<String, Object>();

  public DeviceStatusData lastTimeOnline(Long lastTimeOnline) {
    this.lastTimeOnline = lastTimeOnline;
    return this;
  }

   /**
   * Get lastTimeOnline
   * @return lastTimeOnline
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastTimeOnline() {
    return lastTimeOnline;
  }

  public void setLastTimeOnline(Long lastTimeOnline) {
    this.lastTimeOnline = lastTimeOnline;
  }

  public DeviceStatusData lastActionTs(Long lastActionTs) {
    this.lastActionTs = lastActionTs;
    return this;
  }

   /**
   * Get lastActionTs
   * @return lastActionTs
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastActionTs() {
    return lastActionTs;
  }

  public void setLastActionTs(Long lastActionTs) {
    this.lastActionTs = lastActionTs;
  }

  public DeviceStatusData lastMessageTs(Long lastMessageTs) {
    this.lastMessageTs = lastMessageTs;
    return this;
  }

   /**
   * Get lastMessageTs
   * @return lastMessageTs
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastMessageTs() {
    return lastMessageTs;
  }

  public void setLastMessageTs(Long lastMessageTs) {
    this.lastMessageTs = lastMessageTs;
  }

  public DeviceStatusData availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public DeviceStatusData snapshot(Map<String, Object> snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public DeviceStatusData putSnapshotItem(String key, Object snapshotItem) {
    this.snapshot.put(key, snapshotItem);
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(Map<String, Object> snapshot) {
    this.snapshot = snapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceStatusData deviceStatusData = (DeviceStatusData) o;
    return Objects.equals(this.lastTimeOnline, deviceStatusData.lastTimeOnline) &&
        Objects.equals(this.lastActionTs, deviceStatusData.lastActionTs) &&
        Objects.equals(this.lastMessageTs, deviceStatusData.lastMessageTs) &&
        Objects.equals(this.availability, deviceStatusData.availability) &&
        Objects.equals(this.snapshot, deviceStatusData.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTimeOnline, lastActionTs, lastMessageTs, availability, snapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceStatusData {\n");
    
    sb.append("    lastTimeOnline: ").append(toIndentedString(lastTimeOnline)).append("\n");
    sb.append("    lastActionTs: ").append(toIndentedString(lastActionTs)).append("\n");
    sb.append("    lastMessageTs: ").append(toIndentedString(lastMessageTs)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
