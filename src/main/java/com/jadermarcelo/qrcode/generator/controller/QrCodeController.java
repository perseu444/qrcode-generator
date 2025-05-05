package com.jadermarcelo.qrcode.generator.controller;

import com.jadermarcelo.qrcode.generator.dto.QrCodeGenerateResponse;
import com.jadermarcelo.qrcode.generator.dto.QrCodeGeneratorRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGeneratorRequest request){
        return null;



    }
}
