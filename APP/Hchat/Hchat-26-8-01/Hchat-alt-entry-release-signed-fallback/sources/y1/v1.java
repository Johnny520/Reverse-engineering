package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements y1.o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg.a f22135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0.j1 f22136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.j1 f22137c;

    public v1() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r1.f22137c = r0
            return
    }

    public final long a() {
            r2 = this;
            i0.j1 r0 = r2.f22136b
            if (r0 != 0) goto L1b
            fg.a r0 = r2.f22135a
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.invoke()
            y1.j1 r0 = (y1.j1) r0
            if (r0 != 0) goto L12
        L10:
            y1.j1 r0 = y1.j1.f21979c
        L12:
            i0.j1 r0 = i0.r.u(r0)
            r2.f22136b = r0
            r0 = 0
            r2.f22135a = r0
        L1b:
            i0.j1 r0 = r2.f22136b
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            y1.j1 r0 = (y1.j1) r0
            long r0 = r0.f21981b
            return r0
    }
}
