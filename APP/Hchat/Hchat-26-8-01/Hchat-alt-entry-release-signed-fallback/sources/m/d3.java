package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends m.o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.c f8119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qg.e1 f8120g;

    public d3(m.o2 r1, m.d2 r2, u2.c r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r2 = 6
            r3 = 2147483647(0x7fffffff, float:NaN)
            sg.c r1 = sg.j.a(r3, r2, r1)
            r0.f8119f = r1
            return
    }

    public static final java.lang.Object c(m.d3 r16, m.o2 r17, m.b3 r18, yf.c r19) {
            r1 = r16
            r0 = r18
            r2 = r19
            r1.getClass()
            b.e r6 = r1.f8304e
            boolean r3 = r2 instanceof m.c3
            if (r3 == 0) goto L1f
            r3 = r2
            m.c3 r3 = (m.c3) r3
            int r4 = r3.f8111i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L1f
            int r4 = r4 - r5
            r3.f8111i = r4
        L1d:
            r7 = r3
            goto L25
        L1f:
            m.c3 r3 = new m.c3
            r3.<init>(r1, r2)
            goto L1d
        L25:
            java.lang.Object r2 = r7.f8109g
            int r3 = r7.f8111i
            r8 = 2
            r9 = 1
            xf.a r10 = xf.a.f21579g
            if (r3 == 0) goto L43
            if (r3 == r9) goto L3f
            if (r3 != r8) goto L38
            f8.i.I0(r2)
            goto Le0
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L3f:
            f8.i.I0(r2)
            goto Lb9
        L43:
            f8.i.I0(r2)
            gg.u r3 = new gg.u
            r3.<init>()
            r3.f4564g = r0
            long r4 = r0.f8099b
            long r11 = r0.f8098a
            java.lang.Object r0 = r6.f332h
            t1.d r0 = (t1.d) r0
            r2 = 32
            long r13 = r11 >> r2
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            r0.a(r4, r13)
            java.lang.Object r0 = r6.f333i
            t1.d r0 = (t1.d) r0
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r0.a(r4, r11)
            sg.c r0 = r1.f8119f
            m.b3 r0 = e(r0)
            if (r0 == 0) goto La7
            long r4 = r0.f8099b
            long r11 = r0.f8098a
            java.lang.Object r15 = r6.f332h
            t1.d r15 = (t1.d) r15
            r18 = r13
            long r13 = r11 >> r2
            int r2 = (int) r13
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r15.a(r4, r2)
            java.lang.Object r2 = r6.f333i
            t1.d r2 = (t1.d) r2
            long r11 = r11 & r18
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r2.a(r4, r11)
            java.lang.Object r2 = r3.f4564g
            m.b3 r2 = (m.b3) r2
            m.b3 r0 = r2.a(r0)
            r3.f4564g = r0
        La7:
            f0.b r0 = new f0.b
            r4 = 0
            r5 = 4
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f8111i = r9
            java.lang.Object r0 = r1.b(r0, r7)
            if (r0 != r10) goto Lb9
            goto Ldf
        Lb9:
            gg.a r0 = r1.f8301b
            java.lang.Object r1 = r6.f332h
            t1.d r1 = (t1.d) r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r1.b(r2)
            java.lang.Object r3 = r6.f333i
            t1.d r3 = (t1.d) r3
            float r2 = r3.b(r2)
            long r1 = a.a.d(r1, r2)
            u2.q r3 = new u2.q
            r3.<init>(r1)
            r7.f8111i = r8
            java.lang.Object r0 = r0.invoke(r3, r7)
            if (r0 != r10) goto Le0
        Ldf:
            return r10
        Le0:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    public static m.b3 e(sg.c r3) {
            m.g1 r0 = new m.g1
            r1 = 1
            r0.<init>(r3, r1)
            d9.k r3 = new d9.k
            r1 = 2
            r2 = 0
            r3.<init>(r0, r2, r1)
            ng.k r3 = fb.v0.B(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            m.b3 r0 = (m.b3) r0
            if (r2 != 0) goto L21
        L1f:
            r2 = r0
            goto L11
        L21:
            m.b3 r0 = r2.a(r0)
            goto L1f
        L26:
            return r2
    }

    public final boolean d(s1.k r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.Object r2 = r1.f12262a
            java.lang.Object r2 = tf.m.v1(r2)
            s1.t r2 = (s1.t) r2
            if (r2 == 0) goto La3
            java.util.ArrayList r5 = r2.f12303m
            if (r5 != 0) goto L14
            tf.t r5 = tf.t.f13167g
        L14:
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L1a:
            r9 = 0
            sg.c r10 = r0.f8119f
            m.o2 r11 = r0.f8300a
            r12 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            if (r7 >= r6) goto L65
            java.lang.Object r14 = r5.get(r7)
            s1.c r14 = (s1.c) r14
            r15 = 1
            r16 = 0
            long r3 = r14.f12213d
            long r3 = r3 ^ r12
            long r12 = r11.e(r3)
            float r11 = r11.i(r12)
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L40
            r9 = r15
            goto L42
        L40:
            r9 = r16
        L42:
            if (r9 != 0) goto L62
            m.b3 r17 = new m.b3
            long r11 = r14.f12210a
            r22 = 0
            r18 = r3
            r20 = r11
            r17.<init>(r18, r20, r22)
            r3 = r17
            java.lang.Object r3 = r10.p(r3)
            boolean r3 = r3 instanceof sg.i
            if (r3 == 0) goto L61
            if (r8 == 0) goto L5e
            goto L61
        L5e:
            r8 = r16
            goto L62
        L61:
            r8 = r15
        L62:
            int r7 = r7 + 1
            goto L1a
        L65:
            r15 = 1
            r16 = 0
            long r3 = r2.f12302l
            long r3 = r3 ^ r12
            int r1 = r1.f12267f
            r5 = 12
            if (r1 != r5) goto L74
            r22 = r15
            goto L76
        L74:
            r22 = r16
        L76:
            long r5 = r11.e(r3)
            float r1 = r11.i(r5)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L84
            r1 = r15
            goto L86
        L84:
            r1 = r16
        L86:
            if (r1 == 0) goto L8a
            if (r22 == 0) goto La8
        L8a:
            m.b3 r17 = new m.b3
            long r1 = r2.f12292b
            r20 = r1
            r18 = r3
            r17.<init>(r18, r20, r22)
            r1 = r17
            java.lang.Object r1 = r10.p(r1)
            boolean r1 = r1 instanceof sg.i
            if (r1 == 0) goto La1
            if (r8 == 0) goto La6
        La1:
            r8 = r15
            goto La8
        La3:
            r15 = 1
            r16 = 0
        La6:
            r8 = r16
        La8:
            if (r8 != 0) goto Lb0
            boolean r1 = r0.f8303d
            if (r1 == 0) goto Laf
            goto Lb0
        Laf:
            return r16
        Lb0:
            return r15
    }
}
