package Yue;

import Yue.InterfaceC7144;
import android.util.Log;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class C7582 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2949 = "StartupLogger";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f2950 = false;

    /* JADX INFO: renamed from: ۥ */
    public static void m3743(@InterfaceC6391 String str, @InterfaceC6490 Throwable th) {
        Log.e(f2949, str, th);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3744(@InterfaceC6391 String str) {
        Log.i(f2949, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23728(@InterfaceC6391 String str) {
        Log.w(f2949, str);
    }
}
