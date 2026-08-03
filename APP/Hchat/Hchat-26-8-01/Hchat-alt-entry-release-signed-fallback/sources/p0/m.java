package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p0.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1.f0 f10074j;

    public m(m1.f0 r1) {
            r0 = this;
            r0.<init>()
            r0.f10074j = r1
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f10072i
            int r1 = r0 + 2
            r4.f10072i = r1
            p0.a r1 = new p0.a
            java.lang.Object[] r2 = r4.f10070g
            r3 = r2[r0]
            int r0 = r0 + 1
            r0 = r2[r0]
            m1.f0 r2 = r4.f10074j
            r1.<init>(r2, r3, r0)
            return r1
    }
}
