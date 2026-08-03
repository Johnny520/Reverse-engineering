package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends m7.o implements java.lang.Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m7.u f8756q;

    public m() {
            r2 = this;
            r0 = 6
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    @Override // l7.a, k7.c, k7.a
    public final void B(q7.b r3) {
            r2 = this;
            r3.getClass()
            p7.b r0 = p7.b.T(r3)
            r7.f r0 = r0.f10270o
            int r0 = r0.f11560n
            r1 = 8
            if (r0 >= r1) goto L13
            r2.T(r3)
            return
        L13:
            super.B(r3)
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            m7.m r2 = (m7.m) r2
            if (r2 != r1) goto L6
            r2 = 0
            return r2
        L6:
            m7.u r2 = r2.f8756q
            int r2 = r2.f7388g
            m7.u r0 = r1.f8756q
            int r0 = r0.f7388g
            int r2 = y7.a.e(r2, r0)
            return r2
    }
}
