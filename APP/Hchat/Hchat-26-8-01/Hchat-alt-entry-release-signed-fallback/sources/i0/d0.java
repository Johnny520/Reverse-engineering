package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.h0 f5863h;

    public /* synthetic */ d0(i0.h0 r1, int r2) {
            r0 = this;
            r0.f5862g = r2
            r0.f5863h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d0(i0.h0 r1, i0.v0 r2) {
            r0 = this;
            r2 = 0
            r0.f5862g = r2
            r0.<init>()
            r0.f5863h = r1
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f5862g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            i0.h0 r0 = r1.f5863h
            x0.a r0 = r0.m()
            return r0
        Lc:
            i0.h0 r0 = r1.f5863h
            x0.a r0 = r0.m()
            return r0
        L13:
            r0 = 0
            throw r0
    }
}
