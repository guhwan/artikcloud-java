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
import cloud.artik.model.NotifMessage;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class NotifMessageArray {
  @SerializedName("messages")
  private List<NotifMessage> messages = new ArrayList<NotifMessage>();

  public NotifMessageArray messages(List<NotifMessage> messages) {
    this.messages = messages;
    return this;
  }

  public NotifMessageArray addMessagesItem(NotifMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NotifMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<NotifMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifMessageArray notifMessageArray = (NotifMessageArray) o;
    return Objects.equals(this.messages, notifMessageArray.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifMessageArray {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

