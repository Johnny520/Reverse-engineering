package me.yun.fkwechat.core.config;

import android.content.SharedPreferences;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfigRepo {
    private static final String PREF_NAME = "Module_Config";
    private static SharedPreferences sharedPrefs;

    static {
        FkwLoader.registerNativesForClass(2, ConfigRepo.class);
        Hidden0.special_clinit_2_00(ConfigRepo.class);
    }

    public static native void clear();

    public static native boolean contains(String str);

    public static native boolean getBoolean(String str, boolean z10);

    public static native float getFloat(String str, float f10);

    public static native int getInt(String str, int i10);

    public static native long getLong(String str, long j10);

    public static native String getString(String str, String str2);

    public static native void remove(String str);

    public static native void setBoolean(String str, boolean z10);

    public static native void setFloat(String str, float f10);

    public static native void setInt(String str, int i10);

    public static native void setLong(String str, long j10);

    public static native void setString(String str, String str2);
}
