from __future__ import annotations

import hashlib
import json
import re
from pathlib import Path

from build_semantic_mapping import CLASS_ALIASES, PACKAGE_ALIASES


ROOT = Path(__file__).resolve().parent
APK = ROOT / "OKK_1.2.1_fix4.apk"
READABLE = ROOT / "OKK_1.2.1_fix4_readable"
SIMPLE = ROOT / "OKK_1.2.1_fix4_readable_simple"
JADX_RAW = ROOT / "OKK_1.2.1_fix4_decompiled"
APKTOOL = ROOT / "OKK_1.2.1_fix4_apktool"
ANALYSIS = ROOT / "OKK_1.2.1_fix4_analysis"
REPORT = ROOT / "OKK_1.2.1_fix4_完整解密说明.md"


CLASS_DESCRIPTIONS = {
    "AppFingerprint": "收集宿主微信版本、ABI、构建信息等兼容性指纹。",
    "DexKitManager": "初始化 DexKit、管理缓存并执行混淆类/方法定位。",
    "FeatureProbeCatalog": "定义各功能的探针和兼容性检查项目。",
    "DiagnosticLevel": "诊断结果级别枚举。",
    "DiagnosticItem": "单项诊断结果模型。",
    "CompatibilityReport": "汇总微信版本、探针命中和功能可用性。",
    "ConfigStore": "模块总配置中心；读写 achat_config.properties，并保存默认开关。",
    "AntiRevokeProcessor": "处理消息撤回通知、替换文案和媒体保护。",
    "MessageEditHook": "给聊天消息增加编辑入口并修改消息数据库内容。",
    "MessageDetailHook": "显示消息绝对时间、相对时间等详情。",
    "WallpaperOverlayHook": "给微信页面添加自定义壁纸和透明度遮罩。",
    "HomeAvatarHook": "在微信主页注入头像、昵称、状态及快捷抽屉入口。",
    "GroupMemberTitleHook": "识别群主/管理员/成员并绘制群头衔。",
    "MomentsCommentProtectHook": "拦截朋友圈评论删除/撤回并保留删除标记。",
    "VirtualLocationHook": "替换定位结果，支持地图选点和经纬度配置。",
    "BottomTabConfig": "管理底部 Tab 标题、悬浮样式、角标和图标。",
    "RoundAvatarHook": "统一处理头像圆角/圆形裁剪。",
    "DownloadRedirector": "将下载保存位置重定向到配置目录。",
    "RealNameTailHook": "在联系人/群成员界面追加实名尾标。",
    "InputStatsConfig": "输入/发消息统计配置。",
    "CustomBubbleHook": "替换左右聊天气泡 9.png 皮肤。",
    "SettingsEntryHook": "向微信设置或加号菜单注入 OKK 设置入口。",
    "MomentsAdsBlocker": "过滤朋友圈广告。",
    "PcAutoLoginConfig": "Windows/PC 登录确认页自动选择与自动点击配置。",
    "MessageActionDispatcher": "处理复制、转发、重发、删除、保存等消息动作。",
    "AvatarHook": "定位并 Hook 微信头像相关渲染点。",
    "MomentsHook": "朋友圈数据库保护和删除拦截主逻辑。",
    "FloatingBottomTabView": "自绘悬浮底部导航栏。",
    "HotUpdateBlocker": "屏蔽宿主热更新逻辑。",
    "InputStatsDatabase": "统计当天已发送消息数量。",
    "MapPickerResultHandler": "接收地图选点结果并保存虚拟定位。",
    "MessageDatabaseHook": "定位消息表字段和数据库写入点。",
    "FoldBannerPinHook": "固定/折叠微信顶部横幅区域。",
    "ThemeWallpaperConfig": "保存壁纸路径、启用状态和透明度。",
    "SettingsAction": "设置页点击动作分发：目录、壁纸、群组链接等。",
    "SettingsCallback": "设置页保存、诊断复制、快捷项保存等回调。",
    "FeatureInstallResult": "单个功能安装结果数据。",
    "FeatureInstallStatus": "功能状态枚举。",
    "FeatureStatusRegistry": "记录各 Hook 安装成功、失败和无效状态。",
    "SettingsUiBuilder": "动态构建全部 OKK 设置界面。",
    "FeatureInstallTask": "按编号执行单项 Hook 安装任务。",
    "FeatureInstaller": "模块功能总安装器，集中注册所有 Hook。",
    "ModuleBootstrap": "微信进程就绪后保存上下文并启动模块。",
    "SettingsEntryInjector": "向不同版本微信 UI 注入设置入口。",
    "HookDiagnostics": "诊断 UI、活动跟踪和 Hook 状态展示。",
}


CONFIG_DESCRIPTIONS = {
    "anti_revoke": "消息防撤回",
    "revoke_notice_enabled": "显示撤回提示",
    "anti_revoke_keep_self": "保留自己撤回的消息",
    "anti_revoke_notice_text": "撤回提示模板",
    "media_protect_enabled": "撤回媒体文件保护",
    "anti_moments_delete": "朋友圈内容防删除",
    "anti_moments_comment_revoke": "朋友圈评论防撤回/删除",
    "swipe_quote": "滑动引用",
    "swipe_repeat": "滑动复读",
    "quote_delete_clear": "引用后清理删除状态",
    "bubble_enabled": "自定义聊天气泡",
    "settings_entry_enabled": "显示 OKK 设置入口",
    "module_log_enabled": "写入模块运行日志",
    "bottom_tab_hide_title": "隐藏底部栏文字",
    "bottom_tab_floating": "悬浮底部栏",
    "bottom_tab_floating_labels": "悬浮栏显示标签",
    "bottom_tab_floating_badge": "悬浮栏显示角标",
    "detail_enabled": "消息详情时间",
    "detail_template": "消息详情显示模板",
    "detail_time_pattern": "绝对时间格式",
    "detail_text_size": "详情文字大小",
    "detail_left_margin": "详情左边距",
    "detail_right_margin": "详情右边距",
    "detail_text_color_light": "浅色模式详情颜色",
    "detail_text_color_dark": "深色模式详情颜色",
    "detail_click_show": "点击后显示详情",
    "input_stats_enabled": "今日发送统计",
    "input_stats_count_send": "统计发送动作",
    "input_stats_template": "统计显示模板",
    "round_avatar_enabled": "圆形/圆角头像",
    "round_avatar_radius": "头像圆角比例",
    "virtual_location_enabled": "虚拟定位",
    "virtual_location_latitude": "虚拟纬度",
    "virtual_location_longitude": "虚拟经度",
    "auto_login_win_enabled": "PC 登录页增强",
    "auto_login_win_sync_msg": "自动勾选同步消息",
    "auto_login_win_show_device": "显示登录设备",
    "auto_login_win_auto_device": "自动选择设备",
    "auto_login_win_auto_click": "自动确认登录",
    "remove_moments_ads": "移除朋友圈广告",
    "profile_id": "显示微信 ID",
    "home_avatar_entry": "主页头像入口",
    "home_drawer_shortcuts": "主页抽屉快捷项",
    "home_drawer_signature": "主页抽屉签名",
    "home_status_custom": "主页自定义状态",
    "theme_wallpaper_enabled": "自定义壁纸",
    "theme_wallpaper_alpha": "壁纸遮罩透明度",
    "theme_wallpaper_path": "壁纸路径",
    "disable_hot_update": "屏蔽热更新",
    "real_name_tail": "显示实名尾标",
    "real_name_tail_color": "实名尾标颜色",
    "member_title": "显示群成员头衔",
    "member_title_show_member": "普通成员也显示头衔",
    "member_title_owner": "群主头衔文案",
    "member_title_admin": "管理员头衔文案",
    "member_title_member": "成员头衔文案",
    "edit_message": "编辑聊天消息",
    "hide_home_divider": "隐藏主页分割线",
    "fold_banner_fixed": "固定折叠横幅",
    "night_mode_follow": "夜间模式跟随系统",
    "night_mode": "强制夜间模式",
}


def sha256(path: Path) -> str:
    h = hashlib.sha256()
    with path.open("rb") as f:
        for chunk in iter(lambda: f.read(1024 * 1024), b""):
            h.update(chunk)
    return h.hexdigest().upper()


def count_files(path: Path, pattern: str = "*") -> int:
    return sum(1 for p in path.rglob(pattern) if p.is_file()) if path.exists() else 0


def output_class_path(raw: str, alias: str) -> Path:
    raw_pkg = raw.rsplit(".", 1)[0]
    pkg = PACKAGE_ALIASES.get(raw_pkg, raw_pkg)
    return READABLE / "sources" / Path(*pkg.split(".")) / f"{alias}.java"


def parse_config_defaults() -> list[tuple[str, str]]:
    path = READABLE / "sources/com/abc/core/features/ConfigStore.java"
    text = path.read_text("utf-8", errors="replace")
    return re.findall(r'new C0139e\("([a-z][a-z0-9_]+)", "([^"]*)"\)', text)


def source_folder_rows() -> str:
    src = READABLE / "sources"
    rows = []
    for folder in sorted((p for p in src.iterdir() if p.is_dir()), key=lambda p: p.name.casefold()):
        files = list(folder.rglob("*.java"))
        sample = files[0].relative_to(src).as_posix() if files else "-"
        if folder.name == "com":
            desc = "应用主体 `com.abc`、Google Material/FlatBuffers 等；关键代码已迁入语义化包名。"
        elif folder.name == "android":
            desc = "Android 平台兼容占位/资源类。"
        elif folder.name == "androidx":
            desc = "AndroidX 组件，包含 Activity、Fragment、Preference、Emoji、Lifecycle 等。"
        elif folder.name == "de":
            desc = "传统 Xposed API（`de.robv.android.xposed`）。"
        elif folder.name == "kotlin":
            desc = "Kotlin 标准库与协程运行时。"
        elif folder.name == "org":
            desc = "DexKit Java API（`org.luckypray.dexkit`）及其他组织包。"
        else:
            desc = "R8 短包名的依赖/公共运行时代码；原包名信息已被优化器压缩，文件内容已完整反编译。"
        rows.append(f"| `{folder.name}/` | {len(files)} | `{sample}` | {desc} |")
    return "\n".join(rows)


def resource_folder_text() -> str:
    folders = sorted(p.name for p in (APKTOOL / "res").iterdir() if p.is_dir())
    base = [x for x in folders if not x.startswith("values-")]
    values = [x for x in folders if x.startswith("values-")]
    return (
        "- 基础资源目录：" + "、".join(f"`{x}/`" for x in base) + "。\n"
        f"- `values/`：默认字符串、颜色、尺寸、样式、数组等。\n"
        f"- `values-*`：共 {len(values)} 个语言、屏幕尺寸、夜间模式、API 版本和密度限定目录；完整目录名如下：\n\n"
        + "、".join(f"`{x}`" for x in values)
    )


def class_mapping_table() -> str:
    rows = []
    for raw, alias in CLASS_ALIASES.items():
        path = output_class_path(raw, alias)
        rel = path.relative_to(ROOT).as_posix()
        desc = CLASS_DESCRIPTIONS.get(alias, "按调用关系和字符串语义恢复的关键类。")
        rows.append(f"| `{raw}` | `{alias}` | `{rel}` | {desc} |")
    return "\n".join(rows)


def config_table() -> str:
    rows = []
    for key, default in parse_config_defaults():
        default = default.replace("|", "\\|")
        desc = CONFIG_DESCRIPTIONS.get(key, "配置项")
        rows.append(f"| `{key}` | `{default}` | {desc} |")
    rows.append("| `download_redirect_enabled` | 代码默认关闭 | 下载目录重定向开关 |")
    rows.append("| `download_redirect_dir` | `/storage/emulated/0/Android/media/com.tencent.mm/OKK/download` | 下载重定向目录 |")
    return "\n".join(rows)


def main() -> None:
    ANALYSIS.mkdir(exist_ok=True)
    urls = json.loads((ANALYSIS / "strings_and_urls.json").read_text("utf-8"))["urls"]
    binary_scan_path = ANALYSIS / "binary_string_scan.json"
    if binary_scan_path.exists():
        binary_urls = json.loads(binary_scan_path.read_text("utf-8"))["urls"]
        for url, refs in binary_urls.items():
            urls.setdefault(url, []).extend(refs)
            urls[url] = sorted(set(urls[url]))

    mapping_tsv = ANALYSIS / "重要类语义映射.tsv"
    with mapping_tsv.open("w", encoding="utf-8", newline="") as f:
        f.write("原始混淆名\t语义化类名\t输出文件\t说明\n")
        for raw, alias in CLASS_ALIASES.items():
            f.write(f"{raw}\t{alias}\t{output_class_path(raw, alias).relative_to(ROOT).as_posix()}\t{CLASS_DESCRIPTIONS.get(alias, '')}\n")

    url_tsv = ANALYSIS / "URL清单.tsv"
    with url_tsv.open("w", encoding="utf-8", newline="") as f:
        f.write("URL\t类型\t引用位置\n")
        for url, refs in urls.items():
            if "t.me/" in url:
                kind = "应用外链"
            elif "android.googlesource.com" in url:
                kind = "DexKit 原生库编译工具链标识"
            else:
                kind = "Android XML 命名空间"
            f.write(f"{url}\t{kind}\t{' | '.join(refs)}\n")

    app_files = count_files(READABLE / "sources/com/abc", "*.java")
    java_files = count_files(READABLE / "sources", "*.java")
    simple_files = count_files(SIMPLE / "sources", "*.java")
    smali_files = count_files(APKTOOL / "smali", "*.smali")
    resource_files = count_files(READABLE / "resources")
    incorrect = sum(
        "Code decompiled incorrectly" in p.read_text("utf-8", errors="ignore")
        for p in (READABLE / "sources").rglob("*.java")
    )

    report = f"""# OKK_1.2.1_fix4.apk 完整解密与源码说明

## 1. 交付结果

| 输出 | 路径 | 用途 |
|---|---|---|
| **语义化可读源码（主目录）** | `OKK_1.2.1_fix4_readable/` | JADX 重构模式、资源解码、5 个核心包和 46 个关键类已按功能改名。 |
| **指令顺序源码** | `OKK_1.2.1_fix4_readable_simple/` | JADX simple 模式；复杂方法按 DEX 指令顺序输出，用于对照重构失败的方法。 |
| **完整 Smali 与资源** | `OKK_1.2.1_fix4_apktool/` | Apktool 指令级反汇编，是 DEX 的完整基准版本。 |
| **原始 JADX 反混淆结果** | `OKK_1.2.1_fix4_decompiled/` | 保留第一次自动反混淆结果，便于与语义化版本比较。 |
| **扫描和映射资料** | `OKK_1.2.1_fix4_analysis/` | URL、字符串、配置键、每文件特征、语义映射。 |
| **JADX 语义映射** | `OKK_1.2.1_fix4_semantic.jobf` | 可直接交给 JADX 再次加载的包名/类名映射。 |

文件数量：语义化 Java **{java_files}** 个，其中 `com.abc` 主体代码 **{app_files}** 个；simple Java **{simple_files}** 个；Smali **{smali_files}** 个；解码资源 **{resource_files}** 个。

## 2. APK 基本信息

| 项目 | 结果 |
|---|---|
| 文件 | `OKK_1.2.1_fix4.apk` |
| 大小 | {APK.stat().st_size:,} 字节 |
| SHA-256 | `{sha256(APK)}` |
| 包名 | `com.abc.module` |
| 应用名 | `OKK` |
| versionName / versionCode | `1.2.1` / `13` |
| minSdk / targetSdk / compileSdk | `26` / `35` / `35` |
| 类型 | Xposed / LSPosed 模块，无普通启动 Activity |
| 目标作用域 | `com.tencent.mm`（微信） |
| 传统入口 | `com.abc.loader.HookEntry`、`com.abc.loader.ZygoteEntry` |
| libxposed 入口 | `com.abc.loader.ModernHookEntry` |
| 模块描述 | `OKK Fuck WeChat` |
| Xposed 元数据 | `name=AChat`、`author=Angus`、`version=1.1.7`、`targetApiVersion=102` |
| DEX | 单个 `classes.dex` |
| 原生库 | `arm64-v8a/libdexkit.so`、`armeabi-v7a/libdexkit.so` |
| INTERNET 权限 | Manifest 中未声明 |

元数据里的 `AChat 1.1.7` 与 APK 显示的 `OKK 1.2.1` 不一致，说明该版本保留了旧工程/旧模块名称的兼容信息。

## 3. 加密、加固与混淆判断

- 未发现常见加固壳入口、壳 Application、加密 DEX 容器或运行时释放第二份 DEX；APK 内只有一个正常 `classes.dex`。
- 两个 `.so` 均为 DexKit 的 ABI 库，用于运行时搜索微信混淆类和方法，不是业务代码壳。
- 代码使用 Kotlin + R8/ProGuard 名称压缩，原始短包名主要为 `b0`、`c0`、`d0`、`e0`、`f0`。
- 已把这 5 个核心包恢复为 `com.abc.internal.probe`、`com.abc.core.features`、`com.abc.ui`、`com.abc.core.status`、`com.abc.core.runtime`，并对 46 个关键类完成语义化命名。
- 变量名和少量方法名在发布构建时已被 R8 删除；语义化版本保留完整控制流，并通过 Java 重构版、simple 版、Smali 版三层互相校验。
- 重构模式中有 **{incorrect}** 个文件带 JADX “Code decompiled incorrectly” 提示；对应逻辑可在 `OKK_1.2.1_fix4_readable_simple/` 或 `OKK_1.2.1_fix4_apktool/smali/` 查看完整指令。

## 4. 程序结构与启动流程

```mermaid
flowchart TD
    A["LSPosed / Xposed 加载模块"] --> B["ModernHookEntry / HookEntry"]
    B --> C["ModuleBootstrap 保存微信 Context、ClassLoader、模块 APK 路径"]
    C --> D["FeatureInstaller 注册功能"]
    D --> E["DexKitManager 扫描微信混淆类/方法"]
    E --> F["各 Feature Hook 安装"]
    F --> G["FeatureStatusRegistry 记录结果"]
    F --> H["SettingsEntryInjector 注入设置入口"]
    H --> I["SettingsUiBuilder 动态生成设置页"]
    I --> J["ConfigStore 读写 achat_config.properties"]
```

配置和日志默认目录：`/storage/emulated/0/Android/media/com.tencent.mm/OKK/`。

## 5. 核心功能总览

1. 消息防撤回、撤回提示模板、撤回媒体保护。
2. 消息编辑、滑动引用/复读、消息复制/转发/重发/删除/保存。
3. 消息绝对时间、相对时间、今日发送统计。
4. 朋友圈内容防删除、评论防删除、移除朋友圈广告。
5. 虚拟定位和微信地图选点。
6. 自定义聊天气泡、头像圆角、主页头像/昵称/状态、主页快捷抽屉。
7. 自定义微信壁纸、遮罩透明度、夜间模式。
8. 底部栏图标、文字、自定义名称、悬浮导航、角标。
9. 群主/管理员/成员头衔、微信 ID、实名尾标。
10. PC 登录页自动勾选、设备显示和自动确认。
11. 下载目录重定向、屏蔽热更新、隐藏主页分割线、固定折叠横幅。
12. 模块运行日志、兼容性探针、Hook 安装状态和诊断报告。

## 6. 重要文件说明

| 文件 | 介绍 |
|---|---|
| `OKK_1.2.1_fix4_readable/resources/AndroidManifest.xml` | 包信息、SDK、Xposed 元数据、Provider/Receiver；没有普通 Activity 和网络权限。 |
| `OKK_1.2.1_fix4_apktool/assets/xposed_init` | 传统 Xposed 入口列表。 |
| APK 内 `META-INF/xposed/java_init.list` | libxposed 入口 `ModernHookEntry`。 |
| APK 内 `META-INF/xposed/scope.list` | 模块作用域 `com.tencent.mm`。 |
| `.../com/abc/loader/ModernHookEntry.java` | 现代 Xposed 启动入口，微信包就绪后调用 `ModuleBootstrap`。 |
| `.../com/abc/core/runtime/ModuleBootstrap.java` | 保存宿主上下文、类加载器并启动功能安装。 |
| `.../com/abc/core/runtime/FeatureInstaller.java` | 所有 Hook 的集中安装器，是理解完整功能链的第一入口。 |
| `.../com/abc/core/runtime/SettingsUiBuilder.java` | 动态生成模块设置页面。 |
| `.../com/abc/core/features/ConfigStore.java` | 65 个主要默认配置及配置文件读写。 |
| `.../com/abc/internal/probe/DexKitManager.java` | DexKit 初始化、缓存和混淆目标定位。 |
| `.../com/abc/core/hooks/ModuleLog.java` | Xposed 日志和 `module_runtime.log` 文件日志。 |
| `OKK_1.2.1_fix4_apktool/smali/` | Java 反编译有歧义时的完整 DEX 指令基准。 |

上表中的 `...` 均指 `OKK_1.2.1_fix4_readable/sources`。

## 7. 关键类语义恢复表

| 原混淆名 | 恢复名 | 文件 | 作用 |
|---|---|---|---|
{class_mapping_table()}

完整 TSV：`OKK_1.2.1_fix4_analysis/重要类语义映射.tsv`。

## 8. URL 与网络扫描

### 8.1 应用实际外链

| URL | 用途 | 代码位置 |
|---|---|---|
| `https://t.me/OKK_Group` | 设置/快捷面板中的 Telegram 群组入口，通过 `ACTION_VIEW` 打开。 | `OKK_1.2.1_fix4_readable/sources/com/abc/ui/SettingsAction.java` |

### 8.2 非业务 URL

| URL | 用途 |
|---|---|
| `http://schemas.android.com/apk/res/android` | Android XML 属性命名空间。 |
| `http://schemas.android.com/apk/res-auto` | Android 自定义 XML 属性命名空间。 |
| `https://android.googlesource.com/toolchain/llvm-project` | `libdexkit.so` 中的 LLVM/Android 工具链构建标识，不是运行时请求地址。 |

未发现 Retrofit、OkHttp、Volley、HttpURLConnection、WebSocket、WebView 远程地址、API Base URL、登录接口、上传接口或下载接口；Manifest 也未声明 `android.permission.INTERNET`。因此该模块主要在本地 Hook 微信进程，不包含自有后端通信逻辑。

完整扫描：`OKK_1.2.1_fix4_analysis/URL清单.tsv` 和 `strings_and_urls.json`。

## 9. 配置项清单

| 配置键 | 默认值 | 功能 |
|---|---|---|
{config_table()}

## 10. 文件夹逐项介绍

### 10.1 顶层输出目录

| 文件夹 | 说明 |
|---|---|
| `OKK_1.2.1_fix4_readable/sources/` | 语义化 Java 源码。 |
| `OKK_1.2.1_fix4_readable/resources/` | JADX 解码资源、Manifest、assets、原生库和元数据。 |
| `OKK_1.2.1_fix4_readable_simple/sources/` | simple 指令顺序 Java。 |
| `OKK_1.2.1_fix4_apktool/smali/` | 完整 Smali。 |
| `OKK_1.2.1_fix4_apktool/res/` | Apktool 标准资源目录。 |
| `OKK_1.2.1_fix4_apktool/assets/` | Xposed 入口、底部栏图标、气泡图片、基线配置。 |
| `OKK_1.2.1_fix4_apktool/lib/` | arm64-v8a/armeabi-v7a DexKit 库。 |
| `OKK_1.2.1_fix4_apktool/original/` | APK 原始签名/元数据保留区。 |
| `OKK_1.2.1_fix4_apktool/unknown/` | Apktool 未归类但原样保留的文件。 |
| `OKK_1.2.1_fix4_analysis/` | 自动扫描和人工语义恢复资料。 |

### 10.2 `readable/sources` 每个一级文件夹

| 文件夹 | Java 数 | 示例文件 | 说明 |
|---|---:|---|---|
{source_folder_rows()}

### 10.3 `com.abc` 应用代码文件夹

| 文件夹 | 说明 |
|---|---|
| `com/abc/loader/` | Xposed/LSPosed 启动入口。 |
| `com/abc/core/hooks/` | 模块自身日志等基础 Hook 支持。 |
| `com/abc/core/runtime/` | 模块启动、功能安装、设置 UI、诊断。 |
| `com/abc/core/features/` | 消息、朋友圈、外观、定位、底部栏等实际功能。 |
| `com/abc/core/status/` | 功能安装状态和结果模型。 |
| `com/abc/internal/probe/` | DexKit、微信版本指纹和兼容性探针。 |
| `com/abc/ui/` | 设置动作、回调、浮动底部栏等 UI。 |

### 10.4 资源文件夹

{resource_folder_text()}

### 10.5 Assets 与原生库

| 路径 | 说明 |
|---|---|
| `assets/xposed_init` | 传统 Xposed 入口。 |
| `assets/abc_bottom_tab/` | 微信、通讯录、发现、我四个底部栏图标。 |
| `assets/abc_bubble/` | 左右聊天气泡 `.9.png`。 |
| `assets/dexopt/` | Android Baseline Profile。 |
| `lib/arm64-v8a/libdexkit.so` | 64 位 ARM DexKit。 |
| `lib/armeabi-v7a/libdexkit.so` | 32 位 ARM DexKit。 |

## 11. 阅读建议

1. 从 `ModernHookEntry.java` 阅读进程入口。
2. 继续查看 `ModuleBootstrap.java` 和 `FeatureInstaller.java`，理解安装顺序。
3. 在 `ConfigStore.java` 按配置键定位功能。
4. 进入 `core/features/` 查看具体 Hook。
5. 遇到 JADX 警告时，用同名 simple 文件对照；需要逐条确认时查看 Apktool Smali。

## 12. 生成工具与可重复步骤

- JADX 1.5.5：重构模式 + `--deobf` + 自定义 JOBF 语义映射。
- JADX 1.5.5 simple 模式：补充复杂控制流。
- Apktool 3.0.2：资源解码与 Smali 反汇编。
- `analyze_okk.py`：字符串、URL、配置键和文件特征扫描。
- `build_semantic_mapping.py`：生成语义化 JADX 映射。
- `generate_okk_report.py`：生成本说明和 TSV 清单。
"""
    REPORT.write_text(report, "utf-8")
    print(f"Wrote {REPORT.name}")


if __name__ == "__main__":
    main()
