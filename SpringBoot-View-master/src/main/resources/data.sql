insert into Blogger (age,name) VALUES (21, 'Gyula');
insert into Blogger (age,name) VALUES (26, 'Krisz');
insert into STORY (title,content,posted,blogger_id) values ('Teszt cím','Teszt tartalom', '2017-07-07', (select id FROM BLOGGER where name = 'Gyula') );