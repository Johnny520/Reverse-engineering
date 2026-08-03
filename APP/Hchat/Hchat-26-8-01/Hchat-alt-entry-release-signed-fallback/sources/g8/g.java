package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.d f4357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.d f4358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.d f4359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f4360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f4361e;

    public g(o8.d r2, g8.d r3, g1.d r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f4360d = r0
            r1.f4357a = r2
            r1.f4358b = r3
            r1.f4359c = r4
            return
    }

    public final a2.a a(g8.f r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f4360d
            r0.addIfAbsent(r2)
            a2.a r2 = new a2.a
            r0 = 14
            r2.<init>(r0)
            return r2
    }
}
