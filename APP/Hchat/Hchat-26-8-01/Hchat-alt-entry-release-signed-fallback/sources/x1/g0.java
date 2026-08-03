package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.b1 f20915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x1.a f20920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f20921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20922h;

    public g0(x1.a r1, int r2) {
            r0 = this;
            r0.f20922h = r2
            r0.<init>()
            v1.b1 r1 = (v1.b1) r1
            r0.f20915a = r1
            r1 = 1
            r0.f20916b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f20921g = r1
            return
    }

    public static final void a(x1.g0 r9, v1.j r10, int r11, x1.i1 r12) {
            java.util.HashMap r0 = r9.f20921g
            float r11 = (float) r11
            int r1 = java.lang.Float.floatToRawIntBits(r11)
            long r1 = (long) r1
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r3 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
        L16:
            long r1 = r1 | r3
        L17:
            int r3 = r9.f20922h
            switch(r3) {
                case 0: goto L3e;
                default: goto L1c;
            }
        L1c:
            x1.o0 r3 = r12.p1()
            r3.getClass()
            long r3 = r3.f21008v
            long r7 = r3 >> r11
            int r7 = (int) r7
            float r7 = (float) r7
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r7 = r7 << r11
            long r3 = r3 & r5
            long r3 = r3 | r7
            long r1 = e1.b.e(r3, r1)
            goto L57
        L3e:
            x1.q1 r3 = r12.R
            if (r3 == 0) goto L51
            y1.o1 r3 = (y1.o1) r3
            float[] r4 = r3.b()
            boolean r3 = r3.f22043y
            if (r3 == 0) goto L4d
            goto L51
        L4d:
            long r1 = f1.i0.b(r1, r4)
        L51:
            long r3 = r12.F
            long r1 = ig.a.R(r1, r3)
        L57:
            x1.i1 r12 = r12.f20945w
            r12.getClass()
            v1.b1 r3 = r9.f20915a
            x1.r r3 = r3.A()
            boolean r3 = r12.equals(r3)
            if (r3 != 0) goto L86
            java.util.Map r3 = r9.b(r12)
            boolean r3 = r3.containsKey(r10)
            if (r3 == 0) goto L17
            int r1 = r9.c(r12, r10)
            float r1 = (float) r1
            int r2 = java.lang.Float.floatToRawIntBits(r1)
            long r2 = (long) r2
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r1
            long r1 = r2 << r11
            long r3 = r7 & r5
            goto L16
        L86:
            boolean r9 = r10 instanceof v1.j
            if (r9 == 0) goto L92
            long r11 = r1 & r5
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L99
        L92:
            long r11 = r1 >> r11
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
        L99:
            int r9 = java.lang.Math.round(r9)
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto Lc3
            java.lang.Object r11 = tf.y.Y(r10, r0)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            v1.j r12 = v1.c.f13905a
            gg.j r12 = r10.f13954a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r12.invoke(r11, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        Lc3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r10, r9)
            return
    }

    public final java.util.Map b(x1.i1 r2) {
            r1 = this;
            int r0 = r1.f20922h
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            x1.o0 r2 = r2.p1()
            r2.getClass()
            v1.o0 r2 = r2.Z0()
            java.util.Map r2 = r2.e()
            return r2
        L15:
            v1.o0 r2 = r2.Z0()
            java.util.Map r2 = r2.e()
            return r2
    }

    public final int c(x1.i1 r2, v1.j r3) {
            r1 = this;
            int r0 = r1.f20922h
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            x1.o0 r2 = r2.p1()
            r2.getClass()
            int r2 = r2.R0(r3)
            return r2
        L11:
            int r2 = r2.R0(r3)
            return r2
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.f20917c
            if (r0 != 0) goto Lf
            boolean r0 = r1.f20918d
            if (r0 != 0) goto Lf
            boolean r0 = r1.f20919e
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public final boolean e() {
            r1 = this;
            r1.h()
            x1.a r0 = r1.f20920f
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void f() {
            r3 = this;
            r0 = 1
            r3.f20916b = r0
            v1.b1 r0 = r3.f20915a
            x1.a r1 = r0.B()
            if (r1 != 0) goto Lc
            return
        Lc:
            boolean r2 = r3.f20917c
            if (r2 != 0) goto L11
            goto L14
        L11:
            r1.requestLayout()
        L14:
            boolean r2 = r3.f20918d
            if (r2 == 0) goto L1b
            r0.o0()
        L1b:
            boolean r2 = r3.f20919e
            if (r2 == 0) goto L22
            r0.requestLayout()
        L22:
            x1.g0 r0 = r1.e()
            r0.f()
            return
    }

    public final void g() {
            r3 = this;
            java.util.HashMap r0 = r3.f20921g
            r0.clear()
            b1.f r1 = new b1.f
            r2 = 16
            r1.<init>(r3, r2)
            v1.b1 r2 = r3.f20915a
            r2.c0(r1)
            x1.r r1 = r2.A()
            java.util.Map r1 = r3.b(r1)
            r0.putAll(r1)
            r0 = 0
            r3.f20916b = r0
            return
    }

    public final void h() {
            r2 = this;
            boolean r0 = r2.d()
            v1.b1 r1 = r2.f20915a
            if (r0 == 0) goto L9
            goto L51
        L9:
            x1.a r0 = r1.B()
            if (r0 != 0) goto L10
            goto L53
        L10:
            x1.g0 r0 = r0.e()
            x1.a r1 = r0.f20920f
            if (r1 == 0) goto L23
            x1.g0 r0 = r1.e()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            x1.a r0 = r2.f20920f
            if (r0 == 0) goto L53
            x1.g0 r1 = r0.e()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            x1.a r1 = r0.B()
            if (r1 == 0) goto L41
            x1.g0 r1 = r1.e()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            x1.a r0 = r0.B()
            if (r0 == 0) goto L50
            x1.g0 r0 = r0.e()
            if (r0 == 0) goto L50
            x1.a r1 = r0.f20920f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f20920f = r1
        L53:
            return
    }
}
