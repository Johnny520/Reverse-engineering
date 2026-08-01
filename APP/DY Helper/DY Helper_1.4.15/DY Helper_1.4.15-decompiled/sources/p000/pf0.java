package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 implements p000.iw1 {

    /* JADX INFO: renamed from: ε */
    public final p000.j60 f8538;

    /* JADX INFO: renamed from: ζ */
    public boolean f8539;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.uf0 f8540;

    public pf0(p000.uf0 r2) {
            r1 = this;
            r1.<init>()
            r1.f8540 = r2
            j60 r0 = new j60
            m6 r2 = r2.f10741
            java.lang.Object r2 = r2.f6969
            qk1 r2 = (p000.qk1) r2
            iw1 r2 = r2.f9028
            m42 r2 = r2.mo2505()
            r0.<init>(r2)
            r1.f8538 = r0
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f8539     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            r0 = 1
            r3.f8539 = r0     // Catch: java.lang.Throwable -> L2c
            uf0 r0 = r3.f8540     // Catch: java.lang.Throwable -> L2c
            m6 r0 = r0.f10741     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.f6969     // Catch: java.lang.Throwable -> L2c
            qk1 r0 = (p000.qk1) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "0\r\n\r\n"
            r0.mo4893(r1)     // Catch: java.lang.Throwable -> L2c
            j60 r0 = r3.f8538     // Catch: java.lang.Throwable -> L2c
            m42 r1 = r0.f5341     // Catch: java.lang.Throwable -> L2c
            l42 r2 = p000.m42.f6935     // Catch: java.lang.Throwable -> L2c
            r0.f5341 = r2     // Catch: java.lang.Throwable -> L2c
            r1.mo2868()     // Catch: java.lang.Throwable -> L2c
            r1.mo2869()     // Catch: java.lang.Throwable -> L2c
            uf0 r0 = r3.f8540     // Catch: java.lang.Throwable -> L2c
            r1 = 3
            r0.f10742 = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    @Override // p000.iw1, java.io.Flushable
    public final synchronized void flush() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f8539     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            uf0 r0 = r1.f8540     // Catch: java.lang.Throwable -> L14
            m6 r0 = r0.f10741     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.f6969     // Catch: java.lang.Throwable -> L14
            qk1 r0 = (p000.qk1) r0     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            j60 r0 = r0.f8538
            return r0
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r5, p000.C0793sc r7) {
            r4 = this;
            boolean r0 = r4.f8539
            java.lang.String r1 = "closed"
            if (r0 != 0) goto L31
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            uf0 r4 = r4.f8540
            m6 r4 = r4.f10741
            java.lang.Object r4 = r4.f6969
            qk1 r4 = (p000.qk1) r4
            boolean r0 = r4.f9030
            if (r0 != 0) goto L2d
            sc r0 = r4.f9029
            r0.m5447(r5)
            r4.m4892()
            java.lang.String r0 = "\r\n"
            r4.mo4893(r0)
            r4.mo2507(r5, r7)
            r4.mo4893(r0)
            return
        L2d:
            p000.C1080.m7279(r1)
            return
        L31:
            p000.C1080.m7279(r1)
            return
    }
}
