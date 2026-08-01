package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0158 implements defpackage.InterfaceC1130 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1403 f1124 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Method f1125;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method f1126;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f1127;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method f1128;

    static {
            ᛷᲈᲀ r0 = new ᛷᲈᲀ
            r1 = 9
            r0.<init>(r1)
            defpackage.C0158.f1124 = r0
            return
    }

    public C0158(java.lang.Class r3) {
            r2 = this;
            r2.<init>()
            r2.f1127 = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            r2.f1128 = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            r3.getMethod(r1, r0)
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.f1126 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.f1125 = r3
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo686(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List r4) {
            r1 = this;
            java.lang.Class r3 = r1.f1127
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L31
            java.lang.reflect.Method r3 = r1.f1128     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            r3.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            java.lang.reflect.Method r1 = r1.f1125     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            ᛴᲈᲀᲇ r3 = defpackage.AbstractC1692.f7550     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
            byte[] r3 = defpackage.C1487.m2690(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L2a
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

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean mo687() {
            r0 = this;
            int r0 = defpackage.AbstractC2024.f8728
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String mo688(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.Class r0 = r2.f1127
            boolean r0 = r0.isInstance(r3)
            r1 = 0
            if (r0 != 0) goto La
            goto L33
        La:
            java.lang.reflect.Method r2 = r2.f1126     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.lang.Object r2 = r2.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            byte[] r2 = (byte[]) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            if (r2 == 0) goto L33
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
            java.nio.charset.Charset r0 = defpackage.AbstractC1422.f6221     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L3a
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
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r0)
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

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean mo689(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.Class r0 = r0.f1127
            boolean r0 = r0.isInstance(r1)
            return r0
    }
}
