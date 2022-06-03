/**
 * Service Implementation Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-Learn SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 31/5/2022
 */

package com.springbootcore.springbootcore.serviceimpl;

import com.springbootcore.springbootcore.entity.SpringBootCoreDetails;
import com.springbootcore.springbootcore.exception.ResourceNotFoundException;
import com.springbootcore.springbootcore.repository.SpringBootCoreRepository;
import com.springbootcore.springbootcore.service.SpringBootCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootCoreServiceImpl implements SpringBootCoreService {

	@Autowired
	private SpringBootCoreRepository springBootCoreRepository;


	/**
	 * Method to register SpringCore Bean Details
	 *
	 * @param springBootCoreDetails - SpringBootCoreDetails Entity
	 * @return SpringBootCore
	 */
	@Override
	public SpringBootCoreDetails registerSpringCoreBeanDetails(SpringBootCoreDetails springBootCoreDetails) {
		return springBootCoreRepository.save(springBootCoreDetails);
	}

	/**
	 * Method to get SpringBootCoreDetails details by id
	 *
	 * @param id - Id
	 * @return SpringBootCoreDetails
	 * @throws ResourceNotFoundException - ResourceNotFoundException
	 */
	@Override
	public SpringBootCoreDetails getSpringCoreBeanDetails(Long id)
			throws ResourceNotFoundException {

		// Get record by Id throwing exception if record not found by Id
		return springBootCoreRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Project Details", "Id", String.valueOf(id)));
	}

	/**
	 * Method to update project details
	 *
	 * @param springBootCoreDetails - SpringBootCoreDetails Entity
	 * @return SpringBootCore
	 * @throws ResourceNotFoundException - ResourceNotFoundException
	 */
	@Override
	public SpringBootCoreDetails updateProjectDetails(SpringBootCoreDetails springBootCoreDetails)
			throws ResourceNotFoundException {
		// Check for record
		if (getSpringCoreBeanDetails(springBootCoreDetails.getId()) != null) {
			return springBootCoreRepository.save(springBootCoreDetails);
		}

		// Throw exception if record not found
		throw new ResourceNotFoundException("Spring Details", "Id", springBootCoreDetails.getId().toString());
	}
}
