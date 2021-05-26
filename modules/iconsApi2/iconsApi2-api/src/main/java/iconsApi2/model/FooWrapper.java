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

package iconsApi2.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
public class FooWrapper
	extends BaseModelWrapper<Foo> implements Foo, ModelWrapper<Foo> {

	public FooWrapper(Foo foo) {
		super(foo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
		attributes.put("nombre", getNombre());
		attributes.put("icono", getIcono());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String icono = (String)attributes.get("icono");

		if (icono != null) {
			setIcono(icono);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	/**
	 * Returns the foo ID of this foo.
	 *
	 * @return the foo ID of this foo
	 */
	@Override
	public long getFooId() {
		return model.getFooId();
	}

	/**
	 * Returns the icono of this foo.
	 *
	 * @return the icono of this foo
	 */
	@Override
	public String getIcono() {
		return model.getIcono();
	}

	/**
	 * Returns the nombre of this foo.
	 *
	 * @return the nombre of this foo
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this foo.
	 *
	 * @return the primary key of this foo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the url of this foo.
	 *
	 * @return the url of this foo
	 */
	@Override
	public String getUrl() {
		return model.getUrl();
	}

	/**
	 * Returns the uuid of this foo.
	 *
	 * @return the uuid of this foo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Sets the foo ID of this foo.
	 *
	 * @param fooId the foo ID of this foo
	 */
	@Override
	public void setFooId(long fooId) {
		model.setFooId(fooId);
	}

	/**
	 * Sets the icono of this foo.
	 *
	 * @param icono the icono of this foo
	 */
	@Override
	public void setIcono(String icono) {
		model.setIcono(icono);
	}

	/**
	 * Sets the nombre of this foo.
	 *
	 * @param nombre the nombre of this foo
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this foo.
	 *
	 * @param primaryKey the primary key of this foo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the url of this foo.
	 *
	 * @param url the url of this foo
	 */
	@Override
	public void setUrl(String url) {
		model.setUrl(url);
	}

	/**
	 * Sets the uuid of this foo.
	 *
	 * @param uuid the uuid of this foo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected FooWrapper wrap(Foo foo) {
		return new FooWrapper(foo);
	}

}