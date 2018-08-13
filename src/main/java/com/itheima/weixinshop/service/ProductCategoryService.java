package com.itheima.weixinshop.service;


import com.itheima.weixinshop.entity.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.service
 */
@Service
public interface ProductCategoryService {

    public ProductCategory findOne(Integer id);

    public List<ProductCategory> findAll();

    public List<ProductCategory> findBycategoryTypeIn(List<Integer> categoryTypes);

    public void save(ProductCategory productCategory);
}
