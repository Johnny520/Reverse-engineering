package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f12140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List[] f12141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s.z0 f12145f;

    public y0(s.z0 r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f12145f = r1
            r0.f12140a = r2
            int r1 = r2.size()
            java.util.List[] r1 = new java.util.List[r1]
            r0.f12141b = r1
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L1a
            java.lang.String r1 = "NestedPrefetchController shouldn't be created with no states"
            o.b.a(r1)
        L1a:
            return
    }
}
