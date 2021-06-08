DROP TABLE authorities;
DROP TABLE users;

create table users(
	username VARCHAR(50) NOT NULL PRIMARY KEY,
	password VARCHAR(50) NOT NULL,
	enabled BOOLEAN NOT NULL
);

create table authorities (
	username VARCHAR(50) NOT NULL,
	authority VARCHAR(50) NOT NULL,
	constraint fk_authorities_users FOREIGN KEY (username) REFERENCES  users(username)
);
create unique  index ix_auth_username on authorities (username,authority);