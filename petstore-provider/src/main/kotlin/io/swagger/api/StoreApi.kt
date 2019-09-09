package io.swagger.api

import io.swagger.model.Order
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.annotation.Generated
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@Generated(value = ["io.swagger.codegen.v3.generators.java.SpringCodegen"], date = "2019-08-23T06:04:49.869Z[GMT]")
//@Api(value = "store", description = "the store API")
@Tag(name = "store")
interface StoreApi {

//    @ApiOperation(value = "Delete purchase order by ID", nickname = "deleteOrder", notes = "For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors", tags={ "store", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 400, message = "Invalid ID supplied"),
//        @ApiResponse(code = 404, message = "Order not found") })
//    @RequestMapping(value = "/store/order/{orderId}",
//        method = RequestMethod.DELETE)
//    ResponseEntity<Void> deleteOrder(@Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true, allowableValues = "") @PathVariable("orderId") Long orderId);
//
//
//    @ApiOperation(value = "Returns pet inventories by status", nickname = "getInventory", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
//        @Authorization(value = "api_key")    }, tags={ "store", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
//    @RequestMapping(value = "/store/inventory",
//        produces = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<Map<String, Integer>> getInventory();


//    @Operation(summary = "Find purchase order by ID", responses = [
//      ApiResponse(content = [ Content(schema = Schema(implementation = Order::class)) ], responseCode = "200", description = "successful operation"),
//      ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//      ApiResponse(responseCode = "404", description = "Order not found")
//      ], operationId = "getOrderById", tags = [ "store" ],
//      description = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions")
//    @RequestMapping(value = [ "/store/order/{orderId}" ],
//        produces = [ "application/xml", "application/json" ],
//        method = [ RequestMethod.GET ])
//    fun getOrderById(
//      @Min(1L)
//      @Max(10L)
//      @Parameter(description = "ID of pet that needs to be fetched", required=true)
//      @PathVariable("orderId")
//      orderId: Long
//    ) : ResponseEntity<Order>


//    @ApiOperation(value = "Place an order for a pet", nickname = "placeOrder", notes = "", response = Order.class, tags={ "store", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
//        @ApiResponse(code = 400, message = "Invalid Order") })
//    @RequestMapping(value = "/store/order",
//        produces = { "application/xml", "application/json" },
//        consumes = { "*/*" },
//        method = RequestMethod.POST)
//    ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body);

}
