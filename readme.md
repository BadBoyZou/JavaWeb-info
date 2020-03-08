## 这是使用JSP+servlet（JSTL+EL表达式）完成的信息展示

* 项目包含一个employee员工类，用于保存员工信息
* 一个/list用于初始化要展现的数据
* 一个/create用于实现数据的创建功能
* 用于显示的jsp

### 该项目还需要引入taglibs-standard-impl-1.2.5.jar和taglibs-standard-spec-1.2.5.jar这两个包，用于EL表达式和格式化数据

### 在项目开发过程中遇到了以下问题：
* 只能从/list页面添加数据。在list中模拟了存储数据的数据库,也就是ServletContext，去存储数据的过程，我们需要在/create，去获取这个存取的ServletContext中存放的数据，所以我们需要先访问这个list
* 在使用request.getParameter获取值时，注意在employee定义的属性类型，记得将其转换
* 在jsp页面中使用的是post方式提交数据，在数据的创建过程中，转换字符的编码方式，改为UTF-8