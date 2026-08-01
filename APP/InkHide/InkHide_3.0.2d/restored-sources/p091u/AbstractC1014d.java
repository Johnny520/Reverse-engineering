package p091u;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1014d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3612a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }
}
