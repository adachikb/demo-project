package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.example.openapi.model.ContractInfoResponseAAE91;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContractInfoResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T17:27:52.100692693+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class ContractInfoResponse {

  private @Nullable ContractInfoResponseAAE91 AAE91;

  public ContractInfoResponse AAE91(ContractInfoResponseAAE91 AAE91) {
    this.AAE91 = AAE91;
    return this;
  }

  /**
   * Get AAE91
   * @return AAE91
   */
  @Valid 
  @Schema(name = "AAE91", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91")
  public ContractInfoResponseAAE91 getAAE91() {
    return AAE91;
  }

  public void setAAE91(ContractInfoResponseAAE91 AAE91) {
    this.AAE91 = AAE91;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractInfoResponse contractInfoResponse = (ContractInfoResponse) o;
    return Objects.equals(this.AAE91, contractInfoResponse.AAE91);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AAE91);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractInfoResponse {\n");
    sb.append("    AAE91: ").append(toIndentedString(AAE91)).append("\n");
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

