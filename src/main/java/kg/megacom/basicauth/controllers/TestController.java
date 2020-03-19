package kg.megacom.basicauth.controllers;

import kg.megacom.basicauth.model.Currency;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@EnableWebSecurity
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> test(){
        return new ResponseEntity<>(new Currency("21", "USD", "asd"), HttpStatus.OK);
    }


    @RequestMapping(value = "/t", method = RequestMethod.POST)
    public ResponseEntity<?> testPost(@RequestBody Currency currency){
        return new ResponseEntity<>(currency, HttpStatus.OK);
    }




}
