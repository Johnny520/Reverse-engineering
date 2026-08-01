package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 implements p000.iw1 {

    /* JADX INFO: renamed from: ε */
    public final p000.j60 f9884;

    /* JADX INFO: renamed from: ζ */
    public boolean f9885;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.uf0 f9886;

    public sf0(p000.uf0 r2) {
            r1 = this;
            r1.<init>()
            r1.f9886 = r2
            j60 r0 = new j60
            m6 r2 = r2.f10741
            java.lang.Object r2 = r2.f6969
            qk1 r2 = (p000.qk1) r2
            iw1 r2 = r2.f9028
            m42 r2 = r2.mo2505()
            r0.<init>(r2)
            r1.f9884 = r0
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            boolean r0 = r3.f9885
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f9885 = r0
            j60 r0 = r3.f9884
            m42 r1 = r0.f5341
            l42 r2 = p000.m42.f6935
            r0.f5341 = r2
            r1.mo2868()
            r1.mo2869()
            r0 = 3
            uf0 r3 = r3.f9886
            r3.f10742 = r0
            return
    }

    @Override // p000.iw1, java.io.Flushable
    public final void flush() {
            r1 = this;
            boolean r0 = r1.f9885
            if (r0 == 0) goto L5
            return
        L5:
            uf0 r1 = r1.f9886
            m6 r1 = r1.f10741
            java.lang.Object r1 = r1.f6969
            qk1 r1 = (p000.qk1) r1
            r1.flush()
            return
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            j60 r0 = r0.f9884
            return r0
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r8, p000.C0793sc r10) {
            r7 = this;
            boolean r0 = r7.f9885
            if (r0 != 0) goto L18
            long r1 = r10.f9828
            r3 = 0
            r5 = r8
            p000.sd2.m5471(r1, r3, r5)
            uf0 r7 = r7.f9886
            m6 r7 = r7.f10741
            java.lang.Object r7 = r7.f6969
            qk1 r7 = (p000.qk1) r7
            r7.mo2507(r5, r10)
            return
        L18:
            java.lang.String r7 = "closed"
            p000.C1080.m7279(r7)
            return
    }
}
