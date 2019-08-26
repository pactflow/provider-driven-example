package io.swagger.api

import io.swagger.model.Order
import io.swagger.model.StatusEnum
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import javax.annotation.Generated
import javax.servlet.http.HttpServletRequest
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Generated(value = ["io.swagger.codegen.v3.generators.java.SpringCodegen"], date = "2019-08-23T06:04:49.869Z[GMT]")
@RestController
@Tag(name = "store")
class StoreApiController(
  val request: HttpServletRequest
) {

//    public ResponseEntity<Void> deleteOrder(@Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true, allowableValues = "") @PathVariable("orderId") Long orderId) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    public ResponseEntity<Map<String, Integer>> getInventory() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Map<String, Integer>>(objectMapper.readValue("{
//  "key" : 0
//}", Map.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Map<String, Integer>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<Map<String, Integer>>(HttpStatus.NOT_IMPLEMENTED);
//    }

  @Operation(summary = "Find purchase order by ID", responses = [
    ApiResponse(content = [
      Content(schema = Schema(implementation = Order::class), mediaType = "application/json"),
      Content(schema = Schema(implementation = Order::class), mediaType = "application/xml")
    ], responseCode = "200", description = "successful operation"),
    ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = [ Content(mediaType = "application/json") ]),
    ApiResponse(responseCode = "404", description = "Order not found", content = [ Content(mediaType = "application/json") ])
  ], operationId = "getOrderById", tags = [ "store" ],
    description = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions")
  @RequestMapping(value = [ "/store/order/{orderId}" ],
    produces = [ "application/xml", "application/json" ],
    method = [ RequestMethod.GET ])
  @ResponseStatus(HttpStatus.OK)
  fun getOrderById(
    @Min(1L)
    @Max(10L)
    @Parameter(description = "ID of pet that needs to be fetched", required=true)
    @PathVariable("orderId")
    orderId: Long
  ) : ResponseEntity<Order> {
      val accept = request.getHeader("Accept")
      if (accept != null && (accept.contains("application/json") || accept.contains("application/xml"))) {
          return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(accept))
            .body(Order(1, 6, 1, OffsetDateTime.now(), StatusEnum.PLACED, false))
      }

      return ResponseEntity(HttpStatus.NOT_ACCEPTABLE)
    }

//    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Order>(objectMapper.readValue("{
//  "petId" : 6,
//  "quantity" : 1,
//  "id" : 0,
//  "shipDate" : "2000-01-23T04:56:07.000+00:00",
//  "complete" : false,
//  "status" : "placed"
//}", Order.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
//    }

  companion object: KLogging()

}
