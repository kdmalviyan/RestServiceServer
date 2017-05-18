# RestServiceServer

http://localhost:8080/api/getUser?id=423638
http://localhost:8080/api/getUsers
http://localhost:8080/api/getUsers/ggobi

POST:
	URL: http://localhost:8080/api/updateUser
	content-type in header: application.json
	Payload: 
		{
		  "login": "Kuldeep Singh",
		  "id": 42345638,
		  "url": "https://api.github.com/orgs/ggobi",
		  "repos_url": "https://api.github.com/orgs/ggobi/repos",
		  "events_url": "https://api.github.com/orgs/ggobi/events",
		  "hooks_url": "https://api.github.com/orgs/ggobi/hooks",
		  "issues_url": "https://api.github.com/orgs/ggobi/issues",
		  "members_url": "https://api.github.com/orgs/ggobi/members{/member}",
		  "public_members_url": "https://api.github.com/orgs/ggobi/public_members{/member}",
		  "avatar_url": "https://avatars2.githubusercontent.com/u/423638?v=3",
		  "description": ""
		}