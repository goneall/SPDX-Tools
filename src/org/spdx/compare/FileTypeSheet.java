/**
 * Copyright (c) 2013 Source Auditor Inc.
 * Copyright (c) 2013 Black Duck Software Inc.
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
package org.spdx.compare;

import org.apache.poi.ss.usermodel.Workbook;
import org.spdx.rdfparser.SPDXFile;

/**
 * Sheet containing File Type
 * @author Gary O'Neall
 *
 */
public class FileTypeSheet extends AbstractFileCompareSheet {

	private static final int FILE_TYPE_COL_WIDTH = 15;

	/**
	 * @param workbook
	 * @param sheetName
	 */
	public FileTypeSheet(Workbook workbook, String sheetName) {
		super(workbook, sheetName);
	}

	static void create(Workbook wb, String sheetName) {
		AbstractFileCompareSheet.create(wb, sheetName, FILE_TYPE_COL_WIDTH);
	}

	/* (non-Javadoc)
	 * @see org.spdx.compare.AbstractFileCompareSheet#getFileValue(org.spdx.rdfparser.SPDXFile)
	 */
	@Override
	String getFileValue(SPDXFile spdxFile) {
		if (spdxFile.getType() == null) {
			return "";
		} else {
			return spdxFile.getType();
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.compare.AbstractFileCompareSheet#valuesMatch(org.spdx.compare.SpdxComparer, org.spdx.rdfparser.SPDXFile, int, org.spdx.rdfparser.SPDXFile, int)
	 */
	@Override
	boolean valuesMatch(SpdxComparer comparer, SPDXFile fileA, int docIndexA,
			SPDXFile fileB, int docIndexB) throws SpdxCompareException {
		return SpdxComparer.stringsEqual(fileA.getType(), fileB.getType());
	}

}