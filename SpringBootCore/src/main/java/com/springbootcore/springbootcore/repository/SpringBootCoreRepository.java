/**
 * Repository Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-Learn SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.repository;

import com.springbootcore.springbootcore.entity.SpringBootCoreDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBootCoreRepository extends JpaRepository<SpringBootCoreDetails, Long> {
}
