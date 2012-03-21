/*
 * $Id: HelloWorld.java 471756 2006-11-06 15:01:43Z husted $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.sergio;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class HelloWorld extends ActionSupport{

   
	private static final long serialVersionUID = 1L;

	private List<Dato> listaDatos = null;
	
	
	public String execute() throws Exception {
        
		setListaDatos(rellenarListaDatos());
		
        return SUCCESS;
    }

    private List<Dato> rellenarListaDatos(){
    	List<Dato> listaTemp = new ArrayList<Dato>();
    	
    	Dato dato = new Dato();
    	dato.setId("01");
    	dato.setCodigo("01");
    	dato.setDescripcion("el dato 1");
    	listaTemp.add(dato);
    	dato = new Dato();
    	dato.setId("02");
    	dato.setCodigo("02");
    	dato.setDescripcion("el dato 2");
    	listaTemp.add(dato);
    	    	
    	return listaTemp;
    }
    
    public List<Dato> getListaDatos() {
		return listaDatos;
	}

	public void setListaDatos(List<Dato> listaDatos) {
		this.listaDatos = listaDatos;
	}

}
