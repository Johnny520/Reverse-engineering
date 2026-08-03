package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.p1 f6019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.e f6021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f6023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6024f;

    public q1(i0.p1 r1, java.lang.Object r2, boolean r3, i0.e r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f6019a = r1
            r0.f6020b = r3
            r0.f6021c = r4
            r0.f6022d = r5
            r0.f6023e = r2
            r1 = 1
            r0.f6024f = r1
            return
    }

    public final java.lang.Object a() {
            r1 = this;
            boolean r0 = r1.f6020b
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r1.f6023e
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Unexpected form of a provided value"
            i0.m.b(r0)
            okio.a.c()
            r0 = 0
            return r0
    }
}
