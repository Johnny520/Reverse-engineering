# 批量退群工具

适用于 Hchat 脚本插件的微信批量退群工具，基于 WeChat 8.0.69 ~ 8.0.76 共 6 个版本开发

**当前版本：v1.1.1**

### 命令快捷入口
在聊天框输入以下命令发送即可触发：

| 命令 | 说明 |
| --- | --- |
| `/退群` 或 `/quit` | 打开主菜单 |
| `/stop` 或 `/停止` | 停止正在执行的退群操作 |
| `/群统计` 或 `/stats` | 查看群聊统计信息 |

## 支持版本（下载链接）

- https://dldir1v6.qq.com/weixin/android/weixin8069android3040_0x2800455a_arm64.apk

- https://dldir1v6.qq.com/weixin/android/weixin8070android3060_0x28004634_arm64_1.apk

- https://dldir1v6.qq.com/weixin/android/weixin8071android3080_0x28004734_arm64.apk

- https://dldir1v6.qq.com/weixin/android/weixin8072android3100_0x28004835_arm64.apk

- https://dldir1v6.qq.com/weixin/android/weixin8074android3120_0x28004a36_arm64.apk

- https://dldir1v6.qq.com/weixin/android/weixin8076android3120_0x28004c10_arm6

## 注意事项

- 退群操作不可撤销，请谨慎操作
- 建议退群间隔设置 3 秒以上，避免触发微信限制
- 「删除聊天记录」和「删除会话记录」默认均开启，退群后彻底不留痕迹
- 退群日志记录在插件目录的 `log.txt` 中，包含每个策略的详细执行过程，便于排查问题
- 批量退群过程中请保持微信在前台运行
- 如果「关于插件」显示退群方法「未就绪」，说明当前微信版本不在支持范围内，但插件仍会尝试动态适配
