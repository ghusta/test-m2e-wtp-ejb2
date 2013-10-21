package fr.husta.test.entity;

import javax.ejb.EntityBean;

/**
 * @ejb.bean name="MyEjb"
 *           display-name="MyEjb"
 *           local-jndi-name="ejb/local/MyEjb"
 *           cmp-version="2.x"
 *           view-type="local"
 *           type="CMP"
 *           schema="MyEjb"
 *
 */
public abstract class MyEntityBean
        implements EntityBean
{

}
