SKIPUNZIP=1

unzip -o "$ZIPFILE" "module.prop" -d "$TMPDIR" >&2
FUNBOX_VERSION="$(grep '^version=' "$TMPDIR/module.prop" | cut -d= -f2- | tr -d '\r')"
FUNBOX_VERSION_CODE="$(grep '^versionCode=' "$TMPDIR/module.prop" | cut -d= -f2- | tr -d '\r')"

if [ -n "$FUNBOX_VERSION" ]; then
  if [ -n "$FUNBOX_VERSION_CODE" ]; then
    ui_print "正在安装FunBox ${FUNBOX_VERSION} (${FUNBOX_VERSION_CODE})"
  else
    ui_print "正在安装FunBox ${FUNBOX_VERSION}"
  fi
else
  ui_print "正在安装FunBox"
fi

unzip -o "$ZIPFILE" "zygisk/funloader.so" -d "$TMPDIR" >&2
unzip -o "$ZIPFILE" "action.sh" -d "$TMPDIR" >&2
unzip -o "$ZIPFILE" "webroot/*" -d "$MODPATH" >&2
unzip -o "$ZIPFILE" "keycheck" -d "$TMPDIR" >&2

DATAPATH="/data/adb/funbox"

mkdir -p "$MODPATH/zygisk"
cp "$TMPDIR/module.prop" "$MODPATH/module.prop"
cp "$TMPDIR/action.sh" "$MODPATH/action.sh"
cp "$TMPDIR/keycheck" "$MODPATH/keycheck"
cp "$TMPDIR/zygisk/funloader.so" "$MODPATH/zygisk/arm64-v8a.so"

mkdir -p "$DATAPATH"
cp "$ZIPFILE" "$DATAPATH/main.apk"

ui_print "FunBox安装完成"
ui_print "（提示：使用了Zygisk的FunBox后，请勿在其他框架如LSPosed中对QQ/微信/TIM/抖音开启任何模块，否则将可能因为冲突而闪退）"
set_perm_recursive "$MODPATH" 0 0 0755 0644
set_perm "$MODPATH/action.sh" 0 0 0755
set_perm "$MODPATH/keycheck" 0 0 0755
