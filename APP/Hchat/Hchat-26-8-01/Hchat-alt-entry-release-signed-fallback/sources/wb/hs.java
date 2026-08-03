package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hs implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.y2 f16685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fb.c f16686i;

    public /* synthetic */ hs(wb.y2 r1, fb.c r2, int r3, int r4) {
            r0 = this;
            r0.f16684g = r4
            r0.f16685h = r1
            r0.f16686i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f16684g
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            switch(r0) {
                case 0: goto L38;
                case 1: goto L2a;
                case 2: goto L1c;
                default: goto Lc;
            }
        Lc:
            r4 = 49
            int r4 = i0.r.C(r4)
            wb.y2 r0 = r2.f16685h
            fb.c r1 = r2.f16686i
            r0.q0(r1, r3, r4)
        L19:
            sf.n r3 = sf.n.f12433a
            return r3
        L1c:
            r4 = 49
            int r4 = i0.r.C(r4)
            wb.y2 r0 = r2.f16685h
            fb.c r1 = r2.f16686i
            r0.q0(r1, r3, r4)
            goto L19
        L2a:
            r4 = 49
            int r4 = i0.r.C(r4)
            wb.y2 r0 = r2.f16685h
            fb.c r1 = r2.f16686i
            r0.n0(r1, r3, r4)
            goto L19
        L38:
            r4 = 49
            int r4 = i0.r.C(r4)
            wb.y2 r0 = r2.f16685h
            fb.c r1 = r2.f16686i
            r0.n0(r1, r3, r4)
            goto L19
    }
}
