Create a sample mysql db (you might have to create user table first and then formdata after)

DROP TABLE IF EXISTS `User`;
CREATE TABLE  `User` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
);

DROP TABLE IF EXISTS `FormData`;
CREATE TABLE  `FormData` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `answerQuestion1` int(11) NOT NULL,
  `answerQuestion2` int(11) NOT NULL,
  `answerQuestion3` varchar(255) NOT NULL,
  `answerQuestion4` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`),
  FOREIGN KEY (userId) REFERENCES User(id)
);

INSERT INTO User
VALUES (1, 'fat@cat.com', 'secretPassword',  'dog man');

INSERT INTO User
VALUES (2, 'ping@pong.com', '4321',  'ping pong');

INSERT INTO FormData
VALUES (1, 1, 2, 3, 'hello 1', 'goodbye 2');

------------------------

sample postman requests

create
{
"answerQuestion1": "3",
"answerQuestion2": "4",
"answerQuestion3": "helloooo",
"answerQuestion4": "hello 6",
"email":"fat@cat.com",
"password":"secretPassword"
}

update

{
"id":"1",
"userId":"1",
"answerQuestion1": "3",
"answerQuestion2": "4",
"answerQuestion3": "yupyup",
"answerQuestion4": "nono 6",
"email":"fat@cat.com",
"password":"secretPassword"
}
