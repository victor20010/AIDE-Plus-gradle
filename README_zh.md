<p align="center">
  <img src=".idea/icon.svg" style="width: 30%;" />
</p>

> [!TIP]
> 本项目为使用Android Studio构建版本
> 使用了Kotlin，所以AIDE+不能自举了
> 如若想要自举请前往主项目


- [README of English](README.md)
- [主项目](https://github.com/AndroidIDE-CN/AIDE-Plus)

# AIDE-Plus

## 仓库信息
[![GitHub contributors](https://img.shields.io/github/contributors/neu233/AIDE-Plus)](https://github.com/neu233/AIDE-Plus/graphs/contributors)
[![GitHub last commit](https://img.shields.io/github/last-commit/neu233/AIDE-Plus)](https://github.com/neu233/AIDE-Plus/commits/)
[![Repository Size](https://img.shields.io/github/repo-size/neu233/AIDE-Plus)](https://github.com/neu233/AIDE-Plus)
[![GitHub Release](https://img.shields.io/github/v/release/neu233/AIDE-Plus)](https://github.com/neu233/AIDE-Plus/releases)
[![Total downloads](https://img.shields.io/github/downloads/neu233/AIDE-Plus/total)](https://github.com/neu233/AIDE-Plus/releases)

## 构建
[![Android Studio](https://img.shields.io/badge/Android_Studio-2024.3.1-red?style=for-the-badge&logo=AndroidStudio)](https://developer.android.com/studio)
[![Gradle](https://img.shields.io/badge/Gradle_Version-8.11.1-red?style=for-the-badge&logo=Gradle)](https://developer.android.com/studio)



## 已实现功能
- [x] 构建服务优化和重写
- [x] aapt更替为aapt2
- [x] dx更替为D8
- [x] 一些Java8语法的实现(默认语法分析)
- [x] 一些Java9语法的实现(默认语法分析)
- [x] 一些Java11语法的实现(默认语法分析)
- [x] Java23编译(通过ecj实现，需要设置开启)
- [x] Java高版本格式化(通过ecj实现，需要设置开启)
- [x] 自定义class解析器，以实现高版本的class特性
- [x] 实现了`runtimeOnly`，`compileOnly`，`libgdxNatives`
- [x] 重写Gradle解析器
- [x] 新的Maven下载器(bom已支持)
- [x] 应用冷启动优化
- [x] 添加更多语法高亮
- [x] 使用D8进行混淆
- [x] AIDE默认框架替换为Androidx
- [x] 还原了部分AIDE的dex混淆
- [x] 代码自定义颜色
- [x] ViewBinding支持
- [x] DateBinding支持
- [x] 清单合并工具更新
- [x] 修复静默安装和支持更多安装器(shizuku)
- [x] 新UI的实现
- [x] 修复了补全和高亮丢失问题
- [x] 修复了创建签名的问题
- [x] ApkSign支持了的v1-v4签名
- [x] 新增一些基础的语法补全
- [x] 修复软件内的git问题
- [x] apk资源对齐
- [x] Java项目支持安卓api
- [x] Lambda实现 (ecj) [fbf450d](https://github.com/AndroidIDE-CN/AIDE-Plus/commit/fbf450dba15ccaf51a7a6dd77db300d50551e98b)
- [x] 支持cmake构建 [e702347](https://github.com/AndroidIDE-CN/AIDE-Plus/commit/e702347df0c10b718df5aeb4798402802334e310)
- [x] Xml补全修改逻辑 [0ecb637](https://github.com/neu233/AIDE-Plus/commit/0ecb637e6cb672723df77925e5642fd4b6016c39)

### 计划实现
- [ ] 更多补全 (Lsp)
- [ ] Apks/AAB的生成(未添加)
- [ ] 清单文件编辑
- [ ] 矢量图获取
- [ ] 重写布局可视化


## 相关资源
- [AIDE-Ndk-Install](https://github.com/ZeroAicy/AIDE-Ndk-Install) NDK安装器
- [AIDE-Repair](https://github.com/ZeroAicy/AIDE-Repair) 反混淆

# 相关信息
- QQ群
  * [487145957](https://qm.qq.com/q/W0WJq5qne2)
  * [1002980489](https://qm.qq.com/q/W0WJq5qne2) 
- [QQ频道](https://pd.qq.com/s/auq589py2)
- [网站](https://plus.androidide.cn)

# 特别感谢
> [!TIP]
> 如果没有看到您或者您的项目可以联系我们添加上去
### 项目相关
- [@墨凡尘轩](https://github.com/ZeroAicy) 项目创始人
- [@烂泥扶上墙](https://github.com/eirv) 项目合作者
- [@原罪](https://github.com/neu233) 项目合作者
- [@0047ol](https://github.com/0047ol) 项目合作者
- [@hujiayucc](https://github.com/hujiayucc) 项目合作者
- [@dev-bz](https://github.com/dev-bz) (不知者来此) 提供了帮助
- [阿恒](mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=3322977037) 代码参考
### 开源集成
- [AndroidIDE](https://github.com/AndroidIDEOfficial/AndroidIDE) 借鉴了部分代码
- [CodeAssist](https://github.com/tyron12233/CodeAssist) 借鉴了部分代码
- [Termux-app](https://github.com/termux/termux-app) 集成到软件内部
- [AIDE-Pro](https://github.com/AndroidIDE-CN/) 借鉴UI
- [material-components-android](https://github.com/material-components/material-components-android) MD3界面借鉴
- [VisualXML](https://github.com/Coyamo/VisualXML) 代码参考
- [App-UI-Designer](https://github.com/timscriptov/App-UI-Designer) 代码参考
- [RichPath](https://github.com/tarek360/RichPath) 用来显示矢量图
- [TreeView](https://github.com/dingyi222666/TreeView) 实现树型列表
- [kotlinc-android](https://github.com/Cosmic-Ide/kotlinc-android) 编译Kotlin
- [LSPosed](https://github.com/LSPosed/LSPosed) 目前引入了模糊弹窗代码
- [aosp-android-jar](https://github.com/Reginer/aosp-android-jar) aosp隐藏api的使用
- [TinyPinyin](https://github.com/promeG/TinyPinyin) 拼音
- [libsu](https://github.com/topjohnwu/libsu) libsu
### 资源相关
- [Github](https://github.com/)
- [Icon8](https://igoutu.cn/)
- [Google](https://fonts.google.com/icons)
- [Material3 Theme](https://material-foundation.github.io/material-theme-builder/)
- [Maven Repository](https://mvnrepository.com/)
- [阿里矢量图](https://www.iconfont.cn/)

