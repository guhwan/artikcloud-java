package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export Response.
 **/
@ApiModel(description = "Export Response.")
public class ExportResponse   {
  
  @SerializedName("csvHeaders")
  private Boolean csvHeaders = null;
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("exportId")
  private String exportId = null;
  
  @SerializedName("format")
  private String format = null;
  
  @SerializedName("order")
  private String order = null;
  
  @SerializedName("sdids")
  private String sdids = null;
  
  @SerializedName("sdtids")
  private String sdtids = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  
  @SerializedName("trialId")
  private String trialId = null;
  
  @SerializedName("uids")
  private String uids = null;
  
  @SerializedName("url")
  private String url = null;
  

  
  /**
   * Add header to csv format
   **/
  @ApiModelProperty(value = "Add header to csv format")
  public Boolean getCsvHeaders() {
    return csvHeaders;
  }
  public void setCsvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
  }

  
  /**
   * Timestamp of latest message (in milliseconds since epoch).
   **/
  @ApiModelProperty(value = "Timestamp of latest message (in milliseconds since epoch).")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Returned Export ID that should be used to check status and get the export result.
   **/
  @ApiModelProperty(value = "Returned Export ID that should be used to check status and get the export result.")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   * Format of the export.
   **/
  @ApiModelProperty(value = "Format of the export.")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Ascending or descending sort order.
   **/
  @ApiModelProperty(value = "Ascending or descending sort order.")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   * Source Device IDs being searched for messages (Comma-separated for multiple Device IDs).
   **/
  @ApiModelProperty(value = "Source Device IDs being searched for messages (Comma-separated for multiple Device IDs).")
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   * Source Device Type IDs being searched for messages (Comma-separated for multiple Device Type IDs).
   **/
  @ApiModelProperty(value = "Source Device Type IDs being searched for messages (Comma-separated for multiple Device Type IDs).")
  public String getSdtids() {
    return sdtids;
  }
  public void setSdtids(String sdtids) {
    this.sdtids = sdtids;
  }

  
  /**
   * Timestamp of earliest message (in milliseconds since epoch).
   **/
  @ApiModelProperty(value = "Timestamp of earliest message (in milliseconds since epoch).")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Trial ID being searched for messages.
   **/
  @ApiModelProperty(value = "Trial ID being searched for messages.")
  public String getTrialId() {
    return trialId;
  }
  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  
  /**
   * Owner's user IDs being searched for messages (Comma-separated for multiple User IDs).
   **/
  @ApiModelProperty(value = "Owner's user IDs being searched for messages (Comma-separated for multiple User IDs).")
  public String getUids() {
    return uids;
  }
  public void setUids(String uids) {
    this.uids = uids;
  }

  
  /**
   * URL added to successful email message.
   **/
  @ApiModelProperty(value = "URL added to successful email message.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportResponse exportResponse = (ExportResponse) o;
    return Objects.equals(this.csvHeaders, exportResponse.csvHeaders) &&
        Objects.equals(this.endDate, exportResponse.endDate) &&
        Objects.equals(this.exportId, exportResponse.exportId) &&
        Objects.equals(this.format, exportResponse.format) &&
        Objects.equals(this.order, exportResponse.order) &&
        Objects.equals(this.sdids, exportResponse.sdids) &&
        Objects.equals(this.sdtids, exportResponse.sdtids) &&
        Objects.equals(this.startDate, exportResponse.startDate) &&
        Objects.equals(this.trialId, exportResponse.trialId) &&
        Objects.equals(this.uids, exportResponse.uids) &&
        Objects.equals(this.url, exportResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csvHeaders, endDate, exportId, format, order, sdids, sdtids, startDate, trialId, uids, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportResponse {\n");
    
    sb.append("    csvHeaders: ").append(toIndentedString(csvHeaders)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    sdtids: ").append(toIndentedString(sdtids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    uids: ").append(toIndentedString(uids)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
