#!/system/bin/sh

WORK_DIR="/data/adb/YH/YH_YC/tmp/mj"
TMP_APK="$WORK_DIR/_mgr_tmp.apk"
# 将锁文件目录改回安全区
MOD_LOCK_DIR="$WORK_DIR/mod_locks"

# 核心安全机制：无论发生什么，退出时立即删除临时文件
trap 'rm -f "$TMP_APK"' EXIT SIGINT SIGTERM

KSU_DIR="/data/adb/ksu"
MOD_DIR="/data/adb/modules"

# 获取本次开机的唯一标识
BOOT_ID=$(cat /proc/sys/kernel/random/boot_id)

if [ ! -d "$WORK_DIR" ]; then
    mkdir -p "$WORK_DIR"
    chmod 755 "$WORK_DIR"
fi

# 创建模块锁存放目录
if [ ! -d "$MOD_LOCK_DIR" ]; then
    mkdir -p "$MOD_LOCK_DIR"
    chmod 755 "$MOD_LOCK_DIR"
fi

# 1. 执行全局初始化逻辑
"$KSU_DIR/bin/ksud" post-fs-data >/dev/null 2>&1
[ -L "$KSU_DIR/bin/magisk" ] && rm -f "$KSU_DIR/bin/magisk"

# 2. 核心逻辑：按模块粒度拉起进程，使用 Boot ID 校验
for mod in "$MOD_DIR"/*; do
    MOD_ID=$(basename "$mod")

    # 排除不是目录的情况或已禁用的模块
    [ ! -d "$mod" ] && continue
    [ -f "$mod/disable" ] && continue
    [ -f "$mod/remove" ] && continue

    if [ -f "$mod/service.sh" ]; then
        LOCK_FILE="$MOD_LOCK_DIR/$MOD_ID"
        NEED_START=true

        # 如果锁文件存在，比对 Boot ID
        if [ -f "$LOCK_FILE" ]; then
            SAVED_BOOT_ID=$(cat "$LOCK_FILE")
            if [ "$SAVED_BOOT_ID" = "$BOOT_ID" ]; then
                # ID 一致，说明本次开机已经启动过了，跳过
                NEED_START=false
            fi
        fi

        # 如果需要启动（新模块，或者上次重启遗留的旧锁）
        if [ "$NEED_START" = true ]; then
            echo "Starting module: $MOD_ID"
            # 后台运行模块进程
            sh "$mod/service.sh" >/dev/null 2>&1 &

            # 更新/创建锁文件，写入本次开机的 Boot ID
            echo "$BOOT_ID" > "$LOCK_FILE"
        fi
    fi
done

# 3. 告知 KSU 环境已就绪
"$KSU_DIR/bin/ksud" boot-completed >/dev/null 2>&1

# 4. 覆盖安装 Manager (触发识别)
APK_PATH=$(pm path me.weishu.kernelsu 2>/dev/null | head -1 | cut -d: -f2)
if [ -n "$APK_PATH" ]; then
    cp "$APK_PATH" "$TMP_APK"
    chmod 644 "$TMP_APK"
    chcon u:object_r:apk_data_file:s0 "$TMP_APK" 2>/dev/null
    pm install -r "$TMP_APK" >/dev/null 2>&1
fi
