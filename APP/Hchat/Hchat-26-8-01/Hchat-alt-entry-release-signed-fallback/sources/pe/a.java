package pe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mh.b f10541e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.BitSet[] f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.BitSet[] f10543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.BitSet[] f10544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.BitSet[] f10545d;

    static {
            java.lang.Class<pe.a> r0 = pe.a.class
            mh.b r0 = mh.d.b(r0)
            pe.a.f10541e = r0
            return
    }

    public static java.util.BitSet[] a(int r3, int r4) {
            java.util.BitSet[] r0 = new java.util.BitSet[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto Lf
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r4)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Lf:
            return r0
    }
}
