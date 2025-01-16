package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Advocate;
import digit.web.models.Pagination;
import digit.web.models.ResponseInfo;
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
 * AdvocateResponse
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-01-16T11:10:35.348543+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdvocateResponse   {
        @JsonProperty("responseInfo")

          @Valid
                private ResponseInfo responseInfo = null;

        @JsonProperty("advocates")
          @Valid
                private List<Advocate> advocates = null;

        @JsonProperty("pagination")

          @Valid
                private Pagination pagination = null;


        public AdvocateResponse addAdvocatesItem(Advocate advocatesItem) {
            if (this.advocates == null) {
            this.advocates = new ArrayList<>();
            }
        this.advocates.add(advocatesItem);
        return this;
        }

}
