/**
 * Copyright (c) 2015 Source Auditor Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package org.spdx.rdfparser.model;

import java.util.ArrayList;

import org.spdx.rdfparser.IModelContainer;
import org.spdx.rdfparser.InvalidSPDXAnalysisException;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * A Checksum is value that allows the contents of a file to be authenticated. 
 * Even small changes to the content of the file will change its checksum. 
 * This class allows the results of a variety of checksum and cryptographic 
 * message digest algorithms to be represented.
 * 
 * @author Gary O'Neall
 *
 */
public class Checksum extends RdfModelObject {

	enum ChecksumAlgorithm {checksumAlgorithm_sha1, checksumAlgorithm_sha256,
		checksumAlgorithm_md5};
	ChecksumAlgorithm algorithm;
	String checksumValue;
	
	public Checksum(ChecksumAlgorithm algorithm, String checksumValue) {
		this.algorithm = algorithm;
		this.checksumValue = checksumValue;
	}

	/**
	 * @param modelContainer
	 * @param node
	 * @throws InvalidSPDXAnalysisException
	 */
	public Checksum(IModelContainer modelContainer, Node node)
			throws InvalidSPDXAnalysisException {
		super(modelContainer, node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Checksum() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.model.IRdfModel#verify()
	 */
	@Override
	public ArrayList<String> verify() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.model.RdfModelObject#getUri(org.spdx.rdfparser.IModelContainer)
	 */
	@Override
	String getUri(IModelContainer modelContainer) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.model.RdfModelObject#getType(com.hp.hpl.jena.rdf.model.Model)
	 */
	@Override
	Resource getType(Model model) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.model.RdfModelObject#populateModel()
	 */
	@Override
	void populateModel() throws InvalidSPDXAnalysisException {
		// TODO Auto-generated method stub

	}
	
	@Override
	public Checksum clone() {
		return null;
		// TODO Implement
	}

	/**
	 * @return
	 */
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.model.RdfModelObject#equivalent(org.spdx.rdfparser.model.RdfModelObject)
	 */
	@Override
	public boolean equivalent(RdfModelObject compare) {
		// TODO Auto-generated method stub
		return false;
	}

}