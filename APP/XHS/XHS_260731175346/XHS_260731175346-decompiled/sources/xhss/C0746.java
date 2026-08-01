package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛳᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0746 implements xhss.InterfaceC1173 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final boolean f2499 = false;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0983 f2500 = null;

    static {
            xhss.ᲁᲀᲇᛶ r0 = new xhss.ᲁᲀᲇᛶ
            r0.<init>()
            xhss.C0746.f2500 = r0
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class<xhss.ᛶᛸᛴᛴ> r2 = xhss.AbstractC0579.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L20
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Throwable -> L20
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            boolean r1 = xhss.AbstractC0579.m1050()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            r0 = 1
        L20:
            xhss.C0746.f2499 = r0
            return
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo467(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = r0.mo469(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo468() {
            r0 = this;
            boolean r0 = xhss.C0746.f2499
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo469(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo470(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            boolean r0 = r0.mo469(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r0)
            xhss.ᛵᛳᛸᲇ r0 = xhss.AbstractC0831.f2712
            java.util.ArrayList r0 = xhss.C0564.m1027(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r0)
        L1c:
            return
    }
}
