INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamerica2');
INSERT INTO regiones (id, nombre) VALUES (2, 'centroamerica2');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamerica2');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa2');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia2');


INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Andres8', 'Guzman', 'Profesor@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Jorge8', 'Montoya', 'jorr@gmail.com2', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Jorge9', 'Montoya', 'jorr@gmail.com3', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Jorge10', 'Montoya', 'jorr@gmail.com4', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Jorge11', 'Montoya', 'jorr@gmail.com5', '2018-01-01');

INSERT INTO usuarios (username, password, enabled, nombre, apellidos, email) VALUES ('andres5','$2a$10$vuktNWBhgm8.vuFXjxK5xeJRsJb1A6H8qTsPj/zlS8sbX3FfgRYLu',1, 'jhon','Doe','jhon.doe@bolsadeideas.comf');
INSERT INTO usuarios (username, password, enabled, nombre, apellidos, email) VALUES ('admin5','$2a$10$/b2fg2yUxDqKxXLPbgw1g.hliYk2LCKQj91grx0BTkto6vBfKJDpa',1, 'Andres', 'Guzman','Profesor@bolsadeideas.comf');

INSERT INTO roles (nombre) values ('ROLE_USER');
INSERT INTO roles (nombre) values ('ROLE_ADMIN');


INSERT INTO usuarios_roles (usuario_id, role_id) values (31,1);
INSERT INTO usuarios_roles (usuario_id, role_id) values (32,2);
INSERT INTO usuarios_roles (usuario_id, role_id) values (32,1);
INSERT INTO usuarios_roles (usuario_id, role_id) values (40,1);
INSERT INTO usuarios_roles (usuario_id, role_id) values (44,2);

INSERT INTO productos (nombre, precio, create_at) values ('Panasonic Pantalla LCD',259990,NOW());
INSERT INTO productos (nombre, precio, create_at) values ('Sony Camara digital DSC-W320B',123490,NOW());
INSERT INTO productos (nombre, precio, create_at) values ('Apple iPod shuffle',1499990,NOW());
INSERT INTO productos (nombre, precio, create_at) values ('sony NoteBook z1110',37990,NOW());

INSERT INTO facturas (descripcion,observacion, cliente_id,create_at) VALUES ('Factura equipos de oficion', null ,1,NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,1,4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,3);


INSERT INTO facturas (descripcion,observacion, cliente_id,create_at) VALUES ('Factura bicicleta', 'Alguna nota importante' ,1,NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,2,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,2,4);