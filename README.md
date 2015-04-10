### SimpleEJB  
简单的EJB实现，服务器使用的是Jboss，可以使用java的application访问。  
###### Jboss安装
去官网上下载一个Jboss，然后将其解压，将bin文件夹包含在系统的Path路径上。  
点击bin文件夹下run.bat即可运行，默认是8080端口，端口没有被占用则会正常运行。  
###### EJB部署  
在eclipse下建一个工程，将jboss下client里面的jar包全部关联到构建路径上，新建一个接口RMBConvert定义要实现的方法，用类RMBConvertBean实现这个接口（注意stateless和remote注释的使用）。将这个项目export导出为一个jar包，将jar包复制到server/default/deploy下，在run.bat里能够看到部署情况。  
可以到localhost:8080那里看一下。  
###### Test测试程序  
可以在上面的工程下直接建一个Test.java的文件，然后需要包含RMBConvert这个接口。