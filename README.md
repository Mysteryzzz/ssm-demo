# ssm-demo
# ssm基础框架
使用需求：提前安装好maven3.0+
        mysql数据库
        jdk1.8

使用的是mysql数据库
可以提前建好需要的测试数据库sampledb
建表语句

DROP TABLE IF EXISTS `user_t`;  
  
CREATE TABLE `user_t` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user_t` */  
  
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24); 

建好数据库所需的表之后
将本项目clone到本地
然后用idea打开项目，然后会下载maven依赖的包
下载完毕后，配置一下tomcat，tomcat里的上下文路径配置成/demo
然后点击运行
运行成功后主界面显示helloworld
地址栏输入http://localhost:8080/demo/user/showUser?id=1 可以看到测试两字，说明框架搭建完毕


