/*
 * Software Name : ATK
 *
 * Copyright (C) 2007 - 2012 France Télécom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ------------------------------------------------------------------
 * File Name   : LinuxPlatform.java
 *
 * Created     : 05/03/2010
 * Author(s)   : HENAFF Mari-Mai
 */
package com.orange.atk.platform;

import java.util.HashMap;

public class LinuxPlatform extends Platform {
	private static HashMap<String, String> knownPhones = new HashMap<String, String>();
	private String phoneKey;

	public LinuxPlatform() {
	}

	@Override
	public String getJATKPath() {
		return ".";
	}

	@Override
	public String getDefaultADBLocation() {
		return "adb";
	}

	@Override
	public String getBuildApk() {
		// TODO Auto-generated method stub
		return "buildApk";
	}

	@Override
	public String getRemoveSignature() {
		// TODO Auto-generated method stub
		return "removeSignature";
	}

	@Override
	public String getZipalignLocation() {
		// TODO Auto-generated method stub
		return "zipalign";
	}

	@Override
	public String getAtkKeyLocation() {
		// TODO Auto-generated method stub
		return "ATKKey.keystore";
	}

	@Override
	public String getUserConfigDir() {
		// TODO Auto-generated method stub
		return null;
	}

}
