package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1115 implements xhss.InterfaceC1173 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0263 f3594 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method f3595;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.reflect.Method f3596;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class f3597;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.reflect.Method f3598;

    static {
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r1 = 14
            r0.<init>(r1)
            xhss.C1115.f3594 = r0
            return
    }

    public C1115(java.lang.Class r3) {
            r2 = this;
            r2.<init>()
            r2.f3597 = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            r2.f3595 = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            r3.getMethod(r1, r0)
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.f3596 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.f3598 = r3
            return
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo467(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.Class r0 = r2.f3597
            boolean r0 = r0.isInstance(r3)
            r1 = 0
            if (r0 != 0) goto La
            goto L33
        La:
            java.lang.reflect.Method r2 = r2.f3596     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.lang.Object r2 = r2.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            byte[] r2 = (byte[]) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            if (r2 == 0) goto L33
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.nio.charset.Charset r0 = xhss.AbstractC0619.f2136     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
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
            boolean r3 = xhss.AbstractC0007.m97(r3, r0)
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

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo468() {
            r0 = this;
            int r0 = xhss.AbstractC0670.f2290
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo469(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.Class r0 = r0.f3597
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo470(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List r4) {
            r1 = this;
            java.lang.Class r3 = r1.f3597
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L31
            java.lang.reflect.Method r3 = r1.f3595     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            r3.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.reflect.Method r1 = r1.f3598     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            xhss.ᛵᛳᛸᲇ r3 = xhss.AbstractC0831.f2712     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            byte[] r3 = xhss.C0564.m1030(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            return
        L23:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L2a:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L31:
            return
    }
}
