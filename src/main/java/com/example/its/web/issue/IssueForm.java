package com.example.its.web.issue;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class IssueForm {

    @NotBlank
    @Size(max=256)
    private String summary;

    @NotBlank
    @Size(max=256)
    private String description;

}
