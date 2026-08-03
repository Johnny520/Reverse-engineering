package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.t0 f7067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.d f7068c;

    public t(float r1, f1.t0 r2, v.d r3) {
            r0 = this;
            r0.<init>()
            r0.f7066a = r1
            r0.f7067b = r2
            r0.f7068c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof k.t
            if (r0 != 0) goto L8
            goto L2a
        L8:
            k.t r3 = (k.t) r3
            float r0 = r2.f7066a
            float r1 = r3.f7066a
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            f1.t0 r0 = r2.f7067b
            f1.t0 r1 = r3.f7067b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            v.d r0 = r2.f7068c
            v.d r3 = r3.f7068c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            k.s r0 = new k.s
            f1.t0 r1 = r4.f7067b
            v.d r2 = r4.f7068c
            float r3 = r4.f7066a
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            k.s r4 = (k.s) r4
            float r0 = r4.f7059x
            c1.c r1 = r4.A
            float r2 = r3.f7066a
            boolean r0 = u2.f.b(r0, r2)
            if (r0 != 0) goto L13
            r4.f7059x = r2
            r1.k1()
        L13:
            f1.t0 r0 = r4.f7060y
            f1.t0 r2 = r3.f7067b
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L22
            r4.f7060y = r2
            r1.k1()
        L22:
            v.d r0 = r4.f7061z
            v.d r2 = r3.f7068c
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L34
            r4.f7061z = r2
            r1.k1()
            x1.k.n(r4)
        L34:
            return
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f7066a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            f1.t0 r1 = r2.f7067b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            v.d r0 = r2.f7068c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderModifierNodeElement(width="
            r0.<init>(r1)
            float r1 = r2.f7066a
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush="
            r0.append(r1)
            f1.t0 r1 = r2.f7067b
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            v.d r1 = r2.f7068c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
