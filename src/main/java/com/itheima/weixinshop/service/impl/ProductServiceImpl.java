package com.itheima.weixinshop.service.impl;

import com.itheima.weixinshop.dao.ProductDao;
import com.itheima.weixinshop.entity.ProductInfo;
import com.itheima.weixinshop.service.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop.service.impl
 */
@Service
public class ProductServiceImpl implements ProductSevice {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductInfo findOne(String id) {
        return productDao.findById(id).get();
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        Page<ProductInfo> productInfoPage = productDao.findAll(pageable);
        return productInfoPage;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productDao.findByProductStatus(ProductInfo.UP);
    }

    @Override
    public ProductInfo save(ProductInfo product) {
        ProductInfo save = productDao.save(product);
        return  save;
    }

    @Override
    public ProductInfo onSale(String productId) {
        return null;
    }

    @Override
    public ProductInfo offSale(String productId) {
        return null;
    }
}
