/*
 * Copyright 2011 vvakame <vvakame@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.vvakame.util.jsonpullparser.factory;

import java.util.ArrayList;
import java.util.List;

import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * Internal data model for source code generation ({@link JsonModel})
 * @author vvakame
 */
public class JsonModelModel {

	String packageName = "invalid";

	String postfix = "Invalid";

	boolean existsBase = false;

	String targetBase = "Invalid";

	String target = "Invalid";

	String targetNew = "Invalid";

	List<JsonKeyModel> elements = new ArrayList<JsonKeyModel>();

	boolean treatUnknownKeyAsError;

	boolean genToPackagePrivate;

	boolean jsonMetaToPackagePrivate;

	boolean builder;

	StoreJsonModel storeElement = new StoreJsonModel();


	/**
	 * Keeps the given element.
	 * @param jsonElement
	 * @author vvakame
	 */
	public void addJsonElement(JsonKeyModel jsonElement) {
		if (jsonElement == null) {
			return;
		}
		elements.add(jsonElement);
	}

	/**
	 * @return the packageName
	 * @category accessor
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 * @category accessor
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * @return the postfix
	 * @category accessor
	 */
	public String getPostfix() {
		return postfix;
	}

	/**
	 * @param postfix the postfix to set
	 * @category accessor
	 */
	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	/**
	 * @return the existsBase
	 * @category accessor
	 */
	public boolean isExistsBase() {
		return existsBase;
	}

	/**
	 * @param existsBase the existsBase to set
	 * @category accessor
	 */
	public void setExistsBase(boolean existsBase) {
		this.existsBase = existsBase;
	}

	/**
	 * @return the targetBase
	 * @category accessor
	 */
	public String getTargetBase() {
		return targetBase;
	}

	/**
	 * @param targetBase the targetBase to set
	 * @category accessor
	 */
	public void setTargetBase(String targetBase) {
		this.targetBase = targetBase;
	}

	/**
	 * @return the target
	 * @category accessor
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 * @category accessor
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @return the targetNew
	 * @category accessor
	 */
	public String getTargetNew() {
		return targetNew;
	}

	/**
	 * @param targetNew the targetNew to set
	 * @category accessor
	 */
	public void setTargetNew(String targetNew) {
		this.targetNew = targetNew;
	}

	/**
	 * @return the elements
	 * @category accessor
	 */
	public List<JsonKeyModel> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 * @category accessor
	 */
	public void setElements(List<JsonKeyModel> elements) {
		this.elements = elements;
	}

	/**
	 * @return the treatUnknownKeyAsError
	 * @category accessor
	 */
	public boolean isTreatUnknownKeyAsError() {
		return treatUnknownKeyAsError;
	}

	/**
	 * @param treatUnknownKeyAsError the treatUnknownKeyAsError to set
	 * @category accessor
	 */
	public void setTreatUnknownKeyAsError(boolean treatUnknownKeyAsError) {
		this.treatUnknownKeyAsError = treatUnknownKeyAsError;
	}

	/**
	 * @return the genToPackagePrivate
	 * @category accessor
	 */
	public boolean isGenToPackagePrivate() {
		return genToPackagePrivate;
	}

	/**
	 * @param genToPackagePrivate the genToPackagePrivate to set
	 * @category accessor
	 */
	public void setGenToPackagePrivate(boolean genToPackagePrivate) {
		this.genToPackagePrivate = genToPackagePrivate;
	}

	/**
	 * @return the jsonMetaToPackagePrivate
	 * @category accessor
	 */
	public boolean isJsonMetaToPackagePrivate() {
		return jsonMetaToPackagePrivate;
	}

	/**
	 * @param jsonMetaToPackagePrivate the jsonMetaToPackagePrivate to set
	 * @category accessor
	 */
	public void setJsonMetaToPackagePrivate(boolean jsonMetaToPackagePrivate) {
		this.jsonMetaToPackagePrivate = jsonMetaToPackagePrivate;
	}

	/**
	 * @return the builder
	 * @category accessor
	 */
	public boolean isBuilder() {
		return builder;
	}

	/**
	 * @param builder the builder to set
	 * @category accessor
	 */
	public void setBuilder(boolean builder) {
		this.builder = builder;
	}

	/**
	 * @return the storeElement
	 * @category accessor
	 */
	public StoreJsonModel getStoreElement() {
		return storeElement;
	}

	/**
	 * @param storeElement the storeElement to set
	 * @category accessor
	 */
	public void setStoreElement(StoreJsonModel storeElement) {
		this.storeElement = storeElement;
	}
}