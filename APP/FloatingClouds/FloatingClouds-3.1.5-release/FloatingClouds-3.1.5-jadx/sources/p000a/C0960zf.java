package p000a;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.zf */
/* JADX INFO: loaded from: classes.dex */
public final class C0960zf {

    /* JADX INFO: renamed from: a */
    public static long f3568a;

    /* JADX INFO: renamed from: b */
    public static Method f3569b;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static boolean m2249a() {
        try {
            if (f3569b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f3569b == null) {
                f3568a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3569b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3569b.invoke(null, Long.valueOf(f3568a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
