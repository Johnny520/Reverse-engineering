package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import p000.AbstractC0000a;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsKeepFirePage {
    private static final float COLUMN_GAP_DP = 8.0f;
    private static final float CONTROL_HEIGHT_DP = 36.0f;
    private static final float STATS_HEIGHT_DP = 34.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsKeepFirePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(final InAppSettings inAppSettings) {
        return InAppSettingsWidgets.switchDetailRow(inAppSettings, Prefs.KEY_KEEP_FIRE_ENABLED, "续火定时消息", "每天 00:00 后发一次，点开配置", new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsKeepFirePage.showDialog(inAppSettings);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0004 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x021e */
    /* JADX INFO: Access modifiers changed from: private */
    public static void showDialog(InAppSettings inAppSettings) {
        final InAppSettings inAppSettings2 = inAppSettings;
        try {
            LinearLayout linearLayout = new LinearLayout(inAppSettings2.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = inAppSettings2.m139dp(16.0f);
            linearLayout.setPadding(iM139dp, inAppSettings2.m139dp(13.0f), iM139dp, inAppSettings2.m139dp(11.0f));
            linearLayout.setBackground(inAppSettings2.dialogPanel());
            linearLayout.addView(inAppSettings2.text("续火定时消息", 17, InAppSettings.TEXT, 1));
            final TextView textViewStatPill = inAppSettings2.statPill(AbstractC0152f.m229z(), InAppSettings.BLUE);
            final TextView textViewStatPill2 = inAppSettings2.statPill("下次 ".concat(AbstractC0152f.m215l()), InAppSettings.GREEN);
            textViewStatPill.setMinHeight(0);
            textViewStatPill2.setMinHeight(0);
            LinearLayout linearLayout2 = new LinearLayout(inAppSettings2.activity);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(textViewStatPill, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(STATS_HEIGHT_DP), 1.0f));
            linearLayout2.addView(new Space(inAppSettings2.activity), new LinearLayout.LayoutParams(inAppSettings2.m139dp(COLUMN_GAP_DP), 1));
            linearLayout2.addView(textViewStatPill2, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(STATS_HEIGHT_DP), 1.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = inAppSettings2.m139dp(COLUMN_GAP_DP);
            linearLayout.addView(linearLayout2, layoutParams);
            final TextView textViewText = inAppSettings2.text(inAppSettings2.keepFireTargetsCompactPreview(), 13, InAppSettings.SUB, 0);
            textViewText.setPadding(0, inAppSettings2.m139dp(6.0f), 0, 0);
            linearLayout.addView(textViewText);
            TextView textViewDialogButton = inAppSettings2.dialogButton("选好友", false);
            TextView textViewDialogButton2 = inAppSettings2.dialogButton("选群", false);
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    inAppSettings2.openKeepFireFriendPicker(textViewStatPill, textViewText, view);
                }
            });
            textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    inAppSettings2.openKeepFireGroupPicker(textViewStatPill, textViewText, view);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(inAppSettings2.activity);
            linearLayout3.setOrientation(0);
            linearLayout3.addView(textViewDialogButton, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(CONTROL_HEIGHT_DP), 1.0f));
            linearLayout3.addView(new Space(inAppSettings2.activity), new LinearLayout.LayoutParams(inAppSettings2.m139dp(COLUMN_GAP_DP), 1));
            linearLayout3.addView(textViewDialogButton2, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(CONTROL_HEIGHT_DP), 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = inAppSettings2.m139dp(COLUMN_GAP_DP);
            linearLayout.addView(linearLayout3, layoutParams2);
            final EditText editTextInput = inAppSettings2.input("00:00", AbstractC0152f.m200A());
            final EditText editTextInput2 = inAppSettings2.input("消息", AbstractC0152f.m219p(Prefs.KEY_KEEP_FIRE_MESSAGE, ""));
            LinearLayout linearLayout4 = new LinearLayout(inAppSettings2.activity);
            linearLayout4.setOrientation(0);
            linearLayout4.addView(editTextInput, new LinearLayout.LayoutParams(inAppSettings2.m139dp(96.0f), inAppSettings2.m139dp(CONTROL_HEIGHT_DP)));
            linearLayout4.addView(new Space(inAppSettings2.activity), new LinearLayout.LayoutParams(inAppSettings2.m139dp(COLUMN_GAP_DP), 1));
            linearLayout4.addView(editTextInput2, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(CONTROL_HEIGHT_DP), 1.0f));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = inAppSettings2.m139dp(COLUMN_GAP_DP);
            linearLayout.addView(linearLayout4, layoutParams3);
            TextView textViewDialogButton3 = inAppSettings2.dialogButton("保存", true);
            TextView textViewDialogButton4 = inAppSettings2.dialogButton("立即发送", false);
            try {
                textViewDialogButton3.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        inAppSettings2.saveKeepFireConfig(editTextInput, editTextInput2, textViewStatPill, textViewStatPill2, textViewText, view);
                    }
                });
                inAppSettings2 = inAppSettings;
                textViewDialogButton4.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.5
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (inAppSettings2.saveKeepFireConfig(editTextInput, editTextInput2, textViewStatPill, textViewStatPill2, textViewText, view)) {
                            inAppSettings2.startManualKeepFire(textViewStatPill, textViewStatPill2, view);
                        }
                    }
                });
                LinearLayout linearLayout5 = new LinearLayout(inAppSettings2.activity);
                linearLayout5.setOrientation(0);
                linearLayout5.addView(textViewDialogButton3, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(CONTROL_HEIGHT_DP), 1.0f));
                linearLayout5.addView(new Space(inAppSettings2.activity), new LinearLayout.LayoutParams(inAppSettings2.m139dp(COLUMN_GAP_DP), 1));
                linearLayout5.addView(textViewDialogButton4, new LinearLayout.LayoutParams(0, inAppSettings2.m139dp(CONTROL_HEIGHT_DP), 1.0f));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.topMargin = inAppSettings2.m139dp(10.0f);
                linearLayout.addView(linearLayout5, layoutParams4);
                final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings2.activity).create();
                ScrollView scrollView = new ScrollView(inAppSettings2.activity);
                scrollView.setFillViewport(true);
                scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
                alertDialogCreate.setView(scrollView, 0, 0, 0, 0);
                alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsKeepFirePage.6
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnShowListener
                    public void onShow(DialogInterface dialogInterface) {
                        inAppSettings2.applyDialogWindowStyle(alertDialogCreate);
                    }
                });
                alertDialogCreate.show();
                inAppSettings2.applyDialogWindowStyle(alertDialogCreate);
            } catch (Throwable th) {
                th = th;
                inAppSettings2 = inAppSettings;
                AbstractC0000a.m3d(th, new StringBuilder("keep fire settings dialog failed: "), ": ");
                inAppSettings2.toast("续火设置打开失败");
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
