CREATE TABLE mother (
 `id`      INT NOT NULL PRIMARY KEY,
 `type`    TEXT,
 `content` TEXT
);

INSERT INTO mother(id, type, content)
VALUES (1, 'SECOND', 'bug test'),
       (2, 'FIRST', '{"text":"bug test"}');