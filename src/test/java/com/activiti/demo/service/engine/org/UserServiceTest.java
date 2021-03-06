/**
 * 
 */
package com.activiti.demo.service.engine.org;

import static org.junit.Assert.*;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.User;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import com.activiti.demo.base.spring.SpringTransactionalTestCase;

/**
 * @author Administrator
 *
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UserServiceTest extends SpringTransactionalTestCase {

	
	
	 @Autowired
	 protected ProcessEngineFactoryBean processEngineFactoryBean;
	
	 @Autowired
	 protected IdentityService identityService;
	 
	@Test
	@Rollback(false)
	public void ProcessEngineFactoryBean() {
		
		
	}

}
