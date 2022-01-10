DROP TABLE IF EXISTS user;
CREATE TABLE user (
	id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    email VARCHAR(255),
    name VARCHAR(255),
    age BIGINT
);

INSERT INTO user (email, name, age) VALUES ("detectivecrow2540@gmail.com", "LHS", "29");
INSERT INTO user (email, name, age) VALUES ("madmouse2540@gmail.com", "이호성", "27");
INSERT INTO user (email, name, age) VALUES ("test1@example.com", "김삿갓", "30");
INSERT INTO user (email, name, age) VALUES ("test2@example.com", "홍길동", "20");