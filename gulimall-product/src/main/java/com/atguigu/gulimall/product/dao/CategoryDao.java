package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author awesomeChick
 * @email 1023428664@qq.com
 * @date 2021-12-04 17:16:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
