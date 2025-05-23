use selva;
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK (age >= 18),
    city VARCHAR(100) DEFAULT 'Unknown'
);
 INSERT INTO Student (id, name, email, age) 
VALUES (1, 'Arun', 'arun@example.com', 20);

INSERT INTO Student (id, email, age) 
VALUES (2, 'bala@example.com', 22);

INSERT INTO Student (id, name, email, age) 
VALUES (3, 'Bala', 'arun@example.com', 21);

INSERT INTO Student (id, name, email, age) 
VALUES (4, 'Chitra', 'chitra@example.com', 16);

INSERT INTO Student (id, name, email, age) 
VALUES (5, 'Divya', 'divya@example.com', 24);
SELECT * FROM Student;

