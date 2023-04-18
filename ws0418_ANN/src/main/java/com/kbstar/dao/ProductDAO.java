package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("pdao")
public class ProductDAO implements MyDao<String, ProductDTO> {
    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("insert oracle :" + productDTO);
    }

    @Override
    public void delete(String K) {
        System.out.println("delete oracle :" + K);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("update oracle :" + productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO("01", "샌드위치", 2, 1500);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("01", "샌드위치", 2, 1500));
        list.add(new ProductDTO("02", "고구마빵", 2, 500));
        list.add(new ProductDTO("03", "텀블러", 1, 15000));
        return list;
    }
}
