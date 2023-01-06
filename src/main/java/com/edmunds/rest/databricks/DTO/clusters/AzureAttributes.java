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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * AzureAttributes
 */
@JsonPropertyOrder({
        AzureAttributes.JSON_PROPERTY_FIRST_ON_DEMAND,
        AzureAttributes.JSON_PROPERTY_AVAILABILITY,
        AzureAttributes.JSON_PROPERTY_SPOT_BID_MAX_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-09T23:53:34.566-08:00[America/Los_Angeles]")
public class AzureAttributes {
    public static final String JSON_PROPERTY_FIRST_ON_DEMAND = "first_on_demand";
    public static final String JSON_PROPERTY_AVAILABILITY = "availability";
    public static final String JSON_PROPERTY_SPOT_BID_MAX_PRICE = "spot_bid_max_price";
    @JsonProperty(JSON_PROPERTY_FIRST_ON_DEMAND)
    private Integer firstOnDemand;
    @JsonProperty(JSON_PROPERTY_AVAILABILITY)
    private AvailabilityEnum availability;
    @JsonProperty(JSON_PROPERTY_SPOT_BID_MAX_PRICE)
    private Double spotBidMaxPrice;

    public AzureAttributes firstOnDemand(Integer firstOnDemand) {
        this.firstOnDemand = firstOnDemand;
        return this;
    }

    /**
     * The first &#x60;first_on_demand&#x60; nodes of the cluster are placed on on-demand instances. This value must be greater than 0, or else cluster creation validation fails. If this value is greater than or equal to the current cluster size, all nodes are placed on on-demand instances. If this value is less than the current cluster size, &#x60;first_on_demand&#x60; nodes are placed on on-demand instances and the remainder are placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster.
     *
     * @return firstOnDemand
     **/
    @JsonProperty(value = "first_on_demand")

    public Integer getFirstOnDemand() {
        return firstOnDemand;
    }

    public void setFirstOnDemand(Integer firstOnDemand) {
        this.firstOnDemand = firstOnDemand;
    }

    public AzureAttributes availability(AvailabilityEnum availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Availability type used for all subsequent nodes past the &#x60;first_on_demand&#x60; ones.  &#x60;SPOT_AZURE&#x60;: use spot instances. &#x60;ON_DEMAND_AZURE&#x60;: use on demand instances. &#x60;SPOT_WITH_FALLBACK_AZURE&#x60;: preferably use spot instances, but fall back to on-demand instances if spot instances cannot be acquired (for example, if Azure spot prices are too high or out of quota). Does not apply to pool availability.
     *
     * @return availability
     **/
    @JsonProperty(value = "availability")

    public AvailabilityEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availability) {
        this.availability = availability;
    }

    public AzureAttributes spotBidMaxPrice(Double spotBidMaxPrice) {
        this.spotBidMaxPrice = spotBidMaxPrice;
        return this;
    }

    /**
     * The max bid price used for Azure spot instances. You can set this to greater than or equal to the current spot price. You can also set this to -1 (the default), which specifies that the instance cannot be evicted on the basis of price. The price for the instance is the current price for spot instances or the price for a standard instance. You can view historical pricing and eviction rates in the Azure portal.
     *
     * @return spotBidMaxPrice
     **/
    @JsonProperty(value = "spot_bid_max_price")

    public Double getSpotBidMaxPrice() {
        return spotBidMaxPrice;
    }

    public void setSpotBidMaxPrice(Double spotBidMaxPrice) {
        this.spotBidMaxPrice = spotBidMaxPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AzureAttributes azureAttributes = (AzureAttributes) o;
        return Objects.equals(this.firstOnDemand, azureAttributes.firstOnDemand) &&
                Objects.equals(this.availability, azureAttributes.availability) &&
                Objects.equals(this.spotBidMaxPrice, azureAttributes.spotBidMaxPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstOnDemand, availability, spotBidMaxPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureAttributes {\n");

        sb.append("    firstOnDemand: ").append(toIndentedString(firstOnDemand)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    spotBidMaxPrice: ").append(toIndentedString(spotBidMaxPrice)).append("\n");
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

    /**
     * Availability type used for all subsequent nodes past the &#x60;first_on_demand&#x60; ones.  &#x60;SPOT_AZURE&#x60;: use spot instances. &#x60;ON_DEMAND_AZURE&#x60;: use on demand instances. &#x60;SPOT_WITH_FALLBACK_AZURE&#x60;: preferably use spot instances, but fall back to on-demand instances if spot instances cannot be acquired (for example, if Azure spot prices are too high or out of quota). Does not apply to pool availability.
     */
    public enum AvailabilityEnum {
        SPOT_AZURE("SPOT_AZURE"),

        ON_DEMAND_AZURE("ON_DEMAND_AZURE"),

        SPOT_WITH_FALLBACK_AZURE("SPOT_WITH_FALLBACK_AZURE");

        private String value;

        AvailabilityEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static AvailabilityEnum fromValue(String value) {
            for (AvailabilityEnum b : AvailabilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}
