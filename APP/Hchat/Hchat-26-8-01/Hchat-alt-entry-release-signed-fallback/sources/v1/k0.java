package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends v1.a1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f13979i;

    public /* synthetic */ k0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f13978h = r2
            r0.f13979i = r1
            r0.<init>()
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            int r0 = r1.f13978h
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13979i
            y1.t r0 = (y1.t) r0
            u2.c r0 = r0.getDensity()
            float r0 = r0.d()
            return r0
        L12:
            java.lang.Object r0 = r1.f13979i
            x1.n0 r0 = (x1.n0) r0
            float r0 = r0.d()
            return r0
    }

    @Override // v1.a1
    public float j(v1.l r9) {
            r8 = this;
            int r0 = r8.f13978h
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            float r9 = super.j(r9)
            return r9
        La:
            fg.p r0 = r9.f13980a
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L20
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            java.lang.Object r9 = r0.invoke(r8, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            float r1 = r9.floatValue()
            goto Lbc
        L20:
            java.lang.Object r0 = r8.f13979i
            x1.n0 r0 = (x1.n0) r0
            boolean r2 = r0.f20999q
            if (r2 == 0) goto L2a
            goto Lbc
        L2a:
            r2 = r0
        L2b:
            m8.c r3 = r2.f21001s
            if (r3 == 0) goto L41
            java.lang.Object r4 = r3.f8779b
            v1.l[] r4 = (v1.l[]) r4
            int r4 = tf.l.D0(r4, r9)
            if (r4 >= 0) goto L3a
            goto L41
        L3a:
            java.lang.Object r3 = r3.f8780c
            float[] r3 = (float[]) r3
            r3 = r3[r4]
            goto L42
        L41:
            r3 = r1
        L42:
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto Laf
            x1.f0 r1 = r0.Y0()
            r2.J0(r1, r9)
            v1.t r1 = r2.T0()
            v1.t r0 = r0.T0()
            int r9 = r9.f13981b
            switch(r9) {
                case 0: goto L86;
                default: goto L5c;
            }
        L5c:
            long r4 = r1.F()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r9 = (int) r4
            float r9 = (float) r9
            r2 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r4 = (long) r9
            r9 = 32
            long r2 = r2 << r9
            long r4 = r4 & r6
            long r2 = r2 | r4
            long r0 = r0.w(r1, r2)
            long r0 = r0 >> r9
            int r9 = (int) r0
            float r9 = java.lang.Float.intBitsToFloat(r9)
        L84:
            r1 = r9
            goto Lbc
        L86:
            long r4 = r1.F()
            r9 = 32
            long r4 = r4 >> r9
            int r2 = (int) r4
            float r2 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            long r4 = r4 << r9
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            long r0 = r0.w(r1, r2)
            long r0 = r0 & r6
            int r9 = (int) r0
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L84
        Laf:
            x1.n0 r3 = r2.a1()
            if (r3 != 0) goto Lbd
            x1.f0 r0 = r0.Y0()
            r2.J0(r0, r9)
        Lbc:
            return r1
        Lbd:
            r2 = r3
            goto L2b
    }

    @Override // v1.a1
    public final u2.m m() {
            r1 = this;
            int r0 = r1.f13978h
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13979i
            y1.t r0 = (y1.t) r0
            u2.m r0 = r0.getLayoutDirection()
            return r0
        Le:
            java.lang.Object r0 = r1.f13979i
            x1.n0 r0 = (x1.n0) r0
            u2.m r0 = r0.getLayoutDirection()
            return r0
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            int r0 = r1.f13978h
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13979i
            y1.t r0 = (y1.t) r0
            u2.c r0 = r0.getDensity()
            float r0 = r0.q0()
            return r0
        L12:
            java.lang.Object r0 = r1.f13979i
            x1.n0 r0 = (x1.n0) r0
            float r0 = r0.q0()
            return r0
    }

    @Override // v1.a1
    public final int w() {
            r1 = this;
            int r0 = r1.f13978h
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13979i
            y1.t r0 = (y1.t) r0
            x1.f0 r0 = r0.getRoot()
            x1.j0 r0 = r0.M
            x1.v0 r0 = r0.f20966p
            int r0 = r0.f13900g
            return r0
        L14:
            java.lang.Object r0 = r1.f13979i
            x1.n0 r0 = (x1.n0) r0
            int r0 = r0.w0()
            return r0
    }
}
