package com.p001mr.elaris;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p000.AbstractC0000a;
import p000.AbstractC0174d;
import p000.InterfaceC0032c;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsRepeaterIconPage {
    private static final int REPEATER_ICON_REQUEST = 8101;
    private static volatile WeakReference<EditText> activePathInput = new WeakReference<>(null);
    private static volatile boolean resultHookInstalled = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsRepeaterIconPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void clearRepeaterIconPath(InAppSettings inAppSettings, EditText editText, View view) {
        inAppSettings.keepCategoryBackTarget("repeater");
        if (editText != null) {
            editText.setText("");
        }
        if (inAppSettings.getString(Prefs.KEY_MESSAGE_REPEATER_ICON_PATH).length() > 0) {
            inAppSettings.saveString(Prefs.KEY_MESSAGE_REPEATER_ICON_PATH, "", true);
        }
        inAppSettings.settleTextInput(editText, view);
        inAppSettings.refocusElarisPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(final InAppSettings inAppSettings) {
        return InAppSettingsWidgets.actionRow(inAppSettings, "复读按钮图片", "自定义复读按钮的图片，点开设置", new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsRepeaterIconPage.showDialog(inAppSettings);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRepeaterIconActivityResult(Activity activity, Intent intent) {
        if (activity == null || intent == null) {
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            final String strPersistPickedRepeaterIcon = persistPickedRepeaterIcon(activity, data);
            SharedPreferences.Editor editorEdit = activity.getSharedPreferences(Prefs.PREFS_NAME, 0).edit();
            Prefs.putString(editorEdit, Prefs.KEY_MESSAGE_REPEATER_ICON_PATH, strPersistPickedRepeaterIcon);
            editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).commit();
            HookEntry.setRuntimeString(Prefs.KEY_MESSAGE_REPEATER_ICON_PATH, strPersistPickedRepeaterIcon);
            final EditText editText = activePathInput.get();
            if (editText != null) {
                editText.post(new Runnable() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.6
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public void run() {
                        editText.setText(strPersistPickedRepeaterIcon);
                        editText.setSelection(strPersistPickedRepeaterIcon.length());
                    }
                });
            }
            Toast.makeText(activity, "已设置复读按钮图片，重进聊天后生效", 0).show();
        } catch (Throwable th) {
            Toast.makeText(activity, "复读按钮图片保存失败，请换一张图片", 0).show();
            HookEntry.log("handle repeater icon result failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void installRepeaterIconResultHook() {
        if (resultHookInstalled) {
            return;
        }
        resultHookInstalled = true;
        AbstractC0174d.m337a(REPEATER_ICON_REQUEST, new InterfaceC0032c() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0032c
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                if (i2 != -1 || intent == null) {
                    return;
                }
                InAppSettingsRepeaterIconPage.handleRepeaterIconActivityResult(activity, intent);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void openRepeaterIconPicker(InAppSettings inAppSettings, EditText editText, View view) {
        inAppSettings.keepCategoryBackTarget("repeater");
        inAppSettings.settleTextInput(editText, view);
        activePathInput = new WeakReference<>(editText);
        try {
            installRepeaterIconResultHook();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.addFlags(1);
            inAppSettings.activity.startActivityForResult(intent, REPEATER_ICON_REQUEST);
            inAppSettings.toast("选择图片后会自动保存为复读按钮图标");
        } catch (Throwable th) {
            try {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                intent2.addFlags(1);
                inAppSettings.activity.startActivityForResult(intent2, REPEATER_ICON_REQUEST);
                inAppSettings.toast("选择图片后会自动保存为复读按钮图标");
            } catch (Throwable unused) {
                inAppSettings.toast("无法打开图片选择器，请稍后重试");
                HookEntry.log("system repeater icon picker failed: " + th);
            }
        }
        inAppSettings.refocusElarisPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String persistPickedRepeaterIcon(Activity activity, Uri uri) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(activity.getFilesDir(), "elaris");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "repeater_icon_custom");
            InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException("image stream is null");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[8192];
                    int i = 0;
                    while (true) {
                        int i2 = inputStreamOpenInputStream.read(bArr);
                        if (i2 < 0) {
                            fileOutputStream2.flush();
                            String absolutePath = file2.getAbsolutePath();
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable unused) {
                            }
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable unused2) {
                            }
                            return absolutePath;
                        }
                        if (i2 != 0) {
                            i += i2;
                            if (i > 8388608) {
                                throw new IllegalArgumentException("image too large");
                            }
                            fileOutputStream2.write(bArr, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpenInputStream;
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                inputStream = inputStreamOpenInputStream;
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
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
            linearLayout.addView(inAppSettings.text("复读按钮图片", 17, InAppSettings.TEXT, 1));
            final EditText editTextInput = inAppSettings.input("未设置，使用默认 +1 图标", inAppSettings.getString(Prefs.KEY_MESSAGE_REPEATER_ICON_PATH));
            editTextInput.setFocusable(false);
            editTextInput.setFocusableInTouchMode(false);
            editTextInput.setCursorVisible(false);
            editTextInput.setKeyListener(null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(40.0f));
            layoutParams.topMargin = inAppSettings.m139dp(8.0f);
            linearLayout.addView(editTextInput, layoutParams);
            TextView textViewText = inAppSettings.text("选择后自动保存，恢复默认后使用 Elaris 默认 +1 图标", 12, InAppSettings.SUB, 0);
            textViewText.setPadding(0, inAppSettings.m139dp(6.0f), 0, 0);
            linearLayout.addView(textViewText);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
            TextView textViewDialogButton = inAppSettings.dialogButton("选择图片", true);
            textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    InAppSettingsRepeaterIconPage.openRepeaterIconPicker(inAppSettings, editTextInput, view);
                }
            });
            TextView textViewDialogButton2 = inAppSettings.dialogButton("恢复默认", false);
            textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    InAppSettingsRepeaterIconPage.clearRepeaterIconPath(inAppSettings, editTextInput, view);
                    alertDialogCreate.dismiss();
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(textViewDialogButton, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
            linearLayout2.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(8.0f), 1));
            linearLayout2.addView(textViewDialogButton2, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = inAppSettings.m139dp(10.0f);
            linearLayout.addView(linearLayout2, layoutParams2);
            ScrollView scrollView = new ScrollView(inAppSettings.activity);
            scrollView.setFillViewport(true);
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            alertDialogCreate.setView(scrollView, 0, 0, 0, 0);
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsRepeaterIconPage.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    inAppSettings.applyDialogWindowStyle(alertDialogCreate);
                }
            });
            alertDialogCreate.show();
            inAppSettings.applyDialogWindowStyle(alertDialogCreate);
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater icon dialog failed: "), ": ");
            inAppSettings.toast("复读图片设置打开失败");
        }
    }
}
