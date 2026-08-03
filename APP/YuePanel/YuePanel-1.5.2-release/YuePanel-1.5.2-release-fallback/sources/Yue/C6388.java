package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class C6388 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f22616 = "TraceCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static long f22617;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22618;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22619;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22620;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Method f22621;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6389 {
        public C6389() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m23598(java.lang.String r0, int r1) {
                android.os.Trace.beginAsyncSection(r0, r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m23599(java.lang.String r0, int r1) {
                android.os.Trace.endAsyncSection(r0, r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m23600() {
                boolean r0 = android.os.Trace.isEnabled()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m23601(java.lang.String r0, long r1) {
                android.os.Trace.setCounter(r0, r1)
                return
        }
    }

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L54
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L4c
            r3 = 0
            long r2 = r2.getLong(r3)     // Catch: java.lang.Exception -> L4c
            Yue.C6388.f22617 = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L4c
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L4c
            Yue.C6388.f22618 = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "asyncTraceBegin"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4c
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L4c
            Yue.C6388.f22619 = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L4c
            Yue.C6388.f22620 = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r0, r4}     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r0 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L4c
            Yue.C6388.f22621 = r0     // Catch: java.lang.Exception -> L4c
            goto L54
        L4c:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L54:
            return
    }

    public C6388() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23592(@Yue.InterfaceC4410 java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            Yue.C6388.C6389.m23598(r3, r4)
            goto L26
        La:
            java.lang.reflect.Method r0 = Yue.C6388.f22619     // Catch: java.lang.Exception -> L1f
            long r1 = Yue.C6388.f22617     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L1f
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L1f
            goto L26
        L1f:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke asyncTraceBegin() via reflection."
            android.util.Log.v(r3, r4)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23593(@Yue.InterfaceC4410 java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23594(@Yue.InterfaceC4410 java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            Yue.C6388.C6389.m23599(r3, r4)
            goto L26
        La:
            java.lang.reflect.Method r0 = Yue.C6388.f22620     // Catch: java.lang.Exception -> L1f
            long r1 = Yue.C6388.f22617     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L1f
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L1f
            goto L26
        L1f:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke endAsyncSection() via reflection."
            android.util.Log.v(r3, r4)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m23595() {
            android.os.Trace.endSection()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m23596() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = Yue.C6388.C6389.m23600()
            return r0
        Lb:
            java.lang.reflect.Method r0 = Yue.C6388.f22618     // Catch: java.lang.Exception -> L23
            long r1 = Yue.C6388.f22617     // Catch: java.lang.Exception -> L23
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L23
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L23
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L23
            return r0
        L23:
            java.lang.String r0 = "TraceCompat"
            java.lang.String r1 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r0, r1)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23597(@Yue.InterfaceC4410 java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r4
            Yue.C6388.C6389.m23601(r3, r0)
            goto L27
        Lb:
            java.lang.reflect.Method r0 = Yue.C6388.f22621     // Catch: java.lang.Exception -> L20
            long r1 = Yue.C6388.f22617     // Catch: java.lang.Exception -> L20
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L20
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L20
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L20
            goto L27
        L20:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke traceCounter() via reflection."
            android.util.Log.v(r3, r4)
        L27:
            return
    }
}
