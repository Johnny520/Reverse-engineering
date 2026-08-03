package Yue;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7947 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3134 = "Trace";

    /* JADX INFO: renamed from: ۥ۟ */
    public static long f3135;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Method f23714;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f23715;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Method f23716;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Method f23717;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ */
    public static void m3964(@InterfaceC6391 String str, int i) {
        try {
            if (f23715 == null) {
                C7949.m3968(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m3965(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3965(@InterfaceC6391 String str, int i) {
        try {
            if (f23715 == null) {
                f23715 = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f23715.invoke(null, Long.valueOf(f3135), str, Integer.valueOf(i));
        } catch (Exception e) {
            m25079("asyncTraceBegin", e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25075(@InterfaceC6391 String str) {
        C7948.m3966(str);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m25076(@InterfaceC6391 String str, int i) {
        try {
            if (f23716 == null) {
                C7949.m3969(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m25077(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m25077(@InterfaceC6391 String str, int i) {
        try {
            if (f23716 == null) {
                f23716 = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f23716.invoke(null, Long.valueOf(f3135), str, Integer.valueOf(i));
        } catch (Exception e) {
            m25079("asyncTraceEnd", e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m25078() {
        C7948.m3967();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m25079(@InterfaceC6391 String str, @InterfaceC6391 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f3134, "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m25080() {
        try {
            if (f23714 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m25081();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m25081() {
        try {
            if (f23714 == null) {
                f3135 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f23714 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f23714.invoke(null, Long.valueOf(f3135))).booleanValue();
        } catch (Exception e) {
            m25079("isTagEnabled", e);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m25082(@InterfaceC6391 String str, int i) {
        try {
            if (f23717 == null) {
                C7949.m25084(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m25083(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m25083(@InterfaceC6391 String str, int i) {
        try {
            if (f23717 == null) {
                f23717 = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f23717.invoke(null, Long.valueOf(f3135), str, Integer.valueOf(i));
        } catch (Exception e) {
            m25079("traceCounter", e);
        }
    }
}
