package com.itheima.weixinshop.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.entity
 */
//@data这个注解可以不用谢get和set方法，自动生成
@Entity
@Table(name = "product_category")
@EntityScan(basePackages={"com.itheima.weixinshop.entity"})
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;




}
