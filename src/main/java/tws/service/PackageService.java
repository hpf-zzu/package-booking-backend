package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Package;
import tws.repository.PackageMapper;

import java.util.List;
@Service
public class PackageService {
    @Autowired
    PackageMapper packageMapper;
    public void insertPackage(Package package1){
        packageMapper.insert(package1);

    }

}




