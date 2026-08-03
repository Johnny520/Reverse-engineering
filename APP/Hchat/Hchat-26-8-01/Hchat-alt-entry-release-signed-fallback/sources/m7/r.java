package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends java.util.AbstractList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m7.i f8761g;

    public r(m7.i r1) {
            r0 = this;
            r0.f8761g = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            m7.i r0 = r1.f8761g
            d7.b r0 = r0.R()
            k7.a r2 = r0.Q(r2)
            m7.q r2 = (m7.q) r2
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            m7.i r0 = r1.f8761g
            d7.b r0 = r0.R()
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            return r0
    }
}
