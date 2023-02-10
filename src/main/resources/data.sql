/*DROP TABLE IF EXISTS users, USER_ROLES;
TRUNCATE TABLE post;
DROP SEQUENCE IF EXISTS global_seq;*/

INSERT INTO users (email, name, password)
VALUES ('user@mail.ru',  'Mike', 'password'),
       ('admin@mail.ru', 'Jonny Favorite', 'admin'),
       ('vasya@google.com', 'Вася', 'vasya');

INSERT INTO post (title, author, anons, full_text, views, user_id)
VALUES ('1st Article',  'Mike', 'New Year', 'Happy New Year!', 0, 1),
       ('2nd Article', 'Jonny Favorite', 'Christmas', 'Mary, mary Christmas!', 0, 2),
       ('3rd Article', 'Вася', 'Крещение', 'Ой мороз, мороз. Не морозь меня.', 0, 3);

INSERT INTO USER_ROLES (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2),
       ('USER', 3);

UPDATE users SET password = '$2y$10$GuLrinTubzS74UFaTSC1zutA/w6MMviTwwCr/7Lc/0Lx83QnLY9uS'
WHERE id = 1;

UPDATE users SET password = '$2a$12$aoVp9ZtqiRCSCo76rJ2u8.fTGbnelRhBTS5VUqJTHvriiArL3lPZy'
WHERE id = 2;