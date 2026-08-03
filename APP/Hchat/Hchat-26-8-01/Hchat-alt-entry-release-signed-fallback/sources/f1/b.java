package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f1.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f3025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.graphics.Rect f3026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f3027c;

    public b() {
            r1 = this;
            r1.<init>()
            android.graphics.Canvas r0 = f1.c.f3036a
            r1.f3025a = r0
            return
    }

    @Override // f1.u
    public final void a(float r5, long r6, f1.h r8) {
            r4 = this;
            android.graphics.Canvas r0 = r4.f3025a
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Object r7 = r8.f3058i
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r0.drawCircle(r1, r6, r5, r7)
            return
    }

    @Override // f1.u
    public final void b(float r2, float r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.f3025a
            r0.scale(r2, r3)
            return
    }

    @Override // f1.u
    public final void c(e1.c r8, f1.h r9) {
            r7 = this;
            android.graphics.Canvas r0 = r7.f3025a
            float r1 = r8.f2296a
            float r2 = r8.f2297b
            float r3 = r8.f2298c
            float r4 = r8.f2299d
            android.graphics.Paint r5 = f1.c0.l(r9)
            r6 = 31
            r0.saveLayer(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // f1.u
    public final void d(f1.j r3) {
            r2 = this;
            android.graphics.Canvas r0 = r2.f3025a
            boolean r1 = r3 instanceof f1.j
            if (r1 == 0) goto Le
            android.graphics.Path r3 = r3.f3067a
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.clipPath(r3, r1)
            return
        Le:
            java.lang.String r3 = "Unable to obtain android.graphics.Path"
            j8.o.w(r3)
            return
    }

    @Override // f1.u
    public final void e() {
            r1 = this;
            android.graphics.Canvas r0 = r1.f3025a
            r0.save()
            return
    }

    @Override // f1.u
    public final void f(f1.g r5, long r6, f1.h r8) {
            r4 = this;
            android.graphics.Canvas r0 = r4.f3025a
            android.graphics.Bitmap r5 = f1.c0.h(r5)
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Object r7 = r8.f3058i
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r0.drawBitmap(r5, r1, r6, r7)
            return
    }

    @Override // f1.u
    public final void g() {
            r2 = this;
            android.graphics.Canvas r0 = r2.f3025a
            r1 = 0
            f1.c0.j(r0, r1)
            return
    }

    @Override // f1.u
    public final void h(float[] r2) {
            r1 = this;
            boolean r0 = f1.c0.o(r2)
            if (r0 != 0) goto L13
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            f1.c0.p(r0, r2)
            android.graphics.Canvas r2 = r1.f3025a
            r2.concat(r0)
        L13:
            return
    }

    @Override // f1.u
    public final void i(f1.g r9, long r10, long r12, long r14, f1.h r16) {
            r8 = this;
            android.graphics.Rect r0 = r8.f3026b
            if (r0 != 0) goto L12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f3026b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f3027c = r0
        L12:
            android.graphics.Canvas r0 = r8.f3025a
            android.graphics.Bitmap r9 = f1.c0.h(r9)
            android.graphics.Rect r1 = r8.f3026b
            r1.getClass()
            r2 = 32
            long r3 = r10 >> r2
            int r3 = (int) r3
            r1.left = r3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r4
            int r10 = (int) r10
            r1.top = r10
            long r6 = r12 >> r2
            int r11 = (int) r6
            int r3 = r3 + r11
            r1.right = r3
            long r6 = r12 & r4
            int r11 = (int) r6
            int r10 = r10 + r11
            r1.bottom = r10
            android.graphics.Rect r10 = r8.f3027c
            r10.getClass()
            r6 = 0
            int r11 = (int) r6
            r10.left = r11
            int r3 = (int) r6
            r10.top = r3
            long r6 = r14 >> r2
            int r2 = (int) r6
            int r11 = r11 + r2
            r10.right = r11
            long r4 = r4 & r14
            int r11 = (int) r4
            int r3 = r3 + r11
            r10.bottom = r3
            r11 = r16
            java.lang.Object r11 = r11.f3058i
            android.graphics.Paint r11 = (android.graphics.Paint) r11
            r0.drawBitmap(r9, r1, r10, r11)
            return
    }

    @Override // f1.u
    public final void j(f1.j r3, f1.h r4) {
            r2 = this;
            android.graphics.Canvas r0 = r2.f3025a
            boolean r1 = r3 instanceof f1.j
            if (r1 == 0) goto L10
            android.graphics.Path r3 = r3.f3067a
            android.graphics.Paint r4 = f1.c0.l(r4)
            r0.drawPath(r3, r4)
            return
        L10:
            java.lang.String r3 = "Unable to obtain android.graphics.Path"
            j8.o.w(r3)
            return
    }

    @Override // f1.u
    public final void l(float r7, float r8, float r9, float r10, int r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.f3025a
            if (r11 != 0) goto Lc
            android.graphics.Region$Op r11 = android.graphics.Region.Op.DIFFERENCE
        L6:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto Lf
        Lc:
            android.graphics.Region$Op r11 = android.graphics.Region.Op.INTERSECT
            goto L6
        Lf:
            r0.clipRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // f1.u
    public final void m(float r2, float r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.f3025a
            r0.translate(r2, r3)
            return
    }

    @Override // f1.u
    public final void n() {
            r2 = this;
            r0 = 1110704128(0x42340000, float:45.0)
            android.graphics.Canvas r1 = r2.f3025a
            r1.rotate(r0)
            return
    }

    @Override // f1.u
    public final void o(long r8, long r10, f1.h r12) {
            r7 = this;
            android.graphics.Canvas r0 = r7.f3025a
            r1 = 32
            long r2 = r8 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r5 = r10 >> r1
            int r9 = (int) r5
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r10 = r10 & r3
            int r10 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Object r10 = r12.f3058i
            r5 = r10
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            r3 = r9
            r1 = r2
            r2 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    @Override // f1.u
    public final void p() {
            r1 = this;
            android.graphics.Canvas r0 = r1.f3025a
            r0.restore()
            return
    }

    @Override // f1.u
    public final void q(float r9, float r10, float r11, float r12, float r13, float r14, f1.h r15) {
            r8 = this;
            android.graphics.Canvas r0 = r8.f3025a
            android.graphics.Paint r7 = f1.c0.l(r15)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // f1.u
    public final void r() {
            r2 = this;
            android.graphics.Canvas r0 = r2.f3025a
            r1 = 1
            f1.c0.j(r0, r1)
            return
    }

    @Override // f1.u
    public final void s(float r10, float r11, float r12, float r13, f1.h r14) {
            r9 = this;
            android.graphics.Canvas r0 = r9.f3025a
            java.lang.Object r14 = r14.f3058i
            r8 = r14
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r5 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r6 = 1133412352(0x438e8000, float:285.0)
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // f1.u
    public final void t(float r7, float r8, float r9, float r10, f1.h r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.f3025a
            android.graphics.Paint r5 = f1.c0.l(r11)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }
}
