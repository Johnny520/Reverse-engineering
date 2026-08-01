package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲀᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0206 implements xhss.InterfaceC1173 {
    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String mo467(javax.net.ssl.SSLSocket r1) {
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

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean mo468() {
            r0 = this;
            xhss.ᛵᛳᛸᲇ r0 = xhss.AbstractC0831.f2712
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean mo469(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r0 = android.net.ssl.SSLSockets.isSupportedSocket(r1)
            return r0
    }

    @Override // xhss.InterfaceC1173
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void mo470(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r0 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            javax.net.ssl.SSLParameters r0 = r1.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L1e
            xhss.ᛵᛳᛸᲇ r2 = xhss.AbstractC0831.f2712     // Catch: java.lang.IllegalArgumentException -> L1e
            java.util.ArrayList r2 = xhss.C0564.m1027(r3)     // Catch: java.lang.IllegalArgumentException -> L1e
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
}
