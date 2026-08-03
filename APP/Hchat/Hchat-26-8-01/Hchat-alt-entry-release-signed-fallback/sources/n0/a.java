package n0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends tf.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.c f8914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8916i;

    public a(o0.c r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f8914g = r1
            r0.f8915h = r2
            int r1 = r1.size()
            be.h.o(r2, r3, r1)
            int r3 = r3 - r2
            r0.f8916i = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f8916i
            be.h.m(r2, r0)
            int r0 = r1.f8915h
            int r0 = r0 + r2
            o0.c r2 = r1.f8914g
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f8916i
            return r0
    }

    @Override // tf.f, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f8916i
            be.h.o(r3, r4, r0)
            n0.a r0 = new n0.a
            int r1 = r2.f8915h
            int r3 = r3 + r1
            int r1 = r1 + r4
            o0.c r4 = r2.f8914g
            r0.<init>(r4, r3, r1)
            return r0
    }
}
