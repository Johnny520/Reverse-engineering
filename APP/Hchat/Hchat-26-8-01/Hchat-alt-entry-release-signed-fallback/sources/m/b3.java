package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8100c;

    public b3(long r1, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f8098a = r1
            r0.f8099b = r3
            r0.f8100c = r5
            return
    }

    public final m.b3 a(m.b3 r8) {
            r7 = this;
            m.b3 r0 = new m.b3
            long r1 = r7.f8098a
            long r3 = r8.f8098a
            long r1 = e1.b.e(r1, r3)
            long r3 = r7.f8099b
            long r5 = r8.f8099b
            long r3 = java.lang.Math.max(r3, r5)
            boolean r5 = r7.f8100c
            if (r5 != 0) goto L1e
            boolean r8 = r8.f8100c
            if (r8 == 0) goto L1b
            goto L1e
        L1b:
            r8 = 0
        L1c:
            r5 = r8
            goto L20
        L1e:
            r8 = 1
            goto L1c
        L20:
            r0.<init>(r1, r3, r5)
            return r0
    }
}
