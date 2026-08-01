package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 implements defpackage.InterfaceC1130 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1338 f5961 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final boolean f5962 = false;

    static {
            ᛷᛸᛸᛱ r0 = new ᛷᛸᛸᛱ
            r0.<init>()
            defpackage.C1363.f5961 = r0
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class<ᛵᛴᲇ> r2 = defpackage.AbstractC0878.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L20
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Throwable -> L20
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            boolean r1 = defpackage.AbstractC0878.m1863()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            r0 = 1
        L20:
            defpackage.C1363.f5962 = r0
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo686(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            boolean r0 = r0.mo689(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r0)
            ᛴᲈᲀᲇ r0 = defpackage.AbstractC1692.f7550
            java.util.ArrayList r0 = defpackage.C1487.m2692(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r0)
        L1c:
            return
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo687() {
            r0 = this;
            boolean r0 = defpackage.C1363.f5962
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo688(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = r0.mo689(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo689(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            return r0
    }
}
