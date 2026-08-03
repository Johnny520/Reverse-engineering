package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements v1.n0, p.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.i f10008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.e f10009b;

    public t(p.i r1, y0.e r2) {
            r0 = this;
            r0.<init>()
            r0.f10008a = r1
            r0.f10009b = r2
            return
    }

    @Override // v1.n0
    public final int a(v1.o r11, java.util.List r12, int r13) {
            r10 = this;
            p.i r0 = r10.f10008a
            float r0 = r0.a()
            int r11 = r11.G0(r0)
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            int r0 = r12.size()
            int r0 = r0 + (-1)
            int r0 = r0 * r11
            int r11 = java.lang.Math.min(r0, r13)
            int r0 = r12.size()
            r2 = 0
            r3 = r1
            r5 = r3
            r4 = r2
        L25:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r0) goto L5c
            java.lang.Object r7 = r12.get(r3)
            v1.m0 r7 = (v1.m0) r7
            p.c1 r8 = p.d.e(r7)
            float r8 = p.d.f(r8)
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 != 0) goto L54
            if (r13 != r6) goto L40
            r8 = r6
            goto L42
        L40:
            int r8 = r13 - r11
        L42:
            int r6 = r7.j(r6)
            int r6 = java.lang.Math.min(r6, r8)
            int r11 = r11 + r6
            int r6 = r7.M(r6)
            int r5 = java.lang.Math.max(r5, r6)
            goto L59
        L54:
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 <= 0) goto L59
            float r4 = r4 + r8
        L59:
            int r3 = r3 + 1
            goto L25
        L5c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L62
            r11 = r1
            goto L71
        L62:
            if (r13 != r6) goto L66
            r11 = r6
            goto L71
        L66:
            int r13 = r13 - r11
            int r11 = java.lang.Math.max(r13, r1)
            float r11 = (float) r11
            float r11 = r11 / r4
            int r11 = java.lang.Math.round(r11)
        L71:
            int r13 = r12.size()
        L75:
            if (r1 >= r13) goto L9f
            java.lang.Object r0 = r12.get(r1)
            v1.m0 r0 = (v1.m0) r0
            p.c1 r3 = p.d.e(r0)
            float r3 = p.d.f(r3)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L9c
            if (r11 == r6) goto L92
            float r4 = (float) r11
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            goto L93
        L92:
            r3 = r6
        L93:
            int r0 = r0.M(r3)
            int r0 = java.lang.Math.max(r5, r0)
            r5 = r0
        L9c:
            int r1 = r1 + 1
            goto L75
        L9f:
            return r5
    }

    @Override // p.b1
    public final long b(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 0
            if (r5 != 0) goto L8
            long r2 = u2.b.a(r0, r4, r2, r3)
            return r2
        L8:
            long r2 = f8.i.t(r0, r4, r2, r3)
            return r2
    }

    @Override // v1.n0
    public final int c(v1.o r11, java.util.List r12, int r13) {
            r10 = this;
            p.i r0 = r10.f10008a
            float r0 = r0.a()
            int r11 = r11.G0(r0)
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            int r0 = r12.size()
            int r0 = r0 + (-1)
            int r0 = r0 * r11
            int r11 = java.lang.Math.min(r0, r13)
            int r0 = r12.size()
            r2 = 0
            r3 = r1
            r5 = r3
            r4 = r2
        L25:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r0) goto L5c
            java.lang.Object r7 = r12.get(r3)
            v1.m0 r7 = (v1.m0) r7
            p.c1 r8 = p.d.e(r7)
            float r8 = p.d.f(r8)
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 != 0) goto L54
            if (r13 != r6) goto L40
            r8 = r6
            goto L42
        L40:
            int r8 = r13 - r11
        L42:
            int r6 = r7.j(r6)
            int r6 = java.lang.Math.min(r6, r8)
            int r11 = r11 + r6
            int r6 = r7.G(r6)
            int r5 = java.lang.Math.max(r5, r6)
            goto L59
        L54:
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 <= 0) goto L59
            float r4 = r4 + r8
        L59:
            int r3 = r3 + 1
            goto L25
        L5c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L62
            r11 = r1
            goto L71
        L62:
            if (r13 != r6) goto L66
            r11 = r6
            goto L71
        L66:
            int r13 = r13 - r11
            int r11 = java.lang.Math.max(r13, r1)
            float r11 = (float) r11
            float r11 = r11 / r4
            int r11 = java.lang.Math.round(r11)
        L71:
            int r13 = r12.size()
        L75:
            if (r1 >= r13) goto L9f
            java.lang.Object r0 = r12.get(r1)
            v1.m0 r0 = (v1.m0) r0
            p.c1 r3 = p.d.e(r0)
            float r3 = p.d.f(r3)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L9c
            if (r11 == r6) goto L92
            float r4 = (float) r11
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            goto L93
        L92:
            r3 = r6
        L93:
            int r0 = r0.G(r3)
            int r0 = java.lang.Math.max(r5, r0)
            r5 = r0
        L9c:
            int r1 = r1 + 1
            goto L75
        L9f:
            return r5
    }

    @Override // p.b1
    public final int d(v1.b1 r1) {
            r0 = this;
            int r1 = r1.f13901h
            return r1
    }

    @Override // p.b1
    public final int e(v1.b1 r1) {
            r0 = this;
            int r1 = r1.f13900g
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p.t
            if (r0 != 0) goto L8
            goto L1f
        L8:
            p.t r3 = (p.t) r3
            p.i r0 = r2.f10008a
            p.i r1 = r3.f10008a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            y0.e r0 = r2.f10009b
            y0.e r3 = r3.f10009b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    @Override // p.b1
    public final v1.o0 f(v1.b1[] r7, v1.p0 r8, int[] r9, int r10, int r11) {
            r6 = this;
            hb.w r0 = new hb.w
            r2 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            tf.u r7 = tf.u.f13168g
            v1.o0 r7 = r4.z(r3, r10, r7, r0)
            return r7
    }

    @Override // v1.n0
    public final int g(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            p.i r0 = r9.f10008a
            float r0 = r0.a()
            int r10 = r10.G0(r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            int r0 = r11.size()
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
        L1a:
            if (r1 >= r0) goto L46
            java.lang.Object r6 = r11.get(r1)
            v1.m0 r6 = (v1.m0) r6
            p.c1 r7 = p.d.e(r6)
            float r7 = p.d.f(r7)
            int r6 = r6.j(r12)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L34
            int r4 = r4 + r6
            goto L43
        L34:
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L43
            float r5 = r5 + r7
            float r6 = (float) r6
            float r6 = r6 / r7
            int r6 = java.lang.Math.round(r6)
            int r3 = java.lang.Math.max(r3, r6)
        L43:
            int r1 = r1 + 1
            goto L1a
        L46:
            float r12 = (float) r3
            float r12 = r12 * r5
            int r12 = java.lang.Math.round(r12)
            int r12 = r12 + r4
            int r11 = r11.size()
            int r11 = r11 + (-1)
            int r11 = r11 * r10
            int r11 = r11 + r12
            return r11
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r11, java.util.List r12, long r13) {
            r10 = this;
            int r1 = u2.a.i(r13)
            int r2 = u2.a.j(r13)
            int r3 = u2.a.g(r13)
            int r4 = u2.a.h(r13)
            p.i r13 = r10.f10008a
            float r13 = r13.a()
            int r5 = r11.G0(r13)
            int r13 = r12.size()
            v1.b1[] r8 = new v1.b1[r13]
            int r9 = r12.size()
            r0 = r10
            r6 = r11
            r7 = r12
            v1.o0 r11 = p.d.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final int hashCode() {
            r2 = this;
            p.i r0 = r2.f10008a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            y0.e r1 = r2.f10009b
            float r1 = r1.f21809a
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // v1.n0
    public final int i(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            p.i r0 = r9.f10008a
            float r0 = r0.a()
            int r10 = r10.G0(r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            int r0 = r11.size()
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
        L1a:
            if (r1 >= r0) goto L46
            java.lang.Object r6 = r11.get(r1)
            v1.m0 r6 = (v1.m0) r6
            p.c1 r7 = p.d.e(r6)
            float r7 = p.d.f(r7)
            int r6 = r6.p0(r12)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L34
            int r4 = r4 + r6
            goto L43
        L34:
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L43
            float r5 = r5 + r7
            float r6 = (float) r6
            float r6 = r6 / r7
            int r6 = java.lang.Math.round(r6)
            int r3 = java.lang.Math.max(r3, r6)
        L43:
            int r1 = r1 + 1
            goto L1a
        L46:
            float r12 = (float) r3
            float r12 = r12 * r5
            int r12 = java.lang.Math.round(r12)
            int r12 = r12 + r4
            int r11 = r11.size()
            int r11 = r11 + (-1)
            int r11 = r11 * r10
            int r11 = r11 + r12
            return r11
    }

    @Override // p.b1
    public final void j(int r2, v1.p0 r3, int[] r4, int[] r5) {
            r1 = this;
            p.i r0 = r1.f10008a
            r0.c(r2, r3, r4, r5)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColumnMeasurePolicy(verticalArrangement="
            r0.<init>(r1)
            p.i r1 = r2.f10008a
            r0.append(r1)
            java.lang.String r1 = ", horizontalAlignment="
            r0.append(r1)
            y0.e r1 = r2.f10009b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
