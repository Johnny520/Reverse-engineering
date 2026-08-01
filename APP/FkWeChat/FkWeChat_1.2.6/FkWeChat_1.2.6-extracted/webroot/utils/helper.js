import { exec } from "../libs/kernelsu-index.js";

export const CONFIG_PATH = "/data/user/0/com.tencent.mm/FkWeChat/config.json";

export function showToast(msg) {
    if (typeof mdui !== "undefined" && typeof mdui.snackbar === "function") {
        mdui.snackbar({
            message: msg,
            placement: "bottom"
        });
    } else {
        console.log("Toast fallback:", msg);
    }
}

export async function runCmd(cmd) {
    try {
        return await exec(cmd);
    } catch (err) {
        return { errno: -1, stdout: "", stderr: err.toString() };
    }
}

export async function getWeChatPid() {
    const pidRes = await runCmd("pidof com.tencent.mm");
    if (pidRes.errno === 0 && pidRes.stdout.trim() !== "") {
        return pidRes.stdout.trim().split(" ")[0];
    }
    return "--";
}

export async function getWeChatVersion() {
    const verRes = await runCmd("dumpsys package com.tencent.mm | grep versionName");
    const codeRes = await runCmd("dumpsys package com.tencent.mm | grep versionCode");
    let name = "";
    let code = "";
    if (verRes.errno === 0 && verRes.stdout.trim() !== "") {
        const parts = verRes.stdout.trim().split("=");
        if (parts.length > 1) name = parts[1].split(" ")[0];
    }
    if (codeRes.errno === 0 && codeRes.stdout.trim() !== "") {
        const parts = codeRes.stdout.trim().split("=");
        if (parts.length > 1) code = parts[1].split(" ")[0];
    }
    if (name && code) return name + "(" + code + ")";
    if (name) return name;
    return "--";
}

export async function getModuleVersion() {
    const modVerRes = await runCmd("grep -E '^version=' /data/adb/modules/fkwechat/module.prop | cut -d= -f2");
    const modCodeRes = await runCmd("grep -E '^versionCode=' /data/adb/modules/fkwechat/module.prop | cut -d= -f2");
    let name = "";
    let code = "";
    if (modVerRes.errno === 0 && modVerRes.stdout.trim() !== "") {
        name = modVerRes.stdout.trim();
    }
    if (modCodeRes.errno === 0 && modCodeRes.stdout.trim() !== "") {
        code = modCodeRes.stdout.trim();
    }
    if (name && code) return name + "(" + code + ")";
    if (name) return name;
    return "--";
}

export async function getSystemAbi() {
    const abiRes = await runCmd("getprop ro.product.cpu.abi");
    if (abiRes.errno === 0 && abiRes.stdout.trim() !== "") {
        return abiRes.stdout.trim();
    }
    return "--";
}

export async function getAndroidSdk() {
    const sdkRes = await runCmd("getprop ro.build.version.sdk");
    if (sdkRes.errno === 0 && sdkRes.stdout.trim() !== "") {
        return sdkRes.stdout.trim();
    }
    return "--";
}

export async function checkApkStatus() {
    const apkCheck = await runCmd("[ -f /data/user/0/com.tencent.mm/FkWeChat/apk/base.apk ] && echo 'ok' || echo 'no'");
    if (apkCheck.stdout.trim() === "ok") {
        return { status: "就绪 ✓", color: "var(--mdui-color-success)" };
    } else {
        return { status: "缺失 x", color: "var(--mdui-color-error)" };
    }
}

export async function readConfig() {
    const catRes = await runCmd(`cat ${CONFIG_PATH}`);
    if (catRes.errno === 0 && catRes.stdout.trim() !== "") {
        try {
            return JSON.parse(catRes.stdout.trim());
        } catch (e) {
            return null;
        }
    }
    return null;
}

export async function writeConfig(config) {
    const jsonStr = JSON.stringify(config);
    const cmd = `for d in /data/user/*/com.tencent.mm; do ` +
                `  if [ -d "$d" ]; then ` +
                `    mkdir -p "$d/FkWeChat" && ` +
                `    echo '${jsonStr}' > "$d/FkWeChat/config.json" && ` +
                `    chown -R $(stat -c %u "$d"):$(stat -c %g "$d") "$d/FkWeChat" && ` +
                `    restorecon -R "$d/FkWeChat" && ` +
                `    chmod 0755 "$d/FkWeChat" && ` +
                `    chmod 0644 "$d/FkWeChat/config.json"; ` +
                `  fi; ` +
                `done`;
    await runCmd(cmd);
}

export async function forceStopWeChat() {
    showToast("正在强制停止微信...");
    await runCmd("am force-stop com.tencent.mm");
}

export async function rebuildSandbox(config) {
    showToast("正在清除沙盒缓存...");
    const jsonStr = JSON.stringify(config);
    const cmd = `for d in /data/user/*/com.tencent.mm; do ` +
                `  if [ -d "$d" ]; then ` +
                `    rm -rf "$d/FkWeChat" && ` +
                `    mkdir -p "$d/FkWeChat/apk" && ` +
                `    mkdir -p "$d/FkWeChat/lib" && ` +
                `    echo '${jsonStr}' > "$d/FkWeChat/config.json" && ` +
                `    chown -R $(stat -c %u "$d"):$(stat -c %g "$d") "$d/FkWeChat" && ` +
                `    restorecon -R "$d/FkWeChat" && ` +
                `    chmod -R 0755 "$d/FkWeChat" && ` +
                `    chmod 0644 "$d/FkWeChat/config.json"; ` +
                `  fi; ` +
                `done`;
    await runCmd(cmd);
}