package defpackage;

/* JADX INFO: renamed from: ᲇᛸᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 implements defpackage.InterfaceC1130 {
    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo686(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r0 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            javax.net.ssl.SSLParameters r0 = r1.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L1e
            ᛴᲈᲀᲇ r2 = defpackage.AbstractC1692.f7550     // Catch: java.lang.IllegalArgumentException -> L1e
            java.util.ArrayList r2 = defpackage.C1487.m2692(r3)     // Catch: java.lang.IllegalArgumentException -> L1e
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.IllegalArgumentException -> L1e
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.IllegalArgumentException -> L1e
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.IllegalArgumentException -> L1e
            r0.setApplicationProtocols(r2)     // Catch: java.lang.IllegalArgumentException -> L1e
            r1.setSSLParameters(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return
        L1e:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Android internal error"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo687() {
            r0 = this;
            ᛴᲈᲀᲇ r0 = defpackage.AbstractC1692.f7550
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo688(javax.net.ssl.SSLSocket r1) {
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

    @Override // defpackage.InterfaceC1130
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo689(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = android.net.ssl.SSLSockets.isSupportedSocket(r1)
            return r0
    }
}
