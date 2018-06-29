-- Category table
CREATE TABLE category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id) 
);

-- User detail table
CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

-- Product table
CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Adding the Categories
INSERT INTO category (name, description, image_url, is_active) VALUES ('Consoles', 'The ultimate gaming device you will ever need. ', 'CAT_1.jpg', true);
INSERT INTO category (name, description, image_url, is_active) VALUES ('Games', 'The latest games for your console. ', 'CAT_2.jpg', true);
INSERT INTO category (name, description, image_url, is_active) VALUES ('Accessories', 'Accessories for you and your console. ', 'CAT_3.jpg', true);

-- Adding the Users
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Arun', 'Raj', 'ADMIN', true, 'admin', 'arunraj@gmail.com', '7651239870');

INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Kamal', 'K', 'SUPPLIER', true, '12345', 'kamalk@gmail.com', '74563298756');

INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Kevin', 'J', 'SUPPLIER', true, '12345', 'kevinj@gmail.com', '8654727098');

-- Adding the products
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDPS4031500', 'PlayStation 4', 'Sony', 'The best-selling console, with 500GB or 1TB storage and stunning HDR visuals.', 31500, 5, true, 1, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDPS4034500', 'PS4 Pro', 'Sony', '4K gaming and entertainment, with vibrant HDR. Meet the supercharged PS4 Pro.', 34500, 2, true, 1, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDGTA002700', 'GTA-V', 'Rockstar Games', 'An open world scenario in the eyes of three gangsters. ', 2700, 5, true, 2, 3 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDGOW004000', 'God of War', 'Santa Monica Studio', 'Explore the wilderness of Norse mythology with the latest edition of the third-person action-adventure game, God of War.', 4000, 3, true, 2, 3 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDCON004500', 'PS4-DualShock4 Controller', 'Sony', 'The DUALSHOCK®4 wireless controller features familiar controls while incorporating new ways to interact with games and other players.', 4500, 5, true, 1, 3 );