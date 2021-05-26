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

package iconsApi2.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import iconsApi2.service.FooServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>FooServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooServiceSoap
 * @generated
 */
public class FooServiceHttp {

	public static String getStrign(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				FooServiceUtil.class, "getStrign", _getStrignParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static iconsApi2.model.Foo addFoo(
		HttpPrincipal httpPrincipal, int id, String nombre, String icono,
		String url) {

		try {
			MethodKey methodKey = new MethodKey(
				FooServiceUtil.class, "addFoo", _addFooParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, nombre, icono, url);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (iconsApi2.model.Foo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<iconsApi2.model.Foo> getAllIcons(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				FooServiceUtil.class, "getAllIcons",
				_getAllIconsParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<iconsApi2.model.Foo>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static iconsApi2.model.Foo deleteFoo(
		HttpPrincipal httpPrincipal, long fooId) {

		try {
			MethodKey methodKey = new MethodKey(
				FooServiceUtil.class, "deleteFoo", _deleteFooParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, fooId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (iconsApi2.model.Foo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FooServiceHttp.class);

	private static final Class<?>[] _getStrignParameterTypes0 = new Class[] {};
	private static final Class<?>[] _addFooParameterTypes1 = new Class[] {
		int.class, String.class, String.class, String.class
	};
	private static final Class<?>[] _getAllIconsParameterTypes2 =
		new Class[] {};
	private static final Class<?>[] _deleteFooParameterTypes3 = new Class[] {
		long.class
	};

}