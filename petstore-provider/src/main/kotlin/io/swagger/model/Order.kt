package io.swagger.model

import org.springframework.validation.annotation.Validated
import java.time.OffsetDateTime
import javax.annotation.Generated

/**
 * Order Status
 */
enum class StatusEnum(val value: String) {
  PLACED("placed"),
  APPROVED("approved"),
  DELIVERED("delivered");

//  @Override
//  @JsonValue
//  public String toString() {
//    return String.valueOf(value);
//  }
//
//  @JsonCreator
//  public static StatusEnum fromValue(String text) {
//    for (StatusEnum b : StatusEnum.values()) {
//      if (String.valueOf(b.value).equals(text)) {
//        return b;
//      }
//    }
//    return null;
//  }
}

/**
 * Order
 */
@Validated
@Generated(value = ["io.swagger.codegen.v3.generators.java.SpringCodegen"], date = "2019-08-23T06:04:49.869Z[GMT]")
data class Order(
  var id: Long,
  var petId: Long,
  var quantity: Int,
  var shipDate: OffsetDateTime,
  var status: StatusEnum,
  var complete: Boolean
)
