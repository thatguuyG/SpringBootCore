/**
 * Service Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-Learn SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.service;

import com.springbootcore.springbootcore.entity.SpringBootCoreDetails;
import org.springframework.stereotype.Service;

@Service
public interface SpringBootCoreService {

	/**
	 * Interface method to register SpringCore Bean Details
	 *
	 * @param springBootCoreDetails - SpringBootCoreDetails Entity
	 * @return SpringCore
	 */
	SpringBootCoreDetails registerSpringCoreBeanDetails(SpringBootCoreDetails springBootCoreDetails);

	/**
	 * Interface method to get SpringBootCoreDetails details by id
	 *
	 * @param id - Id
	 * @return SpringBootCoreDetails
	 */
	SpringBootCoreDetails getSpringCoreBeanDetails(Long id);

	/**
	 * Interface method to update project details
	 *
	 * @param springBootCoreDetails - SpringBootCoreDetails Entity
	 * @return SpringBootCore
	 */
	SpringBootCoreDetails updateProjectDetails(SpringBootCoreDetails springBootCoreDetails);
}
