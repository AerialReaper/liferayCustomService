/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package iconsApi2.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;

import iconsApi2.exception.NoSuchFooException;
import iconsApi2.model.Foo;

//import iconsApi2.service.model.Foo;

//import iconsApi2.service.model.impl.FooImpl;

import iconsApi2.service.base.FooServiceBaseImpl;


/**
 * The implementation of the foo remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>iconsApi2.service.FooService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=civica",
		"json.web.service.context.path=Foo"
	},
	service = AopService.class
)
public class FooServiceImpl extends FooServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>iconsApi2.service.FooServiceUtil</code> to access the foo remote service.
	 */
	public String getStrign() {
		return "hola mundo";
	}
	
	public Foo addFoo(int id, String nombre, String icono, String url) {
		Foo foo = this.fooPersistence.create(1l);
		foo.setFooId(id);
		foo.setNombre(nombre);
		foo.setIcono(icono);
		foo.setUrl(url);
		
		this.fooPersistence.update(foo);
		
		return foo;
	}
	
	public List<Foo> getAllIcons(){
		return this.fooPersistence.findAll();
	}
	
	public Foo deleteFoo(long fooId){
		Foo foo = null;
		try {
			foo = this.fooPersistence.findByPrimaryKey(fooId);
			this.fooPersistence.remove(fooId);
		} catch (NoSuchFooException e) {
			e.printStackTrace();
		}
		return foo;
	}
	
}
	
	