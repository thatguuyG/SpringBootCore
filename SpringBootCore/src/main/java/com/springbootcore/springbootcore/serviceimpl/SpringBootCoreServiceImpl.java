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
	 */
	@Override
	public SpringBootCoreDetails getSpringCoreBeanDetails(Long id) {
		return springBootCoreRepository.findById(id).orElse(null);
	}

	/**
	 * Method to update project details
	 *
	 * @param springBootCoreDetails - SpringBootCoreDetails Entity
	 * @return SpringBootCore
	 */
	@Override
	public SpringBootCoreDetails updateProjectDetails(SpringBootCoreDetails springBootCoreDetails) {
		return springBootCoreRepository.save(springBootCoreDetails);
	}
}
