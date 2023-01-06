/*
 * Jobs API 2.1
 * The Jobs API allows you to create, edit, and delete jobs.
 *
 * The version of the OpenAPI document: 2.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.edmunds.rest.databricks.DTO.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * FileStorageInfoDTO
 */
@JsonPropertyOrder({
  FileStorageInfoDTO.JSON_PROPERTY_DESTINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-10T00:39:06.873-08:00[America/Los_Angeles]")
public class FileStorageInfoDTO {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  private String destination;

  public FileStorageInfoDTO destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * File destination. Example: &#x60;file:/my/file.sh&#x60;
   * @return destination
   **/
  @JsonProperty(value = "destination")

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileStorageInfoDTO fileStorageInfo = (FileStorageInfoDTO) o;
    return Objects.equals(this.destination, fileStorageInfo.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileStorageInfoDTO {\n");

    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
