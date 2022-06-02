/**
 * Controller Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-visit SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.components;

import org.springframework.stereotype.Component;

@Component
public class SpringBootCoreComponent {

	public String getMessage() {
		return "!!Spring boot components!!";
	}
}
