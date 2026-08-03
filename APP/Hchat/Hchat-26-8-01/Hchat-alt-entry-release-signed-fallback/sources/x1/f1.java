package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x1.i1 f20910h;

    public /* synthetic */ f1(x1.i1 r1, int r2) {
            r0 = this;
            r0.f20909g = r2
            r0.f20910h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f20909g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            x1.i1 r0 = r3.f20910h
            x1.i1 r0 = r0.f20945w
            if (r0 == 0) goto Le
            r0.y1()
        Le:
            sf.n r0 = sf.n.f12433a
            return r0
        L11:
            x1.i1 r0 = r3.f20910h
            f1.u r1 = r0.N
            r1.getClass()
            i1.b r2 = r0.M
            r0.l1(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
