package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb.j f11897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f11898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.concurrent.ScheduledFuture f11899c;

    public h(rb.j r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f11897a = r1
            r0.f11898b = r2
            r1 = 0
            r0.f11899c = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof rb.h
            if (r0 != 0) goto L8
            goto L2a
        L8:
            rb.h r3 = (rb.h) r3
            rb.j r0 = r2.f11897a
            rb.j r1 = r3.f11897a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.Object r0 = r2.f11898b
            java.lang.Object r1 = r3.f11898b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.concurrent.ScheduledFuture r0 = r2.f11899c
            java.util.concurrent.ScheduledFuture r3 = r3.f11899c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            rb.j r0 = r2.f11897a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f11898b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.concurrent.ScheduledFuture r0 = r2.f11899c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.concurrent.ScheduledFuture r0 = r3.f11899c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ActiveProbe(item="
            r1.<init>(r2)
            rb.j r2 = r3.f11897a
            r1.append(r2)
            java.lang.String r2 = ", scene="
            r1.append(r2)
            java.lang.Object r2 = r3.f11898b
            r1.append(r2)
            java.lang.String r2 = ", timeout="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
