create table PUMA_USER (
  UR_ID          varchar(36) not null primary key,
  UR_FIRSTNAME   varchar(100),
  UR_MIDDLETNAME varchar(100),
  UR_LASTNAME    varchar(100),
  UR_EMAIL       varchar(50),
  UR_CREATEDATE  timestamp,
  UT_CREATEUSER  varchar(36),
  UR_UPDATEDATE  timestamp,
  UR_UPDATEUSER  varchar(36)
);