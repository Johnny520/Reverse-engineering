package com.p001mr.elaris;

import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsLayoutHelpers {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsLayoutHelpers() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View backHeader(InAppSettings inAppSettings, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, inAppSettings.m139dp(18.0f), 0, 0);
        linearLayout.addView(inAppSettings.text(str, 24, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1));
        TextView textViewText = inAppSettings.text(str2, 13, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        textViewText.setPadding(0, inAppSettings.m139dp(5.0f), 0, inAppSettings.m139dp(2.0f));
        linearLayout.addView(textViewText);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ScrollView baseScroll(InAppSettings inAppSettings) {
        InAppSettingsGuardedScrollView inAppSettingsGuardedScrollViewCreateGuardedScrollView = inAppSettings.createGuardedScrollView();
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setFillViewport(true);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setClipToPadding(false);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setBackground(InAppSettingsSecondaryStyle.pageBackground(inAppSettings));
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setOverScrollMode(2);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setVerticalScrollBarEnabled(false);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setVerticalFadingEdgeEnabled(true);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setFadingEdgeLength(inAppSettings.m139dp(20.0f));
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(InAppSettingsSecondaryStyle.pageColor(inAppSettings));
        linearLayout.setPadding(inAppSettings.m139dp(20.0f), safeTopPadding(inAppSettings), inAppSettings.m139dp(20.0f), inAppSettings.m139dp(26.0f));
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        return inAppSettingsGuardedScrollViewCreateGuardedScrollView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int dialogWidth(InAppSettings inAppSettings) {
        return Math.max(inAppSettings.m139dp(280.0f), Math.min(inAppSettings.activity.getResources().getDisplayMetrics().widthPixels - inAppSettings.m139dp(42.0f), inAppSettings.m139dp(520.0f)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: dp */
    public static int m154dp(InAppSettings inAppSettings, float f) {
        return (int) TypedValue.applyDimension(1, f, inAppSettings.activity.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinearLayout innerBox(InAppSettings inAppSettings) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), inAppSettings.m139dp(4.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(6.0f));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinearLayout rootOf(ScrollView scrollView) {
        return (LinearLayout) scrollView.getChildAt(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int safeTopPadding(InAppSettings inAppSettings) {
        return Math.max(inAppSettings.m139dp(12.0f), statusBarHeight(inAppSettings) - inAppSettings.m139dp(8.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ScrollView secondaryScroll(InAppSettings inAppSettings) {
        InAppSettingsGuardedScrollView inAppSettingsGuardedScrollViewCreateGuardedScrollView = inAppSettings.createGuardedScrollView();
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setFillViewport(true);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setClipToPadding(false);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setBackground(InAppSettingsSecondaryStyle.pageBackground(inAppSettings));
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setOverScrollMode(2);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setVerticalScrollBarEnabled(false);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setVerticalFadingEdgeEnabled(true);
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.setFadingEdgeLength(inAppSettings.m139dp(20.0f));
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(InAppSettingsSecondaryStyle.pageColor(inAppSettings));
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), secondaryTopPadding(inAppSettings), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(26.0f));
        inAppSettingsGuardedScrollViewCreateGuardedScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        return inAppSettingsGuardedScrollViewCreateGuardedScrollView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int secondaryTopPadding(InAppSettings inAppSettings) {
        return Math.max(0, safeTopPadding(inAppSettings) - inAppSettings.m139dp(16.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int statusBarHeight(InAppSettings inAppSettings) {
        try {
            int identifier = inAppSettings.activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return inAppSettings.activity.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Throwable unused) {
        }
        return inAppSettings.m139dp(28.0f);
    }
}
