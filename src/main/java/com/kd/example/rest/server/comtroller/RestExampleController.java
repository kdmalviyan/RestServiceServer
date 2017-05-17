package com.kd.example.rest.server.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kd.example.rest.server.api.service.GitHubService;
import com.kd.example.rest.server.entity.GitUser;

@RestController
public class RestExampleController {
	@Autowired
	GitHubService gitHubService;

	@RequestMapping(value = "/api/getUsers")
	public List<GitUser> getGitUsers() {
		return gitHubService.getGitUsers();
	}

	@RequestMapping(value = "/api/getUsers/{name}")
	public List<GitUser> filterUser(@PathVariable String name) {

		List<GitUser> filteredUsers = gitHubService.filterUsers(name);
		return filteredUsers;
	}

	@RequestMapping(value = "/api/getUser")
	public GitUser getUserById(@RequestParam("id") int id) {
		return gitHubService.findUser(id);
	}
}
