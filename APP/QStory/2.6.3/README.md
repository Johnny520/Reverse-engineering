# QStory 2.6.3 Risk Analysis

本仓库/目录用于记录 `QStory_2.6.3-release.apk` 的静态逆向分析结果，重点关注隐私上传、远程接口、自动化群管理、Xposed 反射调用 QQ 内部接口、脚本插件执行等风险点。

## 分析对象

- APK：`QStory_2.6.3-release.apk`
- SHA256：`783F2E8B82F6EDFE812936911C1D3916A897D57C0F8D0CE712DEA7A66ADBEF86`
- MD5：`ED69CA5BA550AF2E413867A26761E3A6`

## 主要结论

2.6.3 仍然保留多类高风险能力：

- 上传当前 QQ 账号、昵称、IP、城市、定位等信息到开发者服务器。
- 通过 Token 访问 `/user-v2/*` 用户接口。
- 通过 Xposed/反射调用 QQ NT 内部接口执行踢人、禁言、删好友、退群等操作。
- 保留脚本插件体系，脚本可调用部分 QQ 操作能力。
- 自动图片检测功能会调用外部接口，命中后可自动禁言或踢人。
- 存在 MCP 本地服务配置：`http://localhost:9000/mcp`。

但本次静态分析没有发现 2.6.2 中确认过的远程黑名单踢人链路：

```text
请求服务器黑名单 -> 自动扫描管理群 -> 监听进群/消息事件 -> 匹配踢人 -> 上报踢人结果
```

2.6.3 中未发现：

- `/user-v2/queryBlacklist`
- `/user-v2/onKickBlacklist`
- 等同于 2.6.2 的远程黑名单列表与管理群监控列表
- 明确的开发者硬编码 QQ 豁免号判断链

## 关键风险点

### 用户信息上传

证据位置：

- `analysis_jadx/sources/p010/RunnableC6186.java`
- `analysis_jadx/sources/p348/InterfaceC8841.java`
- `analysis_jadx/sources/p345/C8834.java`

上传字段包括：

- `Uin`
- `Nickname`
- `Ip`
- `ClientCity`
- `Location`
- `Lt=regularly`

接口：

```text
https://qstory.suzhelan.top/user-v2/commitLoginInfo
```

### 自动检测后禁言/踢人

证据位置：

- `analysis_jadx/sources/top/suzhelan/qstory/hook/item/C5913.java`

执行链：

```text
读取群消息图片 -> 拼接 gchat.qpic.cn 图片 URL -> 调用 imageContain 检测 -> 命中后禁言或踢人
```

外部检测接口：

```text
https://search.linl.top/google/v2/imageContain
```

### QQ 内部危险操作

证据位置：

- `analysis_jadx/sources/lin/xposed/hook/util/qq/QQNTTroopTool.java`
- `analysis_jadx/sources/lin/xposed/hook/util/qq/QQFriendTool.java`
- `analysis_jadx/sources/lin/xposed/hook/util/qq/QQNTTroopSettingTool.java`
- `analysis_jadx/sources/lin/xposed/hook/javaplugin/api/QQNTPluginMethod.java`

能力包括：

- `kickMember`
- `shutUp`
- `deleteFriend`
- `quitGroup`

## 主要接口

基础域名：

```text
https://qstory.suzhelan.top
```

用户接口：

- `/user-v2/doLogin`
- `/user-v2/info`
- `/user-v2/isLogin`
- `/user-v2/refreshUserInfo`
- `/user-v2/commitLoginInfo`

更新接口：

- `/update/valid`
- `/update/getUpdateLog`
- `/update/hasUpdate`

支付接口：

- `/pay-v2/queryOrderResult`
- `/pay-v2/getPayItemList`

公告与开放接口：

- `/notice/all`
- `/notice/last`
- `/open/groups`

插件上传接口：

- `https://plugin.sacz.top/plugin-upload/readyToUpload`
- `https://plugin.sacz.top/plugin-upload/uploadFile`
- `https://plugin.sacz.top/plugin-upload/uploadInfo`
- `https://plugin.sacz.top/plugin-upload/confirmUploadStatus`

## 数字字符串说明

本次解密后发现的主要 QQ/群号型数字：

- `2971017318`：默认检测群配置，未证明为豁免号。
- `638537273`：默认检测群配置，未证明为豁免号。
- `979938489`：脚本交流群号。
- `2376738596`：独立数字字符串，未发现参与豁免踢人判断。
- `114514`：更像占位值/默认值，未发现构成 QQ 豁免判断。

## 文件说明

- `QStory_2.6.3-release_完整解密深度分析报告.md`：完整深度分析报告。
- `QStory_2.6.3-release_危险代码与版本差异分析报告.md`：危险代码与版本差异报告。
- `deobfuscated_qstory/m13972_strings.tsv`：索引字符串解密结果。
- `deobfuscated_qstory/m13973_inline_all_sources.tsv`：行内加密字符串解密结果。
- `deobfuscated_qstory/selected_evidence_annotated.md`：重点危险代码解密注释摘录。
- `analysis_jadx/`：JADX 反编译源码。
- `analysis_apktool/`：apktool 解包与 smali 产物。

## 风险建议

- 不建议在主 QQ 账号或重要群管理账号上运行该 APK。
- 如需测试，应使用隔离账号、测试群、无敏感通讯录的环境。
- 建议监控或阻断以下域名：
  - `qstory.suzhelan.top`
  - `plugin.sacz.top`
  - `search.linl.top`
  - `myip.ipip.net`
- 若要证明服务器端是否保存了个人数据，应通过本人账号授权请求、抓包、服务端数据导出请求或平台/法律渠道处理，不应尝试绕过认证获取后台数据。

## 免责声明

本项目仅用于安全研究、风险说明和用户自查。所有结论基于本地 APK 静态逆向分析，不包含绕过认证、入侵服务器、获取他人数据等行为。请勿将本文档或相关代码用于违法用途。
