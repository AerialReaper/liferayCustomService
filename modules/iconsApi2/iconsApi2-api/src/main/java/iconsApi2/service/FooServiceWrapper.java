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

package iconsApi2.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FooService}.
 *
 * @author Brian Wing Shun Chan
 * @see FooService
 * @generated
 */
public class FooServiceWrapper
	implements FooService, ServiceWrapper<FooService> {

	public FooServiceWrapper(FooService fooService) {
		_fooService = fooService;
	}

	@Override
	public iconsApi2.model.Foo addFoo(
		int id, String nombre, String icono, String url) {

		return _fooService.addFoo(id, nombre, icono, url);
	}

	@Override
	public iconsApi2.model.Foo deleteFoo(long fooId) {
		return _fooService.deleteFoo(fooId);
	}

	@Override
	public java.util.List<iconsApi2.model.Foo> getAllIcons() {
		return _fooService.getAllIcons();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fooService.getOSGiServiceIdentifier();
	}

	@Override
	public String getStrign() {
		return _fooService.getStrign();
	}

	@Override
	public FooService getWrappedService() {
		return _fooService;
	}

	@Override
	public void setWrappedService(FooService fooService) {
		_fooService = fooService;
	}

	private FooService _fooService;

}