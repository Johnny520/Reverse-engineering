package p000;

/* JADX INFO: renamed from: g0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0305g0 implements p000.mx1 {
    @Override // p000.mx1
    /* JADX INFO: renamed from: α */
    public final boolean mo1120(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = android.net.ssl.SSLSockets.isSupportedSocket(r1)
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1121(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            java.lang.String r0 = r1.getApplicationProtocol()     // Catch: java.lang.UnsupportedOperationException -> L10
            if (r0 == 0) goto L10
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)     // Catch: java.lang.UnsupportedOperationException -> L10
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: γ */
    public final boolean mo1122() {
            r0 = this;
            f0 r0 = p000.gh1.f4375
            r0 = 1
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: δ */
    public final void mo1123(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            r0 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L21
            javax.net.ssl.SSLParameters r0 = r1.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L21
            f0 r2 = p000.gh1.f4375     // Catch: java.lang.IllegalArgumentException -> L21
            java.util.ArrayList r2 = p000.rk0.m5104(r3)     // Catch: java.lang.IllegalArgumentException -> L21
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.IllegalArgumentException -> L21
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.IllegalArgumentException -> L21
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.IllegalArgumentException -> L21
            r0.setApplicationProtocols(r2)     // Catch: java.lang.IllegalArgumentException -> L21
            r1.setSSLParameters(r0)     // Catch: java.lang.IllegalArgumentException -> L21
            return
        L21:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Android internal error"
            r1.<init>(r2, r0)
            throw r1
    }
}
