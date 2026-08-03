package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21726h;

    public /* synthetic */ n(i0.a1 r1, int r2) {
            r0 = this;
            r0.f21725g = r2
            r0.f21726h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f21725g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            e1.b r3 = (e1.b) r3
            i0.a1 r3 = r2.f21726h
            java.lang.Object r3 = r3.getValue()
            fg.a r3 = (fg.a) r3
            if (r3 == 0) goto L14
            r3.invoke()
        L14:
            sf.n r3 = sf.n.f12433a
            return r3
        L17:
            v1.t r3 = (v1.t) r3
            r3.getClass()
            r0 = 0
            long r0 = r3.m(r0)
            e1.b r3 = new e1.b
            r3.<init>(r0)
            i0.a1 r0 = r2.f21726h
            r0.setValue(r3)
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
