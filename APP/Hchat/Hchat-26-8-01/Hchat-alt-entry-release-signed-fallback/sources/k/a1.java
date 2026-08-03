package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k.b1 f6906h;

    public /* synthetic */ a1(k.b1 r1, int r2) {
            r0 = this;
            r0.f6905g = r2
            r0.f6906h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f6905g
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L23;
                default: goto L5;
            }
        L5:
            k.b1 r0 = r3.f6906h
            i0.j1 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            v1.t r0 = (v1.t) r0
            if (r0 == 0) goto L18
            r1 = 0
            long r0 = r0.m0(r1)
            goto L1d
        L18:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L1d:
            e1.b r2 = new e1.b
            r2.<init>(r0)
            return r2
        L23:
            k.b1 r0 = r3.f6906h
            long r0 = r0.C
            e1.b r2 = new e1.b
            r2.<init>(r0)
            return r2
        L2d:
            k.b1 r0 = r3.f6906h
            r0.m1()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
