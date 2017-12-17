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

import javax.servlet.ServletOutputStream;

import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSMutableData;


public class WOServletOutputStream extends ServletOutputStream {

	private WOResponse woResponse;
	
	public WOServletOutputStream(WOResponse woResponse){
		this.woResponse = woResponse;
	}
	
	@Override
	public void write(int b) throws IOException {
		/*
		 * The 24 high-order bits of b are ignored.
		 */
		byte[] bA = new byte[1];
		bA[0] = (byte) b;
		woResponse.appendContentData(new NSData(bA));
	}
}
