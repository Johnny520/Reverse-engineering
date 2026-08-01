package p238q4;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.C5750e;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6244a {

    /* JADX INFO: renamed from: a */
    public static long f19384a;

    /* JADX INFO: renamed from: b */
    public static Method f19385b;

    /* JADX INFO: renamed from: a */
    public static void m24638a(String str) {
        AbstractC6245b.m24644a(m24643f(str));
    }

    /* JADX INFO: renamed from: b */
    public static void m24639b() {
        AbstractC6245b.m24645b();
    }

    /* JADX INFO: renamed from: c */
    public static void m24640c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            C5750e.m23251a(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24641d() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC6246c.m24646a() : m24642e();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24642e() {
        try {
            if (f19385b == null) {
                f19384a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f19385b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f19385b.invoke(null, Long.valueOf(f19384a))).booleanValue();
        } catch (Exception e10) {
            m24640c("isTagEnabled", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m24643f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
