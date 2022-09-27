
create  database  bookmvc;
USE bookmvc;

create table User(
        uuid varchar(80) not null  unique primary key,
        username varchar(12) not null  unique,
        password varchar(20) not null  unique,
        name varchar(10),
        age int ,
        sex varchar(1),
        phoneNumber  int  unique,
        E_mail varchar(50) unique,
        jurisdiction  int default 1,
        isDel int  default 1 # 1存在 0删除

);

drop table  User;


insert into   User(uuid,username,password) values (1212121,'1822zhang','zhang1822')



#     private String uuid;
#     private String username;
#     private String password;
#     private int age;
#     private String sex;
#     private int phoneNumber;
#     private String E_mail;
#     private int jurisdiction;
#     private  int isDel;