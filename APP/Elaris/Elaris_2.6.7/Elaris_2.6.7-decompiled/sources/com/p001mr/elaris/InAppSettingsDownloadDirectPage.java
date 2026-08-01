package com.p001mr.elaris;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsDownloadDirectPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsDownloadDirectPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(InAppSettings inAppSettings) {
        return inAppSettings.switchRow(Prefs.KEY_DOWNLOAD_DIRECT_WRITE, "下载文件重定向", "将 QQ 接收文件固定保存到 Download/QQ，避免落到 QQ 私有目录；重启 QQ 后生效");
    }
}
