package p000;

/* JADX INFO: renamed from: wo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0954wo implements p000.mx1 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0879uo f11771 = null;

    /* JADX INFO: renamed from: β */
    public static final boolean f11772 = false;

    static {
            uo r0 = new uo
            r0.<init>()
            p000.C0954wo.f11771 = r0
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class<vo> r2 = p000.AbstractC0917vo.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L20
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Throwable -> L20
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            boolean r1 = p000.AbstractC0917vo.m6273()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            r0 = 1
        L20:
            p000.C0954wo.f11772 = r0
            return
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: α */
    public final boolean mo1120(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r1)
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1121(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = r0.mo1120(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: γ */
    public final boolean mo1122() {
            r0 = this;
            boolean r0 = p000.C0954wo.f11772
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: δ */
    public final void mo1123(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            boolean r0 = r0.mo1120(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r0)
            f0 r0 = p000.gh1.f4375
            java.util.ArrayList r0 = p000.rk0.m5104(r3)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r0)
        L1f:
            return
    }
}
