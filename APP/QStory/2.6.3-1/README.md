# QStory_2.6.3-release APK 逆向/解密产物说明

本文档说明当前目录中和 `QStory_2.6.3-release.apk` 相关的文件、解密还原结果、接口文档和源码说明文档分别是什么。

## 原始 APK

| 文件 | 说明 |
|---|---|
| `QStory_2.6.3-release.apk` | 原始 Android APK 文件，应用版本为 `2.6.3`。后续所有反编译、字符串解密、源码还原、接口分析都来自这个 APK。 |

## 主要反编译/解密文件夹

| 路径 | 说明 |
|---|---|
| `QStory_2.6.3-release-jadx` | jadx 直接反编译输出目录。这里是原始反编译结果，主要用于查看 Java 源码、资源和反编译结构。部分字符串在最初版本中仍可能是加密/混淆形式。 |
| `QStory_2.6.3-release-restored` | 解密并还原后的主要源码目录。这个目录是在 jadx 反编译基础上，把 APK 里的加密字符串恢复成明文，并替换掉原来的运行时解密引用后得到的可读源码目录。后续文档主要围绕这个目录分析。 |

## `QStory_2.6.3-release-restored` 目录里面是什么

| 路径 | 说明 |
|---|---|
| `QStory_2.6.3-release-restored\sources` | 还原后的 Java 源码。包含 QStory 主业务代码、Xposed Hook 逻辑、在线插件 SDK、贴纸 SDK、混淆后的业务/依赖类、第三方库源码等。 |
| `QStory_2.6.3-release-restored\resources` | APK 资源目录。包含 `AndroidManifest.xml`、`res` 布局/图片/字符串/样式、`assets`、`lib` native 库、`META-INF` 签名和依赖元数据等。 |
| `QStory_2.6.3-release-restored\decrypted_strings.tsv` | 解密出来的字符串表。记录 APK 中原本被加密/混淆的字符串和还原后的明文内容。 |
| `QStory_2.6.3-release-restored\RESTORE_REPORT.txt` | 解密还原报告。记录本次字符串解密、源码替换、残留检查等处理结果。 |

## AI已生成的 Markdown 文档

| 文件 | 说明 |
|---|---|
| `QStory_2.6.3-release_own_backend.md` | QStory 自有后端接口文档。里面只整理 QStory/作者自有或疑似自有后端服务器，例如 `qstory.suzhelan.top`、`plugin.suzhelan.top`、`sticker.suzhelan.top` 等，并解释每个接口大概做什么。已排除 QQ/Tencent、GitHub、Gitee、Telegram、DNS 等非自有服务。 |
| `QStory_2.6.3-release-restored_file_explanation.md` | 目录的逐文件用途说明文档。它把 restored 目录里的每一个文件都列出来，并说明这个文件大概是做什么的，包括源码、资源、第三方依赖、Hook 功能、接口类、图片、布局、模型文件等。 |

## 解密了什么

本次主要解密/还原的是 APK 里的字符串混淆内容。

原 APK 中存在运行时字符串解密逻辑，很多 URL、接口路径、提示文本、类名、配置值等不是直接以明文形式出现。还原后：

- 加密字符串被提取并恢复为明文。
- 明文结果保存到 `decrypted_strings.tsv`。
- 反编译源码中的解密调用被替换为直接明文字符串。
- 生成了 `QStory_2.6.3-release-restored` 作为主要可读源码目录。
- 原解密器相关引用已尽量移除，方便直接阅读源码和搜索接口。

## 关键分析入口

| 想看内容 | 推荐查看位置 |
|---|---|
| 应用入口和 Manifest | `QStory_2.6.3-release-restored\resources\AndroidManifest.xml` |
| Application 初始化 | `QStory_2.6.3-release-restored\sources\top\suzhelan\qstory\FixApplication.java` |
| Xposed 核心加载 | `QStory_2.6.3-release-restored\sources\top\suzhelan\qstory\loader\CoreLoader.java` |
| QStory 主后端 Retrofit 客户端 | `QStory_2.6.3-release-restored\sources\p361\C9663.java` |
| 用户/登录接口 | `QStory_2.6.3-release-restored\sources\p364\InterfaceC9670.java` |
| 更新接口 | `QStory_2.6.3-release-restored\sources\p364\InterfaceC9671.java` |
| 支付接口 | `QStory_2.6.3-release-restored\sources\p364\InterfaceC9672.java` |
| 开放群组接口 | `QStory_2.6.3-release-restored\sources\p364\InterfaceC9673.java` |
| 公告接口 | `QStory_2.6.3-release-restored\sources\p364\InterfaceC9674.java` |
| 在线插件接口 | `QStory_2.6.3-release-restored\sources\top\suzhelan\plugin\sdk\online\net\ApiService.java` |
| 在线贴纸接口 | `QStory_2.6.3-release-restored\sources\top\suzhelan\sticker\sdk\net\StickerApiService.java` |
| 所有已还原字符串 | `QStory_2.6.3-release-restored\sources\p303\RestoredStrings.java` |

## 当前文档关系

```text
QStory_2.6.3-release.apk
        │
        ├── QStory_2.6.3-release-jadx
        │       └── jadx 原始反编译结果
        │
        └── QStory_2.6.3-release-restored
                ├── sources/                  还原后的源码
                ├── resources/                APK 资源
                ├── decrypted_strings.tsv     解密字符串表
                └── RESTORE_REPORT.txt        还原报告

分析文档：

QStory_2.6.3-release_own_backend.md
        └── 说明 QStory 自有后端服务器和每个接口用途

QStory_2.6.3-release-restored_file_explanation.md
        └── 说明 restored 目录里每一个文件大概做什么
```