/**
 * ResourceNotFoundException Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-visit SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resourceName, fieldName, fieldValue;

	/**
	 * Class constructor
	 *
	 * @param resourceName - ResourceName
	 * @param fieldName    - FieldName
	 * @param fieldValue   - FieldValue
	 */
	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
