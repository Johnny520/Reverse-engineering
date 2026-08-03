package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements i0.l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Float f5637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Float f5638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.j1 f5639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i.z0 f5640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i.g0 f5644n;

    public d0(i.g0 r7, java.lang.Float r8, java.lang.Float r9, i.c0 r10) {
            r6 = this;
            i.m1 r2 = i.d.f5628j
            r6.<init>()
            r6.f5644n = r7
            r6.f5637g = r8
            r6.f5638h = r9
            i0.j1 r7 = i0.r.u(r8)
            r6.f5639i = r7
            i.z0 r0 = new i.z0
            java.lang.Float r3 = r6.f5637g
            java.lang.Float r4 = r6.f5638h
            r5 = 0
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f5640j = r0
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.j1 r0 = r1.f5639i
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
