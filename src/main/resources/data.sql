INSERT INTO post (title, author, anons, full_text, views)
VALUES ('1st Article',  'Mike', 'New Year', 'Happy New Year!', 0),
       ('2nd Article', 'Jonny Favorite', 'Christmas', 'Mary, mary Christmas!', 0),
       ('3rd Article', 'Вася', 'Крещение', 'Ой мороз, мороз. Не морозь меня.', 0);

INSERT INTO users (email, name, password)
VALUES ('user@mail.ru',  'Mike', 'password'),
       ('admin@mail.ru', 'Jonny Favorite', 'admin'),
       ('vasya@google.com', 'Вася', 'vasya');
