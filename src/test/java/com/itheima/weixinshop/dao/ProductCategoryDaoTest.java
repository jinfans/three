package com.itheima.weixinshop.dao;

import com.itheima.weixinshop.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop.dao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

   @Autowired
   private ProductCategoryDao productCategoryDao;

    @Test
    public void test01(){
        System.out.println(productCategoryDao.findAll().get(0).getCategoryId());
    }

    @Test
    public void test02(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(2);
        productCategory.setCreateTime(new Date());
        productCategoryDao.save(productCategory);
    }
    @Test
    public void test03(){
        Optional<ProductCategory> productCategory = productCategoryDao.findById(1);
        System.out.println(productCategory.toString());
    }

}