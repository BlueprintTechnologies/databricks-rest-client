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


package com.edmunds.rest.databricks.DTO.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * PipelineTask
 */
@JsonPropertyOrder({
        PipelineTask.JSON_PROPERTY_PIPELINE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-09T23:53:34.566-08:00[America/Los_Angeles]")
public class PipelineTask {
    public static final String JSON_PROPERTY_PIPELINE_ID = "pipeline_id";
    @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
    private String pipelineId;

    public PipelineTask pipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The full name of the pipeline task to execute.
     *
     * @return pipelineId
     **/
    @JsonProperty(value = "pipeline_id")
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineTask pipelineTask = (PipelineTask) o;
        return Objects.equals(this.pipelineId, pipelineTask.pipelineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTask {\n");

        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
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

