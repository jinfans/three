package com.itheima.weixinshop.dao;

import com.itheima.weixinshop.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop.dao
 */
public interface ProductDao extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
