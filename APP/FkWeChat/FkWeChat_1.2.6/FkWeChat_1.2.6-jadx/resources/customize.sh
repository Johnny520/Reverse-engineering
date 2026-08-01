#!/system/bin/sh
SKIPUNZIP=1

DATAPATH="/data/adb/fkwechat"
ARCH=$(getprop ro.product.cpu.abi)
case $ARCH in
  arm64-v8a|armeabi-v7a|x86_64|x86) ABI=$ARCH ;;
  *) abort "Unsupported arch: $ARCH" ;;
esac

ui_print "- Arch: $ARCH ($ABI)"

unzip -o "$ZIPFILE" module.prop customize.sh -d "$MODPATH" >&2
mkdir -p "$MODPATH/zygisk"
if unzip -o "$ZIPFILE" "zygisk/$ABI.so" -d "$TMPDIR" >&2; then
  mv "$TMPDIR/zygisk/$ABI.so" "$MODPATH/zygisk/$ABI.so"
else
  ui_print "! No zygisk/$ABI.so found"
fi

if unzip -o "$ZIPFILE" "webroot/*" -d "$MODPATH" >&2; then
  ui_print "- Webroot extracted to $MODPATH/webroot"
  ui_print "- Setting correct permissions for WebUI..."
  chmod -R 755 "$MODPATH/webroot"
  find "$MODPATH/webroot" -type f -exec chmod 644 {} +
else
  ui_print "! No webroot/ found in module zip"
fi

rm -rf "$DATAPATH/apk"
mkdir -p "$DATAPATH/apk"
cp "$ZIPFILE" "$DATAPATH/apk/base.apk"
chcon -R u:object_r:system_file:s0 "$DATAPATH" 2>/dev/null

APK_SIZE=$(stat -c %s "$DATAPATH/apk/base.apk" 2>/dev/null)
DEX_COUNT=$(unzip -l "$DATAPATH/apk/base.apk" 2>/dev/null | grep -c 'classes.*\.dex')
LIB_COUNT=$(unzip -l "$DATAPATH/apk/base.apk" 2>/dev/null | grep -c "lib/$ABI/.*\.so")

ui_print "- APK size: ${APK_SIZE:-?} bytes"
ui_print "- DEX count: $DEX_COUNT"
ui_print "- Native libs: $LIB_COUNT"
ui_print "- FkWeChat install complete"