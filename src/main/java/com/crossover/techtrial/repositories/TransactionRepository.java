/**
 *
 */
package com.crossover.techtrial.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.crossover.techtrial.model.Transaction;

/**
 * @author kbabraj
 *
 */
@RestResource(exported = false)
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Optional<Transaction> getByBookIdAndDateOfReturnIsNull(Long bookId);

    Optional<Transaction> getByIdAndDateOfReturnNotNull(Long transactionId);

    long countByMemberIdAndDateOfReturnIsNull(Long memberId);

}
