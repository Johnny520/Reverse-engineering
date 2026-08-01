package defpackage;

/* JADX INFO: renamed from: ᛷᛵᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1276 implements defpackage.InterfaceC1130 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0862 f5702 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final boolean f5703 = false;

    static {
            ᛵᛴᛱᲀ r0 = new ᛵᛴᛱᲀ
            r0.<init>()
            defpackage.C1276.f5702 = r0
            r0 = 0
            java.lang.String r1 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class<ᛲᲈᲀᲈ> r2 = defpackage.AbstractC0397.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L14
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L14
            r0 = 1
        L14:
            defpackage.C1276.f5703 = r0
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo686(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            boolean r0 = r0.mo689(r1)
            if (r0 == 0) goto L21
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            org.bouncycastle.jsse.BCSSLParameters r0 = r1.getParameters()
            ᛴᲈᲀᲇ r2 = defpackage.AbstractC1692.f7550
            java.util.ArrayList r2 = defpackage.C1487.m2692(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.setApplicationProtocols(r2)
            r1.setParameters(r0)
        L21:
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo687() {
            r0 = this;
            boolean r0 = defpackage.C1276.f5703
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo688(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            java.lang.String r0 = r1.getApplicationProtocol()
            if (r0 == 0) goto L12
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo689(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
