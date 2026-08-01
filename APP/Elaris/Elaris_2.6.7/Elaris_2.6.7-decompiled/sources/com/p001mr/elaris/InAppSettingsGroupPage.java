package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsGroupPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsGroupPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addGroupFile(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("文件与群管", new View[]{inAppSettings.switchRow(Prefs.KEY_RENAME_APK_FILE, "文件名修复", "发送文件时修复不规范文件名，保证接收方正常下载"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU, "群管菜单", "长按成员头像显示头衔、禁言、踢出和撤回等入口"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_NOTICE_BLOCK_AT_ALL, "屏蔽 @全体", "拦截 QQ 正常运行时的 @全体成员通知"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO, "屏蔽群待办", "拦截 QQ 正常运行时的群待办通知"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT, "群文件排版", "实验版，将群文件入口切回旧排版"), inAppSettings.divider(), InAppSettingsDownloadDirectPage.create(inAppSettings)}));
        linearLayout.addView(inAppSettings.card("群打卡", new View[]{inAppSettings.clockInCard()}));
    }
}
