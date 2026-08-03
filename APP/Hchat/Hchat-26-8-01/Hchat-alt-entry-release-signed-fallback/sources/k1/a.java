package k1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.g f7126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1.n f7131j;

    public a(f1.g r4, long r5) {
            r3 = this;
            r3.<init>()
            r3.f7126e = r4
            r3.f7127f = r5
            r0 = 1
            r3.f7128g = r0
            r0 = 0
            int r2 = (int) r0
            if (r2 < 0) goto L39
            int r0 = (int) r0
            if (r0 < 0) goto L39
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            if (r0 < 0) goto L39
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            if (r1 < 0) goto L39
            android.graphics.Bitmap r2 = r4.f3055a
            int r2 = r2.getWidth()
            if (r0 > r2) goto L39
            android.graphics.Bitmap r4 = r4.f3055a
            int r4 = r4.getHeight()
            if (r1 > r4) goto L39
            r3.f7129h = r5
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f7130i = r4
            return
        L39:
            java.lang.String r4 = "Failed requirement."
            j8.o.t(r4)
            r4 = 0
            throw r4
    }

    @Override // k1.b
    public final void a(float r1) {
            r0 = this;
            r0.f7130i = r1
            return
    }

    @Override // k1.b
    public final void b(f1.n r1) {
            r0 = this;
            r0.f7131j = r1
            return
    }

    @Override // k1.b
    public final long d() {
            r2 = this;
            long r0 = r2.f7129h
            long r0 = r9.e0.q0(r0)
            return r0
    }

    @Override // k1.b
    public final void e(x1.h0 r11) {
            r10 = this;
            h1.b r1 = r11.f20932g
            long r2 = r1.a()
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            long r5 = r1.a()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Math.round(r1)
            long r2 = (long) r2
            long r2 = r2 << r4
            long r4 = (long) r1
            long r4 = r4 & r7
            long r4 = r4 | r2
            float r6 = r10.f7130i
            f1.n r7 = r10.f7131j
            int r8 = r10.f7128g
            r9 = 328(0x148, float:4.6E-43)
            f1.g r1 = r10.f7126e
            long r2 = r10.f7127f
            r0 = r11
            h1.d.U0(r0, r1, r2, r4, r6, r7, r8, r9)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2f
        L3:
            boolean r0 = r5 instanceof k1.a
            if (r0 != 0) goto L8
            goto L31
        L8:
            k1.a r5 = (k1.a) r5
            f1.g r0 = r5.f7126e
            f1.g r1 = r4.f7126e
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L31
        L15:
            r0 = 0
            boolean r0 = u2.j.b(r0, r0)
            if (r0 != 0) goto L1e
            goto L31
        L1e:
            long r0 = r4.f7127f
            long r2 = r5.f7127f
            boolean r0 = u2.l.a(r0, r2)
            if (r0 != 0) goto L29
            goto L31
        L29:
            int r0 = r4.f7128g
            int r5 = r5.f7128g
            if (r0 != r5) goto L31
        L2f:
            r5 = 1
            return r5
        L31:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            f1.g r0 = r4.f7126e
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f7127f
            int r0 = eh.a.f(r0, r1, r2)
            int r1 = r4.f7128g
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BitmapPainter(image="
            r0.<init>(r1)
            f1.g r1 = r3.f7126e
            r0.append(r1)
            java.lang.String r1 = ", srcOffset="
            r0.append(r1)
            r1 = 0
            java.lang.String r1 = u2.j.e(r1)
            r0.append(r1)
            java.lang.String r1 = ", srcSize="
            r0.append(r1)
            long r1 = r3.f7127f
            java.lang.String r1 = u2.l.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", filterQuality="
            r0.append(r1)
            int r1 = r3.f7128g
            if (r1 != 0) goto L34
            java.lang.String r1 = "None"
            goto L48
        L34:
            r2 = 1
            if (r1 != r2) goto L3a
            java.lang.String r1 = "Low"
            goto L48
        L3a:
            r2 = 2
            if (r1 != r2) goto L40
            java.lang.String r1 = "Medium"
            goto L48
        L40:
            r2 = 3
            if (r1 != r2) goto L46
            java.lang.String r1 = "High"
            goto L48
        L46:
            java.lang.String r1 = "Unknown"
        L48:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
