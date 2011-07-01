/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs;

/**
 * Wrapper around a Concept (with class=Drug) that represents an orderable generic drug.
 */
public class GenericDrug extends BaseOrderable<DrugOrder> implements Orderable<DrugOrder> {
	
	/** constructor that sets default concept for orderable element*/
	public GenericDrug(Concept concept) {
		super();
		this.concept = concept;
	}
	
	/**
	 * @see org.openmrs.Orderable#getUniqueIdentifier()
	 */
	@Override
	public String getUniqueIdentifier() {
		return "org.openmrs.GenericDrug:concept=" + concept.getConceptId();
	}
}