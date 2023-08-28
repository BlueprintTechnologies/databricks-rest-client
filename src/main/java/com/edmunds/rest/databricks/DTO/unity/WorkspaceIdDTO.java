package com.edmunds.rest.databricks.DTO.unity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WorkspaceIdDTO {
  public static final String JSON_PROPERTY_ID = "id";

  @JsonProperty(JSON_PROPERTY_ID)
  private String id;
}