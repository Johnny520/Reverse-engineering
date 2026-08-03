package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7260i;

    public /* synthetic */ r(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f7258g = r2
            r0.f7260i = r3
            r0.f7259h = r1
            r0.<init>()
            return
    }

    @Override // k5.t
    public final java.lang.Object a(int r3) {
            r2 = this;
            int r0 = r2.f7258g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            l5.b0 r0 = new l5.b0
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
        Lc:
            java.lang.Object r0 = r2.f7260i
            k5.u r0 = (k5.u) r0
            int r1 = r0.f7278p
            int r1 = r1 + 4
            int r3 = r3 * 12
            int r3 = r3 + r1
            m5.b r1 = new m5.b
            r1.<init>(r0, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7258g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f7260i
            l5.c0 r0 = (l5.c0) r0
            int r0 = r0.f7857d
            return r0
        Lc:
            int r0 = r1.f7259h
            return r0
    }
}
