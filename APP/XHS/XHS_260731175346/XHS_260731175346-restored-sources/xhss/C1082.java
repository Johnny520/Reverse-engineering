package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1082 extends xhss.C1181 {

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.net.Socket f3486;

    public C1082(java.net.Socket r1) {
            r0 = this;
            r0.<init>()
            r0.f3486 = r1
            return
    }

    @Override // xhss.C1181
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final void mo851() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r5 = r5.f3486
            r5.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L24
            return
        L8:
            r1 = move-exception
            boolean r2 = xhss.AbstractC0235.m540(r1)
            if (r2 == 0) goto L23
            java.util.logging.Logger r2 = xhss.AbstractC0235.f900
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
            java.util.logging.Logger r2 = xhss.AbstractC0235.f900
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r2.log(r3, r5, r1)
        L38:
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final java.io.IOException m1743(java.io.IOException r2) {
            r1 = this;
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.initCause(r2)
        Lc:
            return r1
    }
}
