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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSMutableData;

public class HttpServletWebobjectsResponseAdapter implements
		HttpServletResponse {

	private WOResponse woResponse;
	
	public HttpServletWebobjectsResponseAdapter(WOResponse woResponse) {
		this.woResponse = woResponse;
	}
	
	public void addCookie(Cookie cookie) {
		// TODO Auto-generated method stub

	}

	public void addDateHeader(String s, long l) {
		// TODO Auto-generated method stub

	}

	public void addHeader(String s, String s1) {
		// TODO Auto-generated method stub

	}

	public void addIntHeader(String s, int i) {
		// TODO Auto-generated method stub

	}

	public boolean containsHeader(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	public String encodeRedirectURL(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String encodeRedirectUrl(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String encodeURL(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String encodeUrl(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendError(int i) throws IOException {
		woResponse.setStatus(i);
	}

	public void sendError(int i, String s) throws IOException {
		// TODO Auto-generated method stub

	}

	public void sendRedirect(String s) throws IOException {
		// TODO Auto-generated method stub

	}

	public void setDateHeader(String s, long l) {
		// TODO Auto-generated method stub

	}

	public void setHeader(String key, String value) {
		woResponse.setHeader(value, key);
	}

	public void setIntHeader(String s, int i) {
		// TODO Auto-generated method stub

	}

	public void setStatus(int i) {
		woResponse.setStatus(i);
	}

	public void setStatus(int i, String s) {
		// TODO Auto-generated method stub

	}

	public void flushBuffer() throws IOException {
		// TODO Auto-generated method stub

	}

	public int getBufferSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServletOutputStream getOutputStream() throws IOException {		
		WOServletOutputStream out = new WOServletOutputStream(woResponse);
		return out;
	}

	public PrintWriter getWriter() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCommitted() {
		// TODO Auto-generated method stub
		return false;
	}

	public void reset() {
		// TODO Auto-generated method stub

	}

	public void resetBuffer() {
		// TODO Auto-generated method stub

	}

	public void setBufferSize(int i) {
		// TODO Auto-generated method stub

	}

	public void setContentLength(int i) {

	}

	public void setContentType(String s) {
		woResponse.setHeader(s, "content-type");

	}

	public void setLocale(Locale locale) {
		// TODO Auto-generated method stub

	}

}
