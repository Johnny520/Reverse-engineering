package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0.n f21095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0.b f21097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0.b f21098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.b1 f21100f;

    public z0(x1.b1 r1, y0.n r2, int r3, j0.b r4, j0.b r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f21100f = r1
            r0.f21095a = r2
            r0.f21096b = r3
            r0.f21097c = r4
            r0.f21098d = r5
            r0.f21099e = r6
            return
    }

    public final boolean a(int r3, int r4) {
            r2 = this;
            j0.b r0 = r2.f21097c
            int r1 = r2.f21096b
            int r3 = r3 + r1
            java.lang.Object[] r0 = r0.f6671g
            r3 = r0[r3]
            y0.m r3 = (y0.m) r3
            j0.b r0 = r2.f21098d
            int r1 = r1 + r4
            java.lang.Object[] r4 = r0.f6671g
            r4 = r4[r1]
            y0.m r4 = (y0.m) r4
            boolean r0 = gg.l.a(r3, r4)
            if (r0 == 0) goto L1b
            goto L25
        L1b:
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r4 = r4.getClass()
            if (r3 != r4) goto L27
        L25:
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }
}
