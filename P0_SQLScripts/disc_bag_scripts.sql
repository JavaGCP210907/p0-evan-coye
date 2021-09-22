CREATE TABLE identifiers (
	id serial PRIMARY KEY,
	disc_brand TEXT,
	disc_type TEXT
);

CREATE TABLE discs (
	disc_id serial PRIMARY KEY,
	disc_name TEXT,
	speed int,
	glide int,
	turn int,
	fade int,
	plastic TEXT,
	id int REFERENCES identifiers (id)
);

DROP TABLE identifiers;
DROP TABLE discs;

INSERT INTO identifiers (disc_brand, disc_type)
VALUES ('Innova', 'Driver'),
	   ('Innova', 'Fairway'),
	   ('Innova', 'Midrange'),
	   ('Innova', 'Putter'),
	   ('Discraft', 'Driver'),
	   ('Discraft', 'Fairway'),
	   ('Discraft', 'Midrange'),
	   ('Discraft', 'Putter'),
	   ('Prodigy', 'Driver'),
	   ('Prodigy', 'Fairway'),
	   ('Prodigy', 'Midrange'),
	   ('Prodigy', 'Putter');
	  
SELECT * FROM identifiers;

INSERT INTO discs (disc_name, speed, glide, turn, fade, plastic, id)
VALUES ('Destroyer', 12, 5, -1, 3, 'Halo', 1),
	   ('F7', 7, 5, -3, 1, '400G', 10),
	   ('Fierce', 3, 4, -2, 0, 'Pro', 8 ),
	   ('Firebird', 9, 3, 0, 4, 'Champion', 2),
	   ('Roc3', 5, 4, 0, 3, 'Star', 3),
	   ('Malta', 5, 4, 1, 3, 'Z', 7),
	   ('Wraith', 11, 5, -1, 3, 'Champion', 1),
	   ('Nova', 2, 3, 0, 0, 'Overmold', 4);
	  
SELECT * FROM discs;

SELECT * FROM discs WHERE speed = 5;

INSERT INTO discs 

DELETE FROM discs WHERE id = 9;

SELECT * FROM discs;
	   
	  