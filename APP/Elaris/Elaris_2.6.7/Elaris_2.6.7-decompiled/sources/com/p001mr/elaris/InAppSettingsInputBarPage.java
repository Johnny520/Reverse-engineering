package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.InAppSettingsWidgets;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;
import p000.AbstractC0260i5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsInputBarPage {
    private static final int[] OPTION_IDS = {1000, 1003, 1005, 1016, 1001, 1006};
    private static final String[] OPTION_TITLES = {"语音", "相册", "相机", "泡泡消息", "表情", "加号"};
    private static final String[] OPTION_DESCRIPTIONS = {"隐藏 QQ 原生语音入口", "隐藏系统相册入口", "隐藏系统相机入口", "隐藏泡泡视频入口", "隐藏表情面板入口", "隐藏更多功能入口"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsInputBarPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View createSwitchRow(final InAppSettings inAppSettings) {
        String string;
        ensureMigrated(inAppSettings);
        boolean bool = inAppSettings.getBool(Prefs.KEY_AIO_INPUT_BAR_ENABLED);
        String string2 = inAppSettings.getString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS);
        if (bool) {
            LinkedHashSet linkedHashSetM607e0 = AbstractC0260i5.m607e0(string2, false);
            if (linkedHashSetM607e0.isEmpty()) {
                string = "未隐藏任何按钮";
            } else {
                int size = linkedHashSetM607e0.size();
                int[] iArr = AbstractC0260i5.f383d;
                if (size == 6) {
                    string = "已隐藏全部 6 项";
                } else {
                    StringBuilder sb = new StringBuilder("已隐藏：");
                    boolean z = true;
                    for (int i = 0; i < 6; i++) {
                        int i2 = iArr[i];
                        if (linkedHashSetM607e0.contains(Integer.valueOf(i2))) {
                            if (!z) {
                                sb.append((char) 12289);
                            }
                            sb.append(i2 == 1000 ? "语音" : i2 == 1003 ? "相册" : i2 == 1005 ? "相机" : i2 == 1016 ? "泡泡消息" : i2 == 1001 ? "表情" : i2 == 1006 ? "加号" : String.valueOf(i2));
                            z = false;
                        }
                    }
                    string = sb.toString();
                }
            }
        } else {
            string = "已关闭";
        }
        return InAppSettingsWidgets.switchDetailRowSilent(inAppSettings, Prefs.KEY_AIO_INPUT_BAR_ENABLED, "屏蔽输入框底栏", string, new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsInputBarPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsInputBarPage.showDialog(inAppSettings);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void ensureMigrated(InAppSettings inAppSettings) {
        if (inAppSettings.getBool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED)) {
            return;
        }
        String string = inAppSettings.getString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS);
        boolean zM528F0 = AbstractC0260i5.m528F0(string, inAppSettings.getBool(Prefs.KEY_AIO_INPUT_BAR_ENABLED), false, inAppSettings.getBool(Prefs.KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES));
        if (AbstractC0260i5.m639n1(string, false).isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(1005);
            linkedHashSet.add(1016);
            inAppSettings.saveString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS, AbstractC0260i5.m544K1(linkedHashSet), false);
        }
        inAppSettings.saveBool(Prefs.KEY_AIO_INPUT_BAR_ENABLED, zM528F0, false);
        inAppSettings.saveBool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void showDialog(final InAppSettings inAppSettings) {
        try {
            LinkedHashSet linkedHashSetM607e0 = AbstractC0260i5.m607e0(inAppSettings.getString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS), false);
            final boolean[] zArr = new boolean[OPTION_IDS.length];
            int i = 0;
            while (true) {
                int[] iArr = OPTION_IDS;
                if (i >= iArr.length) {
                    break;
                }
                zArr[i] = linkedHashSetM607e0.contains(Integer.valueOf(iArr[i]));
                i++;
            }
            LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = inAppSettings.m139dp(20.0f);
            linearLayout.setPadding(iM139dp, inAppSettings.m139dp(18.0f), iM139dp, inAppSettings.m139dp(14.0f));
            linearLayout.setBackground(inAppSettings.dialogPanel());
            linearLayout.addView(inAppSettings.text("屏蔽输入框底栏", 20, InAppSettings.TEXT, 1));
            TextView textViewText = inAppSettings.text("选择要从 QQ 聊天底栏隐藏的入口", 13, InAppSettings.SUB, 0);
            textViewText.setPadding(0, inAppSettings.m139dp(6.0f), 0, inAppSettings.m139dp(8.0f));
            linearLayout.addView(textViewText);
            final int i2 = 0;
            while (true) {
                int[] iArr2 = OPTION_IDS;
                if (i2 >= iArr2.length) {
                    final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
                    LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
                    linearLayout2.setOrientation(0);
                    TextView textViewDialogButton = inAppSettings.dialogButton("取消", false);
                    TextView textViewDialogButton2 = inAppSettings.dialogButton("保存", true);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, inAppSettings.m139dp(42.0f), 1.0f);
                    layoutParams.rightMargin = inAppSettings.m139dp(6.0f);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, inAppSettings.m139dp(42.0f), 1.0f);
                    layoutParams2.leftMargin = inAppSettings.m139dp(6.0f);
                    linearLayout2.addView(textViewDialogButton, layoutParams);
                    linearLayout2.addView(textViewDialogButton2, layoutParams2);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.topMargin = inAppSettings.m139dp(12.0f);
                    linearLayout.addView(linearLayout2, layoutParams3);
                    textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsInputBarPage.3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            alertDialogCreate.dismiss();
                        }
                    });
                    textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsInputBarPage.4
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (int i3 = 0; i3 < InAppSettingsInputBarPage.OPTION_IDS.length; i3++) {
                                if (zArr[i3]) {
                                    linkedHashSet.add(Integer.valueOf(InAppSettingsInputBarPage.OPTION_IDS[i3]));
                                }
                            }
                            inAppSettings.saveString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS, AbstractC0260i5.m544K1(linkedHashSet), false);
                            alertDialogCreate.dismiss();
                            inAppSettings.refreshCurrentPage();
                        }
                    });
                    alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
                    alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsInputBarPage.5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.content.DialogInterface.OnShowListener
                        public void onShow(DialogInterface dialogInterface) {
                            inAppSettings.applyDialogWindowStyle(alertDialogCreate);
                        }
                    });
                    alertDialogCreate.show();
                    inAppSettings.applyDialogWindowStyle(alertDialogCreate);
                    return;
                }
                linearLayout.addView(inAppSettings.settingItem(OPTION_TITLES[i2], OPTION_DESCRIPTIONS[i2], zArr[i2], new InAppSettingsWidgets.CheckedChangeListener() { // from class: com.mr.elaris.InAppSettingsInputBarPage.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // com.mr.elaris.InAppSettingsWidgets.CheckedChangeListener
                    public void onCheckedChange(boolean z, View view) {
                        zArr[i2] = z;
                    }
                }));
                if (i2 < iArr2.length - 1) {
                    linearLayout.addView(inAppSettings.divider());
                }
                i2++;
            }
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("input bar settings dialog failed: "), ": ");
        }
    }
}
