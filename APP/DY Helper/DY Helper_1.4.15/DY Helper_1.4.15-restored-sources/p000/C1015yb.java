package p000;

/* JADX INFO: renamed from: yb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1015yb implements p000.mx1 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0941wb f12545 = null;

    /* JADX INFO: renamed from: β */
    public static final boolean f12546 = false;

    static {
            wb r0 = new wb
            r0.<init>()
            p000.C1015yb.f12545 = r0
            r0 = 0
            java.lang.String r1 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class<xb> r2 = p000.AbstractC0978xb.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L14
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L14
            r0 = 1
        L14:
            p000.C1015yb.f12546 = r0
            return
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: α */
    public final boolean mo1120(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1121(javax.net.ssl.SSLSocket r1) {
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

    @Override // p000.mx1
    /* JADX INFO: renamed from: γ */
    public final boolean mo1122() {
            r0 = this;
            boolean r0 = p000.C1015yb.f12546
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: δ */
    public final void mo1123(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            boolean r0 = r0.mo1120(r1)
            if (r0 == 0) goto L24
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            org.bouncycastle.jsse.BCSSLParameters r0 = r1.getParameters()
            f0 r2 = p000.gh1.f4375
            java.util.ArrayList r2 = p000.rk0.m5104(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.setApplicationProtocols(r2)
            r1.setParameters(r0)
        L24:
            return
    }
}
