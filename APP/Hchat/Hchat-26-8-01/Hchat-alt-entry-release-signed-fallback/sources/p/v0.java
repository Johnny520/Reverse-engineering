package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10026d;

    public v0(float r5, float r6, float r7, float r8) {
            r4 = this;
            r4.<init>()
            r4.f10023a = r5
            r4.f10024b = r6
            r4.f10025c = r7
            r4.f10026d = r8
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 >= 0) goto L1b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L19
            goto L1b
        L19:
            r5 = r3
            goto L1c
        L1b:
            r5 = r2
        L1c:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L29
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L27
            goto L29
        L27:
            r6 = r3
            goto L2a
        L29:
            r6 = r2
        L2a:
            r5 = r5 & r6
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L38
            boolean r6 = java.lang.Float.isNaN(r7)
            if (r6 == 0) goto L36
            goto L38
        L36:
            r6 = r3
            goto L39
        L38:
            r6 = r2
        L39:
            r5 = r5 & r6
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 >= 0) goto L46
            boolean r6 = java.lang.Float.isNaN(r8)
            if (r6 == 0) goto L45
            goto L46
        L45:
            r2 = r3
        L46:
            r5 = r5 & r2
            if (r5 != 0) goto L4e
            java.lang.String r5 = "Padding must be non-negative"
            q.a.a(r5)
        L4e:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p.v0
            if (r0 == 0) goto L7
            p.v0 r3 = (p.v0) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lb
            goto L35
        Lb:
            float r0 = r2.f10023a
            float r1 = r3.f10023a
            boolean r0 = u2.f.b(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.f10024b
            float r1 = r3.f10024b
            boolean r0 = u2.f.b(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.f10025c
            float r1 = r3.f10025c
            boolean r0 = u2.f.b(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.f10026d
            float r3 = r3.f10026d
            boolean r3 = u2.f.b(r0, r3)
            if (r3 == 0) goto L35
            r3 = 1
            return r3
        L35:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.w0 r0 = new p.w0
            r0.<init>()
            float r1 = r2.f10023a
            r0.f10030u = r1
            float r1 = r2.f10024b
            r0.f10031v = r1
            float r1 = r2.f10025c
            r0.f10032w = r1
            float r1 = r2.f10026d
            r0.f10033x = r1
            r1 = 1
            r0.f10034y = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.w0 r2 = (p.w0) r2
            float r0 = r1.f10023a
            r2.f10030u = r0
            float r0 = r1.f10024b
            r2.f10031v = r0
            float r0 = r1.f10025c
            r2.f10032w = r0
            float r0 = r1.f10026d
            r2.f10033x = r0
            r0 = 1
            r2.f10034y = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f10023a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f10024b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f10025c
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f10026d
            int r0 = eh.a.d(r2, r0, r1)
            r1 = 1
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
