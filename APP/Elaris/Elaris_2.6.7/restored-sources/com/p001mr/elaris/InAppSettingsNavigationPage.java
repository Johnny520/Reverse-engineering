package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsNavigationPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsNavigationPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View buildCategory(InAppSettings inAppSettings, String str) {
        inAppSettings.applyThemePalette();
        ScrollView scrollViewSecondaryScroll = inAppSettings.secondaryScroll();
        LinearLayout linearLayoutRootOf = inAppSettings.rootOf(scrollViewSecondaryScroll);
        linearLayoutRootOf.addView(inAppSettings.categoryHeader(str));
        if ("groupfile".equals(str)) {
            InAppSettingsCategoryPage.addGroupFile(inAppSettings, linearLayoutRootOf);
            return scrollViewSecondaryScroll;
        }
        if ("chat_message".equals(str)) {
            InAppSettingsChatPage.addChatMessage(inAppSettings, linearLayoutRootOf);
            return scrollViewSecondaryScroll;
        }
        if ("repeater".equals(str)) {
            InAppSettingsChatPage.addRepeater(inAppSettings, linearLayoutRootOf);
            return scrollViewSecondaryScroll;
        }
        if ("picture".equals(str)) {
            InAppSettingsChatPage.addPicture(inAppSettings, linearLayoutRootOf);
            if (linearLayoutRootOf.getChildCount() <= 1) {
                linearLayoutRootOf.addView(inAppSettings.card("图片", new View[]{inAppSettings.switchRow(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT, "默认原图", "发送图片时默认按原图处理"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_PIC_SUMMARY_ENABLED, "图片外显", "自定义图片消息在聊天列表里的外显文字")}));
                HookEntry.log("settings picture page fallback content added");
            }
            HookEntry.log("settings picture page built children=" + linearLayoutRootOf.getChildCount());
            return scrollViewSecondaryScroll;
        }
        if ("cleanse".equals(str)) {
            InAppSettingsStylePage.addStyle(inAppSettings, linearLayoutRootOf);
            InAppSettingsProfilePage.addProfile(inAppSettings, linearLayoutRootOf);
            return scrollViewSecondaryScroll;
        }
        if ("misc".equals(str)) {
            InAppSettingsCategoryPage.addMisc(inAppSettings, linearLayoutRootOf);
            return scrollViewSecondaryScroll;
        }
        if ("feedback".equals(str)) {
            InAppSettingsFeedbackPage.addFeedback(inAppSettings, linearLayoutRootOf);
        }
        return scrollViewSecondaryScroll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View buildErrorPage(InAppSettings inAppSettings, String str, Throwable th) {
        String str2;
        inAppSettings.applyThemePalette();
        ScrollView scrollViewSecondaryScroll = inAppSettings.secondaryScroll();
        LinearLayout linearLayoutRootOf = inAppSettings.rootOf(scrollViewSecondaryScroll);
        linearLayoutRootOf.addView(inAppSettings.backHeader(inAppSettings.titleOf(str), "页面构建失败"));
        if (th == null) {
            str2 = "未知";
        } else {
            str2 = th.getClass().getSimpleName() + ": " + String.valueOf(th.getMessage());
        }
        TextView textViewText = inAppSettings.text(str2, 13, InAppSettings.SUB, 0);
        textViewText.setPadding(inAppSettings.m139dp(16.0f), inAppSettings.m139dp(12.0f), inAppSettings.m139dp(16.0f), inAppSettings.m139dp(12.0f));
        linearLayoutRootOf.addView(inAppSettings.card("错误", new View[]{textViewText}));
        return scrollViewSecondaryScroll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View buildHome(InAppSettings inAppSettings) {
        inAppSettings.applyThemePalette();
        ScrollView scrollViewBaseScroll = inAppSettings.baseScroll();
        InAppSettingsHomePage.addHome(inAppSettings, inAppSettings.rootOf(scrollViewBaseScroll));
        return scrollViewBaseScroll;
    }
}
