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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.webobjects.appserver.WORequest;

public class HttpServletWebobjectsRequestAdapter implements HttpServletRequest {

	WORequest woRequest;
	
	public HttpServletWebobjectsRequestAdapter(WORequest woRequest) {
		this.woRequest = woRequest;
	}
	
	public String getAuthType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getContextPath() {
		// TODO Auto-generated method stub
		return "";
	}

	public Cookie[] getCookies() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getDateHeader(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getHeader(String s) {
		return woRequest.headerForKey(s);
	}

	public Enumeration getHeaderNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration getHeaders(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getIntHeader(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPathInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPathTranslated() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getQueryString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRemoteUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRequestURI() {
		// TODO Auto-generated method stub
		return null;
	}

	public StringBuffer getRequestURL() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRequestedSessionId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public HttpSession getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	public HttpSession getSession(boolean flag) {
		// TODO Auto-generated method stub
		return null;
	}

	public Principal getUserPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isRequestedSessionIdFromCookie() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRequestedSessionIdFromURL() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRequestedSessionIdFromUrl() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRequestedSessionIdValid() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isUserInRole(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getAttribute(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		String[] type = woRequest.headerForKey("content-type").split(";");
		if (type.length > 1)
			return type[1].split("=")[1];		
		return "utf-8";
		
	}

	public int getContentLength() {
		return woRequest.content().length();
	}

	public String getContentType() {
		return woRequest.headerForKey("content-type");
	}

	public ServletInputStream getInputStream() throws IOException {
		return new WOServletInputStream(woRequest.content());
	}

	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration getLocales() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getParameter(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map getParameterMap() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enumeration getParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getParameterValues(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProtocol() {
		// TODO Auto-generated method stub
		return null;
	}

	public BufferedReader getReader() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRealPath(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRemoteAddr() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRemoteHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestDispatcher getRequestDispatcher(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getScheme() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getServerPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isSecure() {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeAttribute(String s) {
		// TODO Auto-generated method stub

	}

	public void setAttribute(String s, Object obj) {
		// TODO Auto-generated method stub

	}

	public void setCharacterEncoding(String s)
			throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

	}

}
