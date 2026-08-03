package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.l0 f6345b;

    public k(java.lang.String r1, i2.l0 r2) {
            r0 = this;
            r0.<init>()
            r0.f6344a = r1
            r0.f6345b = r2
            return
    }

    @Override // i2.m
    public final i2.l0 a() {
            r1 = this;
            i2.l0 r0 = r1.f6345b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof i2.k
            if (r0 != 0) goto L8
            goto L1f
        L8:
            i2.k r3 = (i2.k) r3
            java.lang.String r0 = r3.f6344a
            java.lang.String r1 = r2.f6344a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            i2.l0 r0 = r2.f6345b
            i2.l0 r3 = r3.f6345b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f6344a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i2.l0 r1 = r2.f6345b
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LinkAnnotation.Clickable(tag="
            r0.<init>(r1)
            java.lang.String r1 = r3.f6344a
            r2 = 41
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
