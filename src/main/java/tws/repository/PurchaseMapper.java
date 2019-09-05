package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;
import tws.entity.Purchase;

import java.util.List;
@Mapper
public interface PurchaseMapper {
    List<Purchase> selectAll();
    void insert(@Param("purchase") Purchase purchase);


}
