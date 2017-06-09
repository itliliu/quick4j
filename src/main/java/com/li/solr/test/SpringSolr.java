/**
 * 
 */
package com.li.solr.test;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.li.spring_solr.pojo.User;

/**
 * 
 * @项目名称：spring-solr
 * @类名称：SpringSolrTest
 * @类描述：测试类
 * @创建人：liliu
 * @version：
 */
@Component
public class SpringSolr {

	@Autowired
	private HttpSolrServer httpSolrServer;

	public User getUser(Long id) throws SolrServerException {

		//创建查询条件
		SolrQuery query = new SolrQuery();
		query.setQuery("id:" + id);
		
		//查询并返回结果
		QueryResponse queryResponse = this.httpSolrServer.query(query);
		return (User) queryResponse.getBeans(User.class);
	}
}

