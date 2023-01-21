INSERT INTO post (title, author, anons, full_text, views)
VALUES ('1st Article',  'Mike', 'New Year', 'Happy New Year!', 0),
       ('2nd Article', 'Jonny Favorite', 'Christmas', 'Mary, mary Christmas!', 0),
       ('3rd Article', 'Вася', 'Крещение', 'Ой мороз, мороз. Не морозь меня.', 0);

INSERT INTO users (email, name, password)
VALUES ('user@mail.ru',  'Mike', 'password'),
       ('admin@mail.ru', 'Jonny Favorite', 'admin'),
       ('vasya@google.com', 'Вася', 'vasya');

INSERT INTO USER_ROLES (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2),
       ('USER', 3);

UPDATE users SET password = '$2y$10$GuLrinTubzS74UFaTSC1zutA/w6MMviTwwCr/7Lc/0Lx83QnLY9uS'
WHERE id = 1;
