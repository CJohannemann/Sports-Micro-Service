DROP TABLE if exists PLAYER;

CREATE TABLE PLAYER (
    id int AUTO_INCREMENT primary key ,
    firstName varchar(25) NOT NULL,
    lastName varchar(25) NOT NULL,
    hometown varchar(50) NOT NULL,
    dob date NOT NULL,
    teamPlayingFor varchar(50) not null,
    sport varchar (25) not null
);

DROP TABLE if exists MLB;

CREATE TABLE MLB (
    sport varchar(15) not null ,
    team varchar(50) NOT NULL ,
    wins varchar(3) NOT NULL,
    losses varchar(3) NOT NULL,
    nextGame date NOT NULL
);

DROP TABLE if exists NFL;

CREATE TABLE NFL (
     sport varchar(15) not null ,
     team varchar(50) NOT NULL ,
     wins varchar(3) NOT NULL,
     losses varchar(3) NOT NULL,
     nextGame date NOT NULL
);

DROP TABLE if exists Soccer;

CREATE TABLE MLS (
     sport varchar(15) not null ,
     team varchar(50) NOT NULL ,
     wins varchar(3) NOT NULL,
     losses varchar(3) NOT NULL,
     nextGame date NOT NULL
);

