package d3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1974a = 0;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L45
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L3d
            r3 = 0
            r2.getLong(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3d
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L3d
            r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "asyncTraceBegin"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L3d
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L3d
            r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L3d
            r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L3d
            r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L45:
            return
    }
}
