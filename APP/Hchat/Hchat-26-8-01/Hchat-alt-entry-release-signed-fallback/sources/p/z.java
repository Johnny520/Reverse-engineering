package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements p.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.r1 f10041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.r1 f10042b;

    public z(p.r1 r1, p.r1 r2) {
            r0 = this;
            r0.<init>()
            r0.f10041a = r1
            r0.f10042b = r2
            return
    }

    @Override // p.r1
    public final int a(u2.c r3, u2.m r4) {
            r2 = this;
            p.r1 r0 = r2.f10041a
            int r0 = r0.a(r3, r4)
            p.r1 r1 = r2.f10042b
            int r3 = r1.a(r3, r4)
            int r0 = r0 - r3
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            return r0
    }

    @Override // p.r1
    public final int b(u2.c r3) {
            r2 = this;
            p.r1 r0 = r2.f10041a
            int r0 = r0.b(r3)
            p.r1 r1 = r2.f10042b
            int r3 = r1.b(r3)
            int r0 = r0 - r3
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            return r0
    }

    @Override // p.r1
    public final int c(u2.c r3, u2.m r4) {
            r2 = this;
            p.r1 r0 = r2.f10041a
            int r0 = r0.c(r3, r4)
            p.r1 r1 = r2.f10042b
            int r3 = r1.c(r3, r4)
            int r0 = r0 - r3
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            return r0
    }

    @Override // p.r1
    public final int d(u2.c r3) {
            r2 = this;
            p.r1 r0 = r2.f10041a
            int r0 = r0.d(r3)
            p.r1 r1 = r2.f10042b
            int r3 = r1.d(r3)
            int r0 = r0 - r3
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof p.z
            if (r0 != 0) goto L8
            goto L20
        L8:
            p.z r3 = (p.z) r3
            p.r1 r0 = r3.f10041a
            p.r1 r1 = r2.f10041a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            p.r1 r3 = r3.f10042b
            p.r1 r0 = r2.f10042b
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            p.r1 r0 = r2.f10041a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            p.r1 r1 = r2.f10042b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            p.r1 r1 = r2.f10041a
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            p.r1 r1 = r2.f10042b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
