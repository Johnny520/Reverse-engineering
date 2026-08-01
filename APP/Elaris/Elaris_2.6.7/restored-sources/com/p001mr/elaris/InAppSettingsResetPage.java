package com.p001mr.elaris;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsResetPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsResetPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void resetAll(InAppSettings inAppSettings, SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (String str : Prefs.BOOLEAN_KEYS) {
                Prefs.putBoolean(editorEdit, str, false);
            }
            for (String str2 : Prefs.STRING_KEYS) {
                Prefs.putString(editorEdit, str2, Prefs.defaultString(str2));
            }
            editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).commit();
            for (String str3 : Prefs.BOOLEAN_KEYS) {
                HookEntry.setRuntimeBool(str3, false);
            }
            for (String str4 : Prefs.STRING_KEYS) {
                HookEntry.setRuntimeString(str4, Prefs.defaultString(str4));
            }
            inAppSettings.toast("已重置为默认关闭，重启 QQ 后完全生效");
        } catch (Throwable unused) {
            inAppSettings.toast("重置失败");
        }
    }
}
