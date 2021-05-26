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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link iconsApi2.service.http.FooServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FooSoap implements Serializable {

	public static FooSoap toSoapModel(Foo model) {
		FooSoap soapModel = new FooSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFooId(model.getFooId());
		soapModel.setNombre(model.getNombre());
		soapModel.setIcono(model.getIcono());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static FooSoap[] toSoapModels(Foo[] models) {
		FooSoap[] soapModels = new FooSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[][] toSoapModels(Foo[][] models) {
		FooSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FooSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FooSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[] toSoapModels(List<Foo> models) {
		List<FooSoap> soapModels = new ArrayList<FooSoap>(models.size());

		for (Foo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FooSoap[soapModels.size()]);
	}

	public FooSoap() {
	}

	public long getPrimaryKey() {
		return _fooId;
	}

	public void setPrimaryKey(long pk) {
		setFooId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFooId() {
		return _fooId;
	}

	public void setFooId(long fooId) {
		_fooId = fooId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getIcono() {
		return _icono;
	}

	public void setIcono(String icono) {
		_icono = icono;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private String _uuid;
	private long _fooId;
	private String _nombre;
	private String _icono;
	private String _url;

}