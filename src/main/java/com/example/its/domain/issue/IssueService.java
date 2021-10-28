package com.example.its.domain.issue;

import java.util.List;

public class IssueService {

    public List<IssueEntity> findAll() {
        return List.of(
                new IssueEntity(1, "概要1", "説明1"),
                new IssueEntity(2, "概要2", "説明2"),
                new IssueEntity(3, "概要3", "説明3")
        );
    }
}
