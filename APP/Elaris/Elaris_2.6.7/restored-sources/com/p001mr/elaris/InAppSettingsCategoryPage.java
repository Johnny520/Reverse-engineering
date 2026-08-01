package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsCategoryPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsCategoryPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addGroupFile(InAppSettings inAppSettings, LinearLayout linearLayout) {
        InAppSettingsGroupPage.addGroupFile(inAppSettings, linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addMisc(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("扫码与网页", new View[]{inAppSettings.switchRow(Prefs.KEY_QR_GALLERY_GATE, "跳过相册扫码校验", "扫描相册二维码时，跳过 QQ 本地识别校验提示"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_QR_CONFIRM_FAST, "跳过扫码等待", "扫码授权页与 OpenSDK 倒计时弹窗尽量快速进入可确认状态"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_EXTERNAL_BROWSER, "外部打开链接", "拦截 QQ 内置网页跳转，尽量交给系统浏览器"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_UNBLOCK_RISK_WEB, "风险链接直开", "识别 QQ 安全中转页，尽量还原原始链接"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_WEB_KERNEL_FALLBACK, "使用系统 WebView", "让内置网页优先使用系统 WebView"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_BLOCK_HOST_HOT_UPDATE, "屏蔽 QQ 热更新/热补丁", "拦截 Tinker/QFix 等热补丁加载；排查收消息或网页异常时建议先关闭")}));
        InAppSettingsAdvancedPage.addAdvanced(inAppSettings, linearLayout);
    }
}
