insert into issues (summary, description) values ('バグA', 'バグがあります');
insert into issues (summary, description) values ('機能要望B', 'Bに追加機能がほしいです');
insert into issues (summary, description) values ('画面Cが遅い', '早くしてほしいです');

-- password1234
insert into users (username, password, authority) values ('tom', '$2a$10$A9jOtQVeXZLzFC2faGIbC.3RybDPqdnk87OoLFpDwZ7aLvUxjdURO', 'ADMIN');
-- password1234
insert into users (username, password, authority) values ('bob', '$2a$10$H3EsCJ1GVXj9Zg/v1xFc9.psEx5G/uI4j0wLNg3zaM9zQEdBnCH4.', 'USER');
