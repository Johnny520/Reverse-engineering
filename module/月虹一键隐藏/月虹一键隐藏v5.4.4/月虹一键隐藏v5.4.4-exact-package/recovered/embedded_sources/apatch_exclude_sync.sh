#!/system/bin/sh
CFG="/data/adb/ap/package_config"
PKGS="/data/system/packages.list"
APD="/data/adb/apd"
[ -x "$APD" ] || APD="/data/adb/ap/bin/apd"
[ -f /data/adb/ap/APatch ] || exit 0
[ -f "$PKGS" ] || exit 0
mkdir -p /data/adb/ap
TMP="${CFG}.tmp.yhyc"
ALLOW="/data/adb/YH/YH_YC/tmp/apatch_allow_uid.tmp"
: > "$ALLOW"
echo 'pkg,exclude,allow,uid,to_uid,sctx' > "$TMP"

# 固定跳过 APatch / FolkPatch 管理器，避免管理器自身被写入排除修改。
for p in me.bmax.apatch me.yuki.folk; do
  u=$(awk -v p="$p" '$1==p {print $2; exit}' "$PKGS" 2>/dev/null)
  [ -n "$u" ] && echo "$u" >> "$ALLOW"
done

# 保留 APatch 已授权 Root 的应用；同时按当前 packages.list 修正 UID。
awk -F, -v pkgs="$PKGS" -v allow="$ALLOW" '
BEGIN {
  while ((getline l < pkgs) > 0) { split(l,a," "); uid[a[1]]=a[2]; }
}
NR>1 && $3==1 && ($1 in uid) {
  s=$6; if (s=="") s="u:r:magisk:s0";
  print $1",0,1,"uid[$1]","$5","s;
  print uid[$1] >> allow;
}' "$CFG" 2>/dev/null >> "$TMP"

# 其他普通应用全部写入 exclude=1, allow=0。
awk 'NR==FNR { allow[$1]=1; next } $2>=10000 && !allow[$2] { print $1",1,0,"$2",0,u:r:magisk:s0" }' "$ALLOW" "$PKGS" >> "$TMP"

CHANGED=1
cmp -s "$CFG" "$TMP" 2>/dev/null && CHANGED=0
if [ "$CHANGED" = 1 ]; then
  mv -f "$TMP" "$CFG" || exit 0
  chmod 0644 "$CFG" 2>/dev/null
  chown root:root "$CFG" 2>/dev/null
else
  rm -f "$TMP"
fi

# APatch package_config 方案不在模块内强制重启 uid-listener。
# 部分设备在模块启用/开机阶段重启 APatch 监听进程会触发系统重启；这里只同步配置，避免主动拉起/杀死 apd。
if [ "$3" != "supercall" ] && { [ "$CHANGED" = 1 ] || [ "$1" = "force" ]; }; then
  echo "APatch package_config 已同步；为降低重启风险，本模块不强制重启 uid-listener" >/dev/null 2>&1
fi
exit 0
