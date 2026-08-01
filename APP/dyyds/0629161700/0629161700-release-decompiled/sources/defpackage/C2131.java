package defpackage;

/* JADX INFO: renamed from: ᲇᲁᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2131 extends defpackage.C2027 {

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final java.net.Socket f9103;

    public C2131(java.net.Socket r1) {
            r0 = this;
            r0.<init>()
            r0.f9103 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.io.IOException m3550(java.io.IOException r2) {
            r1 = this;
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.initCause(r2)
        Lc:
            return r1
    }

    @Override // defpackage.C2027
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo1864() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r5 = r5.f9103
            r5.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L24
            return
        L8:
            r1 = move-exception
            boolean r2 = defpackage.AbstractC1607.m2906(r1)
            if (r2 == 0) goto L23
            java.util.logging.Logger r2 = defpackage.AbstractC1607.f7103
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
            java.util.logging.Logger r2 = defpackage.AbstractC1607.f7103
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
