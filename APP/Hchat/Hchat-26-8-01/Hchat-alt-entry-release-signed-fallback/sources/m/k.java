package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends y0.n implements x1.h, x1.w0 {
    public long A;
    public boolean B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m.p1 f8233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m.o2 f8234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m.c2 f8236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m.c f8237y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8238z;

    public k(m.p1 r1, m.o2 r2, boolean r3, m.c2 r4) {
            r0 = this;
            r0.<init>()
            r0.f8233u = r1
            r0.f8234v = r2
            r0.f8235w = r3
            r0.f8236x = r4
            m.c r1 = new m.c
            r2 = 0
            r1.<init>(r2)
            r0.f8237y = r1
            long r1 = m.l.f8250a
            r0.A = r1
            return
    }

    public static final float k1(m.k r18, m.f r19, long r20) {
            r0 = r18
            r1 = r19
            long r2 = r0.A
            m.c r4 = r0.f8237y
            j0.b r4 = r4.f8101a
            int r5 = r4.f6673i
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object[] r4 = r4.f6671g
            int r7 = r4.length
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 0
            if (r5 >= r7) goto L7b
            r7 = r11
        L1a:
            if (r5 < 0) goto L78
            r12 = r4[r5]
            m.i r12 = (m.i) r12
            t.f r12 = r12.f8186a
            java.lang.Object r12 = r12.invoke()
            e1.c r12 = (e1.c) r12
            if (r12 == 0) goto L73
            long r13 = r12.c()
            long r15 = r0.l1()
            long r15 = r9.e0.q0(r15)
            r17 = 32
            m.p1 r8 = r0.f8233u
            int r8 = r8.ordinal()
            if (r8 == 0) goto L5a
            if (r8 != r6) goto L55
            long r13 = r13 >> r17
            int r8 = (int) r13
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r13 = r15 >> r17
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r8 = java.lang.Float.compare(r8, r13)
            goto L6b
        L55:
            okio.a.k()
            r0 = 0
            return r0
        L5a:
            long r13 = r13 & r9
            int r8 = (int) r13
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r13 = r15 & r9
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r8 = java.lang.Float.compare(r8, r13)
        L6b:
            if (r8 > 0) goto L6f
            r7 = r12
            goto L75
        L6f:
            if (r7 != 0) goto L7e
            r7 = r12
            goto L7e
        L73:
            r17 = 32
        L75:
            int r5 = r5 + (-1)
            goto L1a
        L78:
            r17 = 32
            goto L7e
        L7b:
            r17 = 32
            r7 = r11
        L7e:
            if (r7 != 0) goto L92
            boolean r4 = r0.f8238z
            if (r4 == 0) goto L8d
            m.c2 r4 = r0.f8236x
            java.lang.Object r4 = r4.invoke()
            r11 = r4
            e1.c r11 = (e1.c) r11
        L8d:
            if (r11 != 0) goto L91
            r0 = 0
            return r0
        L91:
            r7 = r11
        L92:
            long r2 = r9.e0.q0(r2)
            m.p1 r0 = r0.f8233u
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lbc
            if (r0 != r6) goto Lb7
            float r0 = r7.f2296a
            long r4 = r20 >> r17
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r0 - r4
            float r5 = r7.f2298c
            float r5 = r5 - r0
            long r2 = r2 >> r17
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r1.a(r4, r5, r0)
            return r0
        Lb7:
            okio.a.k()
            r0 = 0
            return r0
        Lbc:
            float r0 = r7.f2297b
            long r4 = r20 & r9
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r0 - r4
            float r5 = r7.f2299d
            float r5 = r5 - r0
            long r2 = r2 & r9
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r1.a(r4, r5, r0)
            return r0
    }

    public static boolean m1(m.k r6, e1.c r7, long r8, long r10, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L8
            long r8 = r6.l1()
        L8:
            r2 = r8
            r8 = r12 & 2
            if (r8 == 0) goto Lf
            r10 = 0
        Lf:
            r0 = r6
            r1 = r7
            r4 = r10
            long r6 = r0.o1(r1, r2, r4)
            r8 = 32
            long r8 = r6 >> r8
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = java.lang.Math.abs(r8)
            r9 = 1056964608(0x3f000000, float:0.5)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L3e
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L3e
            r6 = 1
            return r6
        L3e:
            r6 = 0
            return r6
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.w0
    public final void e(long r15) {
            r14 = this;
            r1 = r15
            long r3 = r14.l1()
            r14.A = r1
            m.p1 r5 = r14.f8233u
            int r5 = r5.ordinal()
            r7 = 1
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 32
            if (r5 == 0) goto L28
            if (r5 != r7) goto L24
            long r10 = r1 >> r6
            int r5 = (int) r10
            long r10 = r3 >> r6
            int r10 = (int) r10
            int r5 = gg.l.c(r5, r10)
            goto L32
        L24:
            okio.a.k()
            return
        L28:
            long r10 = r1 & r8
            int r5 = (int) r10
            long r10 = r3 & r8
            int r10 = (int) r10
            int r5 = gg.l.c(r5, r10)
        L32:
            if (r5 < 0) goto L35
            goto L87
        L35:
            boolean r5 = r14.f8235w
            if (r5 != 0) goto L57
            m.p1 r5 = r14.f8233u
            m.p1 r10 = m.p1.f8324g
            r11 = 0
            if (r5 != r10) goto L4d
            long r12 = r3 & r8
            int r5 = (int) r12
            long r1 = r1 & r8
            int r1 = (int) r1
            int r5 = r5 - r1
            long r1 = (long) r11
            long r1 = r1 << r6
            long r5 = (long) r5
        L49:
            long r5 = r5 & r8
            long r1 = r1 | r5
        L4b:
            r8 = r1
            goto L5a
        L4d:
            long r12 = r3 >> r6
            int r5 = (int) r12
            long r1 = r1 >> r6
            int r1 = (int) r1
            int r5 = r5 - r1
            long r1 = (long) r5
            long r1 = r1 << r6
            long r5 = (long) r11
            goto L49
        L57:
            r1 = 0
            goto L4b
        L5a:
            m.c2 r1 = r14.f8236x
            java.lang.Object r1 = r1.invoke()
            e1.c r1 = (e1.c) r1
            if (r1 == 0) goto L87
            boolean r2 = r14.B
            if (r2 != 0) goto L87
            boolean r2 = r14.f8238z
            if (r2 != 0) goto L87
            r2 = r3
            r4 = 0
            r6 = 2
            r0 = r14
            boolean r2 = m1(r0, r1, r2, r4, r6)
            if (r2 == 0) goto L87
            r2 = 0
            r6 = 1
            r0 = r14
            r4 = r8
            boolean r1 = m1(r0, r1, r2, r4, r6)
            if (r1 != 0) goto L87
            r14.f8238z = r7
            r14.n1(r4)
        L87:
            return
    }

    public final long l1() {
            r4 = this;
            long r0 = r4.A
            long r2 = m.l.f8250a
            boolean r2 = u2.l.a(r0, r2)
            if (r2 == 0) goto Lc
            r0 = 0
        Lc:
            return r0
    }

    public final void n1(long r10) {
            r9 = this;
            i0.u r0 = m.h.f8176a
            java.lang.Object r1 = x1.k.h(r9, r0)
            r5 = r1
            m.f r5 = (m.f) r5
            boolean r1 = r9.B
            if (r1 == 0) goto L12
            java.lang.String r1 = "launchAnimation called when previous animation was running"
            o.b.c(r1)
        L12:
            m.g3 r4 = new m.g3
            java.lang.Object r0 = x1.k.h(r9, r0)
            m.f r0 = (m.f) r0
            r0.getClass()
            m.e r0 = m.f.f8139a
            r0.getClass()
            i.r0 r0 = m.e.f8122b
            r4.<init>(r0)
            qg.t r0 = r9.Y0()
            m.j r2 = new m.j
            r8 = 0
            r3 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r8)
            r10 = 1
            r11 = 0
            qg.v.q(r0, r11, r2, r10)
            return
    }

    public final long o1(e1.c r7, long r8, long r10) {
            r6 = this;
            long r8 = r9.e0.q0(r8)
            m.p1 r0 = r6.f8233u
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto L47
            r5 = 1
            if (r0 != r5) goto L41
            i0.u r0 = m.h.f8176a
            java.lang.Object r0 = x1.k.h(r6, r0)
            m.f r0 = (m.f) r0
            float r5 = r7.f2296a
            long r10 = r10 >> r4
            int r10 = (int) r10
            float r10 = (float) r10
            float r10 = r5 - r10
            float r7 = r7.f2298c
            float r7 = r7 - r5
            long r8 = r8 >> r4
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r7 = r0.a(r10, r7, r8)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            int r9 = java.lang.Float.floatToRawIntBits(r1)
            long r9 = (long) r9
            long r7 = r7 << r4
            long r9 = r9 & r2
            long r7 = r7 | r9
            return r7
        L41:
            okio.a.k()
            r7 = 0
            return r7
        L47:
            i0.u r0 = m.h.f8176a
            java.lang.Object r0 = x1.k.h(r6, r0)
            m.f r0 = (m.f) r0
            float r5 = r7.f2297b
            long r10 = r10 & r2
            int r10 = (int) r10
            float r10 = (float) r10
            float r10 = r5 - r10
            float r7 = r7.f2299d
            float r7 = r7 - r5
            long r8 = r8 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r7 = r0.a(r10, r7, r8)
            int r8 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r7
            long r7 = r8 << r4
            long r9 = r10 & r2
            long r7 = r7 | r9
            return r7
    }
}
