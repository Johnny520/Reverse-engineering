package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsAdvancedPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsAdvancedPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addAdvanced(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("模块配置", new View[]{InAppSettingsConfigBackupPage.create(inAppSettings)}));
        linearLayout.addView(inAppSettings.card("调试", new View[]{inAppSettings.switchRow(Prefs.KEY_DEBUG_LOG, "调试日志", "默认关闭，排查问题时再打开详细日志")}));
        linearLayout.addView(inAppSettings.card("设备", new View[]{InAppSettingsDevicePage.createBody(inAppSettings)}));
    }
}
