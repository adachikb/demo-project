package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * KChildItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T17:27:52.100692693+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class KChildItem {

  private @Nullable String AAE91024;

  private @Nullable String AAE91037;

  private @Nullable String AAE91042;

  private @Nullable String AAE91057;

  private @Nullable String KEY;

  private @Nullable String pdfSign;

  public KChildItem AAE91024(String AAE91024) {
    this.AAE91024 = AAE91024;
    return this;
  }

  /**
   * Get AAE91024
   * @return AAE91024
   */
  
  @Schema(name = "AAE91024", example = "C538718661", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91024")
  public String getAAE91024() {
    return AAE91024;
  }

  public void setAAE91024(String AAE91024) {
    this.AAE91024 = AAE91024;
  }

  public KChildItem AAE91037(String AAE91037) {
    this.AAE91037 = AAE91037;
    return this;
  }

  /**
   * Get AAE91037
   * @return AAE91037
   */
  
  @Schema(name = "AAE91037", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91037")
  public String getAAE91037() {
    return AAE91037;
  }

  public void setAAE91037(String AAE91037) {
    this.AAE91037 = AAE91037;
  }

  public KChildItem AAE91042(String AAE91042) {
    this.AAE91042 = AAE91042;
    return this;
  }

  /**
   * Get AAE91042
   * @return AAE91042
   */
  
  @Schema(name = "AAE91042", example = "0000000001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91042")
  public String getAAE91042() {
    return AAE91042;
  }

  public void setAAE91042(String AAE91042) {
    this.AAE91042 = AAE91042;
  }

  public KChildItem AAE91057(String AAE91057) {
    this.AAE91057 = AAE91057;
    return this;
  }

  /**
   * Get AAE91057
   * @return AAE91057
   */
  
  @Schema(name = "AAE91057", example = "AAH9J", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91057")
  public String getAAE91057() {
    return AAE91057;
  }

  public void setAAE91057(String AAE91057) {
    this.AAE91057 = AAE91057;
  }

  public KChildItem KEY(String KEY) {
    this.KEY = KEY;
    return this;
  }

  /**
   * Get KEY
   * @return KEY
   */
  
  @Schema(name = "KEY", example = "Sonpo1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KEY")
  public String getKEY() {
    return KEY;
  }

  public void setKEY(String KEY) {
    this.KEY = KEY;
  }

  public KChildItem pdfSign(String pdfSign) {
    this.pdfSign = pdfSign;
    return this;
  }

  /**
   * Get pdfSign
   * @return pdfSign
   */
  
  @Schema(name = "pdfSign", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pdfSign")
  public String getPdfSign() {
    return pdfSign;
  }

  public void setPdfSign(String pdfSign) {
    this.pdfSign = pdfSign;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KChildItem kchildItem = (KChildItem) o;
    return Objects.equals(this.AAE91024, kchildItem.AAE91024) &&
        Objects.equals(this.AAE91037, kchildItem.AAE91037) &&
        Objects.equals(this.AAE91042, kchildItem.AAE91042) &&
        Objects.equals(this.AAE91057, kchildItem.AAE91057) &&
        Objects.equals(this.KEY, kchildItem.KEY) &&
        Objects.equals(this.pdfSign, kchildItem.pdfSign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AAE91024, AAE91037, AAE91042, AAE91057, KEY, pdfSign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KChildItem {\n");
    sb.append("    AAE91024: ").append(toIndentedString(AAE91024)).append("\n");
    sb.append("    AAE91037: ").append(toIndentedString(AAE91037)).append("\n");
    sb.append("    AAE91042: ").append(toIndentedString(AAE91042)).append("\n");
    sb.append("    AAE91057: ").append(toIndentedString(AAE91057)).append("\n");
    sb.append("    KEY: ").append(toIndentedString(KEY)).append("\n");
    sb.append("    pdfSign: ").append(toIndentedString(pdfSign)).append("\n");
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

