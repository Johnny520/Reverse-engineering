package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.x f8493c = null;

    static {
            m0.x r0 = new m0.x
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r2)
            m0.x.f8493c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r1, i0.a r2, l0.k r3, b5.i r4, m0.k0 r5) {
            r0 = this;
            r2 = 0
            java.lang.Object r1 = r1.d(r2)
            i0.r1 r1 = (i0.r1) r1
            java.lang.Object r2 = r4.f476b
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto Le
            return
        Le:
            s0.f r3 = new s0.f
            r3.<init>(r2)
            java.lang.Object r2 = r4.f484j
            f.k0 r2 = (f.k0) r2
            if (r2 != 0) goto L22
            long[] r2 = f.r0.f2895a
            f.k0 r2 = new f.k0
            r2.<init>()
            r4.f484j = r2
        L22:
            r2.m(r1, r3)
            java.util.RandomAccess r1 = r4.f480f
            j0.b r1 = (j0.b) r1
            i0.k0 r2 = new i0.k0
            r4 = -1
            r2.<init>(r3, r4)
            r1.b(r2)
            return
    }
}
