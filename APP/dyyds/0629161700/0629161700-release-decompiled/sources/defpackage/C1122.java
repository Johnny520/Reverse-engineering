package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1122 extends defpackage.C2027 {

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1958 f5005;

    public C1122(defpackage.C1958 r1) {
            r0 = this;
            r0.f5005 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m2142() {
            r1 = this;
            boolean r1 = r1.m3419()
            if (r1 != 0) goto L7
            return
        L7:
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.C2027
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo1864() {
            r4 = this;
            ᲁᲈᛲᛱ r0 = r4.f5005
            r1 = 9
            r0.m3375(r1)
            ᲁᲈᛲᛱ r4 = r4.f5005
            ᲈᲈ r4 = r4.f8517
            monitor-enter(r4)
            long r0 = r4.f10228     // Catch: java.lang.Throwable -> L46
            long r2 = r4.f10212     // Catch: java.lang.Throwable -> L46
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            monitor-exit(r4)
            return
        L16:
            r0 = 1
            long r2 = r2 + r0
            r4.f10212 = r2     // Catch: java.lang.Throwable -> L46
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L46
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r2
            r4.f10224 = r0     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            ᛴᛴᛸᛴ r0 = r4.f10219
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f10214
            r1.append(r2)
            java.lang.String r2 = " ping"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ᛲᲀ r2 = new ᛲᲀ
            r3 = 10
            r2.<init>(r3, r4)
            defpackage.C0658.m1488(r0, r1, r2)
            return
        L46:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
