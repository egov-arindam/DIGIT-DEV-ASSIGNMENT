package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.AdvocateSearchCriteria;
import digit.web.models.RequestInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * AdvocateSearchRequest
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-01-16T11:10:35.348543+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdvocateSearchRequest   {
        @JsonProperty("requestInfo")

          @Valid
                private RequestInfo requestInfo = null;

        @JsonProperty("criteria")
          @Valid
                private List<AdvocateSearchCriteria> criteria = null;


        public AdvocateSearchRequest addCriteriaItem(AdvocateSearchCriteria criteriaItem) {
            if (this.criteria == null) {
            this.criteria = new ArrayList<>();
            }
        this.criteria.add(criteriaItem);
        return this;
        }

}
