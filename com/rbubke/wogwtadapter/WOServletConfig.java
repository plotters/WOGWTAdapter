/*
 * Copyright 2008 Ronny Bubke, Winterhuder Marktplatz 17, 22299 Hamburg, Germany
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.rbubke.wogwtadapter;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class WOServletConfig implements ServletConfig {

	ServletContext servletContext;
	
	public String getInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration getInitParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public String getServletName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
