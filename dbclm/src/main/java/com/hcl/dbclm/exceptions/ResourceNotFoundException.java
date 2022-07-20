package com.hcl.dbclm.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1659595211097457046L;
	
	public ResourceNotFoundException(final String msg) {
        super(msg);
		
	}

}
