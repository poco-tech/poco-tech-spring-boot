insert into issues (summary, description) values ('バグA', 'バグがあります');
insert into issues (summary, description) values ('機能要望B', 'Bに追加機能がほしいです');
insert into issues (summary, description) values ('画面Cが遅い', '早くしてほしいです');

-- password1234
insert into users (username, password, authority) values ('tom', '3b977839c7d9fd9256514cb7974f825336ce587940d0252923380a419f4644926c1071bd93d88c28', 'ADMIN');
-- password1234
insert into users (username, password, authority) values ('bob', '1b9415d98c7380dab7d1951742c8354e9d16ed5162ff8ffc88275d7c8a570122f3fc3ba33303f5ac', 'USER');
