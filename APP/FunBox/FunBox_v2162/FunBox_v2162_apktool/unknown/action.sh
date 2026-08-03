#!/system/bin/sh

KEY_CHECK="/data/adb/modules/funbox/keycheck" # 路径
QQ_FILE="/data/adb/funbox/enableqq" # QQ
WX_FILE="/data/adb/funbox/enablewx" # 微信
TIM_FILE="/data/adb/funbox/enabletim" # TIM
DY_FILE="/data/adb/funbox/enabledy" # 抖音

# 按键信号
VOL_UP_SIGNAL=42 # 音量上键
VOL_DOWN_SIGNAL=41 # 音量下键

# 检测按键工具
[ -x "$KEY_CHECK" ] || {
    if [ -e "$KEY_CHECK" ]; then
        echo "出错: keycheck工具没有执行权限"
    else
        echo "出错: 未找到keycheck工具"
    fi
    exit 1
}

# 辅助函数
get_state() {
    [ -f "$1" ] && echo "$2" || echo "$3"
}

toggle_file() {
    [ -f "$1" ] && rm "$1" || touch "$1"
}

print_item() {
    local idx="$1"
    local sel="$2"
    local label="$3"
    local file="$4"
    local state
    state="$(get_state "$file" "开启" "关闭")"
    if [ "$idx" -eq "$sel" ]; then
        echo "-> ${label} (${state})"
    else
        echo "   ${label} (${state})"
    fi
}

# 绘制菜单
draw_menu() {
    local sel="$1"
    clear
    echo "***************************************"
    echo "使用 音量下键 移动, 音量上键 切换开关"
    echo "***************************************"
    echo ""

    print_item 1 "$sel" "QQ" "$QQ_FILE"
    print_item 2 "$sel" "微信" "$WX_FILE"
    print_item 3 "$sel" "TIM" "$TIM_FILE"
    print_item 4 "$sel" "抖音" "$DY_FILE"
    if [ 5 -eq "$sel" ]; then
        echo "-> 退出"
    else
        echo "   退出"
    fi

    echo ""
    echo "***************************************"
}

# 检测按键
get_single_key() {
    local key
    "$KEY_CHECK" >/dev/null 2>&1
    key=$?
    case "$key" in
        "$VOL_DOWN_SIGNAL") echo "move" ;; # 下键移动
        "$VOL_UP_SIGNAL") echo "confirm" ;; # 上键确认
        *) echo "error:$key" ;;
    esac
}

# 菜单逻辑
main_menu() {
    local selection=1
    local action
    while true; do
        draw_menu "$selection"
        # 等待上一次按键抬起，避免同一次点击的按下/抬起事件被处理两次
        sleep 0.4
        action="$(get_single_key)"
        case "$action" in
            move) # 下键移动
                selection=$((selection + 1))
                if [ "$selection" -gt 5 ]; then
                    selection=1
                fi
                ;;
            confirm) # 上键确认
                case "$selection" in
                    1) toggle_file "$QQ_FILE" ;;
                    2) toggle_file "$WX_FILE" ;;
                    3) toggle_file "$TIM_FILE" ;;
                    4) toggle_file "$DY_FILE" ;;
                    5) exit 0 ;;
                esac
                ;;
            error:*)
                clear
                echo "出错: 按键监听失败（退出码 ${action#error:}）"
                echo "请重新安装模块，或检查keycheck是否有权限访问/dev/input"
                exit 1
                ;;
        esac
    done
}

# 启动菜单
main_menu
