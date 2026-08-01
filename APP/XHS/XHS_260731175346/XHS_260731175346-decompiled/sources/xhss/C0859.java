package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0859 implements xhss.InterfaceC1173 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final boolean f2775 = false;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0864 f2776 = null;

    static {
            xhss.ᲀᛵᛷᛵ r0 = new xhss.ᲀᛵᛷᛵ
            r0.<init>()
            xhss.C0859.f2776 = r0
            r0 = 0
            java.lang.String r1 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class<xhss.ᲁᛵᛸᛳ> r2 = xhss.AbstractC0955.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L14
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L14
            r0 = 1
        L14:
            xhss.C0859.f2775 = r0
            return
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo467(javax.net.ssl.SSLSocket r1) {
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

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo468() {
            r0 = this;
            boolean r0 = xhss.C0859.f2775
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo469(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo470(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            boolean r0 = r0.mo469(r1)
            if (r0 == 0) goto L21
            org.bouncycastle.jsse.BCSSLSocket r1 = (org.bouncycastle.jsse.BCSSLSocket) r1
            org.bouncycastle.jsse.BCSSLParameters r0 = r1.getParameters()
            xhss.ᛵᛳᛸᲇ r2 = xhss.AbstractC0831.f2712
            java.util.ArrayList r2 = xhss.C0564.m1027(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.setApplicationProtocols(r2)
            r1.setParameters(r0)
        L21:
            return
    }
}
