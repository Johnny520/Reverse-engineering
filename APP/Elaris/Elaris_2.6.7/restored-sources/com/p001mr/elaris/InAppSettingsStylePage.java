package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsStylePage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsStylePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addStyle(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.themeCard());
        linearLayout.addView(inAppSettings.card("界面显示与净化", new View[]{inAppSettings.switchRow(Prefs.KEY_DEFAULT_BUBBLE, "默认聊天气泡", "发送和显示消息时使用 QQ 默认气泡"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_DEFAULT_FONT, "默认聊天字体", "屏蔽魔法字体、个性字体等消息字体效果"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES, "表情面板净化", "隐藏热门、DIY、AI、魔法、QQ 秀等表情面板入口"), inAppSettings.divider(), InAppSettingsInputBarPage.createSwitchRow(inAppSettings), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_HOME_PULL_GUARD, "屏蔽下拉小程序", "移除消息页下拉小程序入口，保留正常下拉搜索"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_BLOCK_ANNOYING_POPUPS, "弹窗净化", "拦截打开其他应用确认、QQ 更新和广告横幅")}));
    }
}
