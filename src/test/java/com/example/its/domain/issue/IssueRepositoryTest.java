package com.example.its.domain.issue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class IssueRepositoryTest {

    @Autowired
    public IssueRepository issueRepository;

    @Test
    public void test() {
        var actual = issueRepository.findAll();
        actual.size();
    }
}