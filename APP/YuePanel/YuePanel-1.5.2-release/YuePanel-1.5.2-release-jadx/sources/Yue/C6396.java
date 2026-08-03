package Yue;

import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۡۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6396 {
    /* JADX INFO: renamed from: ۥ */
    public static String m2839(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m2840(String str) {
        return m2839(str).trim();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m19949(String str, boolean z) {
        return z ? m2839(str) : m2840(str);
    }
}
