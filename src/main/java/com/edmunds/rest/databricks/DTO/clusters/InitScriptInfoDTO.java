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
 * InitScriptInfoDTO
 */
@JsonPropertyOrder({
  InitScriptInfoDTO.JSON_PROPERTY_DBFS,
  InitScriptInfoDTO.JSON_PROPERTY_FILE,
  InitScriptInfoDTO.JSON_PROPERTY_WORKSPACE,
  InitScriptInfoDTO.JSON_PROPERTY_S3

})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-10T00:39:06.873-08:00[America/Los_Angeles]")
public class InitScriptInfoDTO {
  public static final String JSON_PROPERTY_DBFS = "dbfs";
  @JsonProperty(JSON_PROPERTY_DBFS)
  private DbfsStorageInfoDTO dbfs;

  public static final String JSON_PROPERTY_FILE = "file";
  @JsonProperty(JSON_PROPERTY_FILE)
  private FileStorageInfoDTO _file;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  private FileStorageInfoDTO workspace;

  public static final String JSON_PROPERTY_S3 = "s3";

  @JsonProperty(JSON_PROPERTY_S3)
  private S3StorageInfoDTO s3;

  public InitScriptInfoDTO dbfs(DbfsStorageInfoDTO dbfs) {
    this.dbfs = dbfs;
    return this;
  }

  /**
   * Get dbfs
   * @return dbfs
   **/
  @JsonProperty(value = "dbfs")
  public DbfsStorageInfoDTO getDbfs() {
    return dbfs;
  }

  public void setDbfs(DbfsStorageInfoDTO dbfs) {
    this.dbfs = dbfs;
  }

  public InitScriptInfoDTO _file(FileStorageInfoDTO _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   **/
  @JsonProperty(value = "file")
  public FileStorageInfoDTO getFile() {
    return _file;
  }

  public void setFile(FileStorageInfoDTO _file) {
    this._file = _file;
  }

  @JsonProperty(value = "s3")
  public S3StorageInfoDTO getS3() {
    return s3;
  }

  public void setS3(S3StorageInfoDTO s3) {
    this.s3 = s3;
  }

  public FileStorageInfoDTO getWorkspace() {
    return workspace;
  }

  public void setWorkspace(FileStorageInfoDTO workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitScriptInfoDTO initScriptInfo = (InitScriptInfoDTO) o;
    return Objects.equals(this.dbfs, initScriptInfo.dbfs) &&
        Objects.equals(this._file, initScriptInfo._file) && Objects.equals(this.workspace, initScriptInfo.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbfs, _file, workspace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitScriptInfoDTO {\n");

    sb.append("    dbfs: ").append(toIndentedString(dbfs)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

