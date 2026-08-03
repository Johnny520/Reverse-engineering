package a;

/* JADX INFO: renamed from: a.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f780a;
    public static java.lang.reflect.Method b;

    @android.annotation.SuppressLint({"NewApi"})
    public static boolean a() {
            java.lang.reflect.Method r0 = a.C0503zf.b     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = a.E.p()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.reflect.Method r1 = a.C0503zf.b     // Catch: java.lang.Exception -> L41
            r2 = 0
            if (r1 != 0) goto L2a
            java.lang.String r1 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r0.getField(r1)     // Catch: java.lang.Exception -> L41
            long r3 = r1.getLong(r2)     // Catch: java.lang.Exception -> L41
            a.C0503zf.f780a = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L41
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L41
            a.C0503zf.b = r0     // Catch: java.lang.Exception -> L41
        L2a:
            java.lang.reflect.Method r0 = a.C0503zf.b     // Catch: java.lang.Exception -> L41
            long r3 = a.C0503zf.f780a     // Catch: java.lang.Exception -> L41
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L41
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L41
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L41
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L41
            goto L5f
        L41:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L57
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L51
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L51:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L57:
            java.lang.String r1 = "Unable to call isTagEnabled via reflection"
            java.lang.String r2 = "Trace"
            android.util.Log.v(r2, r1, r0)
            r0 = 0
        L5f:
            return r0
    }
}
