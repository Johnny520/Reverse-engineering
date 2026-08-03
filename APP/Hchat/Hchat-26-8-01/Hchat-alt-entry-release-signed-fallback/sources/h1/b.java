package h1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.a f5037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5.c f5038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f1.h f5039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1.h f5040j;

    public b() {
            r3 = this;
            r3.<init>()
            h1.a r0 = new h1.a
            r0.<init>()
            u2.d r1 = h1.c.f5041a
            r0.f5033a = r1
            u2.m r1 = u2.m.f13354g
            r0.f5034b = r1
            h1.e r1 = h1.e.f5042a
            r0.f5035c = r1
            r1 = 0
            r0.f5036d = r1
            r3.f5037g = r0
            b5.c r0 = new b5.c
            r0.<init>()
            r0.f471c = r3
            androidx.lifecycle.x r1 = new androidx.lifecycle.x
            r2 = 16
            r1.<init>(r0, r2)
            r0.f469a = r1
            r3.f5038h = r0
            return
    }

    public static f1.h e(h1.b r2, long r3, h1.c r5, float r6, int r7) {
            f1.h r2 = r2.m(r5)
            java.lang.Object r5 = r2.f3058i
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            float r0 = f1.w.d(r3)
            float r0 = r0 * r6
            long r3 = f1.w.b(r3, r0)
        L18:
            int r6 = r5.getColor()
            long r0 = f1.c0.c(r6)
            boolean r6 = f1.w.c(r0, r3)
            if (r6 != 0) goto L29
            r2.w(r3)
        L29:
            java.lang.Object r3 = r2.f3059j
            android.graphics.Shader r3 = (android.graphics.Shader) r3
            r4 = 0
            if (r3 == 0) goto L33
            r2.z(r4)
        L33:
            java.lang.Object r3 = r2.f3060k
            f1.n r3 = (f1.n) r3
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L40
            r2.x(r4)
        L40:
            int r3 = r2.f3057h
            if (r3 != r7) goto L45
            goto L48
        L45:
            r2.v(r7)
        L48:
            boolean r3 = r5.isFilterBitmap()
            r4 = 1
            if (r3 != r4) goto L50
            return r2
        L50:
            r2.y(r4)
            return r2
    }

    @Override // h1.d
    public final void F0(f1.j r8, long r9, float r11, h1.c r12) {
            r7 = this;
            h1.a r0 = r7.f5037g
            f1.u r0 = r0.f5035c
            r6 = 3
            r1 = r7
            r2 = r9
            r5 = r11
            r4 = r12
            f1.h r9 = e(r1, r2, r4, r5, r6)
            r0.j(r8, r9)
            return
    }

    @Override // h1.d
    public final void P0(long r11, long r13, long r15, float r17, h1.c r18, int r19) {
            r10 = this;
            h1.a r0 = r10.f5037g
            f1.u r0 = r0.f5035c
            r1 = 32
            long r2 = r13 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r4
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r15 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 & r15
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r13
            r4 = r10
            r5 = r11
            r8 = r17
            r7 = r18
            r9 = r19
            f1.h r11 = e(r4, r5, r7, r8, r9)
            r16 = r11
            r13 = r14
            r11 = r0
            r14 = r1
            r15 = r2
            r12 = r3
            r11.t(r12, r13, r14, r15, r16)
            return
    }

    @Override // h1.d
    public final void V(f1.j r9, f1.s r10, float r11, h1.c r12, int r13) {
            r8 = this;
            h1.a r0 = r8.f5037g
            f1.u r0 = r0.f5035c
            r7 = 1
            r5 = 0
            r1 = r8
            r2 = r10
            r4 = r11
            r3 = r12
            r6 = r13
            f1.h r10 = r1.j(r2, r3, r4, r5, r6, r7)
            r0.j(r9, r10)
            return
    }

    @Override // h1.d
    public final void W0(f1.g r9, long r10, float r12, f1.n r13, int r14) {
            r8 = this;
            h1.a r0 = r8.f5037g
            f1.u r0 = r0.f5035c
            r2 = 0
            r7 = 1
            h1.f r3 = h1.f.f5043b
            r1 = r8
            r4 = r12
            r5 = r13
            r6 = r14
            f1.h r12 = r1.j(r2, r3, r4, r5, r6, r7)
            r0.f(r9, r10, r12)
            return
    }

    @Override // h1.d
    public final void a0(long r7, long r9, long r11, float r13) {
            r6 = this;
            h1.a r0 = r6.f5037g
            f1.u r0 = r0.f5035c
            f1.h r1 = r6.f5040j
            r2 = 1
            if (r1 != 0) goto L12
            f1.h r1 = f1.c0.f()
            r1.D(r2)
            r6.f5040j = r1
        L12:
            java.lang.Object r3 = r1.f3058i
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            int r4 = r3.getColor()
            long r4 = f1.c0.c(r4)
            boolean r4 = f1.w.c(r4, r7)
            if (r4 != 0) goto L27
            r1.w(r7)
        L27:
            java.lang.Object r7 = r1.f3059j
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            r8 = 0
            if (r7 == 0) goto L31
            r1.z(r8)
        L31:
            java.lang.Object r7 = r1.f3060k
            f1.n r7 = (f1.n) r7
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L3e
            r1.x(r8)
        L3e:
            int r7 = r1.f3057h
            r8 = 3
            if (r7 != r8) goto L44
            goto L47
        L44:
            r1.v(r8)
        L47:
            float r7 = r3.getStrokeWidth()
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L53
        L50:
            r1.C(r13)
        L53:
            float r7 = r3.getStrokeMiter()
            r8 = 1082130432(0x40800000, float:4.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L61
        L5e:
            r3.setStrokeMiter(r8)
        L61:
            int r7 = r1.p()
            if (r7 != r2) goto L68
            goto L6b
        L68:
            r1.A(r2)
        L6b:
            int r7 = r1.q()
            if (r7 != 0) goto L72
            goto L76
        L72:
            r7 = 0
            r1.B(r7)
        L76:
            boolean r7 = r3.isFilterBitmap()
            if (r7 != r2) goto L81
        L7c:
            r8 = r9
            r10 = r11
            r7 = r0
            r12 = r1
            goto L85
        L81:
            r1.y(r2)
            goto L7c
        L85:
            r7.o(r8, r10, r12)
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            h1.a r0 = r1.f5037g
            u2.c r0 = r0.f5033a
            float r0 = r0.d()
            return r0
    }

    @Override // h1.d
    public final void d0(f1.s r12, long r13, long r15, float r17, h1.c r18, int r19) {
            r11 = this;
            h1.a r0 = r11.f5037g
            f1.u r0 = r0.f5035c
            r1 = 32
            long r2 = r13 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r4
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r15 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 & r15
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r13
            r10 = 1
            r8 = 0
            r4 = r11
            r5 = r12
            r7 = r17
            r6 = r18
            r9 = r19
            f1.h r12 = r4.j(r5, r6, r7, r8, r9, r10)
            r17 = r12
            r12 = r0
            r15 = r1
            r16 = r2
            r13 = r3
            r12.t(r13, r14, r15, r16, r17)
            return
    }

    @Override // h1.d
    public final u2.m getLayoutDirection() {
            r1 = this;
            h1.a r0 = r1.f5037g
            u2.m r0 = r0.f5034b
            return r0
    }

    public final f1.h j(f1.s r6, h1.c r7, float r8, f1.n r9, int r10, int r11) {
            r5 = this;
            f1.h r7 = r5.m(r7)
            java.lang.Object r0 = r7.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            if (r6 == 0) goto L12
            long r1 = r5.a()
            r6.a(r8, r1, r7)
            goto L3f
        L12:
            java.lang.Object r6 = r7.f3059j
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            if (r6 == 0) goto L1c
            r6 = 0
            r7.z(r6)
        L1c:
            int r6 = r0.getColor()
            long r1 = f1.c0.c(r6)
            long r3 = f1.w.f3126b
            boolean r6 = f1.w.c(r1, r3)
            if (r6 != 0) goto L2f
            r7.w(r3)
        L2f:
            int r6 = r0.getAlpha()
            float r6 = (float) r6
            r1 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L3c
            goto L3f
        L3c:
            r7.u(r8)
        L3f:
            java.lang.Object r6 = r7.f3060k
            f1.n r6 = (f1.n) r6
            boolean r6 = gg.l.a(r6, r9)
            if (r6 != 0) goto L4c
            r7.x(r9)
        L4c:
            int r6 = r7.f3057h
            if (r6 != r10) goto L51
            goto L54
        L51:
            r7.v(r10)
        L54:
            boolean r6 = r0.isFilterBitmap()
            if (r6 != r11) goto L5b
            return r7
        L5b:
            r7.y(r11)
            return r7
    }

    public final f1.h m(h1.c r5) {
            r4 = this;
            h1.f r0 = h1.f.f5043b
            boolean r0 = gg.l.a(r5, r0)
            if (r0 == 0) goto L17
            f1.h r5 = r4.f5039i
            if (r5 != 0) goto L16
            f1.h r5 = f1.c0.f()
            r0 = 0
            r5.D(r0)
            r4.f5039i = r5
        L16:
            return r5
        L17:
            boolean r0 = r5 instanceof h1.g
            if (r0 == 0) goto L64
            f1.h r0 = r4.f5040j
            if (r0 != 0) goto L29
            f1.h r0 = f1.c0.f()
            r1 = 1
            r0.D(r1)
            r4.f5040j = r0
        L29:
            java.lang.Object r1 = r0.f3058i
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            float r2 = r1.getStrokeWidth()
            h1.g r5 = (h1.g) r5
            float r3 = r5.f5044b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L3a
            goto L3d
        L3a:
            r0.C(r3)
        L3d:
            int r2 = r0.p()
            int r3 = r5.f5046d
            if (r2 != r3) goto L46
            goto L49
        L46:
            r0.A(r3)
        L49:
            float r2 = r1.getStrokeMiter()
            float r3 = r5.f5045c
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L54
            goto L57
        L54:
            r1.setStrokeMiter(r3)
        L57:
            int r1 = r0.q()
            int r5 = r5.f5047e
            if (r1 != r5) goto L60
            return r0
        L60:
            r0.B(r5)
            return r0
        L64:
            okio.a.k()
            r5 = 0
            return r5
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            h1.a r0 = r1.f5037g
            u2.c r0 = r0.f5033a
            float r0 = r0.q0()
            return r0
    }

    @Override // h1.d
    public final void t0(float r8, long r9, long r11) {
            r7 = this;
            h1.a r0 = r7.f5037g
            f1.u r0 = r0.f5035c
            h1.f r4 = h1.f.f5043b
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r1 = r7
            r2 = r9
            f1.h r9 = e(r1, r2, r4, r5, r6)
            r0.a(r8, r11, r9)
            return
    }

    @Override // h1.d
    public final void v0(f1.g r11, long r12, long r14, long r16, float r18, f1.n r19, int r20) {
            r10 = this;
            h1.a r0 = r10.f5037g
            f1.u r1 = r0.f5035c
            r3 = 0
            h1.f r4 = h1.f.f5043b
            r7 = 3
            r2 = r10
            r5 = r18
            r6 = r19
            r8 = r20
            f1.h r9 = r2.j(r3, r4, r5, r6, r7, r8)
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r1.i(r2, r3, r5, r7, r9)
            return
    }

    @Override // h1.d
    public final void x(long r12, long r14, h1.c r16) {
            r11 = this;
            h1.a r1 = r11.f5037g
            f1.u r6 = r1.f5035c
            r1 = 0
            int r3 = (int) r1
            float r7 = java.lang.Float.intBitsToFloat(r3)
            int r1 = (int) r1
            float r8 = java.lang.Float.intBitsToFloat(r1)
            float r2 = java.lang.Float.intBitsToFloat(r3)
            r3 = 32
            long r3 = r14 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r9 = r3 + r2
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r14
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = r2 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 3
            r0 = r11
            r1 = r12
            r3 = r16
            f1.h r1 = e(r0, r1, r3, r4, r5)
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r7 = r1
            r2.s(r3, r4, r5, r6, r7)
            return
    }

    @Override // h1.d
    public final b5.c z0() {
            r1 = this;
            b5.c r0 = r1.f5038h
            return r0
    }
}
