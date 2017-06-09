/**
 * 
 */
package com.li.solr.test;

import org.apache.solr.client.solrj.SolrServerException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.li.spring_solr.pojo.User;


/**
 * 
 * @项目名称：spring-solr
 * @类名称：SpringSolrTest
 * @类描述：测试类
 * @创建人：liliu
 * @version：
 */
public class SpringSolrTest {


	private SpringSolr springSolr;


	@Before
	public void setUp() throws Exception {
		// 初始化Spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml", "applicationContext-solr.xml");
	
		//获取对象
		this.springSolr = applicationContext.getBean(SpringSolr.class);
	}


	@Test
	public void test() throws SolrServerException {


		// 测试方法，输出结果
		User user = springSolr.getUser((long) 1);
		System.out.println(user);
	}


}


