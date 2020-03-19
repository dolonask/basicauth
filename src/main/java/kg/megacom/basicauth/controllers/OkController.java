package kg.megacom.basicauth.controllers;

import kg.megacom.basicauth.model.Currency;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ok")

public class OkController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> test(){
        return new ResponseEntity<>(new Currency("qwe", "USD", "df"), HttpStatus.OK);
    }


}
