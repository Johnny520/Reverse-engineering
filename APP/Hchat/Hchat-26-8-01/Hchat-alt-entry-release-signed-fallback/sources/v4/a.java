package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements z4.k, java.lang.Comparable {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            v4.a r1 = (v4.a) r1
            int r1 = r0.d(r1)
            return r1
    }

    public final int d(v4.a r3) {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L17
            java.lang.String r3 = r0.getName()
            java.lang.String r0 = r1.getName()
            int r3 = r3.compareTo(r0)
            return r3
        L17:
            int r3 = r2.e(r3)
            return r3
    }

    public abstract int e(v4.a r1);

    public abstract boolean i();

    public abstract java.lang.String j();
}
