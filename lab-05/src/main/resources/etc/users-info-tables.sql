CREATE TABLE TD_CONTACT (
  CONTACT_ID        INT PRIMARY KEY AUTO_INCREMENT,
  CONTACT_NAME      VARCHAR(255),
  CONTACT_TELNUMBER VARCHAR(255)
);

DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(50) NOT NULL,
  enabled  BOOLEAN     NOT NULL
);

CREATE TABLE authorities (
  username  VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users (username)
  -- UNIQUE INDEX authorities_idx_1 (username, authority)
);

CREATE UNIQUE INDEX ON authorities (username, authority)