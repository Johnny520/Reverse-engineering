package Yue;

import android.os.Trace;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(29)
public final class C7949 {
    /* JADX INFO: renamed from: ۥ */
    public static void m3968(@InterfaceC6391 String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3969(@InterfaceC6391 String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25084(@InterfaceC6391 String str, int i) {
        Trace.setCounter(str, i);
    }
}
