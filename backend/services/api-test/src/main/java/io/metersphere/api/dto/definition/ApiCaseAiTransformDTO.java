package io.metersphere.api.dto.definition;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class ApiCaseAiTransformDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "接口定义ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank
    private String apiDefinitionId;

    @Schema(description = "提示词", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank
    private String prompt;
}
