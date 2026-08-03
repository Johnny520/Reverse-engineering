package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f5328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f5329c;

    public b(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            r3.<init>()
            r3.f5327a = r4
            r3.f5328b = r0
            r3.f5329c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof hb.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hb.b r5 = (hb.b) r5
            java.lang.String r1 = r4.f5327a
            java.lang.String r3 = r5.f5327a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f5328b
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.f5328b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.concurrent.CountDownLatch r1 = r4.f5329c
            java.util.concurrent.CountDownLatch r5 = r5.f5329c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f5327a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f5328b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.concurrent.CountDownLatch r0 = r2.f5329c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SendOperation(id="
            r0.<init>(r1)
            java.lang.String r1 = r2.f5327a
            r0.append(r1)
            java.lang.String r1 = ", canceled="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f5328b
            r0.append(r1)
            java.lang.String r1 = ", cancelSignal="
            r0.append(r1)
            java.util.concurrent.CountDownLatch r1 = r2.f5329c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
