package com.jadermarcelo.qrcode.generator.controller;

import com.jadermarcelo.qrcode.generator.dto.QrCodeGenerateResponse;
import com.jadermarcelo.qrcode.generator.dto.QrCodeGeneratorRequest;
import com.jadermarcelo.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }


    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGeneratorRequest request){


        try {

            QrCodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);


        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();

        }






    }
}
