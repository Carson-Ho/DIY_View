# DIY_View
>[中文文档]()
- Author：Carson_Ho
- Summary



![示意图](http://upload-images.jianshu.io/upload_images/944365-299cf0c37d4c06ab.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## 1. Introduction
a simple  Android DIY View 
>[Carson_Ho的Github地址：DIY_View](https://github.com/Carson-Ho/DIY_View)


![示意图](http://upload-images.jianshu.io/upload_images/944365-dcef19bb6ad0c77e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## 2. Application Scenarios
learning DIY View



## 3. Feature
- Fresh & concise style
- Easy to use
- Secondary Programming costs are low

## 4. Usage

##### Step 1：Import Library
There are two ways to  import Library：

- 1. For Gradle
*build.Gradle*

```
dependencies {
    compile 'scut.carson_ho:CircileView:1.0.0'
}
```

- 2. For Maven
*pom.xml*
```
<dependency>
  <groupId>scut.carson_ho</groupId>
  <artifactId>CircileView</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```


##### Step 2：Set Animation Attributes
- Attributes Description：

```
circle_color
// 类型 = color 默认 = Color.RED（红色）
```

- Use examples

*activity_main.xml*
```
<scut.carson_ho.circlelibrary.libraryCircle
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#000000"
        android:padding="30dp"
        app:circle_color="#FF4081"
         />
```





## 5. Complete Demo
[Carson_Ho的Github地址：DIY_View](https://github.com/Carson-Ho/DIY_View)


![示意图](http://upload-images.jianshu.io/upload_images/944365-dcef19bb6ad0c77e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 6.  Source code analysis
[手把手教你写一个完整的自定义View](http://www.jianshu.com/p/e9d8420b1b9c)



## 7.  LICENSE
DIY_View is available under the MIT license.



## 8. Contribute
Before you open an issue or create a pull request, please read [Contributing Guide](https://github.com/Carson-Ho/DIY_View/blob/master/CONTRIBUTING.md) first.



## 9. Release
2017-03-15 v1.0.0 ：add Circle View



# About the author
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
