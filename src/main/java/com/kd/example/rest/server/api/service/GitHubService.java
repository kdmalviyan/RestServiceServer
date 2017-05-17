package com.kd.example.rest.server.api.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kd.example.rest.server.entity.GitUser;

@Service
public class GitHubService {
	String endPoint = "https://api.github.com/users/hadley/orgs";

	public List<GitUser> getGitUsers() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<GitUser[]> responseEntity = restTemplate.getForEntity(endPoint, GitUser[].class);
		return Arrays.asList(responseEntity.getBody());
	}

	public List<GitUser> filterUsers(String name) {
		return getGitUsers().stream().filter(user -> user.getLogin().equals(name)).collect(Collectors.toList());
	}

	public GitUser findUser(int id) {
		List<GitUser> users = getGitUsers();
		for (GitUser gitUser : users) {
			if (gitUser.getId() == id) {
				return gitUser;
			}
		}
		return null;
	}
}
