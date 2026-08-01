package com.p001mr.elaris;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsHomeModules {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsHomeModules() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(final InAppSettings inAppSettings) {
        return inAppSettings.moduleListCard(new View[]{inAppSettings.moduleRow("群聊", "文件保存、群管、群通知与打卡", 0, inAppSettings.accentOf("groupfile"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openGroupFeatures(view);
            }
        }), inAppSettings.moduleRow("消息", "未读数量、消息时间、撤回与回复手势", 1, inAppSettings.accentOf("chat_message"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openMessageFeatures(view);
            }
        }), inAppSettings.moduleRow("复读", "复读方式、按钮显示与自定义图标", 2, inAppSettings.accentOf("repeater"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openRepeaterFeatures(view);
            }
        }), inAppSettings.moduleRow("图片", "原图、闪照、表情与图片外显", 3, inAppSettings.accentOf("picture"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openPictureFeatures(view);
            }
        }), inAppSettings.moduleRow("净化", "主题、界面、资料卡、QQ 秀与头像挂件", 4, inAppSettings.accentOf("cleanse"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openCleanseFeatures(view);
            }
        }), inAppSettings.moduleRow("杂项", "扫码、网页、调试、设备与模块配置", 5, inAppSettings.accentOf("misc"), new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsHomeModules.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.openMiscFeatures(view);
            }
        })});
    }
}
