/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.DTO.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

/**
 *
 */
@Data
public class NodeTypeDTO implements Serializable {

  @JsonProperty("node_type_id")
  private String nodeTypeId;
  @JsonProperty("memory_mb")
  private int memoryMb;
  @JsonProperty("num_cores")
  private float numCores;
  @JsonProperty("num_gpus")
  private float numGpus;
  @JsonProperty("description")
  private String description;
  @JsonProperty("category")
  private String category;
  @JsonProperty("support_ebs_volumes")
  private String supportEbsVolumes;
  @JsonProperty("support_cluster_tags")
  private String supportClusterTags;
  @JsonProperty("instance_type_id")
  private String instanceTypeId;
  @JsonProperty("is_deprecated")
  private boolean isDeprecated;
  @JsonProperty("is_hidden")
  private boolean isHidden;
  @JsonProperty("is_graviton")
  private boolean isGraviton;
  @JsonProperty("photon_driver_capable")
  private boolean photonDriverCapable;
  @JsonProperty("photon_worker_capable")
  private boolean photonWorkerCapable;
  @JsonProperty("is_encrypted_in_transit")
  private boolean isEncryptedInTransit;
  @JsonProperty("require_fabric_manager")
  private boolean requireFabricManager;
  @JsonProperty("node_info")
  private ClusterCloudProviderNodeInfoDTO nodeInfo;
  @JsonProperty("node_instance_type")
  private ClusterCloudProviderNodeInstanceTypeDTO nodeInstanceType;


}
