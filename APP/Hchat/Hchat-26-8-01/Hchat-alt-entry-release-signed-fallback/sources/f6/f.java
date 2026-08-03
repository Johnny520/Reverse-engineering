package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends f6.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f6.f f3316k = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient java.lang.Object[] f3317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient int f3318j;

    static {
            f6.f r0 = new f6.f
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r1, r2)
            f6.f.f3316k = r0
            return
    }

    public f(int r1, java.lang.Object[] r2) {
            r0 = this;
            r0.<init>()
            r0.f3317i = r2
            r0.f3318j = r1
            return
    }

    @Override // f6.e, f6.a
    public final int a(java.lang.Object[] r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f3317i
            r1 = 0
            int r2 = r3.f3318j
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            return r2
    }

    @Override // f6.a
    public final java.lang.Object[] b() {
            r1 = this;
            java.lang.Object[] r0 = r1.f3317i
            return r0
    }

    @Override // f6.a
    public final int c() {
            r1 = this;
            int r0 = r1.f3318j
            return r0
    }

    @Override // f6.a
    public final int d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // f6.a
    public final boolean e() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f3318j
            oh.h.o(r2, r0)
            java.lang.Object[] r0 = r1.f3317i
            r2 = r0[r2]
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f3318j
            return r0
    }
}
