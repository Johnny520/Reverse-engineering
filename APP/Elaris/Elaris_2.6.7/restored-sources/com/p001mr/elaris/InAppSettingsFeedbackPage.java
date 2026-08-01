package com.p001mr.elaris;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p000.AbstractC0539xe;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsFeedbackPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsFeedbackPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addFeedback(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("交流与反馈", new View[]{linkRow(inAppSettings, "Telegram 频道", "查看频道更新与反馈入口", "https://t.me/Elaris_mod", InAppSettings.GREEN)}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View linkRow(final InAppSettings inAppSettings, String str, String str2, final String str3, int i) {
        LinearLayout linearLayout = (LinearLayout) InAppSettingsWidgets.actionRow(inAppSettings, str, str2, new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsFeedbackPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsFeedbackPage.openExternalLink(inAppSettings, str3);
            }
        });
        View childAt = linearLayout.getChildAt(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
        layoutParams.leftMargin = inAppSettings.m139dp(13.0f);
        childAt.setLayoutParams(layoutParams);
        linearLayout.addView(inAppSettings.accentStrip(i), 0, new LinearLayout.LayoutParams(inAppSettings.m139dp(3.0f), inAppSettings.m139dp(36.0f)));
        FrameLayout frameLayout = new FrameLayout(inAppSettings.activity);
        frameLayout.setAlpha(0.4f);
        InAppSettingsChevronRightView inAppSettingsChevronRightView = new InAppSettingsChevronRightView(inAppSettings);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(inAppSettings.m139dp(20.0f), inAppSettings.m139dp(20.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(inAppSettingsChevronRightView, layoutParams2);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(inAppSettings.m139dp(22.0f), -1));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openExternalLink(InAppSettings inAppSettings, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            Activity activity = inAppSettings.activity;
            if (AbstractC0539xe.m1152e(str)) {
                System.currentTimeMillis();
            }
            inAppSettings.activity.startActivity(intent);
        } catch (Throwable unused) {
            inAppSettings.toast("无法打开链接");
        }
    }
}
