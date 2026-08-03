package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.b1 f9910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9912j;

    public /* synthetic */ h0(v1.b1 r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f9909g = r4
            r0.f9910h = r1
            r0.f9911i = r2
            r0.f9912j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f9909g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            int r0 = r3.f9912j
            v1.a1 r4 = (v1.a1) r4
            v1.b1 r1 = r3.f9910h
            int r2 = r3.f9911i
            v1.a1.B(r4, r1, r2, r0)
        L10:
            sf.n r4 = sf.n.f12433a
            return r4
        L13:
            int r0 = r3.f9912j
            v1.a1 r4 = (v1.a1) r4
            v1.b1 r1 = r3.f9910h
            int r2 = r3.f9911i
            v1.a1.B(r4, r1, r2, r0)
            goto L10
    }
}
