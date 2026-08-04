package yyds;

import android.util.Log;

/* JADX INFO: renamed from: yyds.ᲀᛵᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2003 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0078 f10023 = new C0078(new C2307(29));

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0078 f10024;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0805 f10025;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f10026;

    static {
        C0078 c0078 = new C0078(new C0824(0));
        f10024 = c0078;
        f10025 = new C0805(19);
        f10026 = 3;
        if (!((Boolean) c0078.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "warn");
        }
        f10026 = 3;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m3882(String str, Throwable th) {
        if (AbstractC2104.m4012(f10026) <= AbstractC2104.m4012(3)) {
            f10025.getClass();
            if (((Boolean) f10024.getValue()).booleanValue()) {
                Log.w("KavaRef", String.valueOf(str), th);
            } else {
                ((InterfaceC0732) f10023.getValue()).mo1682(String.valueOf(str), th);
            }
        }
    }
}
