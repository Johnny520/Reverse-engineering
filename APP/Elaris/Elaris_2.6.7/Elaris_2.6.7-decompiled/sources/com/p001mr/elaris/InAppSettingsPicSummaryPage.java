package com.p001mr.elaris;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
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
final class InAppSettingsPicSummaryPage {
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsPicSummaryPage(InAppSettings inAppSettings) {
        this.settings = inAppSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(InAppSettings inAppSettings) {
        return new InAppSettingsPicSummaryPage(inAppSettings).createCard();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View createCard() {
        InAppSettings inAppSettings = this.settings;
        return inAppSettings.card("图片外显", new View[]{InAppSettingsWidgets.switchDetailRow(inAppSettings, Prefs.KEY_PIC_SUMMARY_ENABLED, "图片外显", "自定义聊天列表的图片外显文字，点开设置", new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsPicSummaryPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsPicSummaryPage.this.showDialog();
            }
        })});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String normalizedPicDisplayText(EditText editText) {
        String strTextOf = this.settings.textOf(editText);
        return strTextOf.length() == 0 ? Prefs.DEFAULT_PIC_SUMMARY : strTextOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void resetPicSummaryText(EditText editText, View view) {
        String string = this.settings.getString(Prefs.KEY_PIC_SUMMARY_TEXT);
        this.settings.keepCategoryBackTarget("picture");
        if (editText != null) {
            editText.setText(Prefs.DEFAULT_PIC_SUMMARY);
        }
        if (!TextUtils.equals(Prefs.DEFAULT_PIC_SUMMARY, string)) {
            this.settings.saveString(Prefs.KEY_PIC_SUMMARY_TEXT, Prefs.DEFAULT_PIC_SUMMARY, true);
        }
        this.settings.settleTextInput(editText, view);
        this.settings.refocusElarisPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void savePicSummaryText(EditText editText, View view) {
        String string = this.settings.getString(Prefs.KEY_PIC_SUMMARY_TEXT);
        this.settings.keepCategoryBackTarget("picture");
        String strNormalizedPicDisplayText = normalizedPicDisplayText(editText);
        boolean zEquals = TextUtils.equals(strNormalizedPicDisplayText, string);
        InAppSettings inAppSettings = this.settings;
        if (zEquals) {
            inAppSettings.settleTextInput(editText, view);
            this.settings.refocusElarisPage(view);
        } else {
            inAppSettings.saveString(Prefs.KEY_PIC_SUMMARY_TEXT, strNormalizedPicDisplayText, true);
            this.settings.settleTextInput(editText, view);
            this.settings.refocusElarisPage(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void showDialog() {
        try {
            LinearLayout linearLayout = new LinearLayout(this.settings.activity);
            linearLayout.setOrientation(1);
            linearLayout.setTag("elaris_dialog_surface");
            int iM139dp = this.settings.m139dp(16.0f);
            linearLayout.setPadding(iM139dp, this.settings.m139dp(13.0f), iM139dp, this.settings.m139dp(11.0f));
            linearLayout.setBackground(this.settings.dialogPanel());
            linearLayout.addView(this.settings.text("图片外显", 17, InAppSettings.TEXT, 1));
            InAppSettings inAppSettings = this.settings;
            final EditText editTextInput = inAppSettings.input("默认：[图片]", inAppSettings.getString(Prefs.KEY_PIC_SUMMARY_TEXT));
            editTextInput.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.settings.m139dp(40.0f));
            layoutParams.topMargin = this.settings.m139dp(8.0f);
            linearLayout.addView(editTextInput, layoutParams);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(this.settings.activity).create();
            TextView textViewDialogButton = this.settings.dialogButton("保存", true);
            TextView textViewDialogButton2 = this.settings.dialogButton("恢复默认", false);
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsPicSummaryPage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    InAppSettingsPicSummaryPage.this.savePicSummaryText(editTextInput, view);
                    alertDialogCreate.dismiss();
                }
            });
            textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsPicSummaryPage.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    InAppSettingsPicSummaryPage.this.resetPicSummaryText(editTextInput, view);
                    alertDialogCreate.dismiss();
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(this.settings.activity);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(textViewDialogButton, new LinearLayout.LayoutParams(0, this.settings.m139dp(36.0f), 1.0f));
            linearLayout2.addView(new Space(this.settings.activity), new LinearLayout.LayoutParams(this.settings.m139dp(8.0f), 1));
            linearLayout2.addView(textViewDialogButton2, new LinearLayout.LayoutParams(0, this.settings.m139dp(36.0f), 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = this.settings.m139dp(10.0f);
            linearLayout.addView(linearLayout2, layoutParams2);
            ScrollView scrollView = new ScrollView(this.settings.activity);
            scrollView.setFillViewport(true);
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            alertDialogCreate.setView(scrollView, 0, 0, 0, 0);
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsPicSummaryPage.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    InAppSettingsPicSummaryPage.this.settings.applyDialogWindowStyle(alertDialogCreate);
                }
            });
            alertDialogCreate.show();
            this.settings.applyDialogWindowStyle(alertDialogCreate);
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("pic summary dialog failed: "), ": ");
            this.settings.toast("图片外显设置打开失败");
        }
    }
}
