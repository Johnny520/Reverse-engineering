#!/bin/sh

echo "=========================================="
echo "    底层 Bootloader 状态穿透检测脚本      "
echo "=========================================="

# 变量初始化
IS_SPOOFED=0
BL_STATE="UNKNOWN"

# ---------------------------------------------------------
# 1. 环境纯净度检测：检查 cmdline 是否被 Bind Mount 劫持
# 常见的隐藏模块会创建一个伪造的 cmdline 文件并挂载上去
# ---------------------------------------------------------
echo "[*] 正在检查 VFS 挂载状态..."
if grep -q "/proc/cmdline" /proc/self/mountinfo; then
    echo "[!] 警告: 发现 /proc/cmdline 被 Bind Mount 劫持！"
    echo "    当前环境存在隐藏模块干预，常规读取不可信。"
    IS_SPOOFED=1
else
    echo "[+] /proc/cmdline 挂载点正常，未发现表层文件劫持。"
fi

# ---------------------------------------------------------
# 2. 绕过文件系统：从 dmesg (内核早期日志) 抓取原始参数
# 大多数隐藏模块不会去清洗内核环形缓冲区
# ---------------------------------------------------------
echo "[*] 正在从 dmesg 提取原始内核启动参数..."
# 匹配主流内核的 command line 打印格式
RAW_CMDLINE=$(dmesg | grep -m 1 -iE "Kernel command line:|Command line:" | cut -d ':' -f 2-)

# 如果 dmesg 因为设备运行时间过长被覆盖，尝试读取 Android 12+ 的 bootconfig
if [ -z "$RAW_CMDLINE" ] && [ -f "/proc/bootconfig" ]; then
    echo "[-] dmesg 早期日志已丢失，尝试读取 /proc/bootconfig..."
    RAW_CMDLINE=$(cat /proc/bootconfig)
fi

# ---------------------------------------------------------
# 3. 解析底层参数
# ---------------------------------------------------------
if [ -n "$RAW_CMDLINE" ]; then
    # 判断解锁特征 (orange/yellow 状态或 locked=0)
    if echo "$RAW_CMDLINE" | grep -qE "androidboot.verifiedbootstate[\=\ \"]*(orange|yellow)|androidboot.flash.locked[\=\ \"]*0"; then
        BL_STATE="UNLOCKED"
    # 判断上锁特征 (green 状态或 locked=1)
    elif echo "$RAW_CMDLINE" | grep -qE "androidboot.verifiedbootstate[\=\ \"]*green|androidboot.flash.locked[\=\ \"]*1"; then
        BL_STATE="LOCKED"
    fi
else
    echo "[-] 无法获取底层启动参数。"
fi

# ---------------------------------------------------------
# 4. 交叉对比与最终判定
# ---------------------------------------------------------
echo ""
echo "================ 最终诊断 ================"

if [ "$BL_STATE" = "UNLOCKED" ]; then
    echo ">>> 真实状态: Bootloader 已解锁 (UNLOCKED) <<<"
    
elif [ "$BL_STATE" = "LOCKED" ]; then
    if [ "$IS_SPOOFED" -eq 1 ]; then
        echo ">>> 逻辑推断: Bootloader 已解锁 (UNLOCKED) <<<"
        echo "说明: 底层参数显示为 locked，但检测到了环境劫持行为。"
        echo "      在未解锁的设备上没有任何理由去劫持 cmdline。"
        echo "      因此判定当前系统已被深度 Root 并伪装了锁定状态。"
    else
        echo ">>> 真实状态: Bootloader 未解锁 (LOCKED) <<<"
    fi
else
    # 兜底方案：读取底层设备树 (如果厂商没用标准的 cmdline)
    DT_STATE=$(cat /sys/firmware/devicetree/base/firmware/android/vbmeta/device_state 2>/dev/null | tr -d '\0')
    if [ "$DT_STATE" = "unlocked" ]; then
        echo ">>> 真实状态: Bootloader 已解锁 (UNLOCKED) [来自 Device Tree] <<<"
    else
        echo ">>> 状态未知 <<<"
        echo "说明: 无法提取标准 AVB 状态，可能是非标准内核或极深度的内核级(eBPF/Kprobe)拦截。"
    fi
fi
echo "=========================================="
