package com.p001mr.elaris;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class HookConfig {
    private final Map<String, Boolean> booleans = new ConcurrentHashMap();
    private final Map<String, String> strings = new ConcurrentHashMap();
    private volatile boolean loadedLogged = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HookConfig() {
        for (String str : Prefs.BOOLEAN_KEYS) {
            this.booleans.put(str, Boolean.valueOf(Prefs.defaultBoolean(str)));
        }
        for (String str2 : Prefs.STRING_KEYS) {
            this.strings.put(str2, Prefs.defaultString(str2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static SharedPreferences openPreferences(Context context) {
        if (context == null) {
            return null;
        }
        int i = 0;
        while (i < 4 && (context instanceof ContextWrapper)) {
            try {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null && baseContext != context) {
                    i++;
                    context = baseContext;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            return context.getSharedPreferences(Prefs.PREFS_NAME, 0);
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean bool(String str) {
        Boolean bool = this.booleans.get(str);
        return bool != null ? bool.booleanValue() : Prefs.defaultBoolean(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void reloadBlocking(Application application, String str) {
        if (application == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesOpenPreferences = openPreferences(application);
            if (sharedPreferencesOpenPreferences == null) {
                return;
            }
            for (String str2 : Prefs.BOOLEAN_KEYS) {
                this.booleans.put(str2, Boolean.valueOf(Prefs.readBoolean(sharedPreferencesOpenPreferences, str2)));
            }
            for (String str3 : Prefs.STRING_KEYS) {
                this.strings.put(str3, Prefs.readString(sharedPreferencesOpenPreferences, str3));
            }
            XposedBridge.setLoggingEnabled(bool(Prefs.KEY_DEBUG_LOG));
            if (!this.loadedLogged) {
                this.loadedLogged = true;
                HookEntry.log("host settings loaded via " + str + ", version=" + sharedPreferencesOpenPreferences.getLong(Prefs.KEY_CONFIG_VERSION, 0L));
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reloadFromContext(Context context, String str) {
        Context applicationContext;
        SharedPreferences sharedPreferencesOpenPreferences;
        if (context == null) {
            applicationContext = null;
        } else {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Throwable unused) {
                return;
            }
        }
        if (applicationContext != null) {
            context = applicationContext;
        }
        if (context == null || (sharedPreferencesOpenPreferences = openPreferences(context)) == null) {
            return;
        }
        for (String str2 : Prefs.BOOLEAN_KEYS) {
            this.booleans.put(str2, Boolean.valueOf(Prefs.readBoolean(sharedPreferencesOpenPreferences, str2)));
        }
        for (String str3 : Prefs.STRING_KEYS) {
            this.strings.put(str3, Prefs.readString(sharedPreferencesOpenPreferences, str3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBool(String str, boolean z) {
        this.booleans.put(str, Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setString(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.strings.put(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String string(String str, String str2) {
        String str3 = this.strings.get(str);
        return str3 == null ? str2 : str3;
    }
}
