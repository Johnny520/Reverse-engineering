# 微信 8.0.75 官替多功能提取与 dylib 解密项目

> 本目录包含原始 IPA、截图中的 13 组功能组件、全部 18 个 dylib、Objective-C 接口恢复、符号、字符串及完整 ARM64 反汇编。

## 快速查看

1. [功能映射与文件说明](./微信_8.0.75功能提取/功能映射与文件说明.md)
2. [全部 dylib 解密报告](./微信_8.0.75功能提取/全部Dylib解密/全部Dylib解密报告.md)
3. [全部 dylib 校验报告](./微信_8.0.75功能提取/全部Dylib解密/全部Dylib校验报告.txt)

## 处理结果

- 截图功能：13 组
- dylib：18 个
- ARM64 指令：49,619,827 条
- IPA SHA-256：`84c0fe52f54af29b869fd2efc3741ca9dfc609b727d5a107993a3466b7d852e4`

## 截图功能

- Mikoto 体验版：Mikoto 主体、插件管理及 MiYou 联动功能
- PKC：撤回、群聊、步数、标签及其他微信增强功能
- WCRefine：聊天与界面精修、插件管理和主题联动
- 微信助手：MiYou 助手主体与 wcplugins 插件注册入口
- XOS：时间标签、Dock、卡片与主题联动界面增强
- 黄白助手：黄白助手主体、插件设置、备份和多媒体功能
- Lab：ThemeLab/Lab 主题、DIY 与 Liquid Glass 适配
- 主题盒子：ThemeBox 主题盒子主体
- ThemePro 主题：ThemePro/Pineapple 主题引擎
- HBB 无后台推送：HBB 推送相关组件
- AFN：AFN 工具集合，包含根目录版与 Frameworks 版
- 微信净化：WCPureExtension 微信净化组件
- WCGlass 液态玻璃：WCGlass/WCLG 液态玻璃和主题组件

## 目录

```text
微信_8.0.75官替多功能/
├─ 微信_8.0.75官替多功能.ipa
├─ idlefish-msg-1785768681778.png.jpg
├─ rebuild_wechat_8075.py
└─ 微信_8.0.75功能提取/
   ├─ 01_Mikoto体验版 ... 13_WCGlass液态玻璃
   ├─ 99_公共运行依赖
   └─ 全部Dylib解密/
      ├─ 原始已解密
      └─ 可读源码
```
