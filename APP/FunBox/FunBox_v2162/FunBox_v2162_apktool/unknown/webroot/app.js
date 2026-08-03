import { exec, toast } from "./kernelsu.js";

const DATA_DIRECTORY = "/data/adb/funbox";
const scopes = {
    qq: { label: "QQ", marker: "enableqq", packages: ["com.tencent.mobileqq"] },
    wx: { label: "微信", marker: "enablewx", packages: ["com.tencent.mm"] },
    tim: { label: "TIM", marker: "enabletim", packages: ["com.tencent.tim"] },
    dy: {
        label: "抖音",
        marker: "enabledy",
        packages: ["com.ss.android.ugc.aweme", "com.ss.android.ugc.aweme.mobile"],
    },
};

const scopeList = document.querySelector("#scope-list");
const scopeCount = document.querySelector("#scope-count");
const errorPanel = document.querySelector("#error-panel");
const errorMessage = document.querySelector("#error-message");
const retryButton = document.querySelector("#retry-button");
const liveStatus = document.querySelector("#live-status");
const userTabs = document.querySelector("#user-tabs");

// 主用户沿用旧的标记路径, 其余用户放在 user_<id> 子目录, 与 zygiskLoader 保持一致
const DEFAULT_USER = { id: 0, name: "主用户" };
let users = [DEFAULT_USER];
let currentUserId = 0;
// userId -> Set(已安装包名), 缺省(null)表示无法确定, 此时不置灰
const installedCache = new Map();

function getItem(scopeName) {
    return document.querySelector(`[data-scope="${scopeName}"]`);
}

function getInput(scopeName) {
    return getItem(scopeName).querySelector("input");
}

function getNote(scopeName) {
    return getItem(scopeName).querySelector(".scope-note");
}

function getMarkerPath(userId, marker) {
    return userId === 0
        ? `${DATA_DIRECTORY}/${marker}`
        : `${DATA_DIRECTORY}/user_${userId}/${marker}`;
}

function isScopeAvailable(scopeName, userId) {
    const installed = installedCache.get(userId);
    if (!installed) {
        return true;
    }
    return scopes[scopeName].packages.some((packageName) => installed.has(packageName));
}

function setInputsDisabled(disabled) {
    Object.keys(scopes).forEach((scopeName) => {
        getInput(scopeName).disabled = disabled || !isScopeAvailable(scopeName, currentUserId);
    });
}

function setTabsDisabled(disabled) {
    userTabs.querySelectorAll("button").forEach((button) => {
        button.disabled = disabled;
    });
}

function updateAvailability() {
    Object.keys(scopes).forEach((scopeName) => {
        const available = isScopeAvailable(scopeName, currentUserId);
        getItem(scopeName).classList.toggle("is-unavailable", !available);
        // 未安装时保留标记的真实状态, 只是不允许修改
        getNote(scopeName).hidden = available;
    });
}

function updateCount() {
    const enabledCount = Object.keys(scopes).filter((scopeName) => getInput(scopeName).checked).length;
    const availableCount = Object.keys(scopes).filter((scopeName) => isScopeAvailable(scopeName, currentUserId)).length;
    scopeCount.textContent = availableCount === Object.keys(scopes).length
        ? `已开启 ${enabledCount} 个`
        : `已开启 ${enabledCount} 个 · 可用 ${availableCount} 个`;
}

function showError(message) {
    errorMessage.textContent = message;
    errorPanel.hidden = false;
}

function hideError() {
    errorPanel.hidden = true;
}

function hasManager() {
    return window.ksu && typeof window.ksu.exec === "function";
}

/**
 * 解析 `pm list users` 的输出, 形如: UserInfo{0:Owner:c13} running
 */
function parseUsers(output) {
    const parsed = [];
    const pattern = /UserInfo\{(\d+):([^:}]*)/g;
    let match = pattern.exec(output);
    while (match !== null) {
        const id = Number.parseInt(match[1], 10);
        if (!Number.isNaN(id) && !parsed.some((user) => user.id === id)) {
            const name = match[2].trim();
            parsed.push({ id, name: name || `用户 ${id}` });
        }
        match = pattern.exec(output);
    }
    parsed.sort((left, right) => left.id - right.id);
    return parsed;
}

async function loadUsers() {
    try {
        const result = await exec("pm list users 2>/dev/null");
        const parsed = result.errno === 0 ? parseUsers(result.stdout || "") : [];
        users = parsed.length > 0 ? parsed : [DEFAULT_USER];
    } catch (error) {
        console.error("Failed to list users", error);
        users = [DEFAULT_USER];
    }

    if (!users.some((user) => user.id === currentUserId)) {
        currentUserId = users[0].id;
    }
    renderUserTabs();
}

function renderUserTabs() {
    userTabs.textContent = "";
    // 只有一个用户时保持原来的界面, 不显示 tab
    if (users.length <= 1) {
        userTabs.hidden = true;
        return;
    }

    users.forEach((user) => {
        const tab = document.createElement("button");
        tab.type = "button";
        tab.className = "user-tab";
        tab.dataset.userId = String(user.id);
        tab.textContent = user.name;
        tab.title = `${user.name} (ID ${user.id})`;
        tab.setAttribute("role", "tab");
        tab.setAttribute("aria-selected", user.id === currentUserId ? "true" : "false");
        tab.addEventListener("click", () => switchUser(user.id));
        userTabs.append(tab);
    });
    userTabs.hidden = false;
}

function updateTabSelection() {
    userTabs.querySelectorAll("button").forEach((tab) => {
        tab.setAttribute("aria-selected", Number(tab.dataset.userId) === currentUserId ? "true" : "false");
    });
}

async function switchUser(userId) {
    if (userId === currentUserId) {
        return;
    }
    currentUserId = userId;
    updateTabSelection();
    await loadStates();
}

/**
 * 读取指定用户已安装的包名, 无法确定时返回 null(此时不置灰任何应用)
 */
async function loadInstalledPackages(userId) {
    if (installedCache.has(userId)) {
        return installedCache.get(userId);
    }

    let installed = null;
    try {
        const result = await exec(`pm list packages --user ${userId} 2>/dev/null`);
        if (result.errno === 0 && result.stdout && result.stdout.includes("package:")) {
            installed = new Set();
            result.stdout.split("\n").forEach((line) => {
                const match = line.trim().match(/^package:(\S+)/);
                if (match) {
                    installed.add(match[1]);
                }
            });
        }
    } catch (error) {
        console.error(`Failed to list packages for user ${userId}`, error);
    }

    installedCache.set(userId, installed);
    return installed;
}

async function loadStates() {
    hideError();
    setInputsDisabled(true);
    setTabsDisabled(true);
    scopeList.setAttribute("aria-busy", "true");
    scopeCount.textContent = "正在读取";

    if (!hasManager()) {
        showError("请在支持模块 WebUI 的管理器中打开此页面");
        scopeCount.textContent = "不可用";
        scopeList.setAttribute("aria-busy", "false");
        return;
    }

    const userId = currentUserId;
    const checks = Object.values(scopes)
        .map(({ marker }) => `[ -f '${getMarkerPath(userId, marker)}' ] && printf '1\\n' || printf '0\\n'`)
        .join("; ");

    try {
        await loadInstalledPackages(userId);
        const result = await exec(checks);
        const states = result.stdout.trim().split(/\s+/);
        if (result.errno !== 0 || states.length !== Object.keys(scopes).length) {
            throw new Error(result.stderr || "状态数据不完整");
        }
        // 期间可能已经切到别的用户, 丢弃过期结果
        if (userId !== currentUserId) {
            return;
        }

        Object.keys(scopes).forEach((scopeName, index) => {
            getInput(scopeName).checked = states[index] === "1";
        });
        updateAvailability();
        setInputsDisabled(false);
        updateCount();
    } catch (error) {
        console.error("Failed to load FunBox scopes", error);
        if (userId !== currentUserId) {
            return;
        }
        showError("读取作用域失败，请稍后重试");
        scopeCount.textContent = "读取失败";
    } finally {
        if (userId === currentUserId) {
            setTabsDisabled(false);
            scopeList.setAttribute("aria-busy", "false");
        }
    }
}

async function changeScope(scopeName, enabled) {
    const input = getInput(scopeName);
    const scope = scopes[scopeName];
    const userId = currentUserId;
    input.disabled = true;
    hideError();

    const markerPath = getMarkerPath(userId, scope.marker);
    const markerDirectory = markerPath.slice(0, markerPath.lastIndexOf("/"));
    const command = enabled
        ? `mkdir -p '${markerDirectory}' && touch '${markerPath}'`
        : `rm -f '${markerPath}'`;

    try {
        const result = await exec(command);
        if (result.errno !== 0) {
            throw new Error(result.stderr || `命令退出码 ${result.errno}`);
        }

        updateCount();
        const stateText = enabled ? "已开启" : "已关闭";
        const userText = users.length > 1 ? `[${getUserName(userId)}] ` : "";
        const message = `${userText}${scope.label} ${stateText}`;
        liveStatus.textContent = message;
        toast(message);
    } catch (error) {
        console.error(`Failed to update ${scopeName} scope`, error);
        if (userId === currentUserId) {
            input.checked = !enabled;
            updateCount();
        }
        showError(`${scope.label} 作用域修改失败`);
        toast("作用域修改失败");
    } finally {
        if (userId === currentUserId) {
            input.disabled = !isScopeAvailable(scopeName, currentUserId);
        }
    }
}

function getUserName(userId) {
    const user = users.find((item) => item.id === userId);
    return user ? user.name : `用户 ${userId}`;
}

Object.keys(scopes).forEach((scopeName) => {
    getInput(scopeName).addEventListener("change", (event) => {
        changeScope(scopeName, event.currentTarget.checked);
    });
});

document.querySelectorAll(".app-icon img").forEach((image) => {
    const hideBrokenImage = () => {
        image.hidden = true;
    };

    if (image.complete && image.naturalWidth === 0) {
        hideBrokenImage();
    } else {
        image.addEventListener("error", hideBrokenImage, { once: true });
    }
});

async function reload() {
    if (!hasManager()) {
        await loadStates();
        return;
    }
    installedCache.clear();
    await loadUsers();
    await loadStates();
}

retryButton.addEventListener("click", reload);
reload();
