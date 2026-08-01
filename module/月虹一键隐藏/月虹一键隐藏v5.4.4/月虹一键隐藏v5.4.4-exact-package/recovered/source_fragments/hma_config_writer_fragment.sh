
CONFIG_FILE="$CONFIG_DIR/config.json"

# 兼容不同 mount namespace
if [ -d "/proc/1/root$CONFIG_DIR" ]; then
    CONFIG_DIR="/proc/1/root$CONFIG_DIR"
    CONFIG_FILE="$CONFIG_DIR/config.json"
fi

# 目录必须存在
if [ ! -d "$CONFIG_DIR" ]; then
    exit 2
fi

