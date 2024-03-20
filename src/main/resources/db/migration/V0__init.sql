CREATE TABLE measures
(
    id    varchar(36)   NOT NULL PRIMARY KEY,
    type  varchar       NOT NULL,
    value numeric(6, 3) NOT NULL
);