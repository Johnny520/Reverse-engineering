package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6385 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f22610 = "Trace";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static long f22611;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22612;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22613;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22614;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Method f22615;

    public C6385() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23576(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = Yue.C6385.f22613     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            Yue.C6387.m23589(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            m23577(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23577(@Yue.InterfaceC4410 java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceBegin"
            java.lang.reflect.Method r1 = Yue.C6385.f22613     // Catch: java.lang.Exception -> L19
            if (r1 != 0) goto L1b
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L19
            Yue.C6385.f22613 = r1     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r5 = move-exception
            goto L30
        L1b:
            java.lang.reflect.Method r1 = Yue.C6385.f22613     // Catch: java.lang.Exception -> L19
            long r2 = Yue.C6385.f22611     // Catch: java.lang.Exception -> L19
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L19
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L19
            goto L33
        L30:
            m23582(r0, r5)
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23578(@Yue.InterfaceC4410 java.lang.String r0) {
            Yue.C6386.m23587(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m23579(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = Yue.C6385.f22614     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            Yue.C6387.m23590(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            m23580(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m23580(@Yue.InterfaceC4410 java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r1 = Yue.C6385.f22614     // Catch: java.lang.Exception -> L19
            if (r1 != 0) goto L1b
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L19
            Yue.C6385.f22614 = r1     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r5 = move-exception
            goto L30
        L1b:
            java.lang.reflect.Method r1 = Yue.C6385.f22614     // Catch: java.lang.Exception -> L19
            long r2 = Yue.C6385.f22611     // Catch: java.lang.Exception -> L19
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L19
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L19
            goto L33
        L30:
            m23582(r0, r5)
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23581() {
            Yue.C6386.m23588()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m23582(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            java.lang.Throwable r2 = r3.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto Lf
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        Lf:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to call "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " via reflection"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "Trace"
            android.util.Log.v(r0, r2, r3)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m23583() {
            java.lang.reflect.Method r0 = Yue.C6385.f22612     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = Yue.C6384.m23575()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            boolean r0 = m23584()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m23584() {
            java.lang.String r0 = "isTagEnabled"
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.reflect.Method r2 = Yue.C6385.f22612     // Catch: java.lang.Exception -> L22
            r3 = 0
            if (r2 != 0) goto L24
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L22
            long r4 = r2.getLong(r3)     // Catch: java.lang.Exception -> L22
            Yue.C6385.f22611 = r4     // Catch: java.lang.Exception -> L22
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L22
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L22
            Yue.C6385.f22612 = r1     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L3b
        L24:
            java.lang.reflect.Method r1 = Yue.C6385.f22612     // Catch: java.lang.Exception -> L22
            long r4 = Yue.C6385.f22611     // Catch: java.lang.Exception -> L22
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L22
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L22
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L22
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L22
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L22
            return r0
        L3b:
            m23582(r0, r1)
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m23585(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = Yue.C6385.f22615     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            Yue.C6387.m23591(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            m23586(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m23586(@Yue.InterfaceC4410 java.lang.String r5, int r6) {
            java.lang.String r0 = "traceCounter"
            java.lang.reflect.Method r1 = Yue.C6385.f22615     // Catch: java.lang.Exception -> L19
            if (r1 != 0) goto L1b
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L19
            Yue.C6385.f22615 = r1     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r5 = move-exception
            goto L30
        L1b:
            java.lang.reflect.Method r1 = Yue.C6385.f22615     // Catch: java.lang.Exception -> L19
            long r2 = Yue.C6385.f22611     // Catch: java.lang.Exception -> L19
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L19
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L19
            goto L33
        L30:
            m23582(r0, r5)
        L33:
            return
    }
}
