# Nuke 批量注册/同步脚本说明

已生成：

- `nuke_bulk_register.py`
- `nuke_bulk_users_template.csv`
- `nuke_crypto_helper_stub.py`

## 目标接口

```text
POST https://www.guang233.com/api/client/report
```

该接口会把 `user_id + platform + environment` 同步到后端。APK 里没有普通明文注册接口；这个接口要求：

1. 请求体必须是 `EncryptedPayload(v,kid,iv,payload,tag)`；
2. `/api/client/*` 请求必须带 `X-Signature`；
3. 加密和签名都由 Android NativeCrypto 完成。

## CSV 格式

最少两列：

```csv
user_id,platform
10001,WECHAT
10002,QQ
```

`platform` 只能是：`WECHAT` / `QQ` / `TIKTOK`。

模板在：`nuke_bulk_users_template.csv`

## 运行方式

需要先准备一个 crypto helper：

```powershell
python nuke_bulk_register.py `
  --csv nuke_bulk_users_template.csv `
  --helper-cmd "python my_real_crypto_helper.py" `
  --out nuke_bulk_register_result.csv `
  --workers 3
```

或者 helper 是 HTTP 服务：

```powershell
python nuke_bulk_register.py `
  --csv nuke_bulk_users_template.csv `
  --helper-url http://127.0.0.1:8787/nuke-crypto `
  --out nuke_bulk_register_result.csv
```

## helper 协议

脚本会给 helper 输入：

```json
{
  "stream":"nuke-client-stream-v3",
  "method":"POST",
  "path":"/api/client/report",
  "userId":"10001",
  "platform":"WECHAT",
  "timestamp":"1783460000",
  "nonce":"uuid",
  "plain":{"message":"Nuke 1.0.0 initialized","environment":{}}
}
```

helper 必须输出：

```json
{
  "body_json":"{\"v\":3,\"kid\":\"...\",\"iv\":\"...\",\"payload\":\"...\",\"tag\":\"...\"}",
  "signature":"..."
}
```

签名明文必须是：

```text
METHOD
PATH
userId
platform
timestamp
nonce
body_json
```

即：

```text
POST
/api/client/report
10001
WECHAT
1783460000
<uuid>
{"v":3,"kid":"...","iv":"...","payload":"...","tag":"..."}
```

## 为什么需要 helper

`libnuke_native.so` 是 Android arm64 ELF，Windows Python 不能直接 `ctypes.CDLL` 加载。需要在 Android/模拟器内用 JNI/Frida/临时 helper APK 调用：

- `NativeCrypto.INSTANCE.encryptJsonBytes(bytes, "nuke-client-stream-v3")`
- `NativeCrypto.INSTANCE.signClientPayload(signingPayload)`
