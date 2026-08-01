package androidx.tracing;

/* JADX INFO: loaded from: classes2.dex */
public final class Trace {
    static final java.lang.String TAG = "Trace";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    private Trace() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.beginAsyncSection(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            return
        L8:
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            beginAsyncSectionFallback(r1, r2)
            return
    }

    private static void beginAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceBegin"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L18
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L2d
            androidx.tracing.Trace.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L2d
        L18:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L2d
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L2d
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r1 = move-exception
            handleException(r0, r1)
        L31:
            return
    }

    public static void beginSection(java.lang.String r0) {
            androidx.tracing.TraceApi18Impl.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.endAsyncSection(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            return
        L8:
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            endAsyncSectionFallback(r1, r2)
            return
    }

    private static void endAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L18
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L2d
            androidx.tracing.Trace.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L2d
        L18:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L2d
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L2d
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r1 = move-exception
            handleException(r0, r1)
        L31:
            return
    }

    public static void endSection() {
            androidx.tracing.TraceApi18Impl.endSection()
            return
    }

    private static void handleException(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = r3.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L10:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to call "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " via reflection"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Trace"
            android.util.Log.v(r1, r0, r3)
            return
    }

    public static boolean isEnabled() {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.NoClassDefFoundError -> La java.lang.NoSuchMethodError -> Lc
            if (r0 != 0) goto L9
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.NoClassDefFoundError -> La java.lang.NoSuchMethodError -> Lc
            return r0
        L9:
            goto Ld
        La:
            r0 = move-exception
            goto Ld
        Lc:
            r0 = move-exception
        Ld:
            boolean r0 = isEnabledFallback()
            return r0
    }

    private static boolean isEnabledFallback() {
            java.lang.String r0 = "isTagEnabled"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3a
            r2 = 0
            if (r1 != 0) goto L23
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r3 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r1.getField(r3)     // Catch: java.lang.Exception -> L3a
            long r3 = r1.getLong(r2)     // Catch: java.lang.Exception -> L3a
            androidx.tracing.Trace.sTraceTagApp = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Class<android.os.Trace> r3 = android.os.Trace.class
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3a
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L3a
            java.lang.reflect.Method r3 = r3.getMethod(r0, r4)     // Catch: java.lang.Exception -> L3a
            androidx.tracing.Trace.sIsTagEnabledMethod = r3     // Catch: java.lang.Exception -> L3a
        L23:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3a
            long r3 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L3a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L3a
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L3a
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L3a
            return r0
        L3a:
            r1 = move-exception
            handleException(r0, r1)
            r0 = 0
            return r0
    }

    public static void setCounter(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.setCounter(r1, r2)     // Catch: java.lang.NoClassDefFoundError -> L9 java.lang.NoSuchMethodError -> Lb
            return
        L8:
            goto Lc
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            r0 = move-exception
        Lc:
            setCounterFallback(r1, r2)
            return
    }

    private static void setCounterFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "traceCounter"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L2d
            if (r1 != 0) goto L18
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2d
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L2d
            androidx.tracing.Trace.sTraceCounterMethod = r1     // Catch: java.lang.Exception -> L2d
        L18:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L2d
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L2d
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r1 = move-exception
            handleException(r0, r1)
        L31:
            return
    }
}
