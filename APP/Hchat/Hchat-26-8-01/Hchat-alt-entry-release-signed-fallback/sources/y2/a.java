package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.v f22189h;

    public /* synthetic */ a(y2.v r1, int r2) {
            r0 = this;
            r0.f22188g = r2
            r0.f22189h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f22188g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            b.g r3 = (b.g) r3
            y2.v r3 = r2.f22189h
            y2.u r0 = r3.f22265k
            boolean r0 = r0.f22258a
            if (r0 == 0) goto L14
            fg.a r3 = r3.f22264j
            r3.invoke()
        L14:
            sf.n r3 = sf.n.f12433a
            return r3
        L17:
            i0.a0 r3 = (i0.a0) r3
            y2.v r3 = r2.f22189h
            r3.show()
            b0.m r0 = new b0.m
            r1 = 8
            r0.<init>(r3, r1)
            return r0
    }
}
