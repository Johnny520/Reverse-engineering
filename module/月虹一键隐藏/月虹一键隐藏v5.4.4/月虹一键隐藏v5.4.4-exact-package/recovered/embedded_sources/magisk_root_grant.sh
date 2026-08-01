#!/system/bin/sh
ROOT_TYPE="$1"
ACTION="$2"
PKG_DATA="$3"
BASE="/data/adb/YH/YH_YC"
LOG="$BASE/log/magisk_su.log"
PKGS="/data/system/packages.list"
FIXED_WEBUI="io.github.a13e300.ksuwebui"
mkdir -p "$BASE/log"
log(){ echo "[MagiskSU] $*"; echo "[$(date '+%F %T')] $*" >> "$LOG"; }
log_file_only(){ echo "[$(date '+%F %T')] $*" >> "$LOG"; }

[ "$ROOT_TYPE" = "Magisk" ] || exit 0

MAGISK_BIN=""
for b in /data/adb/magisk/magisk /sbin/magisk /debug_ramdisk/magisk /system/bin/magisk; do
  [ -x "$b" ] && { MAGISK_BIN="$b"; break; }
done
[ -n "$MAGISK_BIN" ] || MAGISK_BIN=$(command -v magisk 2>/dev/null | head -n 1)
[ -n "$MAGISK_BIN" ] && [ -x "$MAGISK_BIN" ] || { log "❌ 未找到 magisk 命令，跳过 Root 授权"; exit 1; }
[ -f "$PKGS" ] || { log "❌ 未找到 $PKGS，跳过 Root 授权"; exit 1; }

uid_for_pkg(){
  awk -v p="$1" '$1 == p { print $2; exit }' "$PKGS" 2>/dev/null
}

grant_pkg(){
  pkg="$1"
  [ -n "$pkg" ] || return 0
  uid=$(uid_for_pkg "$pkg")
  case "$uid" in ''|*[!0-9]*) log "⚠️ 未找到 UID，跳过: $pkg"; return 1 ;; esac
  [ "$uid" -ge 10000 ] 2>/dev/null || { log "⚠️ 非普通应用 UID，跳过: $pkg uid=$uid"; return 1; }

  if "$MAGISK_BIN" --sqlite "REPLACE INTO policies (uid, policy, until, logging, notification) VALUES ($uid, 2, 0, 1, 1);" >/dev/null 2>&1; then
    log "✅ Root授权成功: $pkg uid=$uid"
  else
    log "❌ Root授权失败: $pkg uid=$uid"
    return 1
  fi
}

case "$ACTION" in
  grant-fixed)
    log "固定授权 WebUI: $FIXED_WEBUI"
    grant_pkg "$FIXED_WEBUI"
    ;;
  grant)
    grant_pkg "$PKG_DATA"
    ;;
  *)
    log "❌ 未知 MagiskSU 操作: $ACTION"
    exit 1
    ;;
esac
