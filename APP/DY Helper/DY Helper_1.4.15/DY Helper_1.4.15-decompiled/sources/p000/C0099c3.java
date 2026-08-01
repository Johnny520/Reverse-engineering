package p000;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0099c3 implements p000.mx1 {

    /* JADX INFO: renamed from: ε */
    public static final p000.C0381i2 f1949 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f1950;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f1951;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f1952;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f1953;

    static {
            i2 r0 = new i2
            r1 = 1
            r0.<init>(r1)
            p000.C0099c3.f1949 = r0
            return
    }

    public C0099c3(java.lang.Class r3) {
            r2 = this;
            r2.<init>()
            r2.f1950 = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            r0.getClass()
            r2.f1951 = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            r3.getMethod(r1, r0)
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.f1952 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.f1953 = r3
            return
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: α */
    public final boolean mo1120(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.Class r0 = r0.f1950
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1121(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.Class r0 = r2.f1950
            boolean r0 = r0.isInstance(r3)
            r1 = 0
            if (r0 != 0) goto La
            goto L33
        La:
            java.lang.reflect.Method r2 = r2.f1952     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.lang.Object r2 = r2.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            byte[] r2 = (byte[]) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            if (r2 == 0) goto L33
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.nio.charset.Charset r0 = p000.AbstractC0547mf.f7105     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            r3.<init>(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            return r3
        L1c:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r0 = r3 instanceof java.lang.NullPointerException
            if (r0 == 0) goto L34
            java.lang.NullPointerException r3 = (java.lang.NullPointerException) r3
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "ssl == null"
            boolean r3 = p000.ln0.m3626(r3, r0)
            if (r3 == 0) goto L34
        L33:
            return r1
        L34:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
        L3a:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: γ */
    public final boolean mo1122() {
            r0 = this;
            int r0 = p000.AbstractC1043z2.f12944
            r0 = 0
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: δ */
    public final void mo1123(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List r4) {
            r1 = this;
            r4.getClass()
            java.lang.Class r3 = r1.f1950
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L34
            java.lang.reflect.Method r3 = r1.f1951     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r3.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.reflect.Method r1 = r1.f1953     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            f0 r3 = p000.gh1.f4375     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            byte[] r3 = p000.rk0.m5105(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            return
        L26:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L2d:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L34:
            return
    }
}
