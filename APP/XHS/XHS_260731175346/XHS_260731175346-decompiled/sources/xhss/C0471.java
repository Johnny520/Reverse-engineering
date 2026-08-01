package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0471 extends xhss.C1181 {

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0741 f1698;

    public C0471(xhss.C0741 r1) {
            r0 = this;
            r0.f1698 = r1
            r0.<init>()
            return
    }

    @Override // xhss.C1181
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void mo851() {
            r4 = this;
            xhss.ᛸᛳᛴ r0 = r4.f1698
            r1 = 9
            r0.m1285(r1)
            xhss.ᛸᛳᛴ r4 = r4.f1698
            xhss.ᲁᛲᛵ r4 = r4.f2479
            monitor-enter(r4)
            long r0 = r4.f2992     // Catch: java.lang.Throwable -> L45
            long r2 = r4.f3009     // Catch: java.lang.Throwable -> L45
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            monitor-exit(r4)
            return
        L16:
            r0 = 1
            long r2 = r2 + r0
            r4.f3009 = r2     // Catch: java.lang.Throwable -> L45
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L45
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r2
            r4.f2994 = r0     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            xhss.ᲇᲀᲀᛷ r0 = r4.f2998
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f3007
            r1.append(r2)
            java.lang.String r2 = " ping"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            xhss.ᛲᛶᲀᛲ r2 = new xhss.ᛲᛶᲀᛲ
            r3 = 2
            r2.<init>(r3, r4)
            xhss.C1081.m1738(r0, r1, r2)
            return
        L45:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final void m852() {
            r1 = this;
            boolean r1 = r1.m1892()
            if (r1 != 0) goto L7
            return
        L7:
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            throw r1
    }
}
