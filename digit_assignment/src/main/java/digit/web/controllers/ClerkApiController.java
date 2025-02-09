package digit.web.controllers;


import digit.web.models.AdvocateClerkRequest;
import digit.web.models.AdvocateClerkResponse;
import digit.web.models.AdvocateClerkSearchRequest;
import digit.web.models.ErrorRes;
    import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.*;

    import jakarta.validation.constraints.*;
    import jakarta.validation.Valid;
    import jakarta.servlet.http.HttpServletRequest;
        import java.util.Optional;
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-01-16T11:10:35.348543+05:30[Asia/Kolkata]")
@Controller
    @RequestMapping("")
    public class ClerkApiController{

        private final ObjectMapper objectMapper;

        private final HttpServletRequest request;

        @Autowired
        public ClerkApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        }

                @RequestMapping(value="/clerk/v1/_create", method = RequestMethod.POST)
                public ResponseEntity<AdvocateClerkResponse> clerkV1CreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Details for the user registration + RequestInfo meta data.", required=true, schema=@Schema()) @Valid @RequestBody AdvocateClerkRequest body) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<AdvocateClerkResponse>(objectMapper.readValue("{  \"pagination\" : {    \"offSet\" : 5.637376656633329,    \"limit\" : 59.621339166831824,    \"sortBy\" : \"sortBy\",    \"totalCount\" : 2.3021358869347655,    \"order\" : \"\"  },  \"responseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"clerks\" : [ {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  }, {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  } ]}", AdvocateClerkResponse.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.NOT_IMPLEMENTED);
                }

                @RequestMapping(value="/clerk/v1/_search", method = RequestMethod.POST)
                public ResponseEntity<AdvocateClerkResponse> clerkV1SearchPost(@Parameter(in = ParameterIn.DEFAULT, description = "Search criteria + RequestInfo meta data.", required=true, schema=@Schema()) @Valid @RequestBody AdvocateClerkSearchRequest body) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<AdvocateClerkResponse>(objectMapper.readValue("{  \"pagination\" : {    \"offSet\" : 5.637376656633329,    \"limit\" : 59.621339166831824,    \"sortBy\" : \"sortBy\",    \"totalCount\" : 2.3021358869347655,    \"order\" : \"\"  },  \"responseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"clerks\" : [ {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  }, {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  } ]}", AdvocateClerkResponse.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.NOT_IMPLEMENTED);
                }

                @RequestMapping(value="/clerk/v1/_update", method = RequestMethod.POST)
                public ResponseEntity<AdvocateClerkResponse> clerkV1UpdatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Details of the registered advocate + RequestInfo meta data.", required=true, schema=@Schema()) @Valid @RequestBody AdvocateClerkRequest body) {
                        String accept = request.getHeader("Accept");
                            if (accept != null && accept.contains("application/json")) {
                            try {
                            return new ResponseEntity<AdvocateClerkResponse>(objectMapper.readValue("{  \"pagination\" : {    \"offSet\" : 5.637376656633329,    \"limit\" : 59.621339166831824,    \"sortBy\" : \"sortBy\",    \"totalCount\" : 2.3021358869347655,    \"order\" : \"\"  },  \"responseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"clerks\" : [ {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  }, {    \"workflow\" : {      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\"    },    \"applicationNumber\" : \"applicationNumber\",    \"documents\" : [ {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    }, {      \"documentType\" : \"documentType\",      \"documentUid\" : \"documentUid\",      \"fileStore\" : \"fileStore\",      \"id\" : \"id\",      \"additionalDetails\" : { }    } ],    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"kl\",    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"individualId\" : \"individualId\",    \"isActive\" : true,    \"additionalDetails\" : { },    \"stateRegnNumber\" : \"stateRegnNumber\"  } ]}", AdvocateClerkResponse.class), HttpStatus.NOT_IMPLEMENTED);
                            } catch (IOException e) {
                            return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            }

                        return new ResponseEntity<AdvocateClerkResponse>(HttpStatus.NOT_IMPLEMENTED);
                }

        }
