package uk.gov.hmcts.probate.service;

import uk.gov.hmcts.probate.domain.FormData;
import uk.gov.hmcts.probate.dto.CaseInfoDTO;

public interface @name.capitalize()@SubmitService {

    CaseInfoDTO submit(FormData formData);
}
