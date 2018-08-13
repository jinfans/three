package com.itheima.weixinshop.service.impl;

import com.itheima.weixinshop.dao.ProductCategoryDao;
import com.itheima.weixinshop.entity.ProductCategory;
import com.itheima.weixinshop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop.service.impl
 */
public class ProductCategoryImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao categoryDao;
    @Override
    public ProductCategory findOne(Integer id) {
        Optional<ProductCategory> byId = categoryDao.findById(id);
        ProductCategory productCategory = byId.get();
        return productCategory;
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findBycategoryTypeIn(List<Integer> categoryTypes) {
        return categoryDao.findBycategoryTypeIn(categoryTypes);
    }

    @Override
    public void save(ProductCategory productCategory) {
            categoryDao.save(productCategory);
    }
}
