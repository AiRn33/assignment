package com.test.test.controller;


import com.test.test.Service.CoffeesService;
import com.test.test.mapper.CoffeesMapper;
import com.test.test.vo.CoffeesVo;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CoffeesController {

    private final CoffeesService service;


    // 어노테이션 설정
    @GetMapping("/coffees")
    public ResponseEntity<List<CoffeesVo>> getCoffeesList() {

        return new ResponseEntity<>(service.getCoffeesList(), HttpStatus.OK);
    }

    @GetMapping("/coffees/{language_id}")
    public ResponseEntity<CoffeesVo> getCoffeeList(@PathVariable("language_id") int language_id) {

        return new ResponseEntity<>(service.getCoffees(language_id), HttpStatus.OK);
    }

    @PostMapping("/coffees")
    public ResponseEntity postCoffee(@RequestBody CoffeesVo vo) {

        return new ResponseEntity<>(service.postCoffee(vo.getName()), HttpStatus.OK);
    }

    @PutMapping("/coffees/{language_id}")
    public ResponseEntity updateCoffee(@PathVariable("language_id") int language_id,
                                         @RequestBody CoffeesVo vo) {


        return new ResponseEntity<>(service.updateCoffee(vo.getName(), language_id), HttpStatus.OK);
    }

    @DeleteMapping("/coffees/{language_id}")
    public ResponseEntity deleteCoffee(@PathVariable("language_id") int language_id){

        return new ResponseEntity<>(service.deleteCoffee(language_id), HttpStatus.OK);
    }

    // -----------------------------------------------------


    // XML 설정
    @GetMapping("/xml/coffees")
    public ResponseEntity<List<CoffeesVo>> getCoffeesListXml() {

        return new ResponseEntity<>(service.getCoffeesListXml(), HttpStatus.OK);
    }

    @GetMapping("/xml/coffees/{language_id}")
    public ResponseEntity<CoffeesVo> getCoffeeXml(@PathVariable("language_id") int language_id) {

        return new ResponseEntity<>(service.getCoffeeXml(language_id), HttpStatus.OK);
    }

    @PostMapping("/xml/coffees")
    public ResponseEntity postCoffeeXml(@RequestBody CoffeesVo vo) {

        return new ResponseEntity<>(service.postCoffeeXml(vo.getName()), HttpStatus.OK);
    }

    @PutMapping("/xml/coffees/{language_id}")
    public ResponseEntity updateCoffeeXml(@PathVariable("language_id") int language_id,
                                       @RequestBody CoffeesVo vo) {


        return new ResponseEntity<>(service.updateCoffeeXml(vo.getName(), language_id), HttpStatus.OK);
    }

    @DeleteMapping("/xml/coffees/{language_id}")
    public ResponseEntity deleteCoffeeXml(@PathVariable("language_id") int language_id){

        return new ResponseEntity<>(service.deleteCoffeeXml(language_id), HttpStatus.OK);
    }
}