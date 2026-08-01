package p278t3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8105h {

    /* JADX INFO: renamed from: a */
    public static long f27048a;

    /* JADX INFO: renamed from: b */
    public static Method f27049b;

    /* JADX INFO: renamed from: c */
    public static Method f27050c;

    /* JADX INFO: renamed from: d */
    public static Method f27051d;

    /* JADX INFO: renamed from: e */
    public static Method f27052e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f27048a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f27049b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f27050c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f27051d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f27052e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m31324a(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m31325b() {
        Trace.endSection();
    }
}
