package com.itheima.weixinshop.service.impl;

import com.itheima.weixinshop.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop.service.impl
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("1");
        System.out.println(productInfo.getProductName());
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findList() throws Exception {
        PageRequest pageable=PageRequest.of(3,10);
        Page<ProductInfo> list = productService.findAll(pageable);

        System.out.println(list.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo product=new ProductInfo();
        product.setProductId("1");
        product.setProductName("炒饭");
        BigDecimal a =new BigDecimal("1.22");
        product.setProductPrice(a);
        product.setProductStock(100);
        product.setProductDescription("好吃的炒饭");
        product.setProductIcon("/aa.jpg");
        product.setProductStatus(ProductInfo.UP);
        product.setCategoryType(2);
        product.setCreateTime(new Date());
        productService.save(product);
    }

}