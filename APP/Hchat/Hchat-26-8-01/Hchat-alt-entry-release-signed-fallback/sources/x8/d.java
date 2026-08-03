package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f21254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f21255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f21256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f21257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f21258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f21259m;

    public /* synthetic */ d(java.util.concurrent.atomic.AtomicBoolean r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.atomic.AtomicReference r3, java.util.concurrent.CountDownLatch r4, java.util.concurrent.atomic.AtomicReference r5, java.util.concurrent.atomic.AtomicReference r6, int r7) {
            r0 = this;
            r0.f21253g = r7
            r0.f21254h = r1
            r0.f21255i = r2
            r0.f21256j = r3
            r0.f21257k = r4
            r0.f21258l = r5
            r0.f21259m = r6
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f21253g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicReference r6 = r8.f21259m
            r7 = 192(0xc0, float:2.69E-43)
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f21254h
            java.util.concurrent.atomic.AtomicReference r2 = r8.f21255i
            java.util.concurrent.atomic.AtomicReference r3 = r8.f21256j
            java.util.concurrent.CountDownLatch r4 = r8.f21257k
            java.util.concurrent.atomic.AtomicReference r5 = r8.f21258l
            x8.q.F(r1, r2, r3, r4, r5, r6, r7)
            sf.n r0 = sf.n.f12433a
            return r0
        L19:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.f21254h
            boolean r0 = r1.get()
            if (r0 != 0) goto L30
            r7 = 128(0x80, float:1.8E-43)
            java.util.concurrent.atomic.AtomicReference r2 = r8.f21255i
            java.util.concurrent.atomic.AtomicReference r3 = r8.f21256j
            java.util.concurrent.CountDownLatch r4 = r8.f21257k
            java.util.concurrent.atomic.AtomicReference r5 = r8.f21258l
            java.util.concurrent.atomic.AtomicReference r6 = r8.f21259m
            x8.q.F(r1, r2, r3, r4, r5, r6, r7)
        L30:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
