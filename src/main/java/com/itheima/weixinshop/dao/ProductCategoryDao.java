package com.itheima.weixinshop.dao;


import com.itheima.weixinshop.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.dao
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer>{

    public List<ProductCategory> findBycategoryTypeIn(List<Integer> categoryTypes);
}
