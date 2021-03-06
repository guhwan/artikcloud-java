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

public class DeviceRegConfirmUserRequest {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("pin")
  private String pin = null;

  public DeviceRegConfirmUserRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device ID. Optional if deviceName is present
   * @return deviceId
  **/
  @ApiModelProperty(example = "null", value = "Device ID. Optional if deviceName is present")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DeviceRegConfirmUserRequest deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Device Name. Optional if deviceId is present
   * @return deviceName
  **/
  @ApiModelProperty(example = "null", value = "Device Name. Optional if deviceId is present")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public DeviceRegConfirmUserRequest pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Pin obtained in the registrations call.
   * @return pin
  **/
  @ApiModelProperty(example = "null", value = "Pin obtained in the registrations call.")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegConfirmUserRequest deviceRegConfirmUserRequest = (DeviceRegConfirmUserRequest) o;
    return Objects.equals(this.deviceId, deviceRegConfirmUserRequest.deviceId) &&
        Objects.equals(this.deviceName, deviceRegConfirmUserRequest.deviceName) &&
        Objects.equals(this.pin, deviceRegConfirmUserRequest.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, deviceName, pin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegConfirmUserRequest {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

