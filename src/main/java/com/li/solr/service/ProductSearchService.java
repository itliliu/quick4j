/**
 * 
 */
package com.li.solr.service;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;

import com.li.solr.entity.Product;
/**
 * @author liliu
 *
 */
public class ProductSearchService {
	
	//通过spring注入HttpSolrServer对象
	@Autowired
	private HttpSolrServer httpSolrServer;
	
	/**
	 * 
	 * @描述：根据商品类型、商品颜色、价格区间组合条件到solr中查询数据
	 * @创建人：liliu
	 * @创建时间：2015年11月04日 上午10:49:19
	 * @param productType 商品的类型
	 * @param minPrice 价格区间底价
	 * @param maxPrice 价格区间顶价
	 * @param color 商品的颜色
	 * @return 查询得到的所有商品列表
	 * @throws SolrServerException 
	 */
	public List<Product> queryProduct(String productType,String color, Float minPrice, Float maxPrice) throws SolrServerException {

		// 创建查询对象
		SolrQuery solrQuery = new SolrQuery();

		// 创建组合条件串
		StringBuilder params = new StringBuilder("productType:" + productType);
		
		// 组合商品颜色条件
		if (color != null) {
			params.append(" AND color:" + color);
		}

		// 组合价格区间条件
		if (minPrice.intValue() != 0 || maxPrice != 0) {
			params.append(" AND spPrice:[" + minPrice + " TO "
					+ maxPrice + "]");
		}

		solrQuery.setQuery(params.toString());

		// 执行查询并获取查询数据
		QueryResponse queryResponse = this.httpSolrServer.query(solrQuery);
		List<Product> products = queryResponse.getBeans(Product.class);

		return products;
	}
}
