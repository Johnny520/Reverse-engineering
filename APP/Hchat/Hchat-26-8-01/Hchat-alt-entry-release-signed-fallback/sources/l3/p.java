package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements l3.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7808i;

    public p(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f7807h = r0
            r1.f7808i = r0
            r1.f7806g = r2
            return
    }

    @Override // l3.o
    public final boolean a(java.lang.CharSequence r1, int r2, int r3, l3.u r4) {
            r0 = this;
            r1 = 0
            int r4 = r0.f7806g
            if (r2 > r4) goto Lc
            if (r4 >= r3) goto Lc
            r0.f7807h = r2
            r0.f7808i = r3
            return r1
        Lc:
            if (r3 > r4) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // l3.o
    public final java.lang.Object e() {
            r0 = this;
            return r0
    }
}
