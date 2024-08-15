CREATE TABLE `User` (
    Username varchar(64) NOT NULL,
    Password varchar(64) NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (Username),
    FOREIGN KEY (role_id) REFERENCES `Role`(id)
);

INSERT INTO User(Username, Password, role_id) VALUES ('admin', 'admin', 1);
INSERT INTO User(Username, Password, role_id) VALUES ('user', 'user', 2);