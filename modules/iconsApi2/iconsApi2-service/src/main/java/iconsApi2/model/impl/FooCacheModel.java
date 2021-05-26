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

package iconsApi2.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import iconsApi2.model.Foo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FooCacheModel)) {
			return false;
		}

		FooCacheModel fooCacheModel = (FooCacheModel)object;

		if (fooId == fooCacheModel.fooId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fooId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fooId=");
		sb.append(fooId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", icono=");
		sb.append(icono);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Foo toEntityModel() {
		FooImpl fooImpl = new FooImpl();

		if (uuid == null) {
			fooImpl.setUuid("");
		}
		else {
			fooImpl.setUuid(uuid);
		}

		fooImpl.setFooId(fooId);

		if (nombre == null) {
			fooImpl.setNombre("");
		}
		else {
			fooImpl.setNombre(nombre);
		}

		if (icono == null) {
			fooImpl.setIcono("");
		}
		else {
			fooImpl.setIcono(icono);
		}

		if (url == null) {
			fooImpl.setUrl("");
		}
		else {
			fooImpl.setUrl(url);
		}

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fooId = objectInput.readLong();
		nombre = objectInput.readUTF();
		icono = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fooId);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (icono == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icono);
		}

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}
	}

	public String uuid;
	public long fooId;
	public String nombre;
	public String icono;
	public String url;

}