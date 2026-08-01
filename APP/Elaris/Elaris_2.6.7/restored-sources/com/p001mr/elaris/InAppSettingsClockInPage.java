package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import p000.AbstractC0000a;
import p000.AbstractC0008a7;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsClockInPage {
    private static final float COLUMN_GAP_DP = 8.0f;
    private static final float CONTROL_HEIGHT_DP = 36.0f;
    private static final float STATS_HEIGHT_DP = 34.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsClockInPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(final InAppSettings inAppSettings) {
        return InAppSettingsWidgets.switchDetailRow(inAppSettings, Prefs.KEY_CLOCK_IN_ENABLED, "自动群打卡", "每天 00:00 后检查未打卡群，点开配置", new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsClockInPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsClockInPage.showDialog(inAppSettings);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void showDialog(final InAppSettings inAppSettings) {
        try {
            LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = inAppSettings.m139dp(16.0f);
            linearLayout.setPadding(iM139dp, inAppSettings.m139dp(13.0f), iM139dp, inAppSettings.m139dp(11.0f));
            linearLayout.setBackground(inAppSettings.dialogPanel());
            linearLayout.addView(inAppSettings.text("自动群打卡", 17, InAppSettings.TEXT, 1));
            final TextView textViewStatPill = inAppSettings.statPill(inAppSettings.clockInCountText(), InAppSettings.BLUE);
            TextView textViewStatPill2 = inAppSettings.statPill("下次 ".concat(AbstractC0008a7.m63t()), InAppSettings.GREEN);
            textViewStatPill.setMinHeight(0);
            textViewStatPill2.setMinHeight(0);
            LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(textViewStatPill, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(STATS_HEIGHT_DP), 1.0f));
            linearLayout2.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(COLUMN_GAP_DP), 1));
            linearLayout2.addView(textViewStatPill2, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(STATS_HEIGHT_DP), 1.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = inAppSettings.m139dp(COLUMN_GAP_DP);
            linearLayout.addView(linearLayout2, layoutParams);
            TextView textViewText = inAppSettings.text("00:00 后检查未打卡群；需要时可立即执行", 12, InAppSettings.SUB, 0);
            textViewText.setPadding(0, inAppSettings.m139dp(6.0f), 0, 0);
            linearLayout.addView(textViewText);
            final TextView textViewText2 = inAppSettings.text(inAppSettings.selectedGroupsPreview(), 12, InAppSettings.SUB, 0);
            textViewText2.setSingleLine(true);
            textViewText2.setEllipsize(TextUtils.TruncateAt.END);
            textViewText2.setPadding(0, inAppSettings.m139dp(3.0f), 0, 0);
            linearLayout.addView(textViewText2);
            TextView textViewDialogButton = inAppSettings.dialogButton("选择群", false);
            TextView textViewDialogButton2 = inAppSettings.dialogButton("立即执行", true);
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsClockInPage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    inAppSettings.openClockInGroupPicker(textViewStatPill, textViewText2, view);
                }
            });
            textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsClockInPage.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    inAppSettings.startManualClockIn(textViewStatPill, view);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(inAppSettings.activity);
            linearLayout3.setOrientation(0);
            linearLayout3.addView(textViewDialogButton, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(CONTROL_HEIGHT_DP), 1.0f));
            linearLayout3.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(COLUMN_GAP_DP), 1));
            linearLayout3.addView(textViewDialogButton2, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(CONTROL_HEIGHT_DP), 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = inAppSettings.m139dp(10.0f);
            linearLayout.addView(linearLayout3, layoutParams2);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
            ScrollView scrollView = new ScrollView(inAppSettings.activity);
            scrollView.setFillViewport(true);
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            alertDialogCreate.setView(scrollView, 0, 0, 0, 0);
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsClockInPage.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    inAppSettings.applyDialogWindowStyle(alertDialogCreate);
                }
            });
            alertDialogCreate.show();
            inAppSettings.applyDialogWindowStyle(alertDialogCreate);
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("clock in settings dialog failed: "), ": ");
            inAppSettings.toast("打卡设置打开失败");
        }
    }
}
