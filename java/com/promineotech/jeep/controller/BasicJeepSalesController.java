package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.Entity.Jeep;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;


@RestController 
public class BasicJeepSalesController implements JeepSalesController {



  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
  return null;
}
}