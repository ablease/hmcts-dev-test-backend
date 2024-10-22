package uk.gov.hmcts.reform.dev.repositories;

import uk.gov.hmcts.reform.dev.models.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {

}
