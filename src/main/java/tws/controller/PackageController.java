package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Package;
import tws.entity.Purchase;
import tws.repository.PackageMapper;
import tws.service.PackageService;
import tws.service.PurchaseService;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/PackagetoStorage")
public class PackageController {
    @Autowired
    PackageService packageService;
    @PostMapping("")
    public ResponseEntity<Package> insert(@RequestBody Package package1){
        packageService.insertPackage(package1);
        return ResponseEntity.created(URI.create("/packages/" + package1.getPurchaseNumber())).body(package1);
    }


}



