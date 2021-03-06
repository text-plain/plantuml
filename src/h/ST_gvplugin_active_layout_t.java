/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
 * 
 * This file is part of Smetana.
 * Smetana is a partial translation of Graphviz/Dot sources from C to Java.
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * This translation is distributed under the same Licence as the original C program:
 * 
 *************************************************************************
 * Copyright (c) 2011 AT&T Intellectual Property 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: See CVS logs. Details at http://www.graphviz.org/
 *************************************************************************
 *
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC
 * LICENSE ("AGREEMENT"). [Eclipse Public License - v 1.0]
 * 
 * ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES
 * RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
 * 
 * You may obtain a copy of the License at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package h;

import smetana.core.CString;
import smetana.core.UnsupportedStructAndPtr;
import smetana.core.__ptr__;

public class ST_gvplugin_active_layout_t extends UnsupportedStructAndPtr {

	private ST_gvlayout_engine_s.Amp engine;
	private int id;
	private ST_gvlayout_features_t.Amp features;
	private CString type;

	// "}",

	@Override
	public __ptr__ setPtr(String fieldName, __ptr__ newData) {
		if (fieldName.equals("type")) {
			this.type = (CString) newData;
			return newData;
		}
		if (fieldName.equals("engine")) {
			this.engine = (ST_gvlayout_engine_s.Amp) newData;
			return newData;
		}
		if (fieldName.equals("features")) {
			this.features = (ST_gvlayout_features_t.Amp) newData;
			return newData;
		}
		return super.setPtr(fieldName, newData);
	}
	
	@Override
	public __ptr__ getPtr(String fieldName) {
		if (fieldName.equals("engine")) {
			return engine;
		}
		if (fieldName.equals("features")) {
			return features;
		}
		return super.getPtr(fieldName);
	}

	@Override
	public void setInt(String fieldName, int data) {
		if (fieldName.equals("id")) {
			this.id = data;
			return;
		}
		super.setInt(fieldName, data);
	}
}

// typedef struct gvplugin_active_layout_s {
// gvlayout_engine_t *engine;
// int id;
// gvlayout_features_t *features;
// const char *type;
// } gvplugin_active_layout_t;