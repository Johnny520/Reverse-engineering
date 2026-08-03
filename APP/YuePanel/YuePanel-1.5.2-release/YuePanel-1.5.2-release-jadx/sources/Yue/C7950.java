package Yue;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C7950 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3136 = "TraceCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static long f3137;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Method f23718;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f23719;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Method f23720;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Method f23721;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۡ$ۥ */
    @InterfaceC7113(29)
    public static class C1387 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3972(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m3973(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m25089() {
            return Trace.isEnabled();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m25090(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3137 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f23718 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f23719 = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f23720 = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f23721 = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i(f3136, "Unable to initialize via reflection.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3970(@InterfaceC6391 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1387.m3972(str, i);
            return;
        }
        try {
            f23719.invoke(null, Long.valueOf(f3137), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(f3136, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3971(@InterfaceC6391 String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25085(@InterfaceC6391 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1387.m3973(str, i);
            return;
        }
        try {
            f23720.invoke(null, Long.valueOf(f3137), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(f3136, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m25086() {
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m25087() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1387.m25089();
        }
        try {
            return ((Boolean) f23718.invoke(null, Long.valueOf(f3137))).booleanValue();
        } catch (Exception unused) {
            Log.v(f3136, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m25088(@InterfaceC6391 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1387.m25090(str, i);
            return;
        }
        try {
            f23721.invoke(null, Long.valueOf(f3137), str, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.v(f3136, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
