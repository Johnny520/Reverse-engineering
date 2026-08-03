package fc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements bc.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.e f3873c;

    public a(java.lang.String r2, java.util.Map r3, java.util.Map r4) {
            r1 = this;
            r1.<init>()
            r1.f3872b = r2
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L14
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L14
            b.e r2 = hc.b.f5508a
            goto L32
        L14:
            ae.a r2 = new ae.a
            r0 = 10
            r2.<init>(r0)
            java.util.Comparator r2 = java.util.Comparator.comparingInt(r2)
            java.util.Comparator r2 = r2.reversed()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r2)
            r0.putAll(r4)
            b.e r2 = new b.e
            r4 = 15
            r2.<init>(r3, r4, r0)
        L32:
            r1.f3873c = r2
            return
    }

    @Override // bc.d
    public final boolean a() {
            r2 = this;
            b.e r0 = r2.f3873c
            b.e r1 = hc.b.f5508a
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // bc.d
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3872b
            return r0
    }

    @Override // bc.d
    public final b.e c() {
            r1 = this;
            b.e r0 = r1.f3873c
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f3872b
            return r0
    }
}
