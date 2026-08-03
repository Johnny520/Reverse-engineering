package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements x0.c, java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.h f7723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0.f f7725i;

    public m(l0.h r1, int r2, l0.c r3, l0.f r4) {
            r0 = this;
            r0.<init>()
            r0.f7723g = r1
            r0.f7724h = r2
            r0.f7725i = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof l0.m
            if (r0 == 0) goto L22
            l0.m r3 = (l0.m) r3
            int r0 = r3.f7724h
            int r1 = r2.f7724h
            if (r0 != r1) goto L22
            l0.h r0 = r3.f7723g
            l0.h r1 = r2.f7723g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            l0.f r3 = r3.f7725i
            l0.f r0 = r2.f7725i
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L22
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7724h
            int r0 = r0 * 31
            l0.h r1 = r2.f7723g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            l0.f r0 = r2.f7725i
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r5 = this;
            l0.l r0 = new l0.l
            r1 = 0
            l0.f r2 = r5.f7725i
            l0.h r3 = r5.f7723g
            int r4 = r5.f7724h
            r0.<init>(r3, r4, r1, r2)
            return r0
    }
}
