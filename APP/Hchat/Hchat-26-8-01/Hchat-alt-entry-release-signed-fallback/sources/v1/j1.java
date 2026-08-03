package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.l1 f13971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1.j0 f13972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1.i1 f13973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v1.i1 f13974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1.i1 f13975e;

    public j1(v1.l1 r2) {
            r1 = this;
            r1.<init>()
            r1.f13971a = r2
            v1.i1 r2 = new v1.i1
            r0 = 2
            r2.<init>(r1, r0)
            r1.f13973c = r2
            v1.i1 r2 = new v1.i1
            r0 = 0
            r2.<init>(r1, r0)
            r1.f13974d = r2
            v1.i1 r2 = new v1.i1
            r0 = 1
            r2.<init>(r1, r0)
            r1.f13975e = r2
            return
    }

    public final v1.j0 a() {
            r1 = this;
            v1.j0 r0 = r1.f13972b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "SubcomposeLayoutState is not attached to SubcomposeLayout"
            j8.o.t(r0)
            r0 = 0
            return r0
    }
}
