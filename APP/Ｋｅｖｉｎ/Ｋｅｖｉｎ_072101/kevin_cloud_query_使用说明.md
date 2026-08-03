# kevin_cloud_query.py 使用说明

> 工具用途：查询 **Kevin 云端**中某个抖音用户的云端数据 —— 即判定该用户 uid 是否在作者维护的 **VIP 白名单**内。
> 逆向依据：`kevin-decode-report.tsv` + `PPHook.java`（`loadVipListFromCloud` / `isVipUid`），详见 [Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md](Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md)。

## 1. 文件与环境

| 项 | 说明 |
|---|---|
| 脚本位置 | `Ｋｅｖｉｎ_072101/kevin_cloud_query.py` |
| 运行环境 | Python 3（标准库即可，**无需安装任何第三方依赖**） |
| 数据来源 | `https://111.kevin42.dpdns.org/vip_list.json`（作者自建域名上的 VIP 名单） |

## 2. 快速开始

在 `Ｋｅｖｉｎ_072101` 目录下打开终端（Windows 用 cmd / PowerShell，或任意 Python 3 环境）：

```bash
python kevin_cloud_query.py 1234567890
```

输出示例：

```
[*] 拉取名单: https://111.kevin42.dpdns.org/vip_list.json
[*] HTTP 200, 12034 字节
[*] 名单内识别到 318 个 uid

=== 云端数据查询结果 ===
uid 1234567890           ✅ 在名单内（VIP）
========================
```

## 3. 完整参数

```
usage: kevin_cloud_query.py [-h] [--list-url LIST_URL] [--check FILE]
                            [--dump] [--raw] [--timeout TIMEOUT]
                            [uid ...]
```

| 参数 | 含义 | 默认 |
|---|---|---|
| `uid ...` | 要查询的抖音 uid，可写多个 | — |
| `--check FILE` | 从文本文件批量检查，每行一个 uid | — |
| `--list-url URL` | 名单来源；支持 http(s) 地址**或本地 JSON 文件路径** | `https://111.kevin42.dpdns.org/vip_list.json` |
| `--dump` | 额外打印名单内全部 uid 列表 | 关 |
| `--raw` | 额外打印原始 JSON 响应 | 关 |
| `--timeout N` | 网络超时秒数 | 15 |

## 4. 用法示例

**查询单个用户**

```bash
python kevin_cloud_query.py 1234567890
```

**查询多个用户**

```bash
python kevin_cloud_query.py 1234567890 9876543210 5551112223
```

**批量检查（每行一个 uid 的文本文件）**

```bash
python kevin_cloud_query.py --check uids.txt
```

**同时导出完整名单**

```bash
python kevin_cloud_query.py 1234567890 --dump
```

**查看名单原始结构（用于理解云端协议格式）**

```bash
python kevin_cloud_query.py 1234567890 --raw
```

**使用本地名单文件**（域名失效/离线时）

```bash
# 先把名单存成本地 JSON 文件 vip.json，再查询
python kevin_cloud_query.py 1234567890 --list-url vip.json
```

**指定其它远程地址**

```bash
python kevin_cloud_query.py 1234567890 --list-url https://example.com/vip.json
```

## 5. 输出解读

| 输出 | 含义 |
|---|---|
| `✅ 在名单内（VIP）` | 该 uid 出现在云端 VIP 白名单中，可享受 VIP 权益 |
| `❌ 不在名单内（普通用户）` | 该 uid 不在白名单中 |
| `HTTP xxx, N 字节` | 名单接口的响应状态码与大小 |
| `名单内识别到 N 个 uid` | 从名单 JSON 中解析出的 uid 总数 |

## 6. 原理与局限

**原理**（与 APK 内客户端行为一致）：

- APK 通过 `PPHook.loadVipListFromCloud()` 拉取同一名单，缓存进内存 `sVipUidSet`，用 `isVipUid(uid)` 做成员判定（详见 [Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md](Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md) §4.6）。
- 本工具复现这一行为：拉名单 → 解析 uid 集合 → 成员比对。

**宽容解析**：

- 名单 JSON 的字段结构在反编译时被混淆（作者字符串池 XOR 编码），工具不依赖固定字段名，而是**递归遍历整个 JSON，把所有形似 uid 的纯数字串提取出来**。
- 因此无论名单是 `["123","456"]`、`{"uids":[...]}`、`{"data":{"list":[...]}}` 还是其它嵌套结构，都能正确识别。

**局限与注意事项**：

1. 名单域名由作者维护，**可能随时失效或下线**。失效时工具会提示网络错误，此时请改用本地文件方式（`--list-url 本地文件`）。
2. 名单内容是"某一时刻"的快照；VIP 名单会变化，本工具结果不代表当前实时状态。
3. 工具只做**只读查询**，不修改、不上报任何数据。

## 7. 与其他文档的关系

- [Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md](Ｋｅｖｉｎ_072101-云端用户信息调用逻辑.md)：本工具复现的调用链（`loadVipListFromCloud` 等）。
- [Ｋｅｖｉｎ_072101-破解云端.md](Ｋｅｖｉｎ_072101-破解云端.md)：云端的整体架构与安全边界（VIP 名单 = 云端授权组件之一）。
- [Ｋｅｖｉｎ_072101-云端与加密分析.md](Ｋｅｖｉｎ_072101-云端与加密分析.md)：混淆与加密现状。
