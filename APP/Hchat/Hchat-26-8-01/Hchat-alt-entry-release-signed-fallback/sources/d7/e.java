package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d7.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2038p;

    public /* synthetic */ e(int r1, boolean r2) {
            r0 = this;
            r0.f2038p = r1
            r0.<init>(r2)
            return
    }

    @Override // k7.d
    public final k7.a n() {
            r5 = this;
            int r0 = r5.f2038p
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            g7.b r0 = new g7.b
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            g7.c r1 = new g7.c
            r1.<init>()
            d7.b r2 = new d7.b
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.P(r1)
            r0.P(r2)
            return r0
        L1f:
            d7.f r0 = new d7.f
            r0.<init>()
            return r0
    }
}
