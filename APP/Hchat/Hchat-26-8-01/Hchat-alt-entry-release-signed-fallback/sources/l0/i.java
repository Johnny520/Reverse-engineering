package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements x0.c, java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.h f7691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7693i;

    public i(l0.h r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7691g = r1
            r0.f7692h = r2
            r0.f7693i = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof l0.i
            if (r0 == 0) goto L1e
            l0.i r3 = (l0.i) r3
            int r0 = r3.f7692h
            int r1 = r2.f7692h
            if (r0 != r1) goto L1e
            int r0 = r3.f7693i
            int r1 = r2.f7693i
            if (r0 != r1) goto L1e
            l0.h r3 = r3.f7691g
            l0.h r0 = r2.f7691g
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            l0.h r0 = r2.f7691g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f7692h
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            l0.h r0 = r6.f7691g
            int r1 = r0.f7687n
            int r2 = r6.f7693i
            if (r1 == r2) goto Lb
            l0.j.f()
        Lb:
            int r1 = r6.f7692h
            r0.g(r1)
            l0.d r2 = new l0.d
            int r3 = r1 + 1
            int[] r4 = r0.f7680g
            int r5 = r1 * 5
            int r5 = r5 + 3
            r4 = r4[r5]
            int r4 = r4 + r1
            r2.<init>(r0, r3, r4)
            return r2
    }
}
