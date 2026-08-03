package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i1.a f6129h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i1.a f6130i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6131g;

    static {
            i1.a r0 = new i1.a
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            i1.a.f6129h = r0
            i1.a r0 = new i1.a
            r2 = 1
            r0.<init>(r1, r2)
            i1.a.f6130i = r0
            return
    }

    public /* synthetic */ a(int r1, int r2) {
            r0 = this;
            r0.f6131g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f6131g
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            r1 = r10
            h1.d r1 = (h1.d) r1
            long r2 = f1.w.f3130f
            r7 = 0
            r8 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r6 = 0
            h1.d.Z(r1, r2, r4, r6, r7, r8)
            sf.n r10 = sf.n.f12433a
            return r10
        L16:
            h1.d r10 = (h1.d) r10
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
