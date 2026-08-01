import { createApp, ref, reactive, onMounted, watch } from "../libs/vue.esm-browser.js";

import { 
    getWeChatPid, 
    getWeChatVersion, 
    getModuleVersion, 
    getSystemAbi, 
    getAndroidSdk, 
    checkApkStatus, 
    readConfig, 
    writeConfig, 
    forceStopWeChat, 
    rebuildSandbox,
    showToast
} from "../utils/helper.js";

createApp({
    setup() {
        const activeTab = ref("home");
        const isDark = ref(window.matchMedia('(prefers-color-scheme: dark)').matches);
        
        // 滑动切换相关
        const tabs = ['home', 'settings'];
        const swiperOffset = ref(0);
        let swiperEl = null;
        let touchStartX = 0;
        let touchStartY = 0;
        let touchStartOffset = 0;
        let isHorizontalSwipe = null;
        let isSwiping = false;

        const getContainerWidth = () => {
            return window.innerWidth || document.documentElement.clientWidth;
        };

        const setTransform = (offset, animate) => {
            if (!swiperEl) return;
            swiperEl.style.transition = animate ? 'transform 0.3s ease' : 'none';
            swiperEl.style.transform = 'translateX(' + offset + 'px)';
        };

        const updateSwiperOffset = (tab, animate = true) => {
            const index = tabs.indexOf(tab);
            const offset = -index * getContainerWidth();
            swiperOffset.value = offset;
            setTransform(offset, animate);
        };

        const onTouchStart = (e) => {
            if (!swiperEl) swiperEl = document.querySelector('.swiper-wrapper');
            const touch = e.touches ? e.touches[0] : e;
            touchStartX = touch.clientX;
            touchStartY = touch.clientY;
            touchStartOffset = swiperOffset.value;
            isSwiping = true;
            isHorizontalSwipe = null;
        };

        const onTouchMove = (e) => {
            if (!isSwiping) return;
            const touch = e.touches ? e.touches[0] : e;
            const dx = touch.clientX - touchStartX;
            const dy = touch.clientY - touchStartY;

            if (isHorizontalSwipe === null) {
                if (Math.abs(dx) > 5 || Math.abs(dy) > 5) {
                    isHorizontalSwipe = Math.abs(dx) > Math.abs(dy);
                }
                return;
            }

            if (!isHorizontalSwipe) return;

            e.preventDefault();
            const containerWidth = getContainerWidth();
            let newOffset = touchStartOffset + dx;

            // 边界阻尼
            if (newOffset > 0) {
                newOffset = newOffset * 0.3;
            } else if (newOffset < -(tabs.length - 1) * containerWidth) {
                newOffset = -(tabs.length - 1) * containerWidth + (newOffset + (tabs.length - 1) * containerWidth) * 0.3;
            }
            // 直接操作 DOM，不走 Vue 响应式，避免卡顿
            setTransform(newOffset, false);
        };

        const onTouchEnd = (e) => {
            if (!isSwiping) return;
            isSwiping = false;

            if (!isHorizontalSwipe) {
                setTransform(touchStartOffset, false);
                return;
            }

            const touch = e.changedTouches ? e.changedTouches[0] : e;
            const dx = touch.clientX - touchStartX;
            const containerWidth = getContainerWidth();
            const threshold = containerWidth * 0.2;
            const currentIndex = tabs.indexOf(activeTab.value);

            if (dx < -threshold && currentIndex < tabs.length - 1) {
                activeTab.value = tabs[currentIndex + 1];
            } else if (dx > threshold && currentIndex > 0) {
                activeTab.value = tabs[currentIndex - 1];
            }
            updateSwiperOffset(activeTab.value, true);
        };

        // 监听 touchmove（在 onMounted 中注册）
         
        const wechat = reactive({
            pid: "--",
            version: "--",
            status: "inactive",
            statusText: "未运行"
        });

        const moduleState = reactive({
            version: "v1.2.6",
            abi: "--",
            sdk: "--",
            apkStatus: "就绪 ✓",
            apkColor: "var(--mdui-color-success)"
        });

        const config = reactive({
            wechat_enabled: true,
            clone_enabled: true,
            debug_mode: false
        });

        const updateTheme = () => {
            const isDarkMode = isDark.value;
            const themeClass = isDarkMode ? "mdui-theme-dark" : "mdui-theme-light";

            // 临时禁用所有过渡动画，确保切换瞬间完成，不会出现分步变色
            const style = document.createElement('style');
            style.id = 'theme-switch-no-transition';
            style.textContent = '*, *::before, *::after { transition: none !important; }';
            document.head.appendChild(style);

            // 强制重排，让上面的禁用规则立即生效
            document.documentElement.offsetHeight;

            // 设置颜色 token
            mdui.setColorScheme('#6750A4', {
                target: document.documentElement,
                theme: isDarkMode ? 'dark' : 'light'
            });

            document.documentElement.className = themeClass;
            document.body.className = themeClass;

            const metaColorScheme = document.querySelector('meta[name="color-scheme"]');
            if (metaColorScheme) {
                metaColorScheme.setAttribute('content', isDarkMode ? 'dark' : 'light');
            }
            document.documentElement.style.colorScheme = isDarkMode ? 'dark' : 'light';

            // 更新 theme-color meta 标签，控制状态栏颜色
            const statusBarColor = isDarkMode ? '#1C1B1F' : '#F4F3F7';
            const metaTheme = document.getElementById('meta-theme-color');
            if (metaTheme) metaTheme.setAttribute('content', statusBarColor);

            // 下一帧恢复过渡动画
            requestAnimationFrame(() => {
                requestAnimationFrame(() => {
                    const noTransition = document.getElementById('theme-switch-no-transition');
                    if (noTransition) noTransition.remove();
                });
            });
        };

        const toggleTheme = () => {
            isDark.value = !isDark.value;
            updateTheme();
        };

        const checkWeChatStatus = async () => {
            try {
                const pid = await getWeChatPid();
                wechat.pid = pid;
                wechat.status = pid !== "--" ? "active" : "inactive";
                wechat.statusText = pid !== "--" ? "运行中" : "未运行";

                wechat.version = await getWeChatVersion();
                moduleState.version = await getModuleVersion();
                moduleState.abi = await getSystemAbi();
                moduleState.sdk = await getAndroidSdk();
                
                const apk = await checkApkStatus();
                moduleState.apkStatus = apk.status;
                moduleState.apkColor = apk.color;
            } catch (e) {
                console.error("状态更新失败:", e);
            }
        };

        const loadConfig = async () => {
            try {
                const parsed = await readConfig();
                if (parsed) {
                    config.wechat_enabled = parsed.wechat_enabled ?? true;
                    config.clone_enabled = parsed.clone_enabled ?? true;
                    config.debug_mode = parsed.debug_mode ?? false;
                } else {
                    await saveConfig();
                }
            } catch (e) {
                console.error("加载配置失败:", e);
            }
        };

        const saveConfig = async () => {
            await writeConfig(config);
        };

        const onConfigChange = async (key, event) => {
            config[key] = event.target.checked;
            await saveConfig();
        };

        const killWeChat = async () => {
            await forceStopWeChat();
            setTimeout(async () => {
                await checkWeChatStatus();
                showToast("微信已停止");
            }, 1000);
        };

        const redeploySandbox = async () => {
            await rebuildSandbox(config);
            showToast("沙盒清空完成");
            await checkWeChatStatus();
        };

        onMounted(async () => {
            // 提前获取 swiper DOM 元素
            swiperEl = document.querySelector('.swiper-wrapper');

            // 注册滑动事件
            document.addEventListener('touchmove', onTouchMove, { passive: false });
            document.addEventListener('touchend', onTouchEnd);
            document.addEventListener('mouseup', onTouchEnd);
            updateSwiperOffset(activeTab.value);

            // 监听窗口大小变化
            window.addEventListener('resize', () => updateSwiperOffset(activeTab.value));

            updateTheme();
            await checkWeChatStatus();
            await loadConfig();
            setInterval(checkWeChatStatus, 2500);
        });

        // 导航栏点击时同步 swiper 位置
        watch(activeTab, (newTab) => {
            updateSwiperOffset(newTab);
        });

        return {
            activeTab,
            isDark,
            wechat,
            moduleState,
            config,
            toggleTheme,
            onConfigChange,
            killWeChat,
            redeploySandbox,
            onTouchStart
        };
    }
}).mount("#app");