package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh.l f5578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5579b;

    public q(hh.l r1, int r2) {
            r0 = this;
            if (r2 == 0) goto La
            r0.<init>()
            r0.f5578a = r1
            r0.f5579b = r2
            return
        La:
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof hh.q
            if (r0 != 0) goto L8
            goto L1b
        L8:
            hh.q r3 = (hh.q) r3
            hh.l r0 = r2.f5578a
            hh.l r1 = r3.f5578a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            int r0 = r2.f5579b
            int r3 = r3.f5579b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            hh.l r0 = r2.f5578a
            java.lang.String r0 = r0.f5559j
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f5579b
            int r1 = t3.c.b(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UsingFieldData(field="
            r0.<init>(r1)
            hh.l r1 = r3.f5578a
            r0.append(r1)
            java.lang.String r1 = ", usingType="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f5579b
            if (r2 == r1) goto L1f
            r1 = 2
            if (r2 == r1) goto L1c
            java.lang.String r1 = "null"
            goto L21
        L1c:
            java.lang.String r1 = "Write"
            goto L21
        L1f:
            java.lang.String r1 = "Read"
        L21:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
