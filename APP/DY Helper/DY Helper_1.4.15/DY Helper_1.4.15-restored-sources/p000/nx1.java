package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends p000.C0386i7 {

    /* JADX INFO: renamed from: ξ */
    public final java.net.Socket f7813;

    public nx1(java.net.Socket r1) {
            r0 = this;
            r0.<init>()
            r0.f7813 = r1
            return
    }

    @Override // p000.C0386i7
    /* JADX INFO: renamed from: κ */
    public final java.io.IOException mo2630(java.io.IOException r2) {
            r1 = this;
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.initCause(r2)
        Lc:
            return r1
    }

    @Override // p000.C0386i7
    /* JADX INFO: renamed from: λ */
    public final void mo2631() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r5 = r5.f7813
            r5.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L24
            return
        L8:
            r1 = move-exception
            boolean r2 = p000.rd2.m5080(r1)
            if (r2 == 0) goto L23
            java.util.logging.Logger r2 = p000.rd2.f9350
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r2.log(r3, r5, r1)
            goto L38
        L23:
            throw r1
        L24:
            r1 = move-exception
            java.util.logging.Logger r2 = p000.rd2.f9350
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r2.log(r3, r5, r1)
        L38:
            return
    }
}
