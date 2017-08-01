# DIY_View
>  Click to see [English Document](https://github.com/Carson-Ho/DIY_View/blob/master/README-en.md)
- 作者：Carson_Ho
- 概述



![示意图](http://upload-images.jianshu.io/upload_images/944365-b8902a8574106af3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



**注：关于该开源项目的意见 & 建议可在Issue上提出。欢迎 Star ！**

## 1. 简介
一款 基础的 `Android`自定义`View`控件
>Github地址：[DIY_Demo](https://github.com/Carson-Ho/DIY_View)

![示意图](http://upload-images.jianshu.io/upload_images/944365-dcef19bb6ad0c77e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## 2. 应用场景
对 实现一款自定义View的所有基础 & 注意事项 进行教学 


## 3. 特点
对比市面上自定义控件，该控件的特点是：

##### 3.1 使用简单
##### 3.2 源码简单
##### 3.3 二次开发成本低
- 本项目已在 `Github`上开源：[DIY_Demo](https://github.com/Carson-Ho/DIY_View)
- 详细的源码分析文档：具体请看本文的第6节

## 4. 具体使用

##### 步骤1：导入控件库
主要有 `Gradle` & `Maven` 2种方式：

- 方式1：`Gradle`引入依赖
*build.Gradle*

```
dependencies {
   compile 'scut.carson_ho:CircileView:1.0.0'
}
```

- 方式2：`Maven`引入依赖
*pom.xml*
```
<dependency>
  <groupId>scut.carson_ho</groupId>
  <artifactId>CircileView</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```


##### 步骤2：设置动画属性
- 属性说明

```
circle_color
// 类型 = color 默认 = Color.RED（红色）
```

- 使用示例
在`XML`文件中进行设置
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

## 5. 完整Demo地址
[Carson_Ho的Github地址：DIY_View](https://github.com/Carson-Ho/DIY_View)


![示意图](http://upload-images.jianshu.io/upload_images/944365-dcef19bb6ad0c77e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 6.  源码解析

请看文章[手把手教你写一个完整的自定义View](http://www.jianshu.com/p/e9d8420b1b9c)



## 7.  开源协议

`DIY_View` 遵循 `MIT` 开源协议

## 8. 贡献代码
- 具体请看：[贡献代码说明](https://github.com/Carson-Ho/DIY_View/blob/master/CONTRIBUTING.md)
- 关于该开源项目的意见 & 建议可在`Issue`上提出。欢迎 Star ！

## 9. 版本说明
2017-03-15 v1.0.0 ：新增 圆 视图

# 关于作者
- ID：Carson_Ho
- 简介：CSDN签约作者、简书推荐作者、稀土掘金专栏作者
- E - mail：[carson.ho@foxmail.com](mailto:carson.ho@foxmail.com)
- Github：[https://github.com/Carson-Ho](https://github.com/Carson-Ho)
- CSDN：[http://blog.csdn.net/carson_ho](http://blog.csdn.net/carson_ho)
- 简书：[http://www.jianshu.com/u/383970bef0a0](http://www.jianshu.com/u/383970bef0a0)
- 稀土掘金：[https://juejin.im/user/58d4d9781b69e6006ba65edc](https://juejin.im/user/58d4d9781b69e6006ba65edc)
