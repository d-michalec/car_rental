CREATE TABLE car (
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     company VARCHAR(255),
                     model VARCHAR(255),
                     year INT
);

INSERT INTO car (company, model, year)
VALUES ('Ford', 'Mustang', 2019),
       ('Chevrolet', 'Camaro', 2020),
       ('Nissan', 'Altima', 2018),
       ('BMW', 'X3', 2021),
       ('Mercedes-Benz', 'C-Class', 2019),
       ('Audi', 'A4', 2022),
       ('Kia', 'Optima', 2020),
       ('Hyundai', 'Elantra', 2021),
       ('Subaru', 'Outback', 2022),
       ('Lexus', 'ES', 2021),
       ('Mazda', 'CX-5', 2019),
       ('GMC', 'Sierra', 2020),
       ('Jeep', 'Wrangler', 2022),
       ('Ram', '1500', 2021),
       ('Volvo', 'XC60', 2022),
       ('Porsche', '911', 2020),
       ('Ferrari', '488', 2021),
       ('McLaren', '720S', 2019),
       ('Lamborghini', 'Aventador', 2022),
       ('Bugatti', 'Chiron', 2020);