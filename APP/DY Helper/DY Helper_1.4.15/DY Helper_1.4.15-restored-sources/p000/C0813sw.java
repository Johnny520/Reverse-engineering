package p000;

/* JADX INFO: renamed from: sw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0813sw implements p000.ss1, p000.InterfaceC0850tw {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f10056;

    /* JADX INFO: renamed from: β */
    public final p000.ss1 f10057;

    /* JADX INFO: renamed from: γ */
    public final int f10058;

    public C0813sw(p000.ss1 r1, int r2, int r3) {
            r0 = this;
            r0.f10056 = r3
            switch(r3) {
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            r1.getClass()
            r0.<init>()
            r0.f10057 = r1
            r0.f10058 = r2
            if (r2 < 0) goto L12
            return
        L12:
            java.lang.String r0 = "count must be non-negative, but was "
            r1 = 46
            p000.C1080.m7265(r2, r1, r0)
            r0 = 0
            throw r0
        L1b:
            r0.<init>()
            r0.f10057 = r1
            r0.f10058 = r2
            if (r2 < 0) goto L25
            return
        L25:
            java.lang.String r0 = "count must be non-negative, but was "
            r1 = 46
            p000.C1080.m7265(r2, r1, r0)
            r0 = 0
            throw r0
    }

    @Override // p000.ss1
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f10056
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            rw r0 = new rw
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Lc:
            rw r0 = new rw
            r0.<init>(r2)
            return r0
    }

    @Override // p000.InterfaceC0850tw
    /* JADX INFO: renamed from: α */
    public final p000.ss1 mo1105(int r3) {
            r2 = this;
            int r0 = r2.f10056
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            int r0 = r2.f10058
            if (r3 < r0) goto La
            goto L13
        La:
            sw r0 = new sw
            ss1 r2 = r2.f10057
            r1 = 1
            r0.<init>(r2, r3, r1)
            r2 = r0
        L13:
            return r2
        L14:
            int r0 = r2.f10058
            int r1 = r0 + r3
            if (r1 >= 0) goto L21
            sw r0 = new sw
            r1 = 1
            r0.<init>(r2, r3, r1)
            goto L29
        L21:
            c12 r3 = new c12
            ss1 r2 = r2.f10057
            r3.<init>(r2, r0, r1)
            r0 = r3
        L29:
            return r0
    }

    @Override // p000.InterfaceC0850tw
    /* JADX INFO: renamed from: β */
    public final p000.ss1 mo1106(int r3) {
            r2 = this;
            int r0 = r2.f10056
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.f10058
            if (r3 < r0) goto Lc
            mz r2 = p000.C0567mz.f7331
            goto L14
        Lc:
            c12 r1 = new c12
            ss1 r2 = r2.f10057
            r1.<init>(r2, r3, r0)
            r2 = r1
        L14:
            return r2
        L15:
            int r0 = r2.f10058
            int r0 = r0 + r3
            if (r0 >= 0) goto L21
            sw r0 = new sw
            r1 = 0
            r0.<init>(r2, r3, r1)
            goto L2a
        L21:
            sw r3 = new sw
            ss1 r2 = r2.f10057
            r1 = 0
            r3.<init>(r2, r0, r1)
            r0 = r3
        L2a:
            return r0
    }
}
