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

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

public class GWTActionResult implements WOActionResults {

	WOResponse woResponse;
	RemoteServiceServlet serviceImpl;
	HttpServletRequest woRequestAdapter;
	HttpServletResponse woResponseAdapter;
	
	public GWTActionResult(
			RemoteServiceServlet serviceImpl,
			WORequest woRequest,
			String webServerRootFolder) {
		this(serviceImpl, woRequest, webServerRootFolder, new WOResponse());
	}
	
	public GWTActionResult(
			RemoteServiceServlet serviceImpl,
			WORequest woRequest,
			String webServerRootFolder,
			WOResponse woResponse) {
		this.serviceImpl = serviceImpl;
		woRequestAdapter = new HttpServletWebobjectsRequestAdapter(woRequest);
		woResponseAdapter = new HttpServletWebobjectsResponseAdapter(woResponse);	
		this.woResponse = woResponse;
		ServletContext servletContext = new WOServletContext(webServerRootFolder);		
		WOServletConfig servletConfig = new WOServletConfig();
		servletConfig.setServletContext(servletContext);
		try {
			serviceImpl.init(servletConfig);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	public WOResponse generateResponse() {
		serviceImpl.doPost(woRequestAdapter, woResponseAdapter);
		return woResponse;
	}

}
