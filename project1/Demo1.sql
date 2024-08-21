create database Demo1
use Demo1
CREATE TABLE Tab1(
std_reg INT PRIMARY KEY,
std_name VARCHAR(50)  NOT NULL,
std_cgp DECIMAL(10,2)
);
INSERT INTO Tab1(std_reg,std_name,std_cgp)
VALUES(105,'Saravana kumar',800),
(102,'uhw',900),
(103,'efc',700);

SELECT * FROM Tab1;

DELETE FROM Tab1
WHERE std_reg=102;

ALTER TABLE Tab1
ADD std_depart VARCHAR(50);

SELECT * FROM Tab1
ORDER BY std_name ASC;

SELECT std_name,COUNT(*) AS num_student
FROM Tab1
GROUP BY std_depart;
