package com.inovati.db;

import javax.persistence.*
import org.hibernate.cfg.*

/**
*
* @author Carlos A. Cuaya Xinto
*/

class Hibernate {
	static factory = new AnnotationConfiguration().configure().buildSessionFactory()

	static def getClassMetadata(xClass){
		return factory.getClassMetadata(xClass)
	}
}