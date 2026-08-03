package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.c f4612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4613b;

    public a1(i.c r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f4612a = r1
            r0.f4613b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L21
        L3:
            boolean r0 = r5 instanceof h.a1
            if (r0 != 0) goto L8
            goto L1f
        L8:
            h.a1 r5 = (h.a1) r5
            i.c r0 = r4.f4612a
            i.c r1 = r5.f4612a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            long r0 = r4.f4613b
            long r2 = r5.f4613b
            boolean r5 = u2.l.a(r0, r2)
            if (r5 != 0) goto L21
        L1f:
            r5 = 0
            return r5
        L21:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            i.c r0 = r3.f4612a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f4613b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimData(anim="
            r0.<init>(r1)
            i.c r1 = r3.f4612a
            r0.append(r1)
            java.lang.String r1 = ", startSize="
            r0.append(r1)
            long r1 = r3.f4613b
            java.lang.String r1 = u2.l.b(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
