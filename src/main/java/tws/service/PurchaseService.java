package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Purchase;
import tws.repository.PurchaseMapper;

import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    PurchaseMapper purchaseMapper;
    public List<Purchase> selectAllPurchase(){
        return purchaseMapper.selectAll();

    }
    public void insertPurchase(Purchase purchase){
        purchaseMapper.insert(purchase);

    }
}
