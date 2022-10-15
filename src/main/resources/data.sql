INSERT INTO user_details(id, birth_date, name) VALUES(10001, CURRENT_DATE(), 'Vali');
INSERT INTO user_details(id, birth_date, name) VALUES(10002, CURRENT_DATE(), 'Fane');
INSERT INTO user_details(id, birth_date, name) VALUES(10003, CURRENT_DATE(), 'Opre');

INSERT INTO post(id, description, user_id) VALUES(20001, 'One sheep is here', 10001);
INSERT INTO post(id, description, user_id) VALUES(20002, 'Second sheep is here', 10001);
INSERT INTO post(id, description, user_id) VALUES(20003, 'One wolf is here', 10002);
INSERT INTO post(id, description, user_id) VALUES(20004, 'Second wolf is here', 10002);
