package p091z;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1142a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4403a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L9;
        Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L6
        Class r3 = Long.TYPE;     // Catch: Exception -> L6
        Trace.class.getMethod("isTagEnabled", new Class[]{r3});     // Catch: Exception -> L6
        Class r4 = Integer.TYPE;     // Catch: Exception -> L6
        Trace.class.getMethod("asyncTraceBegin", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        Trace.class.getMethod("asyncTraceEnd", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        Trace.class.getMethod("traceCounter", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        return;
    L10:
        return;
    }
}
