use ibook;

INSERT INTO `authors` VALUES (11,'Kathy Sierra'),(12,'Clifford Pickover'),(13,'Michael Clark');
INSERT INTO `authors` VALUES (14,'Sinnes Bert'),(15,'Robert Charles'),(16,'Michael Jordan');
INSERT INTO `authors` VALUES (17,'Andrew'),(18,'Taschen'),(19,'David Getches');

INSERT INTO `books` VALUES (7,9,'The Medical Book',1,8,'book8.jpg',2012,'The Medical Book by Clifford Pickover',698);
INSERT INTO `books` VALUES (8,5,'Head First Java',1,9,'book7.jpg',2013,'The Book by Kathy Sierra for Java Beginner',598);

INSERT INTO `authors2books` VALUES (11,11,8);
INSERT INTO `authors2books` VALUES (12,12,7);