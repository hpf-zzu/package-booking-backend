package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.entity.Purchase;
import tws.service.PurchaseService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @GetMapping
    public ResponseEntity<List<Purchase>> selectAllPurchase(){
        List<Purchase> purchaseList = purchaseService.selectAllPurchase();
        return ResponseEntity.ok(purchaseList);
    }


    @PostMapping("")
    public ResponseEntity<Purchase> insert(@RequestBody Purchase purchase) {
        purchaseService.insertPurchase(purchase);
        return ResponseEntity.created(URI.create("/purchases/" + purchase.getPurchaseNumber())).body(purchase);
    }

}
