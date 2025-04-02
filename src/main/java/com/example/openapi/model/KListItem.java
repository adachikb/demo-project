package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.openapi.model.KChildItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * KListItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T17:27:52.100692693+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class KListItem {

  private @Nullable String AAE91008;

  private @Nullable String AAE91022;

  private @Nullable String AAE91024;

  private @Nullable String AAE91025;

  private @Nullable String AAE91028;

  private @Nullable String AAE91029;

  private @Nullable String AAE91031;

  private @Nullable String AAE91037;

  private @Nullable String AAE91043;

  private @Nullable String AAE91044;

  private @Nullable String AAE91045;

  private @Nullable String AAE91046;

  private @Nullable String AAE91047;

  private @Nullable String AAE91048;

  private @Nullable String AAE91049;

  private @Nullable String AAE91050;

  private @Nullable String AAE91057;

  private @Nullable String AAE91059;

  private @Nullable String AAE91061;

  private @Nullable String KEY;

  @Valid
  private List<@Valid KChildItem> kChildList = new ArrayList<>();

  public KListItem AAE91008(String AAE91008) {
    this.AAE91008 = AAE91008;
    return this;
  }

  /**
   * Get AAE91008
   * @return AAE91008
   */
  
  @Schema(name = "AAE91008", example = "<td colspan=\"2\" class=\"table-mask-caution\"><span class=\"table-mask-caution-message\">ご契約者名が変更されておりますので、ご照会いただけなくなりました。</span><span/><span/><p class=\"table-mask-caution-message2\">改姓についてのお問合わせはこちら</p><div class=\"box_block\"><h3>三井住友海上インターネットデスク</h3><p class=\"text_tel\"><a href=\"tel:0120168321\" title=\"TEL0120-168-321\">0120-168-321</a><span>(無料)</span></p></div></td>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91008")
  public String getAAE91008() {
    return AAE91008;
  }

  public void setAAE91008(String AAE91008) {
    this.AAE91008 = AAE91008;
  }

  public KListItem AAE91022(String AAE91022) {
    this.AAE91022 = AAE91022;
    return this;
  }

  /**
   * Get AAE91022
   * @return AAE91022
   */
  
  @Schema(name = "AAE91022", example = "自動車保険", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91022")
  public String getAAE91022() {
    return AAE91022;
  }

  public void setAAE91022(String AAE91022) {
    this.AAE91022 = AAE91022;
  }

  public KListItem AAE91024(String AAE91024) {
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

  public KListItem AAE91025(String AAE91025) {
    this.AAE91025 = AAE91025;
    return this;
  }

  /**
   * Get AAE91025
   * @return AAE91025
   */
  
  @Schema(name = "AAE91025", example = "&nbsp～&nbsp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91025")
  public String getAAE91025() {
    return AAE91025;
  }

  public void setAAE91025(String AAE91025) {
    this.AAE91025 = AAE91025;
  }

  public KListItem AAE91028(String AAE91028) {
    this.AAE91028 = AAE91028;
    return this;
  }

  /**
   * Get AAE91028
   * @return AAE91028
   */
  
  @Schema(name = "AAE91028", example = "-", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91028")
  public String getAAE91028() {
    return AAE91028;
  }

  public void setAAE91028(String AAE91028) {
    this.AAE91028 = AAE91028;
  }

  public KListItem AAE91029(String AAE91029) {
    this.AAE91029 = AAE91029;
    return this;
  }

  /**
   * Get AAE91029
   * @return AAE91029
   */
  
  @Schema(name = "AAE91029", example = "-", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91029")
  public String getAAE91029() {
    return AAE91029;
  }

  public void setAAE91029(String AAE91029) {
    this.AAE91029 = AAE91029;
  }

  public KListItem AAE91031(String AAE91031) {
    this.AAE91031 = AAE91031;
    return this;
  }

  /**
   * Get AAE91031
   * @return AAE91031
   */
  
  @Schema(name = "AAE91031", example = "ご契約明細あり", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91031")
  public String getAAE91031() {
    return AAE91031;
  }

  public void setAAE91031(String AAE91031) {
    this.AAE91031 = AAE91031;
  }

  public KListItem AAE91037(String AAE91037) {
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

  public KListItem AAE91043(String AAE91043) {
    this.AAE91043 = AAE91043;
    return this;
  }

  /**
   * Get AAE91043
   * @return AAE91043
   */
  
  @Schema(name = "AAE91043", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91043")
  public String getAAE91043() {
    return AAE91043;
  }

  public void setAAE91043(String AAE91043) {
    this.AAE91043 = AAE91043;
  }

  public KListItem AAE91044(String AAE91044) {
    this.AAE91044 = AAE91044;
    return this;
  }

  /**
   * Get AAE91044
   * @return AAE91044
   */
  
  @Schema(name = "AAE91044", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91044")
  public String getAAE91044() {
    return AAE91044;
  }

  public void setAAE91044(String AAE91044) {
    this.AAE91044 = AAE91044;
  }

  public KListItem AAE91045(String AAE91045) {
    this.AAE91045 = AAE91045;
    return this;
  }

  /**
   * Get AAE91045
   * @return AAE91045
   */
  
  @Schema(name = "AAE91045", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91045")
  public String getAAE91045() {
    return AAE91045;
  }

  public void setAAE91045(String AAE91045) {
    this.AAE91045 = AAE91045;
  }

  public KListItem AAE91046(String AAE91046) {
    this.AAE91046 = AAE91046;
    return this;
  }

  /**
   * Get AAE91046
   * @return AAE91046
   */
  
  @Schema(name = "AAE91046", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91046")
  public String getAAE91046() {
    return AAE91046;
  }

  public void setAAE91046(String AAE91046) {
    this.AAE91046 = AAE91046;
  }

  public KListItem AAE91047(String AAE91047) {
    this.AAE91047 = AAE91047;
    return this;
  }

  /**
   * Get AAE91047
   * @return AAE91047
   */
  
  @Schema(name = "AAE91047", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91047")
  public String getAAE91047() {
    return AAE91047;
  }

  public void setAAE91047(String AAE91047) {
    this.AAE91047 = AAE91047;
  }

  public KListItem AAE91048(String AAE91048) {
    this.AAE91048 = AAE91048;
    return this;
  }

  /**
   * Get AAE91048
   * @return AAE91048
   */
  
  @Schema(name = "AAE91048", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91048")
  public String getAAE91048() {
    return AAE91048;
  }

  public void setAAE91048(String AAE91048) {
    this.AAE91048 = AAE91048;
  }

  public KListItem AAE91049(String AAE91049) {
    this.AAE91049 = AAE91049;
    return this;
  }

  /**
   * Get AAE91049
   * @return AAE91049
   */
  
  @Schema(name = "AAE91049", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91049")
  public String getAAE91049() {
    return AAE91049;
  }

  public void setAAE91049(String AAE91049) {
    this.AAE91049 = AAE91049;
  }

  public KListItem AAE91050(String AAE91050) {
    this.AAE91050 = AAE91050;
    return this;
  }

  /**
   * Get AAE91050
   * @return AAE91050
   */
  
  @Schema(name = "AAE91050", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91050")
  public String getAAE91050() {
    return AAE91050;
  }

  public void setAAE91050(String AAE91050) {
    this.AAE91050 = AAE91050;
  }

  public KListItem AAE91057(String AAE91057) {
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

  public KListItem AAE91059(String AAE91059) {
    this.AAE91059 = AAE91059;
    return this;
  }

  /**
   * Get AAE91059
   * @return AAE91059
   */
  
  @Schema(name = "AAE91059", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91059")
  public String getAAE91059() {
    return AAE91059;
  }

  public void setAAE91059(String AAE91059) {
    this.AAE91059 = AAE91059;
  }

  public KListItem AAE91061(String AAE91061) {
    this.AAE91061 = AAE91061;
    return this;
  }

  /**
   * Get AAE91061
   * @return AAE91061
   */
  
  @Schema(name = "AAE91061", example = "AAH9J", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AAE91061")
  public String getAAE91061() {
    return AAE91061;
  }

  public void setAAE91061(String AAE91061) {
    this.AAE91061 = AAE91061;
  }

  public KListItem KEY(String KEY) {
    this.KEY = KEY;
    return this;
  }

  /**
   * Get KEY
   * @return KEY
   */
  
  @Schema(name = "KEY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KEY")
  public String getKEY() {
    return KEY;
  }

  public void setKEY(String KEY) {
    this.KEY = KEY;
  }

  public KListItem kChildList(List<@Valid KChildItem> kChildList) {
    this.kChildList = kChildList;
    return this;
  }

  public KListItem addKChildListItem(KChildItem kChildListItem) {
    if (this.kChildList == null) {
      this.kChildList = new ArrayList<>();
    }
    this.kChildList.add(kChildListItem);
    return this;
  }

  /**
   * Get kChildList
   * @return kChildList
   */
  @Valid 
  @Schema(name = "kChildList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kChildList")
  public List<@Valid KChildItem> getkChildList() {
    return kChildList;
  }

  public void setkChildList(List<@Valid KChildItem> kChildList) {
    this.kChildList = kChildList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KListItem klistItem = (KListItem) o;
    return Objects.equals(this.AAE91008, klistItem.AAE91008) &&
        Objects.equals(this.AAE91022, klistItem.AAE91022) &&
        Objects.equals(this.AAE91024, klistItem.AAE91024) &&
        Objects.equals(this.AAE91025, klistItem.AAE91025) &&
        Objects.equals(this.AAE91028, klistItem.AAE91028) &&
        Objects.equals(this.AAE91029, klistItem.AAE91029) &&
        Objects.equals(this.AAE91031, klistItem.AAE91031) &&
        Objects.equals(this.AAE91037, klistItem.AAE91037) &&
        Objects.equals(this.AAE91043, klistItem.AAE91043) &&
        Objects.equals(this.AAE91044, klistItem.AAE91044) &&
        Objects.equals(this.AAE91045, klistItem.AAE91045) &&
        Objects.equals(this.AAE91046, klistItem.AAE91046) &&
        Objects.equals(this.AAE91047, klistItem.AAE91047) &&
        Objects.equals(this.AAE91048, klistItem.AAE91048) &&
        Objects.equals(this.AAE91049, klistItem.AAE91049) &&
        Objects.equals(this.AAE91050, klistItem.AAE91050) &&
        Objects.equals(this.AAE91057, klistItem.AAE91057) &&
        Objects.equals(this.AAE91059, klistItem.AAE91059) &&
        Objects.equals(this.AAE91061, klistItem.AAE91061) &&
        Objects.equals(this.KEY, klistItem.KEY) &&
        Objects.equals(this.kChildList, klistItem.kChildList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AAE91008, AAE91022, AAE91024, AAE91025, AAE91028, AAE91029, AAE91031, AAE91037, AAE91043, AAE91044, AAE91045, AAE91046, AAE91047, AAE91048, AAE91049, AAE91050, AAE91057, AAE91059, AAE91061, KEY, kChildList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KListItem {\n");
    sb.append("    AAE91008: ").append(toIndentedString(AAE91008)).append("\n");
    sb.append("    AAE91022: ").append(toIndentedString(AAE91022)).append("\n");
    sb.append("    AAE91024: ").append(toIndentedString(AAE91024)).append("\n");
    sb.append("    AAE91025: ").append(toIndentedString(AAE91025)).append("\n");
    sb.append("    AAE91028: ").append(toIndentedString(AAE91028)).append("\n");
    sb.append("    AAE91029: ").append(toIndentedString(AAE91029)).append("\n");
    sb.append("    AAE91031: ").append(toIndentedString(AAE91031)).append("\n");
    sb.append("    AAE91037: ").append(toIndentedString(AAE91037)).append("\n");
    sb.append("    AAE91043: ").append(toIndentedString(AAE91043)).append("\n");
    sb.append("    AAE91044: ").append(toIndentedString(AAE91044)).append("\n");
    sb.append("    AAE91045: ").append(toIndentedString(AAE91045)).append("\n");
    sb.append("    AAE91046: ").append(toIndentedString(AAE91046)).append("\n");
    sb.append("    AAE91047: ").append(toIndentedString(AAE91047)).append("\n");
    sb.append("    AAE91048: ").append(toIndentedString(AAE91048)).append("\n");
    sb.append("    AAE91049: ").append(toIndentedString(AAE91049)).append("\n");
    sb.append("    AAE91050: ").append(toIndentedString(AAE91050)).append("\n");
    sb.append("    AAE91057: ").append(toIndentedString(AAE91057)).append("\n");
    sb.append("    AAE91059: ").append(toIndentedString(AAE91059)).append("\n");
    sb.append("    AAE91061: ").append(toIndentedString(AAE91061)).append("\n");
    sb.append("    KEY: ").append(toIndentedString(KEY)).append("\n");
    sb.append("    kChildList: ").append(toIndentedString(kChildList)).append("\n");
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

