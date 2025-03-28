CREATE TABLE messages (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    username varchar(64) UNIQUE NOT NULL,
    message text NOT NULL
);
