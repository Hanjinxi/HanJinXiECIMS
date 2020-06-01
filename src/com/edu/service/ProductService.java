package com.edu.service;

import java.util.List;
import java.util.Map;

import com.edu.entity.Product;

/**
 * 产品Dao接口
 * @author Administrator
 *
 */
public interface ProductService {

	/**
	 * 查询产品
	 * @param map
	 * @return
	 */
	public List<Product> findProduct(Map<String,Object> map);
	
	/**
	 * 查询产品记录数
	 * @param map
	 * @return
	 */
	public Long getTotalProduct(Map<String,Object> map);
	

}
