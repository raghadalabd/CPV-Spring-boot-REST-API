package com.cpv.api;

import org.springframework.data.jpa.repository.JpaRepository;

/*A repository is a mechanism for encapsulating storage, retrieval,
 * and search behavior which emulates a collection of objects.
 */
public interface CpvRepository extends JpaRepository<CpvModel, String>{

}
