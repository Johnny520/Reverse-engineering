package com.p001mr.elaris;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0174d;
import p000.C0479u2;
import p000.InterfaceC0032c;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsConfigBackupPage {
    private static final String BACKUP_TYPE = "elaris_settings_backup";
    private static final int EXPORT_REQUEST = 8211;
    private static final int IMPORT_REQUEST = 8212;
    private static final int MAX_IMPORT_BYTES = 1048576;
    private static volatile WeakReference<InAppSettings> activeSettings = new WeakReference<>(null);
    private static volatile boolean resultHookInstalled = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsConfigBackupPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String backupFileName() {
        return "Elaris-settings-" + new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date()) + ".json";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View create(final InAppSettings inAppSettings) {
        LinearLayout linearLayoutInnerBox = inAppSettings.innerBox();
        TextView textViewText = inAppSettings.text("模块配置", 15, InAppSettings.TEXT, 1);
        textViewText.setPadding(0, inAppSettings.m139dp(2.0f), 0, 0);
        linearLayoutInnerBox.addView(textViewText);
        TextView textViewText2 = inAppSettings.text("导出或恢复 Elaris 开关和文本配置，不包含 QQ 聊天数据", 12, InAppSettings.SUB, 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(2.0f), 0, 0);
        linearLayoutInnerBox.addView(textViewText2);
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        TextView textViewButton = inAppSettings.button("导出配置");
        textViewButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsConfigBackupPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsConfigBackupPage.openExportPicker(inAppSettings, view);
            }
        });
        TextView textViewButton2 = inAppSettings.button("导入配置");
        textViewButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsConfigBackupPage.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsConfigBackupPage.openImportPicker(inAppSettings, view);
            }
        });
        linearLayout.addView(textViewButton, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
        linearLayout.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(10.0f), 1));
        linearLayout.addView(textViewButton2, new LinearLayout.LayoutParams(0, inAppSettings.m139dp(36.0f), 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = inAppSettings.m139dp(6.0f);
        linearLayoutInnerBox.addView(linearLayout, layoutParams);
        TextView textViewButton3 = inAppSettings.button("重置全部开关");
        textViewButton3.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsConfigBackupPage.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                inAppSettings.resetAllSettingsToDefaultOff();
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(36.0f));
        layoutParams2.topMargin = inAppSettings.m139dp(6.0f);
        linearLayoutInnerBox.addView(textViewButton3, layoutParams2);
        return linearLayoutInnerBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void handleExportResult(Activity activity, Uri uri) {
        try {
            writeBackup(activity, uri);
            Toast.makeText(activity, "配置已导出", 0).show();
        } catch (Throwable th) {
            Toast.makeText(activity, "配置导出失败", 0).show();
            HookEntry.log("settings backup export failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void handleImportResult(Activity activity, Uri uri) {
        try {
            int iImportBackup = importBackup(activity, uri);
            InAppSettings inAppSettings = activeSettings.get();
            if (inAppSettings != null) {
                inAppSettings.refreshCurrentPage();
            }
            Toast.makeText(activity, "配置已导入：" + iImportBackup + " 项，建议重启 QQ", 0).show();
        } catch (Throwable th) {
            Toast.makeText(activity, "配置导入失败，请确认文件正确", 0).show();
            HookEntry.log("settings backup import failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int importBackup(Activity activity, Uri uri) {
        int i;
        JSONObject jSONObject = new JSONObject(readText(activity, uri));
        if (!BACKUP_TYPE.equals(jSONObject.optString("type", ""))) {
            throw new IllegalArgumentException("unexpected backup type");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("booleans");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("strings");
        int i2 = 0;
        SharedPreferences.Editor editorEdit = activity.getSharedPreferences(Prefs.PREFS_NAME, 0).edit();
        String[] strArr = Prefs.BOOLEAN_KEYS;
        boolean[] zArr = new boolean[strArr.length];
        boolean[] zArr2 = new boolean[strArr.length];
        String[] strArr2 = Prefs.STRING_KEYS;
        boolean[] zArr3 = new boolean[strArr2.length];
        String[] strArr3 = new String[strArr2.length];
        if (jSONObjectOptJSONObject != null) {
            int i3 = 0;
            i = 0;
            while (true) {
                String[] strArr4 = Prefs.BOOLEAN_KEYS;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str = strArr4[i3];
                if (jSONObjectOptJSONObject.has(str)) {
                    zArr[i3] = true;
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean(str, Prefs.defaultBoolean(str));
                    zArr2[i3] = zOptBoolean;
                    Prefs.putBoolean(editorEdit, str, zOptBoolean);
                    i++;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        if (jSONObjectOptJSONObject2 != null) {
            int i4 = 0;
            while (true) {
                String[] strArr5 = Prefs.STRING_KEYS;
                if (i4 >= strArr5.length) {
                    break;
                }
                String str2 = strArr5[i4];
                if (jSONObjectOptJSONObject2.has(str2)) {
                    zArr3[i4] = true;
                    String strOptString = jSONObjectOptJSONObject2.optString(str2, Prefs.defaultString(str2));
                    strArr3[i4] = strOptString;
                    Prefs.putString(editorEdit, str2, strOptString);
                    i++;
                }
                i4++;
            }
        }
        if (i <= 0) {
            throw new IllegalArgumentException("empty backup");
        }
        editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis());
        if (!editorEdit.commit()) {
            C0479u2.m1037b("commit backup failed");
            return 0;
        }
        int i5 = 0;
        while (true) {
            String[] strArr6 = Prefs.BOOLEAN_KEYS;
            if (i5 >= strArr6.length) {
                break;
            }
            if (zArr[i5]) {
                HookEntry.setRuntimeBool(strArr6[i5], zArr2[i5]);
            }
            i5++;
        }
        while (true) {
            String[] strArr7 = Prefs.STRING_KEYS;
            if (i2 >= strArr7.length) {
                return i;
            }
            if (zArr3[i2]) {
                HookEntry.setRuntimeString(strArr7[i2], strArr3[i2]);
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void installResultHook() {
        if (resultHookInstalled) {
            return;
        }
        resultHookInstalled = true;
        InterfaceC0032c interfaceC0032c = new InterfaceC0032c() { // from class: com.mr.elaris.InAppSettingsConfigBackupPage.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0032c
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                Uri data;
                if (i2 != -1 || intent == null || (data = intent.getData()) == null) {
                    return;
                }
                if (i == InAppSettingsConfigBackupPage.EXPORT_REQUEST) {
                    InAppSettingsConfigBackupPage.handleExportResult(activity, data);
                } else if (i == InAppSettingsConfigBackupPage.IMPORT_REQUEST) {
                    InAppSettingsConfigBackupPage.handleImportResult(activity, data);
                }
            }
        };
        AbstractC0174d.m337a(EXPORT_REQUEST, interfaceC0032c);
        AbstractC0174d.m337a(IMPORT_REQUEST, interfaceC0032c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void openExportPicker(InAppSettings inAppSettings, View view) {
        activeSettings = new WeakReference<>(inAppSettings);
        try {
            installResultHook();
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("application/json");
            intent.putExtra("android.intent.extra.TITLE", backupFileName());
            intent.addFlags(2);
            inAppSettings.activity.startActivityForResult(intent, EXPORT_REQUEST);
            inAppSettings.toast("请选择配置备份保存位置");
        } catch (Throwable th) {
            inAppSettings.toast("无法打开文件保存器");
            HookEntry.log("settings backup export picker failed: " + th);
        }
        inAppSettings.refocusElarisPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void openImportPicker(InAppSettings inAppSettings, View view) {
        activeSettings = new WeakReference<>(inAppSettings);
        try {
            installResultHook();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            intent.addFlags(1);
            inAppSettings.activity.startActivityForResult(intent, IMPORT_REQUEST);
            inAppSettings.toast("请选择 Elaris 配置备份文件");
        } catch (Throwable th) {
            try {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("*/*");
                intent2.addFlags(1);
                inAppSettings.activity.startActivityForResult(intent2, IMPORT_REQUEST);
                inAppSettings.toast("请选择 Elaris 配置备份文件");
            } catch (Throwable unused) {
                inAppSettings.toast("无法打开文件选择器");
                HookEntry.log("settings backup import picker failed: " + th);
            }
        }
        inAppSettings.refocusElarisPage(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static String readText(Activity activity, Uri uri) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("backup input stream is null");
            }
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int i2 = inputStreamOpenInputStream.read(bArr);
                if (i2 < 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return str;
                }
                if (i2 != 0) {
                    i += i2;
                    if (i > MAX_IMPORT_BYTES) {
                        throw new IllegalArgumentException("backup file too large");
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void writeBackup(Activity activity, Uri uri) throws JSONException {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(Prefs.PREFS_NAME, 0);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        for (String str : Prefs.BOOLEAN_KEYS) {
            jSONObject2.put(str, Prefs.readBoolean(sharedPreferences, str));
        }
        for (String str2 : Prefs.STRING_KEYS) {
            jSONObject3.put(str2, Prefs.readString(sharedPreferences, str2));
        }
        jSONObject.put("type", BACKUP_TYPE);
        jSONObject.put("version", 1);
        jSONObject.put("createdAt", System.currentTimeMillis());
        jSONObject.put("booleans", jSONObject2);
        jSONObject.put("strings", jSONObject3);
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(uri, "wt");
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("backup output stream is null");
            }
            outputStreamOpenOutputStream.write(jSONObject.toString(2).getBytes("UTF-8"));
            outputStreamOpenOutputStream.flush();
            try {
                outputStreamOpenOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }
}
