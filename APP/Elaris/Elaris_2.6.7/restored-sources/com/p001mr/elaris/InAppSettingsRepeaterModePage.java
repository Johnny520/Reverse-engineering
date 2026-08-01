package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.InAppSettings;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsRepeaterModePage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsRepeaterModePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View repeaterModeRow(final InAppSettings inAppSettings, String str, final String str2, final InAppSettings.ToggleView toggleView, final AlertDialog alertDialog) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        boolean z = false;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, inAppSettings.m139dp(12.0f), 0, inAppSettings.m139dp(12.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(54.0f));
        linearLayout.setClickable(true);
        linearLayout.setBackground(inAppSettings.rowBackground());
        linearLayout.addView(inAppSettings.text(str, 16, InAppSettings.TEXT, 1), new LinearLayout.LayoutParams(0, -2, 1.0f));
        String string = inAppSettings.getString(Prefs.KEY_MESSAGE_REPEATER_MODE);
        if (TextUtils.equals(str2, string) || (string.length() == 0 && Prefs.REPEATER_MODE_SINGLE.equals(str2))) {
            z = true;
        }
        TextView textViewText = inAppSettings.text(z ? "✓" : "", 13, InAppSettings.BLUE, 1);
        textViewText.setGravity(17);
        textViewText.setBackground(inAppSettings.checkCircleDrawable(z));
        linearLayout.addView(textViewText, new LinearLayout.LayoutParams(inAppSettings.m139dp(28.0f), inAppSettings.m139dp(28.0f)));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsRepeaterModePage.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlertDialog alertDialog2 = alertDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                inAppSettings.saveString(Prefs.KEY_MESSAGE_REPEATER_MODE, str2, false);
                if (!toggleView.isChecked()) {
                    toggleView.setChecked(true);
                    inAppSettings.saveBool(Prefs.KEY_MESSAGE_REPEATER, true, true);
                }
                InAppSettingsRepeaterModePage.updateSummaryView(inAppSettings);
                inAppSettings.toast(Prefs.REPEATER_MODE_DOUBLE.equals(str2) ? "已切换为双击复读" : "已切换为单击复读");
            }
        });
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showDialog(final InAppSettings inAppSettings, InAppSettings.ToggleView toggleView, View view) {
        try {
            LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = inAppSettings.m139dp(24.0f);
            linearLayout.setPadding(iM139dp, inAppSettings.m139dp(22.0f), iM139dp, inAppSettings.m139dp(18.0f));
            linearLayout.setBackground(inAppSettings.dialogPanel());
            linearLayout.addView(inAppSettings.text("消息复读", 20, InAppSettings.TEXT, 1));
            TextView textViewText = inAppSettings.text("选择复读按钮触发方式", 13, InAppSettings.SUB, 0);
            textViewText.setPadding(0, inAppSettings.m139dp(8.0f), 0, inAppSettings.m139dp(14.0f));
            linearLayout.addView(textViewText);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
            linearLayout.addView(repeaterModeRow(inAppSettings, "单击复读", Prefs.REPEATER_MODE_SINGLE, toggleView, alertDialogCreate));
            linearLayout.addView(inAppSettings.divider());
            linearLayout.addView(repeaterModeRow(inAppSettings, "双击复读", Prefs.REPEATER_MODE_DOUBLE, toggleView, alertDialogCreate));
            TextView textViewDialogButton = inAppSettings.dialogButton("取消", false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(46.0f));
            layoutParams.topMargin = inAppSettings.m139dp(16.0f);
            linearLayout.addView(textViewDialogButton, layoutParams);
            alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsRepeaterModePage.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    inAppSettings.applyDialogWindowStyle(alertDialogCreate);
                }
            });
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsRepeaterModePage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    alertDialogCreate.dismiss();
                }
            });
            alertDialogCreate.show();
            inAppSettings.applyDialogWindowStyle(alertDialogCreate);
        } catch (Throwable unused) {
            inAppSettings.saveString(Prefs.KEY_MESSAGE_REPEATER_MODE, Prefs.REPEATER_MODE_SINGLE, false);
            toggleView.setChecked(true);
            inAppSettings.saveBool(Prefs.KEY_MESSAGE_REPEATER, true, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String summary(InAppSettings inAppSettings) {
        return Prefs.REPEATER_MODE_DOUBLE.equals(inAppSettings.getString(Prefs.KEY_MESSAGE_REPEATER_MODE)) ? "当前为双击复读" : "当前为单击复读";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void updateSummaryView(InAppSettings inAppSettings) {
        TextView textView = inAppSettings.repeaterModeSummaryView;
        if (textView != null) {
            textView.setText(summary(inAppSettings));
        }
    }
}
