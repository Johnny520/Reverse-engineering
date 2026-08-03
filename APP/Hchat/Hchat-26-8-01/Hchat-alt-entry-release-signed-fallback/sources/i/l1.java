package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements i.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.v f5727c;

    public l1(int r1, int r2, i.v r3) {
            r0 = this;
            r0.<init>()
            r0.f5725a = r1
            r0.f5726b = r2
            r0.f5727c = r3
            return
    }

    @Override // i.k
    public final i.n1 a(i.m1 r4) {
            r3 = this;
            i.u1 r4 = new i.u1
            int r0 = r3.f5726b
            i.v r1 = r3.f5727c
            int r2 = r3.f5725a
            r4.<init>(r2, r0, r1)
            return r4
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof i.l1
            r1 = 0
            if (r0 == 0) goto L1f
            i.l1 r4 = (i.l1) r4
            int r0 = r4.f5725a
            int r2 = r3.f5725a
            if (r0 != r2) goto L1f
            int r0 = r4.f5726b
            int r2 = r3.f5726b
            if (r0 != r2) goto L1f
            i.v r4 = r4.f5727c
            i.v r0 = r3.f5727c
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f5725a
            int r0 = r0 * 31
            i.v r1 = r2.f5727c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f5726b
            int r1 = r1 + r0
            return r1
    }
}
