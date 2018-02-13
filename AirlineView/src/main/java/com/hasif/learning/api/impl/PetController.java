package com.hasif.learning.api.impl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Pet;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController implements PetApi {

  @ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma separated strings", response = Pet.class, responseContainer = "List", tags = {
      "pet",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
      @ApiResponse(code = 400, message = "Invalid status value", response = Pet.class)})
  @RequestMapping(value = "/pet/findByStatus",
      produces = {"application/json"},
      method = RequestMethod.GET)
  @Override
  public ResponseEntity<List<Pet>> findPetsByStatus(
      @NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "AVAILABLE, PENDING, SOLD") @RequestParam(value = "status", required = true) List<String> status) {
    System.out.println("findPetsByStatus");
    return null;
  }


  @ApiOperation(value = "Finds Pets by tags", notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", tags = {
      "pet",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
      @ApiResponse(code = 400, message = "Invalid tag value", response = Pet.class)})
  @RequestMapping(value = "/pet/findByTags",
      produces = {"application/json"},
      method = RequestMethod.GET)
  @Override
  public ResponseEntity<List<Pet>> findPetsByTags(
      @NotNull @ApiParam(value = "Tags to filter by", required = true) @RequestParam(value = "tags", required = true) List<String> tags) {
    System.out.println("findPetsByTags");
    return null;
  }
}
