# query_beta_users.py 使用说明

> 工具：DY Helper 云端 Beta 名单查询工具
> 脚本：[query_beta_users.py](query_beta_users.py)
> 数据源：作者 GitHub 云端名单 `beta_users.json`（约 628 个用户）
> 依赖：Python 3.8+ 标准库（urllib / json），无需安装任何第三方包

---

## 一、准备

1. 安装 Python 3.8 或更高版本（Windows 可到 python.org 或微软商店安装）。
2. 确认命令行里能运行：

```bash
python --version
```

3. 进入脚本所在目录：

```bash
cd "D:\folder\codex\解密\DY Helper\DY Helper_1.4.15"
```

---

## 二、用法

### 1. 查询单个 UID 的云端数据（最常用）

```bash
python query_beta_users.py 70008778893
```

输出示例：

```
名单更新时间: 2026-07-30
名单用户总数: 628
公告: 欢迎使用 天天开心^_^ 请不要在抖音评论区或者作品贴脸宣传炫耀模块UI界面或者信息否则可能小黑屋哦
------------------------------------------------------------
[命中] UID: 70008778893
      到期: 2029-12-31
      状态: 有效，剩余 1245 天
      签名: Lf9HAU23/4d51bQ5RMthMnIt2bKI9icr...（共 344 字符，--full 查看完整）
```

字段含义：

| 字段 | 说明 |
| --- | --- |
| `uid` | 获得 Beta/捐赠内测资格的抖音 UID |
| `到期` | 资格到期日期，格式 `YYYY-MM-DD` |
| `状态` | 有效剩余天数 / 已过期 / 未知（时间格式异常） |
| `签名` | `dynamic_code_sign` 服务端签名，客户端 native 层用于校验名单真实性 |

### 2. 查询不存在的 UID

```bash
python query_beta_users.py 99999999999
```

输出：

```
[未命中] UID 99999999999 不在云端 Beta 名单中。
```

### 3. 查看完整签名

```bash
python query_beta_users.py 70008778893 --full
```

默认只显示签名前 48 个字符，加 `--full` 显示完整 344 字符。

### 4. 列出名单全部用户

```bash
python query_beta_users.py --list
```

逐行显示每个 UID、到期时间、剩余天数和签名摘要。

### 5. 强制重新下载，忽略缓存

```bash
python query_beta_users.py 70008778893 --refresh
```

### 6. 使用自定义名单地址

```bash
python query_beta_users.py 70008778893 --url "https://example.com/beta_users.json"
```

---

## 三、命令行参数速查

| 参数 | 说明 |
| --- | --- |
| `uid`（位置参数） | 要查询的抖音 UID |
| `--list` | 列出名单中全部用户 |
| `--full` | 显示完整 `dynamic_code_sign` 签名 |
| `--refresh` | 忽略本地缓存，强制重新下载 |
| `--url` | 指定名单 JSON 地址（默认作者 GitHub 仓库） |

帮助信息：

```bash
python query_beta_users.py --help
```

---

## 四、本地缓存

- 首次运行会把名单下载并保存为同目录下的 `beta_users_cache.json`。
- 缓存有效期 **1 小时**，期间再次查询走本地缓存、不联网，可离线查看。
- 需要强制更新时加 `--refresh`，或直接删除 `beta_users_cache.json`。

---

## 五、常见问题

| 问题 | 解决办法 |
| --- | --- |
| `python` 提示找不到命令 | 安装 Python 时勾选 "Add Python to PATH"，或改用 `py query_beta_users.py ...` |
| 中文乱码 | 脚本已强制 UTF-8 输出；若仍乱码，设置环境变量 `PYTHONIOENCODING=utf-8` |
| `网络错误，无法下载名单` | 检查网络能否访问 `raw.githubusercontent.com`（GitHub 直连有时需要代理） |
| `名单 JSON 解析失败` | 服务端内容异常或被代理返回了非 JSON，加 `--refresh` 重试 |
| 改了名单数据不生效 | 正常现象：客户端还有 native 层 `libdy_protect.so` 对 `dynamic_code_sign` 验签，单纯改名单无法通过校验 |

---

## 六、相关文档

- [DY Helper_1.4.15-云端捐赠信息调用逻辑.md](DY Helper_1.4.15-云端捐赠信息调用逻辑.md) —— 云端名单的完整获取调用链
- [DY Helper_1.4.15-破解云端.md](DY Helper_1.4.15-破解云端.md) —— 云端授权机制的信任模型与攻击面分析
