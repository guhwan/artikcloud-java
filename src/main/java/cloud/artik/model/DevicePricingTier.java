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

public class DevicePricingTier {
  @SerializedName("messageLimit")
  private Integer messageLimit = null;

  @SerializedName("cost")
  private String cost = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("ptid")
  private String ptid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("billingInterval")
  private String billingInterval = null;

  public DevicePricingTier messageLimit(Integer messageLimit) {
    this.messageLimit = messageLimit;
    return this;
  }

   /**
   * Message Limit
   * @return messageLimit
  **/
  @ApiModelProperty(example = "null", value = "Message Limit")
  public Integer getMessageLimit() {
    return messageLimit;
  }

  public void setMessageLimit(Integer messageLimit) {
    this.messageLimit = messageLimit;
  }

  public DevicePricingTier cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Cost
   * @return cost
  **/
  @ApiModelProperty(example = "null", value = "Cost")
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public DevicePricingTier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DevicePricingTier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DevicePricingTier active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "Active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public DevicePricingTier interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval
   * @return interval
  **/
  @ApiModelProperty(example = "null", value = "Interval")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public DevicePricingTier ptid(String ptid) {
    this.ptid = ptid;
    return this;
  }

   /**
   * Pricing Tier ID
   * @return ptid
  **/
  @ApiModelProperty(example = "null", value = "Pricing Tier ID")
  public String getPtid() {
    return ptid;
  }

  public void setPtid(String ptid) {
    this.ptid = ptid;
  }

  public DevicePricingTier type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DevicePricingTier billingInterval(String billingInterval) {
    this.billingInterval = billingInterval;
    return this;
  }

   /**
   * Billing Interval
   * @return billingInterval
  **/
  @ApiModelProperty(example = "null", value = "Billing Interval")
  public String getBillingInterval() {
    return billingInterval;
  }

  public void setBillingInterval(String billingInterval) {
    this.billingInterval = billingInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicePricingTier devicePricingTier = (DevicePricingTier) o;
    return Objects.equals(this.messageLimit, devicePricingTier.messageLimit) &&
        Objects.equals(this.cost, devicePricingTier.cost) &&
        Objects.equals(this.name, devicePricingTier.name) &&
        Objects.equals(this.description, devicePricingTier.description) &&
        Objects.equals(this.active, devicePricingTier.active) &&
        Objects.equals(this.interval, devicePricingTier.interval) &&
        Objects.equals(this.ptid, devicePricingTier.ptid) &&
        Objects.equals(this.type, devicePricingTier.type) &&
        Objects.equals(this.billingInterval, devicePricingTier.billingInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageLimit, cost, name, description, active, interval, ptid, type, billingInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicePricingTier {\n");
    
    sb.append("    messageLimit: ").append(toIndentedString(messageLimit)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    ptid: ").append(toIndentedString(ptid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    billingInterval: ").append(toIndentedString(billingInterval)).append("\n");
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
