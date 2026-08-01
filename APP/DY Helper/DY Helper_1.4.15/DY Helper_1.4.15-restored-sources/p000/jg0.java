package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 extends p000.C0386i7 {

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ p000.kg0 f5458;

    public jg0(p000.kg0 r1) {
            r0 = this;
            r0.f5458 = r1
            r0.<init>()
            return
    }

    @Override // p000.C0386i7
    /* JADX INFO: renamed from: κ */
    public final java.io.IOException mo2630(java.io.IOException r1) {
            r0 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            return r0
    }

    @Override // p000.C0386i7
    /* JADX INFO: renamed from: λ */
    public final void mo2631() {
            r4 = this;
            kg0 r0 = r4.f5458
            sz r1 = p000.EnumC0816sz.f10092
            r0.m3246(r1)
            kg0 r4 = r4.f5458
            dg0 r4 = r4.f5900
            monitor-enter(r4)
            long r0 = r4.f3145     // Catch: java.lang.Throwable -> L41
            long r2 = r4.f3144     // Catch: java.lang.Throwable -> L41
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            monitor-exit(r4)
            return
        L16:
            r0 = 1
            long r2 = r2 + r0
            r4.f3144 = r2     // Catch: java.lang.Throwable -> L41
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L41
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L41
            long r0 = r0 + r2
            r4.f3146 = r0     // Catch: java.lang.Throwable -> L41
            monitor-exit(r4)
            w22 r0 = r4.f3139
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f3134
            java.lang.String r3 = " ping"
            java.lang.String r1 = p000.lz1.m3691(r1, r2, r3)
            η r2 = new η
            r3 = 11
            r2.<init>(r3, r4)
            p000.w22.m6309(r0, r1, r2)
            return
        L41:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* JADX INFO: renamed from: μ */
    public final void m2958() {
            r1 = this;
            boolean r0 = r1.m2629()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.io.IOException r1 = r1.mo2630(r0)
            throw r1
    }
}
