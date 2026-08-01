package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsThemePage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsThemePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(InAppSettings inAppSettings) {
        return inAppSettings.card("主题设置", new View[]{themeRow(inAppSettings)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String label(String str) {
        return "light".equals(str) ? "浅色" : "dark".equals(str) ? "深色" : "跟随系统";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void saveMode(InAppSettings inAppSettings, String str, AlertDialog alertDialog) {
        if (!"light".equals(str) && !"dark".equals(str) && !"system".equals(str)) {
            str = "system";
        }
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (!str.equals(inAppSettings.themeMode())) {
            inAppSettings.saveString(Prefs.KEY_UI_THEME_MODE, str, false);
        }
        inAppSettings.applyThemePalette();
        inAppSettings.refreshCurrentPage();
        inAppSettings.toast("主题已切换：" + label(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void showThemePicker(final InAppSettings inAppSettings) {
        String[] strArr = {"system", "light", "dark"};
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setPadding(inAppSettings.m139dp(20.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(20.0f), inAppSettings.m139dp(16.0f));
        linearLayout.setBackground(inAppSettings.dialogPanel());
        TextView textViewText = inAppSettings.text("主题", 20, InAppSettings.TEXT, 1);
        textViewText.setPadding(inAppSettings.m139dp(2.0f), 0, 0, inAppSettings.m139dp(12.0f));
        linearLayout.addView(textViewText);
        String strThemeMode = inAppSettings.themeMode();
        for (int i = 0; i < 3; i++) {
            linearLayout.addView(themeOptionRow(inAppSettings, strArr[i], strThemeMode));
            if (i < 2) {
                linearLayout.addView(inAppSettings.divider());
            }
        }
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt != null && (childAt.getTag() instanceof String)) {
                final String str = (String) childAt.getTag();
                childAt.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsThemePage.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        InAppSettingsThemePage.saveMode(inAppSettings, str, alertDialogCreate);
                    }
                });
            }
        }
        alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsThemePage.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                inAppSettings.applyDialogWindowStyle(alertDialogCreate);
            }
        });
        alertDialogCreate.show();
        inAppSettings.applyDialogWindowStyle(alertDialogCreate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String summary(String str) {
        return "light".equals(str) ? "始终使用浅色界面" : "dark".equals(str) ? "始终使用深色界面" : "跟随系统深浅色切换";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View themeOptionRow(InAppSettings inAppSettings, String str, String str2) {
        boolean zEquals = str.equals(str2);
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setTag(str);
        linearLayout.setPadding(inAppSettings.m139dp(16.0f), inAppSettings.m139dp(12.0f), inAppSettings.m139dp(12.0f), inAppSettings.m139dp(12.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(64.0f));
        linearLayout.setClickable(true);
        linearLayout.setBackground(zEquals ? inAppSettings.round(inAppSettings.mixForSurface(InAppSettings.BLUE, 0.9f), inAppSettings.m139dp(16.0f)) : inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        TextView textViewText = inAppSettings.text(label(str), 17, zEquals ? InAppSettings.BLUE : InAppSettings.TEXT, 1);
        TextView textViewText2 = inAppSettings.text(summary(str), 12, InAppSettings.SUB, 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(5.0f), 0, 0);
        linearLayout2.addView(textViewText);
        linearLayout2.addView(textViewText2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewText3 = inAppSettings.text(zEquals ? "✓" : "", 24, InAppSettings.BLUE, 1);
        textViewText3.setGravity(17);
        linearLayout.addView(textViewText3, new LinearLayout.LayoutParams(inAppSettings.m139dp(38.0f), inAppSettings.m139dp(38.0f)));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View themeRow(final InAppSettings inAppSettings) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), inAppSettings.m139dp(6.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(6.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(61.0f));
        linearLayout.setClickable(true);
        linearLayout.setBackground(inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(0, 0, inAppSettings.m139dp(8.0f), 0);
        TextView textViewText = inAppSettings.text("主题", 15, InAppSettingsSecondaryStyle.titleColor(inAppSettings), 1);
        TextView textViewText2 = inAppSettings.text("选择 Elaris 设置页的主题模式", 12, InAppSettingsSecondaryStyle.subtitleColor(inAppSettings), 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
        linearLayout2.addView(textViewText);
        linearLayout2.addView(textViewText2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(inAppSettings.statPill(label(inAppSettings.themeMode()), InAppSettings.BLUE), new LinearLayout.LayoutParams(inAppSettings.m139dp(118.0f), inAppSettings.m139dp(36.0f)));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsThemePage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsThemePage.showThemePicker(inAppSettings);
            }
        });
        return linearLayout;
    }
}
